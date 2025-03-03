public class JavaConstructor {
    String attrName;
    int attrAge;
    String attrAddress;

    public JavaConstructor(String name, int age, String address) {
        attrName = name;
        attrAge = age;
        attrAddress = address;
    }

    public static void main(String[] args) {
        JavaConstructor obj1 = new JavaConstructor("Miftah Fadilah", 20, "Indonesia");
        System.out.println("My name is " + obj1.attrName + "\nand my age is " + obj1.attrAge);
        System.out.println(obj1.attrAddress);
    }
}
