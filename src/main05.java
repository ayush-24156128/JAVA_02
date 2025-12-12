import java.util.Scanner;

public class main05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String first = sc.nextLine().trim();

        System.out.print("Enter Last Name: ");
        String last = sc.nextLine().trim();

        System.out.println(last + " " + first);

        sc.close();
    }
}
