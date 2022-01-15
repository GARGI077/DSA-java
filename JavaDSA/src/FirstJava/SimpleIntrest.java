package FirstJava;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,r,t;
        p=sc.nextInt();
        r = sc.nextInt();
        t=sc.nextInt();
        float si= (float) (p*t*r)/100;
        System.out.println(si);
    }
}
