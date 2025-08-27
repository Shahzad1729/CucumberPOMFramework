# 🧪 Cucumber Page Object Model (POM) Framework with Page Factories

This project is a **Test Automation Framework** built using **Cucumber (BDD)**, **Selenium WebDriver**, **TestNG**, **Maven**, and **Page Object Model with Page Factories**.  
It supports **parameterized test execution**, **Extent Reports**, **Cucumber Reports**, and **Jenkins CI/CD integration**.

---

## 📌 Features

- ✅ **Cucumber + TestNG** integration for BDD-style test scenarios
- ✅ **Page Object Model (POM) with Page Factories** for clean code separation
- ✅ **Custom Assertions** with Extent Report logging
- ✅ **Maven Surefire Plugin** for test execution
- ✅ **Extent Reports + Cucumber Reports** for rich reporting
- ✅ **Jenkins CI/CD Integration** with parameterized build options

---

## ⚙️ Tech Stack

- **Java 8+**
- **Maven 3.9+**
- **Selenium WebDriver**
- **Cucumber 7+**
- **TestNG**
- **Extent Reports**
- **Jenkins CI/CD**

---

## ▶️ How to Run Tests

### 🔹 Run from Maven
```
mvn clean package -DType=Sanity
```

### 🔹Where Type can be:

- **Sanity**
- **Login**
- **AddDeleteItem**

---

## 🔹 Run from TestNG

```
mvn clean test -DsuiteXmlFile=src/test/resources/runner/testng.xml
```
---

## 🔹 Run from IDE

- **Open project in IntelliJ / Eclipse**
- **Navigate to runner/TestRunner.java or testng.xml**
- **Run as TestNG Test**

---

## 📊 Reports

### After execution, reports will be available at:

- **Extent Report → target/ExtentReports/**
- **Cucumber JSON/HTML Report → target/RunCuke/**

---

## **📜 License**

This project is licensed under the **MIT** License.