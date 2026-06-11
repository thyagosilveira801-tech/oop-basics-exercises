import random
import time

# --- CAR CLASS DEFINITION ---
class Car:
    # Static class member to track the global winner's name
    winner = "None"

    # Constructor method (initializes name and max speed)
    def __init__(self, name: str, max_speed: int):
        self.name = name              # Instance member
        self.max_speed = max_speed    # Instance member

    # Method to simulate the race performance
    def drive(self):
        # Generates a random time inversely proportional to the maximum speed.
        # Faster cars are more likely to finish in less time.
        luck_factor = random.uniform(0.8, 1.2)
        race_time = (100 / self.max_speed) * 10 * luck_factor
        return round(race_time, 2)


# --- MAIN EXECUTION PROGRAM ---
def start_championship():
    # Instantiating available cars
    car1 = Car("Ferrari F8", 340)
    car2 = Car("Porsche 911", 310)
    car3 = Car("Lamborghini", 325)
    
    car_list = [car1, car2, car3]

    print("=========================================")
    print(" 🏎️       RACING CAR SIMULATOR       🏎️ ")
    print("=========================================")

    while True:
        print("\nAvailable cars for the Grand Prix:")
        for i, car in enumerate(car_list, 1):
            print(f"[{i}] {car.name} (Max Speed: {car.max_speed} km/h)")
        
        print("[0] Exit Simulator")
        
        try:
            choice = int(input("\nChoose your car by number to start the race: "))
        except ValueError:
            print("Please enter a valid number.")
            continue

        if choice == 0:
            print("Shutting down engines... See you next race!")
            break
        elif choice < 1 or choice > len(car_list):
            print("Invalid option! Choose a car from the list.")
            continue

        player_car = car_list[choice - 1]
        print(f"\n🟢 You chose the {player_car.name}! Engines are warming up...")
        time.sleep(1)
        print("3... 2... 1... GO! 🏁")
        time.sleep(1)

        # Variables to track the current race results
        best_time = float('inf')
        current_winner_name = ""

        # All cars run on the track
        for car in car_list:
            lap_time = car.drive()
            print(f"⏱️  {car.name} completed the track in: {lap_time} seconds.")
            
            # The car with the LOWEST time wins
            if lap_time < best_time:
                best_time = lap_time
                current_winner_name = car.name

        # Updating the STATIC member of the Car class
        Car.winner = current_winner_name

        # Display final scoreboard
        print("\n================ RACE RESULTS ================")
        print(f"🏆 THE WINNER IS: {Car.winner}!")
        print(f"⏱️  Winner's Time: {best_time} seconds.")
        print("==============================================")
        
        # Player feedback loop
        if Car.winner == player_car.name:
            print("🎉 Congratulations! Your car crossed the finish line first!")
        else:
            print("❌ Not this time! Your car couldn't beat the competition.")

        input("\ Press Enter to return to the menu and race again...")

if __name__ == "__main__":
    start_championship()
