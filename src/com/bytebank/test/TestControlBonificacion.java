package Test;

import Modelo.ControlBonificacion;
import Modelo.Funcionario;
import Modelo.Gerente;

public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario jose = new Gerente();
        jose.setSalario(2000.0);

        Gerente maria = new Gerente();
        maria.setSalario(10000.0);

        ControlBonificacion control = new ControlBonificacion();
        control.salaryRegister(jose);
        control.salaryRegister(maria);
    }
}
