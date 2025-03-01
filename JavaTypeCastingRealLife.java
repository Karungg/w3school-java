public class JavaTypeCastingRealLife {
    public static void main(String[] args) {
        int maxScore = 500;

        int userScore = 423;

        float result = (float) userScore / maxScore * 100.0f;
        
        System.out.println("The user persentage score is : " + result);
    }
}
