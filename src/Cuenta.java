public abstract class Cuenta {
    Cliente titular = new Cliente();
    protected double saldo;
    private int agencia=1;
    private int numero;

    public static int totalcuentas=1;

    public Cuenta(int agencia, int numero) {;
        System.out.println("El total de cuentas es: " + Cuenta.totalcuentas);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);
        Cuenta.totalcuentas++;
    }

    public abstract void depositar (double valor);
    public boolean retirar (double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Retirado con exito");
            return true;
        }
        System.out.println("Saldo insuficiente");
        return false;
    }


    public boolean transferir (double valor, Cuenta destino) {
        if (this.saldo >= valor){
            retirar(valor);
            destino.saldo += valor;
            return true;
        }
            return false;
        }
    public double getSaldo() {
        return this.saldo;
    }

    public void setnumero(double saldo) {
        this.saldo = saldo;
    }

    public int setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
            return agencia;
        }else {
            System.out.println("Agencia invalida");
            return 0;
        }
    }
}


