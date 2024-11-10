package OCT30;

public class foreach {
    public static void main(String[] args) {
        int[] a =new int[5];
        a[0]=67;
        a[1]=97;
        a[2]=87;
        a[3]=57;
        a[4]=65;

        for (int arraylist : a){
            System.out.println(arraylist);
        }
        //same with string
       // String[] names =new String[3];
        String[] names ={"swathi","vijay","garimella"};
        for (String s:names){
            System.out.println(s);
        }

        }
    }


