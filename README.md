# E-Commerce Test Automation Framework

Overview
--------
This repository contains a small Selenium + TestNG based end-to-end test automation framework for an example e-commerce practice site.
The tests demonstrate a typical page-object pattern with reusable page classes, a browser factory helper, and test classes that
run an end-to-end flow (login, select device, checkout, and invoice verification).

---

## Key features

- Page Object Model structure under `src/test/java/Pages`
- A simple `browserFactory` helper to start browsers
- Tests written using TestNG located in `src/test/java/Tests`
- Build and run with Maven (project uses Java 21)

---

## Tech stack

- Java 21
- Maven
- Selenium Java 4.x
- TestNG

---

## Prerequisites & Environment Setup

This framework is optimized for modern IDE execution, completely eliminating the need for manual browser driver management or complex environment path configuration.

---

### Local Requirements:

* **Java Development Kit (JDK):** Version 21 installed on your machine.
* **Integrated Development Environment (IDE):** IntelliJ IDEA (Community or Ultimate edition).
* **Web Browser:** Google Chrome, Mozilla Firefox, or Microsoft Edge installed locally.

---

### One-Click Execution Setup:

Because this project utilizes **Selenium 4.x** managed via **Maven**, you do not need to download `chromedriver.exe` or manually configure your system `PATH` variables.

- **Open the Project:** Clone or download this repository and open the root folder directly in **IntelliJ IDEA**.
- **Sync Dependencies:** IntelliJ will automatically read the `pom.xml` file, initialize the Maven build tool, and resolve all necessary Selenium and TestNG libraries.
- **Run Instantly:** When you execute the tests, Selenium’s native backend automatically detects your local browser version and configures the matching WebDriver instance on the fly.

---

Project structure
-----------------
Top-level files and folders (abbreviated):

```text
E-Commerce-Test-Automation-Framework/
  ├─ pom.xml
  ├─ README.md
  └─ src/
	 └─ test/
		└─ java/
		   ├─ Base/
		   │  └─ `baseTest.java`        (setup / teardown for tests)
		   ├─ Pages/
		   │  ├─ `loginPage.java`       (page object for login + navigation)
		   │  ├─ `inventoryPage.java`   (page object for selecting device/specs)
		   │  ├─ `checkoutPage.java`    (page object for checkout flow)
		   │  └─ `invoicePage.java`     (page object for invoice verification)
		   ├─ Tests/
		   │  └─ `LoginTest.java`       (end-to-end test composed of steps)
		   └─ utilities/
			  └─ `browserFactory.java`  (starts the requested browser and navigates to URL)
```



## Files of interest:

- `pom.xml` — manages dependencies (Selenium, TestNG) and Java compiler settings (Java 21).
- `src/test/java/Base/baseTest.java` — TestNG `@BeforeClass` to start browser and `@AfterClass` to quit it.


## How to run:

1) From the command line (PowerShell on Windows)

```powershell
# Run the whole test suite
mvn test

# Run a single TestNG test class (example)
mvn -Dtest=Tests.LoginTest test

```
