public class JavaMethodsReturnValue {
    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int z = myMethod(20, 10);

        System.out.println(z);
    }
}
