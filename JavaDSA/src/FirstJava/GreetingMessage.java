package FirstJava;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.next();
        System.out.println("Welcome to Java World "+name);
    }
}
