public class textValidation {
    public static void main(String[] args) {
        String str = "iPhone8";

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
