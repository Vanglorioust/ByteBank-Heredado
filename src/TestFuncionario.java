public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente();
        f1.setName("João");
        f1.setId("123");
        f1.setSalario(2000.0);
        f1.getBonus();
        System.out.println(f1.getSalario());
        System.out.println(f1.getBonus());
    }
}
