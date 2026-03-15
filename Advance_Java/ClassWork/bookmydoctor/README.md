# BookMyDoctor — Doctor Appointment Booking System

A Spring Boot REST API application for booking doctor appointments with JWT-based authentication and role-based access control.

---

## Tech Stack

| Layer       | Technology                        |
|-------------|-----------------------------------|
| Framework   | Spring Boot 3.2.5                 |
| Security    | Spring Security + JWT (jjwt 0.11.5) |
| Database    | MySQL                             |
| ORM         | Spring Data JPA / Hibernate       |
| Build Tool  | Maven                             |
| Docs        | Springdoc OpenAPI (Swagger UI)    |
| Java        | Java 17                           |

---

## Prerequisites

- Java 17+
- Maven 3.6+
- MySQL 8.x running locally

---

## Database Setup

1. Start MySQL and run:

```sql
CREATE DATABASE bookmydoctor;
```

> Or let Spring Boot auto-create it via `createDatabaseIfNotExist=true` in the datasource URL.

2. Update credentials in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bookmydoctor?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=root
```

---

## Running the Application

```bash
# Clone / unzip the project
cd bookmydoctor

# Build
mvn clean install -DskipTests

# Run
mvn spring-boot:run
```

Server starts at: `http://localhost:8080`

---

## Swagger UI

Visit: `http://localhost:8080/swagger-ui.html`

To test secured endpoints in Swagger:
1. Login via `/api/auth/login`
2. Copy the `token` from response
3. Click **Authorize** button → Enter: `Bearer <token>`

---

## API Endpoints

### Authentication (Public)

| Method | Endpoint              | Description              |
|--------|-----------------------|--------------------------|
| POST   | /api/auth/register    | Register new user        |
| POST   | /api/auth/login       | Login and get JWT token  |

### Doctor APIs

| Method | Endpoint                    | Access       |
|--------|-----------------------------|--------------|
| POST   | /api/doctors                | Admin only   |
| PUT    | /api/doctors/{doctorId}     | Admin only   |
| DELETE | /api/doctors/{doctorId}     | Admin only   |
| GET    | /api/doctors                | Admin + User |
| GET    | /api/doctors/{doctorId}     | Admin + User |

### Appointment APIs

| Method | Endpoint                              | Access     |
|--------|---------------------------------------|------------|
| POST   | /api/appointments                     | User only  |
| GET    | /api/appointments/my                  | User only  |
| DELETE | /api/appointments/{appointmentId}     | User only  |
| GET    | /api/appointments                     | Admin only |

### User APIs

| Method | Endpoint     | Access     |
|--------|--------------|------------|
| GET    | /api/users   | Admin only |

---

## Authentication Flow

1. Register: `POST /api/auth/register`
2. Login: `POST /api/auth/login` → get JWT token
3. Pass token in header for all secured APIs:
   ```
   Authorization: Bearer <JWT_TOKEN>
   ```

---

## Default Roles

Roles are auto-seeded on startup:
- `ADMIN`
- `USER` (default for registration)

To create an ADMIN user, manually update the role in MySQL:
```sql
UPDATE users SET role_id = (SELECT id FROM roles WHERE role_name = 'ADMIN') WHERE email = 'admin@example.com';
```

---

## Sample Request Bodies

### Register
```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "password": "password123",
  "phoneNumber": "9876543210"
}
```

### Login
```json
{
  "email": "john@example.com",
  "password": "password123"
}
```

### Add Doctor (Admin)
```json
{
  "doctorName": "Dr. Priya Sharma",
  "specialization": "Cardiology",
  "hospitalName": "City Heart Hospital",
  "experienceYears": 10,
  "consultationFee": 500.00,
  "availableDays": "Monday, Wednesday, Friday",
  "availableTime": "10:00 AM - 2:00 PM"
}
```

### Book Appointment (User)
```json
{
  "doctorId": 1,
  "appointmentDate": "2026-03-20",
  "appointmentTime": "10:30:00"
}
```

---

## Project Structure

```
com.bookmydoctor
├── BookMyDoctorApplication.java
├── config/
│   ├── DataInitializer.java      # Seeds roles on startup
│   ├── SecurityConfig.java       # Spring Security + JWT config
│   └── SwaggerConfig.java        # OpenAPI config
├── controller/
│   ├── AuthController.java
│   ├── AppointmentController.java
│   ├── DoctorController.java
│   └── UserController.java
├── dto/                          # Request/Response DTOs
├── entity/                       # JPA Entities
├── exception/                    # Custom exceptions + global handler
├── repository/                   # Spring Data JPA repositories
├── security/
│   ├── CustomUserDetailsService.java
│   └── JwtAuthenticationFilter.java
├── service/                      # Business logic
└── util/
    └── JwtUtil.java              # JWT helper
```
