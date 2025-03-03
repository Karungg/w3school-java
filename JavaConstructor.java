public class JavaConstructor {
    String attrName;
    int attrAge;

    public JavaConstructor(String name, int age) {
        attrName = name;
        attrAge = age;
    }

    public static void main(String[] args) {
        JavaConstructor obj1 = new JavaConstructor("Miftah Fadilah", 20);
        System.out.println("My name is " + obj1.attrName + "\nand my age is " + obj1.attrAge);
    }
}
