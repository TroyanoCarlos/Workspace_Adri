public class Usuario {
    private String nombre;
    private Integer edad;

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        if (edad > 0)
            this.edad = edad;
        else
            this.edad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public Boolean ingresar() {
        String nombreString;
        System.out.print("Dime tu nombre");
        nombreString = App.sc.nextLine();
        setNombre(nombreString);
        return true;
    }

    public void crearDino() {
        if (ingresar())
            System.out.println("Crear Dino");
        else
            System.out.println("Primero debes logearte al sistema");
    }

}
