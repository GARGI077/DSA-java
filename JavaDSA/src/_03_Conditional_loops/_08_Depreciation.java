package _03_Conditional_loops;

import java.util.Scanner;

public class _08_Depreciation {
    public static void main(String[] args) {

        //derpreciation=(cost of fixed asset - residual value)/useful assests of life;

        Scanner in=new Scanner(System.in);

        System.out.println("Enter Asset cost ");
        double asset=in.nextInt();

        System.out.println("Enter Residual value ");
        double res=in.nextInt();

        System.out.println("Enter Assets of Life ");
        double ual=in.nextInt();

        double depreciation=(asset-res)/ual;

        System.out.println("Depreciation "+ depreciation);





    }
}
