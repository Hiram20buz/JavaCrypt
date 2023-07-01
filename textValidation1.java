import java.util.Scanner;
public class textValidation1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        // Convert the string to lowercase
        String lowercaseStr = str.toLowerCase();

        // Check if the lowercase string contains "iphone8"
        boolean containsIPhone8 = lowercaseStr.contains("iphone8");

        if (containsIPhone8) {
            System.out.println("iphone8");
        } else {
            System.out.println("No");
        }
    }
}
