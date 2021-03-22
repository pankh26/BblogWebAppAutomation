Bblog Web Application Automation (Functionality- Favorite Articles)

Page Object model Test automation framework using Selenium with Java, Junit, Cucumber (BDD) and Maven-

Application under test:
BBlog Webapp

Functianality covered:
Favorite articles

Manual test cases for the functionality is attached in excel sheet. 
Few favorite articles test scenarios are covered in this framework code.

List of test cases automated are mentioned below:
1. TC_01 :: Verify presence of favorite icon for articles on Global Feed screen
2. TC_17 :: Verify empty screen message on Favorited Articles tab
3. TC_18 :: Verify favorite article icon without signing into the app
4. TC_21 :: Verify favorite icon displayed for own article post on My Articles tab
5. TC_27 :: Verify number of Unfavorite Post icon displayed on article details page

This is a sample project to demonstrate the implementation of page object model framework and how it can be used in selenium to automate web application "http://qa-task.backbasecloud.com/#/" with BDD software development process.

The purpose of this project is to write feature file, develop scenarios and execute end to end test automation scripts.

Pre-requisites:
Java -programming language : 1.8
Selenium WebDriver : 3.141.59
Cucumber - BDD framework : 1.2.5
Maven : 3.6.3
Intellij IDE : 2020.3.3

Command Line Execution

1. Open the terminal in your system and navigate to the project directory.
2. Since we have already added a Maven dependency through pom.xml, we can execute the test using the simple command:
   mvn clean test

HTML reports can be found in the project filepath : target/cucumber-reports
