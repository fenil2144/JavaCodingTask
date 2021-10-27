# JavaCodingTask
This Project is built using Java Springboot Framework that interacts with Mysql database using JPA.SL4J Logger has been used for logging purpose.

To Run this project:
-> Make Mysql root credentials as username: root & password: root.
->Please download the jar file and run command "java -jar java-coding-task-0.0.1-SNAPSHOT.jar" in cmd after moving to downloaded file location.
->Done. You will be able to see project started info in same console.

API's:
1) http://localhost:8080/register | POST Endpoint | Used to register the user.
  Request Body:
  {
      "username":"fenil",
      "password":"fenil1",
      "role":"ROLE_ADMIN"
  }
 
2) http://localhost:8080/authenticate | POST Endpoint | Used for User Login & returns Token.
  Request Body:
  {
    "username":"fenil",
    "password":"fenil1"
  }

3) http://localhost:8080/adminHome | GET Endpoint | Endpoint that is only accessible by users with role ADMIN.
  
4) http://localhost:8080/commonHome | GET Endpoint | Common Endpoint that is accessible by both users with role USER & ADMIN.

  
