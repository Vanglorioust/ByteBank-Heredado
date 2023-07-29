public class Gerente extends Funcionario implements Autenticable {
    private LoginUtil util;

    public Gerente(){
        this.util = new LoginUtil();
    }

    public void setPassword(String password) {
        this.util.setPassword(password);
    }
    public boolean login(String password){
        return this.util.login(password);
    }
    public double getBonus(){
        return super.getSalario() + this.getSalario() * 0.5;
    }

}
 