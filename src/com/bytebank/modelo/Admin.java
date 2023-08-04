package Modelo;

public class Admin extends Funcionario implements Autenticable {

    private LoginUtil util;

    public Admin(){
        this.util = new LoginUtil();
    }

    public void setPassword(String password) {
        this.util.setPassword(password);
    }
    public boolean login(String password){
        return this.util.login(password);
    }

    @Override
    public double getBonus() {
        return 200;
    }
}
