
# Spring Boot + Angular app

Simple application to register users and view data through an interface.
## Run Locally

Clone this project to yout computer 
```bash 
git clone https://github.com/Natanista/springboot-angular-app.git
```

Go to angular project folder and execute the app
```bash 
$ cd springboot-angular-app/angular-app/ 
$ ng serve
```

Open the springboot-api folder on your favorite IDE and run it.





## API Reference

#### PORT
```PORT
 localhost:8080
```
#### GET ALL USERS
```http
  GET /api/v1/users
```

#### POST A USER

```http
  POST /api/v1/users
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `firstName` | `string` | user first name |
| `lastName` | `string` | user last name |







## Tech Stack


**Server:**  Spring Boot 

**Client:** Angular
