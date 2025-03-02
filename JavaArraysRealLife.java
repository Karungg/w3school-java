public class JavaArraysRealLife {
    public static void main(String[] args) {
        int[] grades = {75, 79, 90, 95, 85, 90};
        
        float avg, sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        avg = sum / grades.length;

        System.out.println("The average grades is : " + avg);
    }
}
