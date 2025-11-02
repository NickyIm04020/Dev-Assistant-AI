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
   git clone https://github.com/<your-username>/DevAssistantAI.git
   cd DevAssistantAI

2. Add your OpenRouter API key:
   export OPENROUTER_API_KEY="your_api_key_here"

3. Build & Run:
   mvn clean compile exec:java -Dexec.mainClass="com.devassistant.Main"
