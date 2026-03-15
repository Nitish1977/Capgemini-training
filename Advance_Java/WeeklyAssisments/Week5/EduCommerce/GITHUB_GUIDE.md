# GitHub Setup Guide - EduCommerce Project

## Repository Structure on GitHub
You need TWO repositories:
1. `educommerce-microservices` → Main project code
2. `educommerce-config` → Config repo (used by Config Server)

---

## Step 1: Create Config Repo on GitHub

1. Go to GitHub → New Repository
2. Name it: `educommerce-config`
3. Make it **Public** (Config Server needs to read it)
4. Click "Create Repository"

Then push the config-repo folder:
```bash
cd config-repo
git init
git add .
git commit -m "Initial config files"
git remote add origin https://github.com/YOUR_USERNAME/educommerce-config.git
git push -u origin main
```

---

## Step 2: Update Config Server URL

Open `config-server/src/main/resources/application.yml` and update:
```yaml
spring:
  cloud:
    config:
      server:
        git:
          uri: https://github.com/YOUR_USERNAME/educommerce-config
```

---

## Step 3: Push Main Project to GitHub

1. Go to GitHub → New Repository
2. Name it: `educommerce-microservices`
3. Click "Create Repository"

Then push:
```bash
cd EduCommerce
git init
git add .
git commit -m "Initial commit: Spring Cloud EduCommerce microservices"
git remote add origin https://github.com/YOUR_USERNAME/educommerce-microservices.git
git push -u origin main
```

---

## Step 4: Good Commit Practices

After initial push, commit each feature separately:
```bash
git add student-service/
git commit -m "feat: Add Student Service with JWT auth"

git add attendance-service/
git commit -m "feat: Add Attendance Service with Feign + Circuit Breaker"

git add result-service/
git commit -m "feat: Add Result Service with GPA calculation"

git add api-gateway/
git commit -m "feat: Add API Gateway with JWT filter"

git add docker-compose.yml
git commit -m "chore: Add Docker Compose for all services"
```

---

## Step 5: Add .gitignore

Create `.gitignore` in root:
```
target/
*.class
*.jar
.env
.DS_Store
*.iml
.idea/
.mvn/
```

---

## Step 6: Create README Badges (Optional)

Add to README.md:
```
![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2-green)
![Spring Cloud](https://img.shields.io/badge/Spring%20Cloud-2023.0-blue)
```

---

## Recommended Branch Strategy

```
main          → stable, working code
develop       → integration branch
feature/xxx   → individual feature branches
```

Example:
```bash
git checkout -b feature/circuit-breaker
# make changes
git push origin feature/circuit-breaker
# Create Pull Request on GitHub
```
