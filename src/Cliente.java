public class Cliente implements Autenticable {
    private String nombre;
    private String documento;
    private String telefono;
    private String genero;

    private LoginUtil util;

    public Cliente(){
        this.util = new LoginUtil();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero == "Masculino" || genero == "Femenino") {
            this.genero = genero;
        } else {
            System.out.println("Genero invalido");
        }
    }

    @Override
    public void setPassword(String password) {
        this.util.setPassword(password);
    }

    @Override
    public boolean login(String password) {

        return this.util.login(password);
    }
}
