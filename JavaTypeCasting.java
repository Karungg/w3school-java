public class JavaTypeCasting {
    public static void main(String[] args) {
        // Widening casting (automatically)
        int myInt = 10;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        // Narrowing casting (manually)
        double myDoubleNarrowing = 10564.2313153;
        int myIntNarrowing = (int) myDoubleNarrowing;
        
        System.out.println(myDoubleNarrowing);
        System.out.println(myIntNarrowing);
    }
}
