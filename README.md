# Ultralesson API Automation Workshop 

### Project Setup

This repository contains the initial setup for the API automation workshop. It includes essential dependencies and a basic environment check test to ensure everything is working correctly.

### Getting Started

### Forking and Cloning the Repository

- **Fork the Repository:** Start by forking this repository to your own GitHub account. This provides you with a personal copy to work on independently.

  - Navigate to the original GitHub repository.
  - Click on the `Fork` button at the top right corner.

- **Clone Your Forked Repository:** After forking, clone your repository to your local machine. This allows you to work on the project locally.

  ```bash
  git clone https://github.com/your-username/your-repository.git
  ```

### Development Environment

- **Integrated Development Environment (IDE):** You can use any IDE for Java development, but we recommend IntelliJ IDEA for the best experience.
- **Java and Gradle Compatibility:** Ensure that the Java version installed on your system is compatible with the Gradle version used in the project (**Gradle 8.0, requires Java version < 20**). Refer to the Gradle documentation for [Compatibility Matrix](https://docs.gradle.org/current/userguide/compatibility.html) details if you tend to change the gradle version.

### Setting Up

1. **Open the Project:** Open the cloned repository in your preferred IDE.
2. **Sync Gradle:** Make sure to sync the project with Gradle to download all the necessary dependencies.

### Dependencies

This project kickstarts with the following key dependencies:

- **RestAssured:** For API testing.
- **TestNG:** For organizing and running tests.

These are already included in the project's `build.gradle` file.

### Basic Test

The repository includes an environment check test to verify that your setup is correct. You can find this test in the `EnvironmentCheckTest` class.


### Executing the Test Case

Once your environment is set up, you should verify everything is working correctly by running the included test case. You have two options to run the test: using your IDE or the command line.

- **Using the IDE:**
  - Open the `EnvironmentCheckTest` class in your IDE.
  - Run the test using the IDE's built-in test runner. This can usually be done by right-clicking on the test file or the test method and selecting `Run`.

- **Using the Command Line:**
  - You can also run the test case via the command line. This is a great way to quickly verify everything is set up correctly.
  - Navigate to the root directory of your project in the terminal.
  - Execute the following command:

    ```bash
    ./gradlew test --tests EnvironmentCheckTest
    ```

- **Test Verification:**
  - If the test passes and you see all green, it means your environment is correctly set up and ready for the workshop.
  - If you encounter any errors, check your environment setup and try running the test again.

Remember, running the test case successfully is a good indicator that you have correctly configured your environment and are ready to proceed with the workshop activities.

### Regular sync to remote

You will be making regular updates to your forked repositories as we progress through the workshop.

- **Committing Changes:** The following are the basic commands to stage the changes and commit the same.

  ```bash
  git add .
  git commit -m "Descriptive message about the change"
  ```

- **Pushing to GitHub:** To synchronize our local repository with the remote repository on GitHub, we use the `git push` command.

  ```bash
  git push origin main
  ```