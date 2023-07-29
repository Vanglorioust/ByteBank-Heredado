public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(1,1);
        CuentaAhorros ca = new CuentaAhorros(1,2);
        cc.depositar(6000);
        cc.transferir(2000, ca);
        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());
    }
}
