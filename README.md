# Automation Practice Project
This project will automate testing the practice automation website http://automationpractice.com/index.php.

## Table Of Contents
* Description
* Pre-requisites
* Installation
* Usage

## Description
This project uses the Selenium Web Driver in order to automate a user navigating a website. In order to test that it behaves in ways that
are defined through the specifications. The specifications are built from user stories written in the gherkin language to generate
test cases.

# Pre-requisites

### IntelliJ IDE ### 
This can be downloaded from https://www.jetbrains.com/idea/download/#section=windows

### JUnit4 ###
This can be downloaded from the maven repository https://mvnrepository.com/

### Chromedriver ###
This can be downloaded from https://chromedriver.chromium.org/downloads
The project used ChromeDriver 76.0.3809.126

### Maven ###
This can be downloaded from https://maven.apache.org/download.cgi

### Selenium WebDriver ###
This can be downloaded from the maven repository https://mvnrepository.com/

# Installation #
In order to get the source code in this repo so that you can run it on your system you should run the following commands 
``` If you are familiar with git you can clone the repo using git bash
git clone https://github.com/Taoheed1/AutomationPracticeProject.git
cd AutomationPracticeProject
Then the project can be opened in your IDE as a maven project
```
Alternatively
```
The the zip file can be downloaded from https://github.com/Taoheed1/AutomationPracticeProject.git
Then extracted and opened in an IDE as a maven project
```

# Usage #
To run the tests, run the CucumberTestRunner class.
The tests that are run can be specified through the use of the @Tags annotation in the CucumberOptions
An example of this can be found below
```
@CucumberOptions(
        features = "src/test/java/featureFiles",
        glue = "stepDefinitionFiles",
        tags = "@Test1"
        ,plugin = {"html:target/cucumber-html-reports"}


The tag here means that only features that are tagged with @Test1 will be run
```

Plugins  
```bash
The following plugins were used to more easily write tests that follow BDD
Cucumber is used to run tests that describe defined scenarios
Gherkin is a language that is used to define feature files and convert them into tests
```
