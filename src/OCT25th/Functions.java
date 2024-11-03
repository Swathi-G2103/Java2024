package OCT25th;

public class Functions {
    public static void main(String[] args) {
        //substring
        String program="Code on Functions";
        String programnew=program.substring(8,12);//substring prints lastindex-1
        System.out.println(programnew);
//concatenation
        String n1="swathi";
        String n2= n1.concat(" Garimella");
        System.out.println(n2);
//split string[] --split()
        String fruits="Banana,Cherry,apple";
        String[] split_fruits=fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

        //charAT()
        String character="swathi";
        System.out.println(character.charAt(4));

        //trim
        String t=" swathi ";
        System.out.println(t.trim());

        //indexof --print the index value

        String i="swathi";
        System.out.println(i.indexOf("a"));

        //contains--always gices o/p in boolean value
        String c="mahathi";
        System.out.println(c.contains("ha"));
//index of a char string
        String s8 = "swathi";
        System.out.println(s8.lastIndexOf("h"));

        String s9 = "Swathigarimella";
        System.out.println(s9.replace("a","@"));
        System.out.println(s9.replaceAll("ll","LL"));

        String s10 = "swathisivarambotla";
        System.out.println(s10.startsWith("swa"));
        System.out.println(s10.endsWith("tla"));
        System.out.println(s10.endsWith("wrwr"));



        String original = "banana";
        String result1 = original.replace('a', 'o');
        System.out.println(result1);

        String original1 = "Hello123 World456!";
        String result2 = original1.replaceAll("\\d+", "-");
        System.out.println(result2);






    }
}
