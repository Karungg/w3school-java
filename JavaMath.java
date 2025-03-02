public class JavaMath {
    public static void main(String[] args) {
        int myMathMin = Math.min(10, 20);
        int myMathMax = Math.max(10, 20);
        double myMathSqrt = Math.sqrt(64);
        double myMathAbs = Math.abs(-4.8);
        double myMathRandom = Math.random();
        int randomNum = (int) (Math.random() * 101);

        System.out.println(myMathMin);
        System.out.println(myMathMax);
        System.out.println(myMathSqrt);
        System.out.println(myMathAbs);
        System.out.println(myMathRandom);
        System.out.println(randomNum);
        
    }
}
