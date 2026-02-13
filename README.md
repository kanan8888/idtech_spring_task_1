Student Management API
-
This is a simple Spring Boot application that manages students.

Features:
-
-       Store students with id, name, age, email.

-       Basic CRUD operations via REST endpoints:
        Method  	    Endpoint	      Description
    
        GET  	        /students	      Return all students
        GET	        /students/{id}	  Return student by id
        POST	        /students	      Add new student
        PUT	        /students/{id}	  Update student
        DELETE        /students/{id}	  Delete student

How to Run
- 
- git clone https://github.com/kanan8888/idtech_spring_task_1.git

- cd idtech_spring_task_1

- docker-compose up -d

- ./gradlew build

- ./gradlew bootRun

### Postman Collection

You can import the Postman collection to quickly test the API:

[Download Postman Collection](https://github.com/kanan8888/idtech_spring_task_1/blob/main/ms-student-idtech-spring-t1.postman_collection.json)
