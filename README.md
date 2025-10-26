# Quantum Qubit Buzzer Backend

This is the backend server for the Quantum Qubit Buzzer app, built with Kotlin and Ktor. It manages real-time quiz lobbies, participant joining, buzzing, and round management via WebSockets.

## Features
- Create and join quiz lobbies
- Real-time participant management
- Secure host authentication
- Buzz-in logic with round timing
- WebSocket-based communication

## Getting Started

### Prerequisites
- JDK 17 or higher
- Gradle (or use the included Gradle wrapper)

### Running Locally
```sh
./gradlew run
```
The server will start on `ws://localhost:8080/buzzer` by default.

### Deploying to Railway/Cloud
- The backend will listen on the port provided by the Railway environment (usually 8080).
- Use the following WebSocket URL for clients:
  ```
  wss://quantum-qubit-buzzer-backend-production.up.railway.app:8080/buzzer
  ```
