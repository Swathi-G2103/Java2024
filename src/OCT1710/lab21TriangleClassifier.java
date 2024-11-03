package OCT1710;

import java.util.Scanner;

public class lab21TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A value");
        int A= sc.nextInt();
        System.out.println("Enter B value");
        int B= sc.nextInt();
        System.out.println("Enter C value");
        int C= sc.nextInt();
        if(A==B && B==C && C==A){
            System.out.println("Equalateral Triangle");
        }
        else if (A==B || A==C ||(B==C)){
            System.out.println( "isosceles Triangle");
        }
        else {
            System.out.println("Triangle is scalene");
        }



    }
}
