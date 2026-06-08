# ==============================================================================
# Activity: Text-Based Adventure Game with state loops and nested routing
# Module 2: OOP. Basic Concepts I
# ==============================================================================

def main():
    # Introductory narrative layout
    print("==================================================")
    print("        WELCOME TO THE ADVENTURE GAME!            ")
    print("==================================================")
    print("You are a fearless explorer searching for a")
    print("legendary lost treasure hidden on a mysterious island.")
    print("Your choices will determine your ultimate fate.\n")
    
    # State control variable for the execution loop
    game_active = True
    
    # Loop keeps running until a definitive terminal state is reached
    while game_active:
        print("--- SCENARIO 1: THE ARRIVAL ---")
        print("You land on the shore and face two immediate options:")
        print("1 - Enter the dense, untamed jungle")
        print("2 - Explore a dark cave on the cliffside")
        
        choice1 = input("What do you want to do? (Type 1 or 2): ").strip()
        print("-" * 50)
        
        # Branching logic for Scenario 1
        if choice1 == "1":
            print("You plunge into the dense jungle. The path is rough.")
            print("Suddenly, an unstable rope bridge appears right in front of you.")
            print("1 - Attempt to cross the old rope bridge")
            print("2 - Search for an alternative path down by the river")
            
            jungle_choice = input("What is your decision? (Type 1 or 2): ").strip()
            print("-" * 50)
            
            if jungle_choice == "1":
                print("💥 Oh no! The old bridge snapped under your weight!")
                print("You fell into the deep canyon. Game Over.")
                game_active = False # Terminal state: Defeat
            elif jungle_choice == "2":
                print("🎉 Excellent choice! Following the river led you right")
                print("to the LEGENDARY TREASURE chest hidden behind a waterfall!")
                print("You won the game and became filthy rich!")
                game_active = False # Terminal state: Victory
            else:
                print("Invalid option! Fear paralyzed you, and wild wolves found you. Game Over.")
                game_active = False

        elif choice1 == "2":
            print("You light up a torch and step into the dark cave.")
            print("Deep inside, you hear a strange, echoing roar.")
            print("1 - Continue advancing with caution")
            print("2 - Flee back to the safety of the beach")
            
            cave_choice = input("What is your decision? (Type 1 or 2): ").strip()
            print("-" * 50)
            
            if cave_choice == "1":
                print("🦁 A wild beast was guarding a secret passage!")
                print("However, it was chained up safely. Walking past it, you discovered")
                print("the hidden chamber of the LEGENDARY TREASURE! Congratulations, you made it!")
                game_active = False # Terminal state: Victory
            elif cave_choice == "2":
                print("You ran back to the beach, but your boat drifted away in the current.")
                print("You are stranded on the island forever without the treasure. Game Over.")
                game_active = False # Terminal state: Defeat
            else:
                print("Invalid option! You tripped in the pitch black and fell into a pit. Game Over.")
                game_active = False
        else:
            print("Invalid option! Please choose either 1 or 2 to proceed.\n")
            # Loop continues because game_active remains True

    print("\n==================================================")
    print("                END OF ADVENTURE                  ")
    print("==================================================")

if __name__ == "__main__":
    main()
