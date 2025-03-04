abstract class JavaAbstract {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("zzz");
    }
}

class Cat extends JavaAbstract {
    public void animalSound() {
        System.out.println("Meow");
    }
}

class MainJavaAbstract {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.animalSound();
        myCat.sleep();
    }
}
