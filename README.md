# User Registration API

A RESTful backend application built with **Spring Boot 4**, **Java 21**, and **Gradle**.  
The project provides user management APIs secured with **Spring Security**, persisted using **Spring Data JPA**, and deployed using **Docker and Docker Compose**.

---

## 🚀 Tech Stack

- **Java 21**
- **Spring Boot 4**
- **Spring Security**
- **Spring Data JPA (Hibernate)**
- **RESTful APIs**
- **Gradle (Wrapper)**
- **Docker**
- **Docker Compose**

---

## 📦 Features

- User registration and management
- RESTful API design
- Stateless authentication
- JPA-based persistence
- UUID-based entity identifiers
- Dockerized application
- Docker Compose for multi-container setup (API + database)
- Clean layered architecture

---

## 🏗️ Project Structure

├── src/
│ └── main/java/com/example/userregistration
│ ├── config
│ ├── controller
│ ├── model
│ ├── repository
│ ├── service
│ └── UserRegistrationApplication.java
├── Dockerfile
├── docker-compose.yml
├── build.gradle
├── gradle/
├── gradlew
└── README.md

---

## 🐳 Docker

### Build Docker image
```bash
docker build -t user-registration .
