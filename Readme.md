# **Readme**

1. Create a Maven project using eclipse or IntelIJ.
1. Import all the required dependencies in the pom.xml and build the project.
1. Download the Selenium webdrivers for the browser on which you want to perform the tests.
1. All the global data is stored under the config file and is being used using the Reading properties file.
1. To set the browser driver usage change the browser name in config file.
1. **Please update your Flipkart Credentials in the data.xlsx file to run login related test cases.**
1. All the automation code like initializing browser and accessing the data is in mainPage under BasePages directory.
1. BasePages directory also contains all the xpath data required to access the elements in the name specified files.
1. All the test cases are stored under the test directory implemented with logs and extent reports.
1. Under the Utilities directory all the webdrivers, Extent report, Reading Properties file and screenshot files are stored which are implemented in the mainPage.
1. Logs are implemented using Log4j.
1. All the logs are stored in the ExitAssignment.log file.
1. For Extent Report open report.html under the ExtentReport directory.
1. To run the Tests you can either run the tests separately or you can run the testing.xml to run all the testcases at once.
1. If the test fails it’s screenshot is generated in root directory.
1. Data.xlsx file in utilities directory contains the login credentials of the user.
1. Jar file is stored in utilities directory and is used to click on element and implemented to click on cross button of login popup.

