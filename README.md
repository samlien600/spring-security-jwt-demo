# spring-security-jwt-demo
## prerequisites
- Maven
- Java 17

## run spring boot
- run only once
	```
	mvn install
	```
- run server
	```
	mvn spring-boot:run
	```
## Restful API
- without auth
	- GET：http://localhost:8080/demo/hello
	- POST：http://localhost:8080/demo/login
		- body(json)：username=admin, password=1234
- auth(jwt)
	- GET：http://localhost:8080/demo/data

## Version
- Java 17
- Spring Boot 3.1.2
- Spring Security 6.1.2