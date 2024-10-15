package OCT1510;

public class lab011decrement {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(a--);// print the value and decerement
        System.out.println(--a);//19 decrement and print the value
        System.out.println(a++);// take the value and increment//19
        //System.out.println(a--);//
        // line /exp/a
            //  Part ->  A -> a-- , Exp1 = 20 , a = 19
           //  Part ->  B -> --a , Exp2 = 18 , a = 18 take the value and decrement
            //  Part ->  C -> a--, Exp3 = 18, a = 17-take the value and decrement
    }
}
