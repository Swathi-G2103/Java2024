package Nov6thconstructor;

public class defaultconstructor {

    public static void main(String[] args) {
        Car waganer = new Car();//this call the car class
        System.out.println("model of car is " +waganer.model);
        System.out.println("year of the car " + waganer.year);
         Car alto =new Car();
        System.out.println(alto.model);
        System.out.println(alto.year);
    }
}
