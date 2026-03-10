# Spring MVC Product Management System

## Project Overview

This is a comprehensive **Product Management Application** built using the **Spring MVC** framework. It serves as a practical implementation of the Model-View-Controller pattern, showcasing persistent data storage with **Spring Data JPA** and robust **Role-Based Access Control (RBAC)**.

The system allows administrators to manage a full product catalog while providing users with a seamless, paginated browsing experience.

---

## Core Features

* **Full CRUD Lifecycle**: Create, Read, Update, and Delete product entries.
* **Dynamic Searching**: Real-time filtering of the product catalog via keyword search.
* **Advanced Pagination**: Optimized data fetching and UI navigation for large datasets.
* **Security & Authorization**:
  * **Role-Based Access Control**: Distinct permissions for Admin and User roles.
  * **Secure Authentication**: Integrated Login/Logout functionality.
  * **Protected Routes**: Restricted access to administrative URL patterns.


* **Responsive UI**: A modern interface built with **Thymeleaf** and **Bootstrap 5**, fully compatible with mobile and desktop views.

---

## Technology Stack

| Layer | Technology |
| --- | --- |
| **Backend** | Java 17, Spring Boot, Spring MVC |
| **Security** | Spring Security |
| **Persistence** | Spring Data JPA, Hibernate |
| **Database** | H2 (In-Memory) |
| **Frontend** | Thymeleaf, Bootstrap 5 |
| **Build Tool** | Maven |

---

## Architecture & Directory Structure

The project follows a standard Maven/Spring Boot layout to maintain a clean separation of concerns:

```text
src/main/java/com/java/enset/
├── entity/          # JPA Entities (Database Models)
├── repository/      # Data Access Layer (Spring Data JPA)
├── controller/      # MVC Controllers & UI Logic
├── security/        # Security Configurations & Auth Providers
└── SpringMvcProductAppApplication.java  # Application Entry Point

```

---

## Installation 

### Prerequisites

* **JDK 17** or higher
* **Maven 3.x**
* Your preferred IDE (IntelliJ IDEA, Eclipse, VS Code)

### Setup Steps

1. **Clone the Repository**
```bash
git clone https://github.com/ELHAIDYousef/spring-mvc-product-app-tp2.git
cd spring-mvc-product-app-tp2

```


2. **Database Configuration**
* By default, the app uses **H2 (In-Memory)**. Access it at `/h2-console` after launch.


3. **Build and Run**
```bash
mvn clean install
mvn spring-boot:run

```


4. **Access the App**
Navigate to `http://localhost:8080` in your browser.

---

## Default Credentials

The following users are pre-loaded in memory for testing:

| Role | Username | Password |
| --- | --- | --- |
| **Admin** | `admin` | `1234` |
| **User** | `user1` | `1234` |
| **User** | `user2` | `1234` |

---

## Visual Showcase
### =========== Login page ===========
<img width="1037" height="408" alt="image" src="https://github.com/user-attachments/assets/6a678599-0994-4080-bd1f-64d8ff1953e9" />

### =========== Index page ===========
<img width="1546" height="509" alt="image" src="https://github.com/user-attachments/assets/b71f164b-dcff-47b0-b48c-e52b6d91027a" />

### =========== Add a new product form ===========
<img width="1608" height="605" alt="image" src="https://github.com/user-attachments/assets/ab633a90-e4c8-41c9-926c-dd715a0254e2" />

### =========== Edit a product form ===========
<img width="1594" height="622" alt="image" src="https://github.com/user-attachments/assets/30cc5d8b-5587-441e-8e0b-2ca81cd4efd7" />






---

## Contact

**Yousef ELHAID**

* [GitHub Profile](https://www.google.com/search?q=https://github.com/ELHAIDYousef)

