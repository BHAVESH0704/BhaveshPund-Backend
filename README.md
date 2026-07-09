# 🚀 Bhavesh Pund | Portfolio Backend

A secure and scalable REST API built using **Spring Boot** that powers my personal portfolio website. The backend provides dynamic content management through a protected admin dashboard using **JWT Authentication**, while serving portfolio data to the frontend through REST APIs.

## 🌐 Live API

**Backend URL**

👉 https://bhaveshpund-backend-production.up.railway.app

---

# ✨ Features

- RESTful API Architecture
- JWT Authentication
- Spring Security
- Secure Admin Login
- Protected CRUD Operations
- MySQL Database Integration
- JPA & Hibernate
- CORS Configuration
- Railway Deployment
- Production Ready

---

# 🛠️ Tech Stack

### Backend

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- JWT (JSON Web Token)
- Maven

### Database

- MySQL

### Deployment

- Railway

---

# 📁 Project Structure

```
src
└── main
    ├── java
    │   └── com.bhavesh.portfolio
    │       ├── admin
    │       ├── auth
    │       ├── controller
    │       ├── dto
    │       ├── entity
    │       ├── jwt
    │       ├── repository
    │       ├── security
    │       ├── service
    │       └── PortfolioApplication.java
    │
    └── resources
        ├── application.properties
        └── ...
```

---

# 🔐 Authentication

The backend uses **JWT (JSON Web Token)** authentication.

### Authentication Flow

1. Admin logs in using username and password.
2. Backend validates credentials.
3. JWT token is generated.
4. Frontend stores the token.
5. Protected API requests include:

```
Authorization: Bearer <JWT_TOKEN>
```

6. JWT Filter validates every protected request.

---

# 📌 REST API Endpoints

## Public APIs

| Method | Endpoint |
|---------|----------|
| GET | `/api/v1/about` |
| GET | `/api/v1/projects` |
| GET | `/api/v1/skills` |
| GET | `/api/v1/experience` |
| GET | `/api/v1/education` |
| GET | `/api/v1/certifications` |
| GET | `/api/v1/contact` |

---

## Authentication

| Method | Endpoint |
|---------|----------|
| POST | `/api/v1/auth/login` |

---

## Protected Admin APIs

### About

- GET `/api/v1/admin/about`
- PUT `/api/v1/admin/about`

### Projects

- GET `/api/v1/admin/projects`
- POST `/api/v1/admin/projects`
- PUT `/api/v1/admin/projects/{id}`
- DELETE `/api/v1/admin/projects/{id}`

### Skills

- GET `/api/v1/admin/skills`
- POST `/api/v1/admin/skills`
- PUT `/api/v1/admin/skills/{id}`
- DELETE `/api/v1/admin/skills/{id}`

### Experience

- GET `/api/v1/admin/experience`
- POST `/api/v1/admin/experience`
- PUT `/api/v1/admin/experience/{id}`
- DELETE `/api/v1/admin/experience/{id}`

### Education

- GET `/api/v1/admin/education`
- POST `/api/v1/admin/education`
- PUT `/api/v1/admin/education/{id}`
- DELETE `/api/v1/admin/education/{id}`

### Certifications

- GET `/api/v1/admin/certifications`
- POST `/api/v1/admin/certifications`
- PUT `/api/v1/admin/certifications/{id}`
- DELETE `/api/v1/admin/certifications/{id}`

### Contact

- GET `/api/v1/admin/contact`
- PUT `/api/v1/admin/contact`

---

# 🗄️ Database

The application uses **MySQL** as the primary database.

### Main Tables

- admin
- about
- project
- skill
- experience
- education
- certification
- contact

Hibernate automatically manages the schema using JPA entities.

---

# ⚙️ Configuration

Create an `application.properties` file or configure environment variables.

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/portfolio_db
spring.datasource.username=root
spring.datasource.password=your_password

jwt.secret=your_secret_key
jwt.expiration=3600000
```

For Railway deployment, database credentials are provided through environment variables.

---

# ▶️ Running Locally

Clone the repository

```bash
git clone https://github.com/BHAVESH0704/BhaveshPund-Backend.git
```

Navigate to the project

```bash
cd BhaveshPund-Backend
```

Build the project

```bash
mvn clean install
```

Run the application

```bash
mvn spring-boot:run
```

The backend will start on:

```
http://localhost:8080
```

---

# 🔗 Frontend

Frontend Repository

https://github.com/BHAVESH0704/BhaveshPund-Frontend

Frontend Deployment

https://bhaveshpund.vercel.app

---

# 📷 API Testing

The REST APIs can be tested using:

- Postman
- Bruno
- Insomnia
- cURL

---

# 🔒 Security

- Spring Security
- JWT Authentication
- BCrypt Password Encoding
- Protected Admin APIs
- CORS Configuration
- Role-based request protection

---

# 🚀 Future Improvements

- Refresh Tokens
- Role-Based Access Control (RBAC)
- Image Upload Support
- Cloudinary Integration
- Swagger/OpenAPI Documentation
- Docker Support
- GitHub Actions CI/CD
- Rate Limiting
- Request Validation Improvements

---

# 👨‍💻 Developer

**Bhavesh Pund**

Electronics & Telecommunication Engineering Student

Aspiring Full Stack Java Developer

📍 Pune, Maharashtra, India

📧 Email: **pundbhavesh@gmail.com**

🔗 LinkedIn

https://www.linkedin.com/in/bhaveshpund/

💻 GitHub

https://github.com/BHAVESH0704

🌐 Portfolio

https://bhaveshpund.vercel.app

---

# 📄 License

This project is developed for learning, portfolio, and professional showcase purposes.

---

## ⭐ Support

If you found this project useful, consider giving it a **⭐ Star** on GitHub.
