# Online Course Management System

Spring Boot REST API for managing online courses, enrollments, and course materials.

## Tech Stack

- Java 17
- Spring Boot 3.2.0
- Spring Data JPA
- MySQL
- Lombok
- SpringDoc OpenAPI (Swagger)
- Spring Cache

## Setup Instructions

### 1. Database Setup

Make sure MySQL is running. Create the database:

```sql
CREATE DATABASE course_management_db;
```

### 2. Configure application.properties

Update `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/course_management_db?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
```

### 3. Run the Application

```bash
mvn spring-boot:run
```

## API Endpoints

### Auth / User
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/auth/register | Register new user |
| POST | /api/auth/login | Login user |
| GET  | /api/users/{id} | Get user profile |
| POST | /api/users/{id}/profile-picture | Upload profile picture |

### Courses
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST   | /api/courses | Create course |
| PUT    | /api/courses/{id} | Update course |
| DELETE | /api/courses/{id} | Delete course |
| GET    | /api/courses | Get all courses (paginated) |
| GET    | /api/courses/{id} | Get course by ID |
| GET    | /api/courses/instructor/{id} | Get courses by instructor |

#### Pagination Example
```
GET /api/courses?page=0&size=10&sort=title&direction=asc
```

### Enrollments
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST   | /api/enrollments | Enroll student |
| GET    | /api/enrollments/student/{studentId} | Get student enrollments |
| GET    | /api/enrollments/course/{courseId} | Get course enrollments |
| PATCH  | /api/enrollments/{id}/progress | Update progress |

### Course Materials
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST   | /api/materials/upload | Upload material |
| GET    | /api/materials/{id}/download | Download material |
| GET    | /api/materials/course/{courseId} | Get course materials |

## Swagger UI

After starting the application, access Swagger UI at:

```
http://localhost:8080/swagger-ui/index.html
```

## Project Structure

```
com.learning.cms
├── config          → Swagger, CORS config
├── controllers     → REST Controllers
├── dto             → Request/Response DTOs
├── entity          → JPA Entities
├── exception       → Custom exceptions & GlobalExceptionHandler
├── mapper          → Entity ↔ DTO mapping
├── repository      → JPA Repositories
├── service         → Service interfaces
│   └── impl        → Service implementations
└── util            → FileStorageUtil
```
