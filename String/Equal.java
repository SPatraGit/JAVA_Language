import java.util.Scanner;
public class Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your old name: ");
        String a = sc.nextLine();
        System.out.println(a.equals("Bubai"));
        System.out.println(a.equalsIgnoreCase("Bubai"));
    }
}
