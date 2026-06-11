# 🎓 OOP Basics & Data Input Exercises

This repository serves as a centralized collection of practical exercises focused on Object-Oriented Programming (OOP) fundamentals, data collection, type casting, and console output formatting.


📂 Repository Structure

* `Module-02-OOP-Basics/`: Core principles, primitive data types, and user interactions.
  * 📄 `student_registry.py`: Script to collect, convert, and cleanly display academic profiles.
  * 📄 `average_calculator.py`: Script implementing modular functions to process numeric arguments.
  * 📄 `path_choice.py`: Text-based adventure script using basic if-elif-else branching.
  * 📄 `guessing_game.py`: Secret number guessing game with exceptions and random limits.
  * 📄 `adventure_game.py`: Dynamic choice matrix using active state flags and deep nesting.
  * 📄 `math_quiz.py`: Interactive multiplication game featuring score tracking and dynamic random bounds.
  * 📄 `simulador_corrida.py`: Object-Oriented racing simulator leveraging static class attributes and instance states.
* `Module-02-Java-Basics/`: Intro to compiled languages and syntax controls.
  * 📄 `MultiplicationTable.java`: Counter-controlled loop displaying arithmetic sequences.
  * 📄 `Account.java`: Object-Oriented paradigm application focusing on encapsulation, constructors, and instance comparison.
* 📄 `StudentManagement.java`: Advanced OOP interface showcasing constructor overloading, dynamic object lists, and console execution menus.
* 📄 `hierarquia_animais.py`: Script showcasing classical single inheritance and attribute protection hooks.
* 📄 `VehicleHierarchy.java`: Advanced application mapping class extension structures and protected encapsulation loops.
* 📄 `PaymentSystem.java`: Console interface using object polymorphism to simulate structural runtime transaction gateways.

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

### 6. Java Multiplication Table (`MultiplicationTable.java`)
A Java console application focused on syntax structure, block-scoped loop counters, and arithmetic processing within compiled code threads.

* **Core Concepts Applied:**
  * **Compiled Language Syntax:** Structuring strong-typed entry points through standard class envelopes and fixed main arguments (`public static void main`).
  * **Counter-Controlled Loops (`for`):** Implementing strict iteration limits using standard initializer, conditional check, and evaluation steps.

    ### 7. Interactive Multiplication Quiz (`math_quiz.py`)
A dynamic arithmetic training game utilizing an infinite tracking loop paired with input-type verification to manage session scores.

* **Core Concepts Applied:**
  * **Infinite Loop Control (`while True`):** Maintaining an active gameplay cycle until an explicit terminal command string ('exit') is parsed.
  * **State Accumulation:** Managing structural arithmetic scores across iterative loop passes based on matching logic evaluations.

### 8. Object-Oriented Account Management (`Account.java`)
A Java application implementing basic Object-Oriented Programming (OOP) design patterns, emphasizing variable encapsulation, instance constructors, and data protection hooks.

* **Core Concepts Applied:**
  * **Data Encapsulation:** Declaring class attributes with `private` access modifiers to prevent unauthorized state manipulation from external classes.
  * **Constructor Initialization:** Leveraging the `this` keyword inside explicit constructors to correctly map arguments to local instance fields during instantiation.
  * **Accessor Methods (Getters):** Implementing standard public getters to selectively expose specific internal object states safely.

### 9. Student Management System (`StudentManagement.java`)
A interactive Java terminal application implementing structural constructor overloading patterns alongside dynamic collections to simulate real-time database registries.

* **Core Concepts Applied:**
  * **Constructor Overloading:** Providing multiple initialization states (default values vs. parameter mapping) within the same object blueprint.
  * **Dynamic Collection Tracking (`ArrayList`):** Managing persistent, scale-flexible objects in runtime memory spaces using automated collection index management.
  * **Menu Interface Loop (`do-while` / `switch-case`):** Designing safe context-driven application menus capable of executing iterative operational selections until terminated by user state inputs.

### 10. Object-Oriented Racing Simulator (`simulador_corrida.py`)

An interactive Python console simulation mapping structural automotive classes to evaluate race tracking logic using synchronized instance properties and shared class counters.
Core Concepts Applied:
* **Static Class Attributes:** Utilizing class-level scoped properties (`vencedor = "Nenhum"`) to register and update global reference boundaries independent of specific object allocation loops.
* **Object Instance State Binding:** Customizing runtime initializers (`__init__`) using standard `self` mapping context constraints to bind operational traits uniquely to active execution nodes.
* **Inverse Proportional Operations:** Implementing randomized time calculation patterns where computation output factors scale inversely with object configuration thresholds (simulating weight-to-speed boundaries via `random.uniform`).
* **Console Delay Simulation:** Embedding automated standard library time gaps (`time.sleep`) to simulate terminal execution pacing and dynamic operational feedback cycles.

### 11. Object-Oriented Animal Hierarchy System (`hierarquia_animais.py`)

A practical Python script structured to demonstrate classical single inheritance and standard naming conventions for protected attribute states across distinct object boundaries.
Core Concepts Applied:
* **Class-Level Inheritance:** Deriving common behaviors and parameters inside child subclasses (`Cao` and `Gato`) directly from a generalized base parent blueprint (`Animal`).
* **Protected Attribute Naming Conventions:** Simulating non-public scoping properties using a single leading underscore prefix (`_nome`) to restrict structural access strategies conceptually.
* **Method Reuse vs. Specialization:** Executing shared foundational routines (`emitir_som`) while maintaining distinct subclass operational loops (`latir` / `miar`).

### 12. Advanced Vehicle Hierarchy System (`VehicleHierarchy.java`)

An object-oriented Java application mapping corporate vehicle types to demonstrate class extension structures, protected encapsulation rules, and hierarchical constructor chainings.
Core Concepts Applied:
* **Classical Inheritance (`extends`):** Generating vertical behavioral structures where child nodes (`Carro` / `Moto`) inherit and augment the parameters of a common root blueprint (`Veiculo`).
* **Hierarchical Initialization Contexts (`super`):** Activating root constructor logic using the `super` keyword to process shared data attributes cleanly before subclass memory maps lock.
* **Polymorphic Method Overriding (`@Override`):** Redefining baseline execution blocks (`apresentar`) within downstream classes to enrich runtime console logs without breaking shared design structures.

### 13. Polymorphic Payment Processing Engine (`PaymentSystem.java`)

An interactive checkout solution executing polymorphic object bindings to resolve execution trees dynamically using decoupled baseline schemas and localized override methods.
Core Concepts Applied:
* **Runtime Polymorphism:** Declaring decoupled parent objects (`FormaDePagamento`) to reference unique sub-object memories (`CartaoCredito` / `PayPal`) compiled dynamically at execution phase.
* **Dynamic Method Binding:** Overriding virtual root routines (`processarPagamento`) to dispatch specialized algorithmic paths dependent entirely on active operational contexts.
* **Console String Manipulation Security:** Isolating non-public inputs via safe string tokenization techniques (`substring`) to partially obscure structural credit card inputs during standard system receipts.
