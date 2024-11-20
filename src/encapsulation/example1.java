package encapsulation;

public class example1 {
    public static void main(String[] args) {
        urllogin test =  new urllogin("Password1","swathi");
        String pass=test.getPassword(true);
        System.out.println(pass);

    }

}

class urllogin{
    private String name;
  private   String password;

    public String getPassword( boolean isauth ) {
        if(isauth){
            return password;
        }
        return "none";
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public urllogin(String password, String name) {
        this.password = password;
        this.name = name;
    }

}
