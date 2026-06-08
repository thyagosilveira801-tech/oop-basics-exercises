# ==============================================================================
# Activity: Secret Number Guessing Game with bounded attempts
# Module 2: OOP. Basic Concepts I
# ==============================================================================

import random

def main():
    # 1. Generate a pseudo-random target number between 1 and 100
    secret_number = random.randint(1, 100)
    
    # 2. Track attempt limitations and historical values
    attempts_left = 7
    attempts_made = 0
    
    # Introductory console layout instructions
    print("=========================================")
    print("      Welcome to the Guessing Game!      ")
    print("=========================================")
    print("I am thinking of a secret number between 1 and 100.")
    print(f"You have {attempts_left} attempts to crack it. Good luck!\n")
    
    # 3. Execution game loop driven by remaining counts
    while attempts_left > 0:
        # Prompt user input
        user_input = input(f"Attempt {attempts_made + 1} | Enter your guess (or type 'exit'): ").strip()
        
        # Check if the player triggers an early exit sequence
        if user_input.lower() == 'exit':
            print(f"\nGame aborted. The secret number was: {secret_number}")
            break
            
        # Error handling block trying to safe-cast string entries into integers
        try:
            guess = int(user_input)
        except ValueError:
            print("Invalid entry! Please input a valid integer or type 'exit'.\n")
            continue
            
        # Incremental tracking adjustments
        attempts_made += 1
        attempts_left -= 1
        
        # 4. Conditional flow branching evaluating boundaries
        if guess == secret_number:
            print(f"\n🎉 CONGRATULATIONS! You guessed it right in {attempts_made} attempt(s)!")
            break
        elif guess < secret_number:
            print("Hint: The secret number is HIGHER than your guess.")
        else:
            print("Hint: The secret number is LOWER than your guess.")
            
        # Display feedback data if execution context has remaining frames
        if attempts_left > 0:
            print(f"Attempts remaining: {attempts_left}\n")
        else:
            # 5. Fallback trigger upon running out of attempts
            print(f"\n💥 Out of attempts! The secret number was: {secret_number}")
            print("Game Over!")

if __name__ == "__main__":
    main()
