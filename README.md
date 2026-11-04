# 🎓 Student Management REST API (Spring Boot)

A 3-layer backend REST API built with **Java** and **Spring Boot** that performs full CRUD operations on student records backed by a persistent **H2 SQL Database** and **Swagger UI**.

## 🚀 Tech Stack
* **Java 21 & Spring Boot 3.x**
* **Spring Web** (RESTful API Architecture: Controller → Service → Repository)
* **Spring Data JPA / Hibernate** (ORM & SQL Query Generation)
* **H2 Database** (File-based Persistent SQL Storage)
* **Springdoc OpenAPI / Swagger UI** (Interactive API Testing Dashboard)

## 📌 API Endpoints
| HTTP Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/get_AlL_Students_Data` | Fetch all students from the SQL database |
| `GET` | `/Students_By/{id}` | Fetch a single student by ID |
| `POST` | `/Add_new_Student_Data` | Save a new student record |
| `PUT` | `/UPDATE_Student_By/{id}` | Update an existing student by ID |
| `DELETE` | `/Students_By/{id}` | Delete a student record by ID |

## 💻 How to Run Locally
1. Clone the repository and open it in **IntelliJ IDEA**.
2. Run `DemoApplication.java`.
3. Open Swagger UI in your browser: `http://localhost:8080/swagger-ui/index.html`
