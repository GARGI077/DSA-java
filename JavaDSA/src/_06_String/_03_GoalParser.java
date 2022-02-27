package _06_String;

import java.util.Scanner;

public class _03_GoalParser {
//    public String interpret(String command) {
//
//    }
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();

    String str=s.replace("()","o");
    System.out.println(str.replace("(al)","al"));


}
}
