import java.util.Scanner;

public class ScanApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello " + name);
        scan.close();
    }
}
