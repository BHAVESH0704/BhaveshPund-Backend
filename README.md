# BhaveshPund-Backend

A Spring Boot REST API that powers my personal portfolio website. This backend provides public APIs for displaying portfolio information and secure admin APIs for managing content through JWT-based authentication.

## 🚀 Live API

**Base URL**

```
https://bhaveshpund-backend.onrender.com/api/v1
```

## ✨ Features

- RESTful API built with Spring Boot
- JWT Authentication & Authorization
- Role-based access for admin endpoints
- CRUD operations for portfolio content
- Public APIs for portfolio visitors
- Secure admin APIs
- Database integration using Spring Data JPA
- Deployed on Render
- Connected to TiDB Cloud (MySQL-compatible)

## 🛠️ Tech Stack

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- JWT
- MySQL / TiDB Cloud
- Maven
- Lombok

## 📂 Project Structure

```
src
├── main
│   ├── java
│   │   ├── config
│   │   ├── controller
│   │   ├── dto
│   │   ├── entity
│   │   ├── repository
│   │   ├── security
│   │   ├── service
│   │   └── BackendApplication.java
│   └── resources
│       └── application.properties
```

## 🔐 Authentication

The application uses JWT authentication.

### Public Endpoints

```
GET /api/v1/about
GET /api/v1/projects
GET /api/v1/skills
GET /api/v1/experience
GET /api/v1/education
GET /api/v1/certification
GET /api/v1/contact
```

### Protected Endpoints

```
/api/v1/admin/**
```

All admin endpoints require a valid JWT access token.

## 🗄️ Database

The backend uses a MySQL-compatible database hosted on **TiDB Cloud** and is managed using Spring Data JPA.

## ⚙️ Running Locally

### Clone the repository

```bash
git clone https://github.com/BHAVESH0704/BhaveshPund-Backend.git
```

### Navigate to the project

```bash
cd BhaveshPund-Backend
```

### Configure the database

Update `application.properties` (or environment variables) with your database credentials.

### Build the project

```bash
mvn clean install
```

### Run the application

```bash
mvn spring-boot:run
```

The application will start at:

```
http://localhost:8080
```

## 🌐 API Base URLs

**Local**

```
http://localhost:8080/api/v1
```

**Production**

```
https://bhaveshpund-backend.onrender.com/api/v1
```

## 🚀 Deployment

- **Backend:** Render
- **Database:** TiDB Cloud
- **Build Tool:** Maven

## 🔗 Frontend Repository

Frontend Repository:
https://github.com/BHAVESH0704/BhaveshPund-Frontend

## 👨‍💻 Author

**Bhavesh Pund**

GitHub: https://github.com/BHAVESH0704

LinkedIn: [https://www.linkedin.com/in/bhaveshpund](https://www.linkedin.com/in/bhaveshpund/)

