# 🧠 DevAssistant AI – Java Debugging Assistant

### 🧩 Overview
A CLI tool that uses GPT via OpenRouter API to:
- Analyze **Java error logs**
- Suggest **fixes and explanations**
- Auto-generate **JUnit test stubs** from parsed source code

---

### ⚙️ Tech Stack
- Java 17
- GPT (OpenRouter API)
- JavaParser
- JUnit 5
- OkHttp

---

### 🚀 Setup Instructions
1. Clone the repo:
   ```bash
   git clone https://github.com/NickyIm04020/DevAssistantAI.git
   cd Dev-Assistant-AI

2. Add your OpenRouter API key:
   ```bash
   export OPENROUTER_API_KEY="YOUR_API_KEY"

3. Build & Run:
    ```bash
   mvn clean compile exec:java -Dexec.mainClass="com.devassistant.Main"
