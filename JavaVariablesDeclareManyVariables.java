public class JavaVariablesDeclareManyVariables {
    public static void main(String[] args) {
        // int x = 10;
        // int z = 10;
        // int y = 10;

        // Daripada menulis kode diatas, lebih baik menulis seperti ini
        // int x = 10, z = 10, y = 10;

        // System.out.println(x + z + y);

        int x, z, y;
        x = z = y = 50;

        System.out.println(x + y + z);
    }
}
