public class TestGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setName("João");
        g1.setId("123");
        g1.setSalario(2000.0);

        System.out.println(g1.getSalario());
        System.out.println(g1.getBonus());

        g1.setPassword("1234");
        g1.login("1234");
    }
}
