public class JavaArrays {
    public static void main(String[] args) {
        String[] cars = {"Mitsubishi", "Toyota", "Honda"};
        
        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        
        for(String data : cars) {
            System.out.println(data);
        }
    }
}
