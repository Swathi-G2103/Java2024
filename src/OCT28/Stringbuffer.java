package OCT28;

public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("swathi");
                sb.append("garimella");
        System.out.println(sb);
        //sb.reverse();
        //System.out.println(sb);
        StringBuffer sb1 = sb.replace(0, 6, "Mahaa");
        System.out.println(sb1);

    }
}
