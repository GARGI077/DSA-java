package _06_String;

import java.util.Scanner;

public class _01_IP_Address {

    static public String defangIPaddr(String address) {

        return(address.replace(".","[.]"));
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String addr=in.next();
        System.out.println(defangIPaddr(addr));

        in.close();
    }
}
