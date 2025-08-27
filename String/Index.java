package String;

import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your old name: ");
        String a = sc.nextLine();
        System.out.println(a.indexOf("a"));
        System.out.println(a.indexOf("b",1));
        System.out.println(a.lastIndexOf("b"));
    }
}