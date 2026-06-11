# --- BASE CLASS (PARENT) ---
class Animal:
    # Constructor mapping the generic animal name
    def __init__(self, name: str):
        # A single leading underscore (_name) indicates a PROTECTED attribute in Python
        self._name = name 

    # Generic method to make a sound
    def make_sound(self):
        print(f"The animal {self._name} makes a generic sound.")


# --- CHILD SUBCLASSES INHERITING FROM ANIMAL ---

class Dog(Animal):
    # Dog inherits the constructor and _name attribute automatically from Animal
    
    # Specific subclass method
    def bark(self):
        print(f"The dog {self._name} is barking: Woof Woof! 🐶")


class Cat(Animal):
    # Cat inherits the constructor and _name attribute automatically from Animal
    
    # Specific subclass method
    def meow(self):
        print(f"The cat {self._name} is meowing: Meow! 🐱")


# --- MAIN EXECUTION RUNTIME ---
def main():
    print("=========================================")
    print("        ANIMAL HIERARCHY SYSTEM          ")
    print("=========================================\n")

    # Creating the Dog instance via user setup
    dog_name = input("Give a name to your Dog: ").strip()
    my_dog = Dog(dog_name) 
    
    print("-" * 40)

    # Creating the Cat instance via user setup
    cat_name = input("Give a name to your Cat: ").strip()
    my_gato = Cat(cat_name)

    print("\n================ TESTING ACTIONS ================")
    
    # 1. Triggering Dog behaviors
    print(f"\nActions for {my_dog._name}:")
    my_dog.make_sound()  # Inherited method from parent class
    my_dog.bark()        # Specific method from child class

    # 2. Triggering Cat behaviors
    print(f"\nActions for {my_gato._name}:")
    my_gato.make_sound()  # Inherited method from parent class
    my_gato.meow()        # Specific method from child class

    print("=================================================")

if __name__ == "__main__":
    main()
