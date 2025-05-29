# 🧠 Quiz App – Minimal Viable Product (MVP)

A simple yet powerful quiz application built with **Java + Spring Boot**, designed for quick deployment and learning.

---

## 🚀 What We’ll Build

A lightweight quiz platform where users can:

- 🧍‍♂️ Take quizzes (no login required — keep it simple!)
- 🧠 Answer multiple-choice questions
- 📊 See their final score after completing the quiz

---

## 👤 Users

- No registration/login needed
- Simply pick a quiz and start answering

---

## 🧠 Quizzes

Each quiz includes:
- A **title** (e.g., “General Knowledge”)
- A **list of questions**

---

## ❓ Questions

Each question contains:
- A **question text** (e.g., “What’s the capital of France?”)
- **Four options**
- **One correct answer**

---

## 🧾 User Flow

1. User selects a quiz
2. App serves **one question at a time**
3. After completing all questions, the app shows the **final score**

---

## 🛠️ Tech Stack

| Layer     | Tools                        |
|-----------|------------------------------|
| Backend   | Java + Spring Boot           |
| Database  | H2 (in-memory for dev/test)  |
| Testing   | Postman or Swagger UI        |
| Frontend (optional) | HTML/Thymeleaf or React |

---

## ⚙️ VS Code Setup (Java 21)

If you’re using **VS Code**, follow these steps to configure Java 21:

1. Open your Spring Boot project in VS Code.
2. Create a folder named `.vscode` if it doesn’t exist.
3. Inside `.vscode`, create a file named `settings.json`.
4. Add the following (adjust your Java path as needed):

``json
{
  "java.configuration.runtimes": [
    {
      "name": "JavaSE-21",
      "path": "C:\\Program Files\\Java\\jdk-21",
      "default": true
    }
  ]
}

