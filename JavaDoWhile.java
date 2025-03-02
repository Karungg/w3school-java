public class JavaDoWhile {
    public static void main(String[] args) {
        // int i = 0;

        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i < 5);

        // int countDown = 3;

        // while (countDown > 0) {
        //     System.out.println(countDown);
        //     countDown--;
        // }

        int dice = 1;

        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("Not yatzy");
            }else {
                System.out.println("Yatzy");
            }
            dice += dice;
        }
    }
}
