# Sample project to use Selenium tests with SerenityBDD, Cucumber and Java

This is a sample starter project to use Selenium tests with SerenityBDD, Cucumber and Java. Serenity BDD is a framework that simplifies a lot the implementation of test automation and allows to write better quality automated acceptance tests and also faster.

### Organization of the project

##### This repository is organized into different folders:

* The page_objects folder contains locators for web elements.
* The step_definitions folder contains all the information related the definition of steps in cucumber.
* The step_implementation folder contains the actions implementation.
* The resources folder contains the drivers and the cucumber test specifications.
* The serenity.properties file contains the definition where is the root locations of the tests and where is located the chromedriver executable.


### To Run
After clone this project and open with JetBrains Intellij is it needed to change the location of web drivers path that are specified in serenity.properties file to the path of drivers location and go to one of the cucumber features implemented and go to the terminal and execute mvn clean verify to run all tests.
