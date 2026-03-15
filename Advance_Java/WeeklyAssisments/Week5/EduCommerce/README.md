# EduCommerce - Spring Cloud Microservices

A complete Spring Boot microservices application for Student Performance & Attendance Management.

## Architecture

```
Client (Postman/Browser)
        |
   API Gateway :8080  (JWT Security + Load Balancing)
        |
   --------------------------------
   |            |                |
Student:8081  Attendance:8082  Result:8083
   |            |                |
   ------Eureka Server:8761-------
                |
          Config Server:8888
                |
          Git Config Repo

Observability: All Services --> Zipkin:9411
```

## Services & Ports

| Service          | Port |
|-----------------|------|
| Config Server   | 8888 |
| Eureka Server   | 8761 |
| API Gateway     | 8080 |
| Student Service | 8081 |
| Attendance Svc  | 8082 |
| Result Service  | 8083 |
| Zipkin          | 9411 |

## Quick Start (Local)

### Prerequisites
- Java 17+
- Maven 3.8+
- (Optional) Docker & Docker Compose

### Step 1: Start Zipkin
```bash
docker run -d -p 9411:9411 openzipkin/zipkin
```

### Step 2: Set Environment Variables
```bash
export JWT_SECRET=bXlTZWNyZXRLZXlGb3JFZHVDb21tZXJjZUFwcGxpY2F0aW9u
export ZIPKIN_URL=http://localhost:9411/api/v2/spans
```

### Step 3: Start Services IN ORDER
```bash
# 1. Config Server
cd config-server && mvn spring-boot:run &

# 2. Eureka Server
cd eureka-server && mvn spring-boot:run &

# 3. Student Service
cd student-service && mvn spring-boot:run &

# 4. Attendance Service
cd attendance-service && mvn spring-boot:run &

# 5. Result Service
cd result-service && mvn spring-boot:run &

# 6. API Gateway (last)
cd api-gateway && mvn spring-boot:run &
```

### Step 4: Verify
- Eureka Dashboard: http://localhost:8761
- Zipkin UI: http://localhost:9411
- API Gateway: http://localhost:8080

---

## API Usage (via Gateway on port 8080)

### 1. Register a Student
```
POST http://localhost:8080/auth/register
Content-Type: application/json

{
  "name": "John Doe",
  "email": "john@example.com",
  "password": "password123",
  "department": "Computer Science",
  "semester": 3
}
```

### 2. Login
```
POST http://localhost:8080/auth/login
Content-Type: application/json

{
  "email": "john@example.com",
  "password": "password123"
}
```
Response gives you a JWT token. Use it in all further requests.

### 3. Use JWT Token
```
Authorization: Bearer <your_jwt_token>
```

### 4. Create a Course
```
POST http://localhost:8080/courses
Authorization: Bearer <token>

{
  "courseName": "Data Structures",
  "courseCode": "CS301",
  "instructor": "Dr. Smith",
  "credits": 4
}
```

### 5. Enroll Student in Course
```
POST http://localhost:8080/enroll?studentId=1&courseId=1
Authorization: Bearer <token>
```

### 6. Mark Attendance
```
POST http://localhost:8080/attendance
Authorization: Bearer <token>

{
  "studentId": 1,
  "courseId": 1,
  "date": "2024-01-15",
  "status": "PRESENT"
}
```

### 7. Add Result
```
POST http://localhost:8080/results
Authorization: Bearer <token>

{
  "studentId": 1,
  "courseId": 1,
  "examType": "MIDTERM",
  "marksObtained": 85,
  "maxMarks": 100
}
```

### 8. Get Student Performance (calls 2 services)
```
GET http://localhost:8080/results/performance?studentId=1&courseId=1
Authorization: Bearer <token>
```

### 9. Get Attendance Percentage
```
GET http://localhost:8080/attendance/percentage?studentId=1&courseId=1
Authorization: Bearer <token>
```

---

## Spring Cloud Features Implemented

| Feature | Where Used |
|--------|-----------|
| Config Server | All services fetch config from Git |
| Eureka Discovery | All services register & discover |
| API Gateway | JWT filter + routing + load balancing |
| OpenFeign | Attendance→Student, Result→Student+Attendance |
| Circuit Breaker (Resilience4j) | Fallback when services are down |
| Distributed Tracing | Micrometer + Zipkin across all services |
| JWT Security | Generated in Student Service, validated at Gateway |
| Load Balancing | lb:// prefix in Gateway routes |

---

## Docker Compose

```bash
cp .env.example .env
# Edit .env with your values
docker-compose up --build
```

---

## H2 Consoles (for development)
- Student DB: http://localhost:8081/h2-console
- Attendance DB: http://localhost:8082/h2-console  
- Result DB: http://localhost:8083/h2-console

JDBC URL: `jdbc:h2:mem:studentdb` (or attendancedb, resultdb)
