# ==============================================================================
# Activity: Calculate the average of three grades using functions
# Module 2: OOP. Basic Concepts I
# ==============================================================================

# Custom method that accepts three parameters and returns their mathematical average
def calculateAverage(grade1, grade2, grade3):
    average = (grade1 + grade2 + grade3) / 3
    return average

# Main Routine
def main():
    # 1. Welcome introductory message
    print("Welcome to the Average Calculator!")
    
    # 2. Prompt user for three individual values (Explicitly cast into floating-point numbers)
    grade_a = float(input("Enter the first grade: "))
    grade_b = float(input("Enter the second grade: "))
    grade_c = float(input("Enter the third grade: "))
    
    # 3. Call the calculateAverage function passing the local variables as arguments
    final_average = calculateAverage(grade_a, grade_b, grade_c)
    
    # 4. Output the final processed payload format to two decimal places
    print(f"The average of the three grades is: {final_average:.2f}")

# Main execution trigger check
if __name__ == "__main__":
    main()
