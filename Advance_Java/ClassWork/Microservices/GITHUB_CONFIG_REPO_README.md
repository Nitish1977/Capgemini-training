# GitHub Config Repo Setup - IMPORTANT

Tumhara config repo hai: https://github.com/Nitish1977/microservice-config

## GitHub repo mein ye files honi chahiye (root level par):

### 1. user-service.properties
```properties
spring.application.name=user-service
server.port=8085

eureka.client.service-url.defaultZone=http://localhost:8761/eureka/
eureka.instance.prefer-ip-address=true

management.tracing.sampling.probability=1.0
management.zipkin.tracing.endpoint=http://localhost:9411/api/v2/spans
management.endpoints.web.exposure.include=*
```

### 2. doctor-service.properties
```properties
spring.application.name=doctor-service
server.port=8010

eureka.client.service-url.defaultZone=http://localhost:8761/eureka/
eureka.instance.prefer-ip-address=true

spring.cloud.openfeign.circuitbreaker.enabled=true
resilience4j.circuitbreaker.instances.userService.failure-rate-threshold=50
resilience4j.circuitbreaker.instances.userService.minimum-number-of-calls=5
resilience4j.circuitbreaker.instances.userService.wait-duration-in-open-state=10s
resilience4j.circuitbreaker.instances.userService.permitted-number-of-calls-in-half-open-state=3

management.endpoints.web.exposure.include=*
management.health.circuitbreaker.enabled=true

management.tracing.sampling.probability=1.0
management.zipkin.tracing.endpoint=http://localhost:9411/api/v2/spans
```

## IMPORTANT - File naming rule:
- spring.application.name=user-service  →  GitHub file: user-service.properties
- spring.application.name=doctor-service → GitHub file: doctor-service.properties
- Name CASE SENSITIVE hai, lowercase use karo

## Startup Order:
1. Zipkin  → docker run -d -p 9411:9411 openzipkin/zipkin
2. ServiceRegistry (Eureka) → port 8761
3. config-server → port 8888
4. UserService → port 8085  (config server se properties lega)
5. DoctorService → port 8010 (config server se properties lega)
6. ApiGateway → port 8080

## Verify config server working:
- http://localhost:8888/user-service/default
- http://localhost:8888/doctor-service/default

## Zipkin Dashboard:
- http://localhost:9411
