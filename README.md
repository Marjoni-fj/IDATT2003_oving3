# IDATT2003_oving3 :octocat: 

[//]: # (TODO: Fill inn your name and student ID)
[//]: # (TODO: Mappe-2025-Marjoni-fj)

**STUDENT NAME = Fredrik Jonathan Marjoni** 
<br>
**STUDENT ID = 157313**

## Project description💻

[//]: # (TODO: Write a short description of your project/product here.)
This project is a Java-based text processing library developed using Maven.  
The goal of the project is to demonstrate correct and effective use of:

- Interfaces
- Inheritance
- Polymorphism
- Unit testing with JUnit 5

The project follows the **Command Pattern**, where each text transformation is implemented as a command that operates on a `String`.  
All commands implement a common interface, allowing them to be used interchangeably

## Project structure 📁
The project follows the standard Maven directory structure.  
Source code and tests are clearly separated, and packages are organized by responsibility.

### Main Package Structure (`src/main/java/edu/ntnu`)
<pre>
   edu.ntnu
├── App.java
└── command
├── TextCommand.java
├── replace
│    ├── ReplaceTextCommand.java
│    └── ReplaceFirstTextCommand.java
├── wrap
│    ├── WrapTextCommand.java
│    ├── WrapLinesTextCommand.java
│    └── WrapSelectionTextCommand.java
└── capitalize
   ├── CapitalizeTextCommand.java
   ├── CapitalizeWordsTextCommand.java
   └── CapitalizeSelectionTextCommand.java
</pre>
[//]: # (TODO: Describe the structure of your project here. How have you used packages in your structure. Where are all sourcefiles stored. Where are all JUnit-test classes stored. etc.)

---
## 📦 Package responsibilities

### `command`
- `TextCommand`: Common interface for all text commands  
  Defines the `execute(String text)` method

---

### `command.replace`
Handles replacement of text:
- `ReplaceTextCommand`: Replaces all occurrences of a target string
- `ReplaceFirstTextCommand`: Replaces only the first occurrence

---

### `command.wrap`
Handles wrapping text with a prefix and suffix:
- `WrapTextCommand`: Wraps an entire string
- `WrapLinesTextCommand`: Wraps each line separately
- `WrapSelectionTextCommand`: Wraps only selected words

---

### `command.capitalize`
Handles capitalization:
- `CapitalizeTextCommand`: Capitalizes the first letter of a string
- `CapitalizeWordsTextCommand`: Capitalizes the first letter of each word
- `CapitalizeSelectionTextCommand`: Capitalizes only selected words

---

## JUnit tests 🧪

All unit tests are written using **JUnit 5** and mirror the main package structure.

### Test package structure (`src/test/java/edu/ntnu`)
<pre>
   edu.ntnu
└── command
├── replace
│    ├── ReplaceTextCommandTest.java
│    └── ReplaceFirstTextCommandTest.java
├── wrap
│    ├── WrapTextCommandTest.java
│    ├── WrapLinesTextCommandTest.java
│    └── WrapSelectionTextCommandTest.java
└── capitalize
      ├── CapitalizeTextCommandTest.java
      ├── CapitalizeWordsTextCommandTest.java
      └── CapitalizeSelectionTextCommandTest.java
</pre>

The tests cover:
- Normal use cases
- Edge cases
- Invalid input (e.g. `null` and empty strings)
---
## Maven layout ⚙️
The project uses the standard Maven layout:

- `src/main/java` – application source code
- `src/test/java` – unit tests
- `pom.xml` – project configuration and dependencies

This ensures:
- Clean separation of production and test code
- Easy integration with IDEs (VS Code, IntelliJ, Eclipse)
- Simple build and test execution
---
## Link to repository📚

[//]: # (TODO: Include a link to your GitHub repository here.)
[GitHub Repository - IDATT1003 Mappevurdering 2025](https://github.com/NTNU-IDI/mappe-2025-Marjoni-fj)

---
## How to run the project📝

[//]: # (TODO: Describe how to run your project here. What is the main class? What is the main method?
What is the input and output of the program? What is the expected behaviour of the program?)

### Requirements
- Java JDK 21 or higher
- Maven
- An IDE such as VS Code or IntelliJ

### Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/Marjoni-fj/IDATT2003_oving3.git
   
2. **Open the Project:**  
   Open VS Code and select **File > Open Folder**, navigating to the root folder of the project (containing `pom.xml`).
   ````bash
   cd IDATT2003_oving3
   
4. **Build the Project:**  
   Open the terminal in VS Code (`Ctrl + ~`) and run:  
   ```bash
   mvn clean compile
   
5. **Run the Application:**
  Start the program by running the main class:
    ```bash
   mvn exec:java

---
## How to run the tests 🧪
This project uses JUnit 5 for unit testing. 
All test classes mirror the main package structure and are stored in `src/test/java/edu/ntnu`

- ### Open the Project:
   Open VS Code and select **File > Open Folder**, navigating to the root folder of the project (containing `pom.xml`).
  ````bash
   cd IDATT2003_oving3

- ### Run all tests
   To execute the full test suite, run:
   ```bash
   mvn clean test

This command:
   1. Cleans old build files
   2. Compiles the main source code
   3. Compiles the tests
   4. Runs all JUnit tests
---
 - ### Viewing test results
After the tests finish, Maven creates detailed reports here: 
`target/surefire-reports/`

Each report includes:
   1. Test class summaries
   2. Stack traces for any failures
   3. Execution times
   4. Running tests in an IDE

[//]: # (TODO: Describe how to run the tests here.)

## References 🔗
[//]: # (TODO: Include references here, if any. For example, if you have used code from the course book, include a reference to the chapter.
Or if you have used code from a website or other source, include a link to the source.)
References are included in the project report.

---
"""
