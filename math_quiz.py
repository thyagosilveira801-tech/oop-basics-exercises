# ==============================================================================
# Activity: Multiplication Quiz Game (Math Quiz) with score tracking
# Module 2: OOP. Basic Concepts I - Practical Exercises
# ==============================================================================

import random  # Imports module to generate pseudo-random integer limits

def main():
    # 1. Welcome messaging layout and rule explanation
    print("=========================================")
    print("       Welcome to the Math Quiz!         ")
    print("=========================================")
    print("Rules: Answer the multiplication questions")
    print("correctly to score points. Each correct")
    print("answer awards 10 points! Type 'exit' to quit.\n")
    
    # 2. Score counter initialization state
    score = 0
    
    # 3. Core persistent execution loop
    while True:
        # Generate two unexpected numbers between 1 and 9 for the quiz factor
        num1 = random.randint(1, 9)
        num2 = random.randint(1, 9)
        
        # Compute exact validation result behind the scenes
        correct_answer = num1 * num2
        
        # Display math problem and prompt user response entry
        user_input = input(f"How much is {num1} x {num2}? ").strip()
        
        # Check if user requests a session interrupt sequence
        if user_input.lower() == 'exit':
            print("\nThank you for playing the Math Quiz!")
            break  # Escapes the execution loop safely
            
        # Exception handling framework guarding against text entries instead of integers
        try:
            user_answer = int(user_input)
            
            # 4. Conditional logic tracking answer status
            if user_answer == correct_answer:
                print("✨ Correct! You earned 10 points.")
                score += 10  # Accumulate values into state flag
            else:
                print(f"❌ Incorrect! The right answer was {correct_answer}.")
                
        except ValueError:
            # Fallback block triggered when parsing non-integer string data
            print("Invalid input! Please enter a valid integer or type 'exit'.")
            continue  # Recycles the loop immediately without evaluating scores
            
        # 5. Output current running score data after valid iterations
        print(f"Current Total Score: {score}")
        print("-" * 41)

    # Final termination interface summary block
    print(f"\nGame Over. Final Score: {score} points. Well done!")

if __name__ == "__main__":
    main()
