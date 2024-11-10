package Nov5th;

class dogclass {

        String name;
        int age;
        String color;
        boolean isMale=true;
        boolean isfemale=false;
        void displayage(){
            System.out.println("Age of the dog is:" + age);
        }
        public void sleep(){
            System.out.println("sleeping");
        }

    public String getGender() {

        System.out.println("dog is male:"+ isMale);
        return isMale ? "Male" : "Female";
    }

    int runs(int a) {
        System.out.println("He runs " + a + " miles per day");
        return a;
    }
        }

