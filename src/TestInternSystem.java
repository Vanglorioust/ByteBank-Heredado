public class TestInternSystem {
    public static void main(String[] args) {
        InternSystem internSystem = new InternSystem();
        Gerente jose = new Gerente();
        Admin maria = new Admin();

        jose.setPassword("123");
        maria.setPassword("123");
        internSystem.login(jose);
        internSystem.login(maria);
    }
}
