public class OperacionesConString {
    public static void main(String[] args) {
        String str = "Hola Mundo";
        System.out.println(upperCase(str));
        // Convertir string a mayusculas
        
    }
    public static String upperCase(String str){
        String resultado;
        for (int i=0; i<str.length();i++){
            char elemento = str.charAt(i);
            if (elemento>=97 && elemento<=122)
                elemento = elemento - 32;
            resultado = resultado + elemento;
        }
        return resultado;
    }  
}
