package nov7inheritance.example1.example2;

public class maintestcases {
    public static void main(String[] args) {
        Testcase t1= new Testcase();// on creating this testcase--loaded in class loader along with baseclass default constructor
        //both class load at a time .on run this baseclass default constructor wil be loaded.
        t1.closebrowser();
        t1.closebrowser();
        t1.readthedata();
        t1.testcase1();

    }
}
