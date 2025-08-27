import java.util.Scanner;
public class CelciusFarenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Celcius Temperature: ");
        int c = sc.nextInt();
        double f = ((c * 1.8) + 32);
        System.out.println("Farenheit Temperature is "+ f);
    }
}