class JavaPolymorphism {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends JavaPolymorphism {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends JavaPolymorphism {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class JavaPolymorphismOut {
    public static void main(String[] args) {
        JavaPolymorphism myAnimal = new JavaPolymorphism(); // Create a Animal object
        JavaPolymorphism myPig = new Pig(); // Create a Pig object
        JavaPolymorphism myDog = new Dog(); // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}