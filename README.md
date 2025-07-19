# Spring Boot Security with JWT Authentication

This is a **Spring Boot backend project** that implements **JWT-based authentication** using Spring Security. The application supports user registration, login, and protected API access with token validation.

No Front End You Can test this Application using any Web Browser or By Using PostMan
---

## 📂 Project Structure

```
Security/
├── src/
│   ├── main/
│   │   ├── java/com/securityy/Security/
│   │   │   ├── config/                  # Security configuration and JWT filter
│   │   │   │   ├── SecurityConfig.java
│   │   │   │   └── JwtAuthenticationFilter.java
│   │   │   ├── controller/              # API controllers
│   │   │   │   ├── HelloController.java
│   │   │   │   ├── ProductController.java
│   │   │   │   └── UserController.java
│   │   │   ├── entity/                  # User entity
│   │   │   │   └── User.java
│   │   │   ├── repo/                    # Spring Data JPA repository
│   │   │   │   └── UserRepository.java
│   │   │   ├── service/                 # Business logic and JWT utilities
│   │   │   │   ├── CustomUserDetailsService.java
│   │   │   │   ├── JwtService.java
│   │   │   │   ├── UserService.java
│   │   │   │   └── CustomUserDetails.java
│   │   │   └── SecurityApplication.java  # Main application entry
│   ├── resources/
│   │   ├── static/
│   │   ├── templates/
│   │   └── application.properties
│   └── test/
├── .gitignore
├── mvnw, mvnw.cmd
└── pom.xml
```

---

## 🛠 Technologies Used

- Java 17+
- Spring Boot
- Spring Security
- JWT (Java JWT - `io.jsonwebtoken`)
- Maven
- MySQL
- Lombok

---

## 🔐 Features

- ✅ User registration (`/register`)
- ✅ User login with JWT token (`/login`)
- ✅ Protected APIs (e.g. `/hello`, `/products`)
- ✅ JWT validation with custom authentication filter
- ✅ Encrypted password storage using `BCryptPasswordEncoder`
- ✅ Role-based security ready for extension

---

## 🧪 API Endpoints

| Method | Endpoint       | Description             | Auth Required |
|--------|----------------|-------------------------|---------------|
| POST   | `/register`    | Register a new user     | ❌ No         |
| POST   | `/login`       | Authenticate & get JWT  | ❌ No         |
| GET    | `/hello`       | Protected test endpoint | ✅ Yes        |
| GET    | `/products`    | Protected endpoint      | ✅ Yes        |

---

## ⚙️ MySQL Configuration (application.properties)

```properties
# MySQL DB Connection
spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update

# JWT Configuration
jwt.secret=yourSuperSecretKey123!
jwt.expiration=86400000
```

> 💡 Replace `your_db_name`, `your_db_user`, and `your_db_pass` with your actual MySQL config.

---

## ▶️ Run the Application

1. **Build & Run**

```bash
./mvnw spring-boot:run
```

2. **Access APIs via Postman**

- **Register** a new user:

```http
POST /register
Content-Type: application/json
{
  "username": "test",
  "email": "test@example.com",
  "password": "test123"
}
```

- **Login** and receive a JWT:

```http
POST /login
Content-Type: application/json
{
  "email": "test@example.com",
  "password": "test123"
}
```

- **Use JWT** in Authorization header to access secured endpoints:

```
GET /hello
Authorization: Bearer <your_token_here>
```

---

## 🧾 .gitignore (if not already included)

```gitignore
/target/
*.class
*.log
*.jar
*.war
*.iml
/.idea/
/*.iws
*.db
.env
*.properties
```

---

## 👤 Author

**Chenna Yenugu**  
🔗 GitHub: [@Chenna000](https://github.com/Chenna000)

---
