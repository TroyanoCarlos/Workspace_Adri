public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;

    public Persona() {
        cedula = "";
        nombre = "";
        apellido = "";
    }

    public Persona(String cedula, String nombre, String apellido) {
        setCedula(cedula);// this.cedula = cedula;
        setNombre(nombre);// this.nombre = nombre;
        setApellido(apellido);// this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if (cedula == null || cedula.length() != 10 )
            this.cedula = "noValido";
        else
            this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null)
            this.nombre = "";
        else
            this.nombre = nombre.toUpperCase();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido == null)
            this.apellido = "";
        else
            this.apellido = apellido.toUpperCase();
    }

}
