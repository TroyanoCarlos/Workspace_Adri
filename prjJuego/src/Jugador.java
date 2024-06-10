public class Jugador {
    private String usuario;
    private String clave;
    private String nombre;

    public Jugador() {
        setClave("1234");
        setUsuario("adritroya");
        setNombre("AdrielTroya");
    }

    public boolean logIn() {
        String usuario = "";
        String clave = "";
        boolean sinLogeo = true;
        do {
            System.out.println("Ingresa el usuario");
            usuario = App.sc.nextLine();
            System.out.println("Ingresa la clave");
            clave = App.sc.nextLine();
            if (this.usuario.equalsIgnoreCase(usuario) && this.clave.equalsIgnoreCase(clave))
                return true;

            System.out.println("Deseas salir (s): ");
            if(App.sc.nextLine().toUpperCase().equals("S"));
                sinLogeo = false;


        } while (sinLogeo);

        return false;

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null)
            this.nombre = nombre.toUpperCase();
        else
            this.nombre = "";
    }

}
