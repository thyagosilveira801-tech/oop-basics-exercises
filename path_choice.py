# ==============================================================================
# Activity: Text-based adventure game using conditional branching
# Module 2: OOP. Basic Concepts I
# ==============================================================================

def startGame():
    # Introductory welcome message layout
    print("====================================")
    print("      Welcome to Path Choice!       ")
    print("====================================\n")
    
    # Displaying the narrative branches available
    print("Three mysterious paths spread out before you:")
    print("[A] - Path A")
    print("[B] - Path B")
    print("[C] - Path C\n")
    
    # Capture input and sanitize (stretching out spaces and converting to uppercase)
    choice = input("Choose your path (type A, B, or C): ").strip().upper()
    print("") # Blank line for console spacing
    
    # Conditional Flow Control Tree to handle execution paths
    if choice == "A":
        print("You chose Path A: It is a safe and peaceful trail! You walk forward with zero worries.")
    elif choice == "B":
        print("You chose Path B: A rugged trail full of challenges and secrets, but high rewards await at the end!")
    elif choice == "C":
        print("You chose Path C: You find yourself inside a dense, magical forest. Beware of the wild creatures!")
    else:
        print("Invalid choice! You hesitated for too long and ended up stuck in the exact same spot. Try again.")

# Main script execution trigger guard
if __name__ == "__main__":
    startGame()
