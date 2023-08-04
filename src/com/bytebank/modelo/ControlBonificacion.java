package Modelo;

public class ControlBonificacion {
    private double sum;
    public double salaryRegister(Funcionario f){
        this.sum += f.getBonus();
        System.out.println(sum);
        return this.sum;
    }
}
