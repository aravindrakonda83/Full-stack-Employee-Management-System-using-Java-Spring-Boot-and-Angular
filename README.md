# EMS Employee Management System with Angular and Spring Boot 👨‍💼

This full-stack Employee Management System provides a robust platform to manage employee data with secure, role-based access.  
It uses **Angular** for a responsive and interactive front-end and **Spring Boot** for a powerful RESTful back-end.

---
## 📸 Screenshots

![Login Page](https://github.com/aravindrakonda83/Full-stack-Employee-Management-System-using-Java-Spring-Boot-and-Angular/blob/main/images/Screenshot%202025-06-11%20164206.png)

![Registration Page](https://github.com/aravindrakonda83/Full-stack-Employee-Management-System-using-Java-Spring-Boot-and-Angular/blob/main/images/Screenshot%202025-06-11%20164224.png)

![Admin Dashboard 1](https://github.com/aravindrakonda83/Full-stack-Employee-Management-System-using-Java-Spring-Boot-and-Angular/blob/main/images/Screenshot%202025-06-11%20164314.png)

![Admin Dashboard 2](https://github.com/aravindrakonda83/Full-stack-Employee-Management-System-using-Java-Spring-Boot-and-Angular/blob/main/images/Screenshot%202025-06-11%20164323.png)

![User Dashboard](https://github.com/aravindrakonda83/Full-stack-Employee-Management-System-using-Java-Spring-Boot-and-Angular/blob/main/images/Screenshot%202025-06-11%20164352.png)


## 🔑 Key Features

### 👩‍💼 Employee Management:
- Add, update, delete employee records (Admin only)
- View all employees (User & Admin)

### 🔐 Authentication & Authorization:
- User Registration and Login
- JWT-based Authentication
- Role-based access:
    - **Admin**: Full CRUD
    - **User**: View-only access

---
## 🛠 Technology Stack

| Layer       | Technology |
|-------------|------------|
| Front-End   | Angular 15+, Bootstrap 5 |
| Back-End    | Java 17, Spring Boot 3 |
| Security    | Spring Security, JWT     |
| Database    | MySQL                    |
| Others      | Model Mapper, Lombok     |

---
## 🚀 Getting Started

### 📦 Project Setup

1. **Backend (Spring Boot)**
    - Clone the repo
      ```bash
      git clone https://github.com/aravindrakonda83/Full-stack-Employee-Management-System-using-Java-Spring-Boot-and-Angular.git
      ```
    - Configure `application.properties`:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/ems_db
      spring.datasource.username=root
      spring.datasource.password=your_password
      spring.jpa.hibernate.ddl-auto=update
      jwt.secret=your_secret_key
      ```
    - Run the app:
      ```bash
      ./mvnw spring-boot:run
      ```

2. **Frontend (Angular)**
    - Navigate to the Angular project:
      ```bash
      cd frontend
      ```
    - Install dependencies:
      ```bash
      npm install
      ```
    - Start the development server:
      ```bash
      ng serve
      ```
    - Open browser at: [http://localhost:4200](http://localhost:4200)

---

## 🔐 Default Credentials

| Username | Password  | Role  |
|----------|-----------|-------|
| admin    | admin123  | ADMIN |
| user     | user123   | USER  |

---

## 📡 API Integration

- The Angular frontend uses **HTTPClient** (or Axios) to communicate with the Spring Boot REST APIs.
- JWT tokens are stored and attached to every secured request via HTTP headers.

---

## ✅ Deployment

- Back-End: Deploy to **Heroku**, **Render**, or your own server
- Front-End: Deploy to **Netlify**, **Vercel**, or **GitHub Pages**

---

## 📄 License

This project is licensed under the **MIT License**.

---

## 👤 Author

**Aravind Rakonda**  
GitHub: [@aravindrakonda83](https://github.com/aravindrakonda83)
