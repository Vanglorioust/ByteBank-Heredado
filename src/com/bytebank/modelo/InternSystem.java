package Modelo;

public class InternSystem {
    private String password="123";
    public boolean login(Autenticable autenticable){
        boolean authenticated = autenticable.login(password);
        if(authenticated){
            System.out.println("Login successful");
            return true;
        }
        else{
            System.out.println("Login failed");
            return false;
        }
    }

}
