package Modelo;

public class LoginUtil {
    private String password;
    public boolean login(String password){
        if(this.password == password){
            System.out.println("Login successful");
            return true;
        }
        else{
            System.out.println("Login failed");
            return false;
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
