public class App {
    public static void main(String[] args) throws Exception {
        Persona oP = new Persona();
        Persona oP2 = new Persona(null, null, null);
        Supervisor oS = new Supervisor();

        oP.setCedula("0123");
        oP.setNombre("pepe");
        oP.setApellido("Lopez");

        System.out.println(oP.getCedula());
        System.out.println(oP.getApellido());
        System.out.println(oP.getNombre());
        
        System.out.println(oP2.getCedula());
        System.out.println(oP2.getApellido());
        System.out.println(oP2.getNombre());


    }
}
