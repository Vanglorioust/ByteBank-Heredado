public class Contador extends Funcionario{
    public double getBonus(){
        return super.getSalario() + this.getSalario() * 0.2;
    }
}
