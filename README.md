# 🎓 OOP Basics & Data Input Exercises

This repository serves as a centralized collection of practical exercises focused on Object-Oriented Programming (OOP) fundamentals, data collection, type casting, and console output formatting.

## 📁 Repository Structure

* `Module-02-OOP-Basics/`: Core principles, primitive data types, and user interactions.
  * 📄 `student_registry.py`: Script to collect, convert, and cleanly display academic profiles.

---

## 🚀 Projects Overview

### 1. Student Profile Registry (`student_registry.py`)
A foundational Python script designed to capture dynamic console entries, enforce proper data type conversions, and present a structured textual data block.

* **Core Concepts Applied:**
  * **Type Casting:** Safeguarding numeric manipulation by explicitly converting inputs into Integer (`int`) and Floating-Point (`float`) variables.
  * **String Formatting:** Implementing f-strings with numeric padding flags (`:.2f`) to standardize decimal point notation for grades.
  * **Entry Encapsulation:** Isolating structural code blocks within a dedicated `main()` routine triggered by a standard Python entry guard (`__name__ == "__main__"`).

### 2. Average Calculator (`average_calculator.py`)
A script structured to demonstrate modular programming by isolating mathematical logic into reusable functions that accept parameters and return computed data.

* **Core Concepts Applied:**
  * **Modular Functions:** Defining custom operations using the `def` keyword to separate business logic from the user interface.
  * **Parameter Passing & Returns:** Sending console-derived numeric arguments into an isolated routine and capturing the returned computational payload.

    ### 3. Path Choice Adventure (`path_choice.py`)
An interactive text-based adventure script designed to showcase conditional flow control and input standardization techniques in Python.

* **Core Concepts Applied:**
  * **Conditional Branching (`if-elif-else`):** Routing the application execution down completely separate logical paths based on runtime evaluation.
  * **Input Sanitization:** Utilizing `.strip().upper()` chained string methods to safeguard data entry against unexpected white spaces or casing mismatches.

### 4. Secret Number Guessing Game (`guessing_game.py`)
An interactive console game demonstrating input validation, exception handling, and random number generation inside a dynamic logic loop.

* **Core Concepts Applied:**
  * **Pseudo-Random Generation:** Utilizing Python's built-in `random` module to instantiate unexpected state parameters at runtime.
  * **Exception Handling (`try-except`):** Safeguarding the execution thread against crash triggers when typecasting unexpected non-integer string data.
 * **Loop Breaks & Flags:** Managing structured loop escapes using intentional `break` and `continue` statements based on user decisions or mathematical results.

### 5. Text-Based Adventure Game (`adventure_game.py`)
An interactive text adventure that demonstrates persistent execution states using a dynamic `while` loop combined with deeply nested conditional routing blocks.

* **Core Concepts Applied:**
  * **State-Driven Loops:** Using a boolean control flag (`game_active`) to maintain operational context until an explicit win/loss outcome is triggered.
  * **Nested Conditional Trees:** Implementing layered `if-elif-else` code blocks to process multi-stage narrative paths and user choices.
