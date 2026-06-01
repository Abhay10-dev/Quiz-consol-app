# QuizConsol - Console Quiz Application

A lightweight, robust Java console application that simulates a multiple-choice quiz game. This project demonstrates core Object-Oriented Programming (OOP) concepts, strict data encapsulation, graceful exception handling, and modern Java functional programming paradigms.

## 🚀 Features

- **Encapsulated Architecture:** Keeps quiz states, questions, and replies entirely secure using `private final` fields.
- **Robust Input Handling:** Gracefully handles invalid user input (e.g., typing text instead of integers) without crashing or looping infinitely.
- **Modern Java Pipelines:** Utilizes Java Streams (`Arrays.stream()`) for clean, loop-free rendering of options.
- **State Evaluation:** Evaluates answers dynamically and tracks performance with null-safe comparison checks.

## 📁 Project Structure

Following standard Java conventions, the codebase is split cleanly into models and services inside the `org.lazyCoder` root package:

```text
src/
└── org.lazyCoder/
    ├── model/
    │   └── Questions.java         # The Blueprint for a quiz question
    ├── Services/
    │   └── QuestionServices.java  # Core business logic (playing, scoring, tracking)
    └── Main.java                  # Application entry point

```

## 🛠️ Code Architecture Highlight

The core engine utilizes modern stream processing and structured exception recovery to ensure a bulletproof terminal interaction:

```java
try {
    reply[i] = scan.nextInt();
} catch (InputMismatchException e) {
    System.out.println("\nPlease enter an integer");
    scan.next(); // Clears invalid token buffer to prevent infinite loops
    reply[i] = null; 
}

```

## 💻 How to Run

1. Open the project folder in your preferred IDE (e.g., IntelliJ IDEA).
2. Ensure you have the Java Development Kit (JDK 8 or higher) configured.
3. Locate `Main.java` inside the `org.lazyCoder` package.
4. Run the `main` method.


## 📝 License

This project is open-source and free to use for educational purposes.