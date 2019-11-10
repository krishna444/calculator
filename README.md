# calculator
Calculator with REST 

## How to Run

This is maven based project, developed using Spring Boot framework(2.2.1.RELEASE) and Java 8. I have used IntelliJIDEA to develop this. 
We can simply run this application with the following command:

*mvn spring-boot:run*

## REST End Points

- /add/{a}/{b}
- /subtract/{a}/{b}
- /multiply/{a}/{b}
- /divide/{a}/{b}
- /square/{a}
- /factorial/{a}
- /prime/{a}

Examples:
- http://localhost:8080/add/12/15
- http://localhost:8080/subtract/34.33/24.89
and so on.

## Project Structure

* The project follows maven based project structure. The source files are located in _src/main/java/_.

* _CalculatorApplication.java_ => SpringBoot startup application
* _CalculatorService.java_ => Interface for CalculatorService
* _CalculatorServiceImpl.java_ =>  This class implements CalculatorService interface
* _RestCalculatorController.java_ => Rest controller class   
* The test files are located in /src/test/java
* _CalculatorServiceTest.java_ => Tests the calculator service
* _RestCalculatorControllerTest.java_ => Test class for calculator Rest controller  





