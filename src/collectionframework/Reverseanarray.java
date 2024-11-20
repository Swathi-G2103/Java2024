package collectionframework;

public class Reverseanarray {
    public static void main(String[] args) {
        int[] digits = {12, 43, 46, 76, 45};
        System.out.println(digits.length);
        System.out.println("reverse Array");
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i] + " ");

        }
    }
}
