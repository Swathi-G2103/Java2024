package OCT1510;

public class lab009ternary {
    public static void main(String[] args) {
        int a=34;
        int b=43;
        int c=23;
        String  result= ((a > b) && (a > c)) ? "a is largest" : (((b > a) && (b > c)) ? "b is largest" : (((c > a) && (c > b)) ? "c is largest" : "F"));
        System.out.println(result);

    }
}
