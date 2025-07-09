# 🧠 Spring Boot AI Chatbot

This project is a simple, extensible chatbot built with **Spring Boot** and **Spring AI**, powered by OpenAI's GPT models. It integrates a system prompt (using `PromptTemplate`) to simulate domain-specific conversations (e.g., bakery FAQ, legal assistant, nursing assistant).

---

## 🚀 Tech Stack

| Tech                | Purpose                                      |
|---------------------|----------------------------------------------|
| **Java 17+**        | Programming language                         |
| **Spring Boot**     | Application framework                        |
| **Spring AI**       | Integration with OpenAI/LLMs                 |
| **OpenAI GPT**      | Language model backend                       |
| **Maven**           | Dependency and build management              |
| **REST (Spring Web)** | RESTful API for chat interaction          |
| **Postman / cURL**  | API testing                                  |

---

## 🧩 Features

- ✅ **Chat endpoint** (`POST /chat`) that accepts user input and returns AI-generated responses.
- ✅ **Prompt templating** with `PromptTemplate`, loaded from file.
- ✅ Modular Spring configuration (separate config files for prompt and OpenAI client).
- ✅ Easy to switch prompt files for multi-domain support (e.g., legal, bakery, health).
- ✅ Ready for integration with RAG or frontend UI.

---

## 🗂️ Project Structure

```
src
├── main
│   ├── java/com/example/chatbot
│   │   ├── ChatController.java     # REST API controller
│   │   ├── ChatService.java        # Service calling the AI model
│   │   ├── SpringAIClientConfig.java
│   │   └── PromptTemplateConfig.java
│   └── resources
│       ├── application.yml         # OpenAI API key config
│       └── prompts
│           └── faq-system-prompt.txt
```

---

## 📩 Sample Request

### 🔸 Endpoint
```
POST http://localhost:8080/chat
```

### 🔸 Body (JSON)
```json
{
  "message": "What time do you open?"
}
```

### 🔸 Sample Prompt (`faq-system-prompt.txt`)
```
You are a helpful assistant for a local bakery.
Answer questions based on this context:

- Open: Mon–Sat 8am–6pm
- Closed: Sunday
- Address: 123 Main Street, Auerbach
- Products: bread, cakes, sandwiches

User: {input}
```

---

## 🛠️ Setup & Run

### 1. Clone the Repository
```bash
git clone https://github.com/yourname/springboot-ai-chatbot.git
cd springboot-ai-chatbot
```

### 2. Add Your OpenAI API Key

Update `src/main/resources/application.yml`:

```yaml
spring:
  ai:
    openai:
      api-key: sk-...
```

Or set it as an environment variable:
```bash
export SPRING_AI_OPENAI_API_KEY=sk-...
```

### 3. Run the App

Using Maven wrapper:
```bash
./mvnw spring-boot:run
```

Using Spring Tools or IntelliJ:
- Run the `ChatbotAiDemoApplication` class.

---

## ✅ Future Improvements

- 🧠 Integrate Retrieval-Augmented Generation (RAG)
- 🧾 Add chat history with database
- 💬 Create a web UI (e.g., React, Thymeleaf)
- 🧪 LangSmith or LangChain4j for tracing/debugging
- 🩺 Switchable prompt modes (Bakery / Legal / Nursing)

---

## 👨‍💻 Author

**Jerome De Dios**  
🌍 Auerbach, Germany
---

## 📄 License

This project is licensed under the MIT License.
