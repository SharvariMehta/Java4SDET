package ex_10_Encapsulation;

public class Encapsulation_Demo {
    public static void main(String[] args) {
        appLogin al = new appLogin();
        al.setUsername("msharvari97");
        System.out.println(al.getUsername());
        al.setPassword("Switch@9012");
        System.out.println(al.getPassword());
    }

}
class appLogin {
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    private String username;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    private String password;
}



