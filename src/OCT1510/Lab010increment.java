package OCT1510;

public class Lab010increment {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a++ + ++a);
        // line /exp/a
        //  Part ->  A -> ++a , Exp1 = 11 , a = 10--increment and print value
        //  Part ->  B -> a++ , Exp2 = 11 , a = 11 take the value and increment
        //  Part ->  C -> a++, Exp3 = 12 , a = 12-take the value and increment

    }

}
