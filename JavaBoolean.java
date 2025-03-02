public class JavaBoolean {
    public static void main(String[] args) {
        String nim = "12220551";
        String name = "Miftah Fadilah";
        int grade = 89;
        char result;
        
        if(grade >= 90) {
            result = 'A'; 
        } else {
            result = 'B';
        }

        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + name);
        System.out.println("Result : " + result);
    }
}
