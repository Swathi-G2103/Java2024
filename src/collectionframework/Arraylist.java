package collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList studentslist = new ArrayList();
        //collection (I)-->list(I)-->arralylist(C)
        //above object can also we written as
        //collection students = new list()
        //Collection students =(Collection) new Arraylist();
      //  List Students =new ArrayList(); ynamic dispatch --parent to chlid
        studentslist.add("swathi");
        studentslist.add("Mahaa");
        studentslist.add("Mahathi");
        studentslist.add("Vijay");
        studentslist.add("Garimella");
        System.out.println(studentslist);
        System.out.println(studentslist.isEmpty());
        System.out.println(studentslist.size());




    }
}
