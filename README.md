
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Lingpeng Li                |
| Date         | 10/25/2024                 |
| Course       | Fall 2024                  |
| Assignment # | 2                          |


---

## Project Description

This project implements a **Delivery Notification System** using the **Observer Pattern**. The system allows a collection of stores in a city to notify local drivers (such as van, taxi, and scooter drivers) when a delivery request is received. Each delivery request is broadcasted to all subscribed drivers, and they are notified with the delivery details.

The system consists of three main components:
1. **Shop**: Acts as the subject (observable), which generates delivery requests.
2. **Driver**: Interface for the observers that respond to notifications.
3. **DeliveryRequest**: Encapsulates the delivery details such as the destination and package information.

---

## Implementation Details 

In the implementation of this application, the following software design principles were considered:

### 1. Flexibility in Adding or Removing Drivers
The system uses the **Observer Pattern**, which allows new drivers to be added or removed easily from the list of observers (subscribers). The `Shop` class keeps track of the drivers, and whenever a delivery request is created, the `Shop` notifies all subscribed drivers. This ensures the system can be extended without modifying the core logic. For example, new driver types (e.g., `BikeDriver`) can be added by simply implementing the `Driver` interface and registering them with the shop.

### 2. Simplicity and Understandability
The implementation focuses on simplicity by ensuring that each class has a clear and singular responsibility:
- `Shop` handles delivery requests and notifying drivers.
- `Driver` interface is responsible for defining how each driver responds to delivery notifications.
- `DeliveryRequest` encapsulates the delivery details.

This separation of concerns makes the code easy to read, understand, and maintain.

### 3. Avoiding Code Duplication
By adhering to the **DRY (Don't Repeat Yourself)** principle, the code avoids duplication by abstracting common functionality into base classes or interfaces. The `Driver` interface, for example, ensures that all types of drivers follow a consistent structure, reducing the likelihood of code duplication in future extensions.

### 4. Use of the Observer Pattern
The **Observer Pattern** was chosen because it allows the system to broadcast events (delivery requests) to multiple listeners (drivers). It decouples the shop (subject) from the drivers (observers), making the system highly flexible and maintainable. New types of drivers can be added without modifying the core logic in the `Shop` class. The pattern also ensures that the drivers are notified asynchronously whenever a new delivery request is created.
## Objectives

The key objectives of this assignment were as follows:

1. **Implement Core Classes**:
    - Develop classes for `Shop`, `DeliveryRequest`, and `Driver`, ensuring that these core components interact seamlessly to facilitate the notification and handling of delivery requests.

2. **Observer Pattern**:
    - Apply the **Observer Design Pattern** to enable a decoupled architecture where drivers can be dynamically notified about new delivery requests from shops.

3. **Unit Testing**:
    - Demonstrate the system's functionality through comprehensive unit tests, simulating real-world usage scenarios and verifying the correct behavior of the notification mechanism.

4. **Software Design Principles**:
    - Incorporate fundamental software design principles and patterns to achieve a solution that is not only functional but also flexible, maintainable, and understandable.

---
## Expectations

1. **Flexibility**:
    - The system should be designed with flexibility in mind, allowing for the easy addition or removal of shops, drivers, and delivery request types.

2. **Maintainability and Understandability**:
    - The code should be well-organized, clearly commented, and adhere to best practices, making it easy for others to read, understand, and maintain.

3. **Avoidance of Duplication**:
    - Duplicated code should be minimized through the use of abstraction, inheritance, and other relevant design patterns, promoting reusability and efficiency.

4. **Design Pattern Application**:
    - Students were encouraged to identify and apply appropriate design patterns beyond the Observer pattern, justifying their choices based on the specific problems they solve within the context of the assignment.

---
## Deliverables

Students were required to submit the following deliverables:

1. **Source Code**:
    - A complete set of source files for the implemented system, adhering to the specified requirements and design principles.

2. **Unit Tests**:
    - A suite of unit tests demonstrating the functionality of the system and covering a range of scenarios to ensure robustness.

3. **Documentation**:
    - A detailed documentation, including an **Implementation Description** section, outlining the design decisions, applied principles and patterns, and explaining the system's architecture and behavior.

---

This assignment provided an opportunity to apply theoretical knowledge of software engineering principles and design patterns to a practical problem, reinforcing the importance of thoughtful design in software development.

## Project Structure

```
src
 ├── main
 │   └── java
 │       └── edu
 │           └── bu
 │               └── met
 │                   └── cs665
 │                       ├── Observers
 │                       │   ├── Driver.java
 │                       │   ├── VanDriver.java
 │                       │   ├── TaxiDriver.java
 │                       │   └── ScooterDriver.java
 │                       └── ShopSystem
 │                           ├── Shop.java
 │                           ├── DeliveryRequest.java
 │                           └── Main.java
 ├── resources
 └── test
     └── java
         └── edu
             └── bu
                 └── met
                     └── cs665
                         └── DeliverySystemTests.java
```

---

## Compilation & Execution

### Prerequisites
- **Java JDK 1.8**
- **Apache Maven** 4.0.0



---

# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system.

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line:

```bash
mvn clean compile 
```

**Run the Project:**
After compiling, you can run the project by executing the `Main.java` class:
   ``` bash
   mvn exec:java -Dexec.mainClass="edu.bu.met.cs665.ShopSystem.Main
   ```

## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```
---

## Spotbugs

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.



## Checkstyle

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser.

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`

## Example Output
```
Shop: New delivery request received: Package to be delivered to 123 Main St. containing: Electronics
Van Driver 1 received delivery request: Package to be delivered to 123 Main St. containing: Electronics
Taxi Driver 1 received delivery request: Package to be delivered to 123 Main St. containing: Electronics
Scooter Driver 1 received delivery request: Package to be delivered to 123 Main St. containing: Electronics
Shop: New delivery request received: Package to be delivered to 456 Market St. containing: Food
Van Driver 1 received delivery request: Package to be delivered to 456 Market St. containing: Food
Scooter Driver 1 received delivery request: Package to be delivered to 456 Market St. containing: Food
```