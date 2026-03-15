# MediConnect - Doctor Appointment Microservices System

## Architecture Overview

```
Client
  |
  | (Port 8080)
API Gateway
  |
  |------------------------------|
  |                              |
Doctor Service              Appointment Service
(Port 8081 / 8082)          (Port 8083)
  |                              |
MySQL DB                    MySQL DB          <-- Feign Client calls Doctor Service
(mediconnect_doctor)        (mediconnect_appointment)

All services registered with Eureka Server (Port 8761)
```

---

## Prerequisites

- Java 17+
- Maven 3.8+
- MySQL 8.x running on localhost:3306
- Postman (for API testing)

---

## MySQL Setup

Run the following SQL commands in MySQL before starting services:

```sql
CREATE DATABASE IF NOT EXISTS mediconnect_doctor;
CREATE DATABASE IF NOT EXISTS mediconnect_appointment;
```

> **Note:** Update `username` and `password` in `application.yml` files if your MySQL credentials differ from `root/root`.

---

## How to Run

### Step 1 - Start Eureka Server
```bash
cd eureka-server
mvn spring-boot:run
```
Access Eureka Dashboard: http://localhost:8761

---

### Step 2 - Start Doctor Service (Instance 1 - Port 8081)
```bash
cd doctor-service
mvn spring-boot:run
```

### Step 2b - Start Doctor Service (Instance 2 - Port 8082) [For Load Balancing]
```bash
cd doctor-service
mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8082
```

---

### Step 3 - Start Appointment Service
```bash
cd appointment-service
mvn spring-boot:run
```

---

### Step 4 - Start API Gateway
```bash
cd api-gateway
mvn spring-boot:run
```

---

## Service Ports Summary

| Service              | Port         |
|----------------------|--------------|
| Eureka Server        | 8761         |
| API Gateway          | 8080         |
| Doctor Service       | 8081 / 8082  |
| Appointment Service  | 8082 (default 8083 if conflict) |

---

## API Endpoints (via API Gateway - Port 8080)

### Doctor APIs

| Method | URL                            | Description          |
|--------|--------------------------------|----------------------|
| POST   | /doctor/doctors                | Create a doctor      |
| GET    | /doctor/doctors                | Get all doctors      |
| GET    | /doctor/doctors/{id}           | Get doctor by ID     |
| PUT    | /doctor/doctors/{id}           | Update doctor        |
| DELETE | /doctor/doctors/{id}           | Delete doctor        |

### Appointment APIs

| Method | URL                               | Description              |
|--------|-----------------------------------|--------------------------|
| POST   | /appointment/appointments         | Create appointment       |
| GET    | /appointment/appointments         | Get all appointments     |
| GET    | /appointment/appointments/{id}    | Get appointment by ID    |
| DELETE | /appointment/appointments/{id}    | Cancel appointment       |

---

## Sample Postman Requests

### Create Doctor
```
POST http://localhost:8080/doctor/doctors
Content-Type: application/json

{
  "name": "Dr. Ramesh Kumar",
  "specialization": "Cardiology",
  "experience": 10,
  "hospitalName": "Apollo Hospital",
  "availability": "MON-FRI 9AM-5PM"
}
```

### Create Appointment
```
POST http://localhost:8080/appointment/appointments
Content-Type: application/json

{
  "patientName": "Rahul Sharma",
  "doctorId": 1,
  "appointmentDate": "2026-04-15"
}
```

---

## Feign Client - Load Balancing

When Doctor Service runs on multiple ports (8081 and 8082), the Feign Client in Appointment Service automatically distributes requests using Eureka's service registry + Spring Cloud LoadBalancer.

Verify on Eureka Dashboard (http://localhost:8761) that both instances of `doctor-service` are registered.

---

## Project Structure

```
mediconnect/
├── eureka-server/
│   ├── src/main/java/com/mediconnect/eurekaserver/
│   │   └── EurekaServerApplication.java
│   └── src/main/resources/application.yml
│
├── doctor-service/
│   ├── src/main/java/com/mediconnect/doctorservice/
│   │   ├── DoctorServiceApplication.java
│   │   ├── controller/DoctorController.java
│   │   ├── service/DoctorService.java
│   │   ├── service/DoctorServiceImpl.java
│   │   ├── repository/DoctorRepository.java
│   │   ├── entity/Doctor.java
│   │   ├── dto/DoctorRequestDTO.java
│   │   ├── dto/DoctorResponseDTO.java
│   │   └── exception/GlobalExceptionHandler.java
│   └── src/main/resources/application.yml
│
├── appointment-service/
│   ├── src/main/java/com/mediconnect/appointmentservice/
│   │   ├── AppointmentServiceApplication.java
│   │   ├── controller/AppointmentController.java
│   │   ├── service/AppointmentService.java
│   │   ├── service/AppointmentServiceImpl.java
│   │   ├── repository/AppointmentRepository.java
│   │   ├── entity/Appointment.java
│   │   ├── dto/AppointmentRequestDTO.java
│   │   ├── dto/AppointmentResponseDTO.java
│   │   ├── dto/DoctorResponseDTO.java
│   │   ├── feign/DoctorServiceClient.java
│   │   └── exception/GlobalExceptionHandler.java
│   └── src/main/resources/application.yml
│
└── api-gateway/
    ├── src/main/java/com/mediconnect/apigateway/
    │   └── ApiGatewayApplication.java
    └── src/main/resources/application.yml
```
