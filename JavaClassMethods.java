public class JavaClassMethods {
    public String bugatti() {
        return (String) "Buggatti is the fastest car in the world";
    }

    public void startBugatti(String type) {
        if(type == "Chiron") {
            System.out.println("The maximum top speed is 460KM");
        } else if (type == "Veyron") {
            System.out.println("The maximum top speed is 400KM");
        } else {
            System.out.println("Unknow type");
        }
    }

    public static void main(String[] args) {
        JavaClassMethods obj1 = new JavaClassMethods();
        System.out.println(obj1.bugatti());
        obj1.startBugatti("Chiron");
    }
}
