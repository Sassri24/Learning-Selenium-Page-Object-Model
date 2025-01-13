# 🖥️ Learning Selenium Page Object Model

Welcome to the **Learning Selenium Page Object Model** repository! This project is designed to help you understand and implement the Page Object Model (POM) design pattern using Selenium WebDriver with Java. 🚀

## 📚 About Page Object Model

The Page Object Model is a design pattern in Selenium that enhances test maintenance and reduces code duplication by creating an object repository for web UI elements. Each web page is represented as a class, and the elements on the page are variables within the class. Actions that can be performed on the page are implemented as methods within the class. :contentReference[oaicite:0]{index=0}

## 🛠️ Technologies Used

- **Java**: Programming language for writing test scripts.
- **Selenium WebDriver**: Tool for automating web application testing.
- **TestNG**: Testing framework for running tests.
- **Maven**: Build automation tool for managing project dependencies.
- **Log4j**: Logging library for generating logs.
- **Extent Reports**: Library for creating detailed test reports.

## 📂 Project Structure

The project follows a modular structure to enhance readability and maintainability:

- **src/main/java**: Contains the main Java classes.
  - **pages**: Page classes representing different web pages, each containing web elements and methods to interact with them.
  - **utils**: Utility classes for common functions like reading from properties files or Excel sheets.
- **src/test/java**: Contains the test classes.
  - **tests**: Test scripts that utilize the page classes to perform test actions.
- **test-output**: Directory where test reports and logs are generated.

## 🚀 Getting Started

To get started with this project:

1. **Clone the repository**:

   ```bash
   git clone https://github.com/Sassri24/Learning-Selenium-Page-Object-Model.git
   cd Learning-Selenium-Page-Object-Model
   
2. **Install dependencies**: Ensure you have Maven installed, then run:

   ```bash
   mvn clean install
3. **Run tests**: Execute the test cases using TestNG by running:

   ```bash
   mvn test
   
## 📈 Reporting

After executing the test cases, reports are generated automatically in the `test-output` directory. ✨

- To view the **Extent Reports**, navigate to the `test-output` directory and open the `index.html` file in your web browser.

---

## 🤝 Contributing

Contributions are welcome! 🛠️ If you'd like to contribute:

1. **Fork** this repository.  
2. **Create a new branch** for your changes.  
3. **Submit a pull request** with your enhancements or fixes.

Please ensure your code adheres to the repository's style and includes appropriate tests. ✅

---

## 📄 License

This project is licensed under the **MIT License**.  
For more details, refer to the [LICENSE](LICENSE) file.

---
