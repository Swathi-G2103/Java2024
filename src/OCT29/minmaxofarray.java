package OCT29;

public class minmaxofarray {
        public static void main(String[] args) {
            int[] array = {20,40,50,60,70,10};
            int max_value = give_max(array);
            int min_value = give_min(array);
            System.out.printf("Max Value is %d", max_value);
            System.out.println();
            System.out.printf("Min Value is %d", min_value);

        }

        static int give_max(int[] array) { //method give_max
            int max = array[0];
            for (int i = 0; i < array.length ; i++) {
                if(array[i] > max ){
                    max = array[i];
                }
            }

            return max;
        }

        static int give_min(int[] array) {
            int min = array[0];
            for (int i = 0; i < array.length ; i++) {
                if(array[i] < min ){
                    min = array[i];
                }
            }

            return min;
        }
    }

