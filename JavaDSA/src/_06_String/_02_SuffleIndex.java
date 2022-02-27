package _06_String;

import java.util.Scanner;

public class _02_SuffleIndex {
   static public String restoreString(String s, int[] indices) {
       char[] ch = new char[indices.length];

       for(int i=0; i<indices.length; i++)
           ch[indices[i]] = s.charAt(i);

       String str = new String(ch);
           return str;
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        String s=in.next();
        System.out.println("Enter index ");
        int[] indices=new int[s.length()];
        for (int i=0;i<s.length();i++)
        {
            indices[i]=in.nextInt();
        }

        System.out.println(restoreString(s,indices));

    }
}
