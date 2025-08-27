import java.util.Scanner;
public class CgpaCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Subject Marks: ");
        float a = sc.nextFloat();
        System.out.println("Enter Second Subject Marks: ");
        float b = sc.nextFloat();
        System.out.println("Enter Third Subject Marks: ");
        float c = sc.nextFloat();
        float cgpa = (a + b + c)/3;
        System.out.println("CGPA is ");
        System.out.println(cgpa);
    }
}