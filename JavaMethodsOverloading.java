public class JavaMethodsOverloading {
    static int myMethod(int x, int y) {
        return x + y;
    }

    static double myMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int z =  myMethod(10, 20);
        double c = myMethod(10.20, 10.20);
        System.out.println(z);
        System.out.println(c);
    }
}
