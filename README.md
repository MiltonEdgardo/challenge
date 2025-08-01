# Challenge

---

## Description

This project is a functional test automation framework built with **Java**, using **Selenium WebDriver**, **JUnit 5**, **Cucumber**, and **Gradle**.

It validates login and shopping cart features from [saucedemo.com](https://www.saucedemo.com), and also consumes and verifies a public API from Mercado Libre.

## 🧰 Tech Stack

- Java 17+
- Selenium WebDriver
- JUnit 5
- Cucumber 7
- Gradle
- Chrome and Firefox drivers

## 🚀 How to Run

### From Terminal

```bash
./gradlew test
```

### From Cucumber Runner

Run the class:

```
runner/RunCucumberTest.java
```

## 🌐 Browser Switch

Default browser is **Chrome**, but you can change it to **Firefox** in:

```
hooks/Hooks.java
```

Change the value:

```java
DriverType driverType = CHROME; --> change it to "FIREFOX"
```

## 📊 Reports and Screenshots

- Test reports (.html) are generated under:

```
target/
```

- Screenshots on failure are added in the same report.

