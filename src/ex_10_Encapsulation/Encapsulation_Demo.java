package ex_10_Encapsulation;

public class Encapsulation_Demo {
    public static void main(String[] args) {
        appLogin al = new appLogin();
        al.setUsername("msharvari97");
        System.out.println("Username : "+al.getUsername());
        al.setPassword("Switch@9012", true);
        // Only admin is allowed to update password in this case
        System.out.println("Password : "+al.getPassword());
        al.setPassword("Update@123",false);
        System.out.println("Msg after update attempt by some else than admin : \n"+al.getPassword());
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
    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin)
            this.password = password;
        else
            this.password = "You are not allowed to change Password";
    }
    private String password;
}
/*
OUTPUT:
Username : msharvari97
Password : Switch@9012
Msg after update attempt by some else than admin :
You are not allowed to change Password
 */


