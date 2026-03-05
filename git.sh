#!/usr/bin/env bash

MODEL="mistral:7b-instruct-q4_K_M"   # Model quantized untuk CPU
MAX_DIFF_LINES=100

function get_changed_files() {
    git status --porcelain | awk '{print $2}'
}

function generate_commit_message() {
    local file="$1"

    diff_content=$(git diff "$file" | head -n $MAX_DIFF_LINES)

    prompt="
You are an expert software engineer.
Generate a concise and professional git commit message
using Conventional Commits standard.

Rules:
- Use one of: feat, fix, refactor, chore, docs, style, test, perf
- Format: type(scope): short summary
- Maximum 72 characters
- No explanation, only the commit message

File: $file

Diff:
$diff_content
"

    echo "$prompt" | ollama run "$MODEL"
}

while true; do
    mapfile -t files < <(get_changed_files)

    if [ ${#files[@]} -eq 0 ]; then
        echo "Tidak ada file yang berubah."
        exit 0
    fi

    echo "==== Pilih file yang ingin di-commit ===="
    for i in "${!files[@]}"; do
        echo "$((i+1)). ${files[$i]}"
    done
    echo "0. Keluar"
    echo "=========================================="

    read -p "Masukkan nomor: " choice

    if [ "$choice" -eq 0 ]; then
        exit 0
    fi

    if [ "$choice" -gt 0 ] && [ "$choice" -le "${#files[@]}" ]; then
        selected_file="${files[$((choice-1))]}"

        echo "Generating commit message untuk $selected_file..."
        commit_msg=$(generate_commit_message "$selected_file")

        echo "----------------------------------"
        echo "Suggested Commit Message:"
        echo "$commit_msg"
        echo "----------------------------------"

        read -p "Gunakan commit ini? (y/n): " confirm
        if [[ "$confirm" == "y" ]]; then
            git add "$selected_file"
            git commit -m "$commit_msg"
            echo "Commit berhasil."
        fi
    else
        echo "Pilihan tidak valid."
    fi

    echo ""
done