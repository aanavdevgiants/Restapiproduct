# 🧾 Product Management REST API

This project is a *Spring Boot-based REST API* that manages product-related operations including create, read, update, and delete (CRUD). It is connected to a **CI/CD pipeline using Jenkins** and version-controlled with **GitHub**.

Developed with best practices for scalability, modularity, and real-world readiness, it is inspired by actual enterprise use cases implemented during my tenure at **TCS**.

---

## 👨‍💻 Developer Info

*Abhishek Tiwari* 
Java Backend Developer | Spring Boot | REST API | Jenkins CI/CD | GitHub | TCS  
📧 pandit.abhi650@gmail.com  
🔗 [LinkedIn Profile](https://linkedin.com/in/abhishek-tiwari-b336a7168)

---

#Tech Stack

- Java 17
- Spring Boot 2.7
- RESTful APIs
- MySQL (Database)
- Maven (Build Tool)
- Jenkins (CI/CD Pipeline)
- Git & GitHub (Version Control)
- Postman (API Testing)
- HTML, CSS, JavaScript (UI Integration Support)

---

#Key Features

- ✅ Create, Read, Update, Delete Products
- ✅ Well-structured API architecture using Spring Boot
- ✅ **CI/CD pipeline with Jenkins:** auto-build & deploy on GitHub commit
- ✅ Connected to GitHub repo for version control
- ✅ Integration-ready structure for future microservice development
- ✅ Project follows MVC design pattern

---

## 💼 Real-World Contribution @TCS

->Successfully implemented a **custom inactivity timeout feature** using Java Servlet technology
->Used background thread to detect inactivity and call logout method securely
->Configured via scheduler framework; added frontend alerts before session expiration
->Integrated REST APIs in enterprise-scale marking and evaluation systems
->Contributed to **ION Digital Marking and Evaluation Hub** at TCS with secure and scalable modules

---

## 🛠️ API Endpoints Example

| Method | Endpoint             | Description        |
|--------|----------------------|--------------------|
| GET    | `/products`          | Get all products   |
| GET    | `/products/{id}`     | Get product by ID  |
| POST   | `/products`          | Add new product    |
| PUT    | `/products/{id}`     | Update product     |
| DELETE | `/products/{id}`     | Delete product     |

---

## 🧪 Testing

Use Postman or any REST client with:
- Content-Type: `application/json`
- Sample JSON:
```json
{
  "name": "Laptop",
  "price": 50000,
  "description": "Dell i5 11th Gen"
}
