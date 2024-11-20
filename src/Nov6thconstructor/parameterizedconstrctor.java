package Nov6thconstructor;

import java.util.Scanner;

public class parameterizedconstrctor {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        car2 t1=new car2("benzene",2024);
        System.out.println(t1.name);
        System.out.println(t1.year);
        car2 t2=new car2("audi",2022);
        System.out.println(t2.name);
        System.out.println(t2.year);
        System.out.println("Enter model name");
        String name_carname=sc.next();
        System.out.println("Enter car year");
        int year_modelyear=sc.nextInt();
        car2 t3 = new car2(name_carname,year_modelyear);
        System.out.println(t3.name);
        System.out.println(t3.year);;

    }

}

class car2{
    String name;
    int year;

    car2(String name_carname,int year_modelyear){
        this.name=name_carname;
        this.year=year_modelyear;
        System.out.println("pc");

    }
}
