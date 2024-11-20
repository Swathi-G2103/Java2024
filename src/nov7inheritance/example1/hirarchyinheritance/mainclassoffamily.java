package nov7inheritance.example1.hirarchyinheritance;

public class mainclassoffamily {
    public static void main(String[] args) {
        firstson s1 =new firstson();
        s1.fatherproperty();
        s1.firstsonperperty();

        secondson s2 =new secondson();
        s2.fatherproperty();
        s2.secondsonperperty();
         //same way can call daughter class and can call father property

        father f =new father();
        f.fatherproperty();
    }
}
