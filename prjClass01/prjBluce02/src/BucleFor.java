public class BucleFor {
    // Metodo +-+-+-+-+-
    public void signosAlternos() {
        System.out.println();
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                imprimirUnidoRepetidamente("-", i);
            } else {
                imprimirUnidoRepetidamente("+", i);
            }
        }
        System.out.println();
    }

    // Metodo imprimir repetidamente un numero de veces
    public void imprimirUnidoRepetidamente(String cadena, int repeticiones) {
        for (int i = 0; i < repeticiones; i++) {
            System.out.print(cadena);
        }
        System.out.print(" ");
    }

    public void signosAlternosMejorado() {
        System.out.println();
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((i % 2 == 0) ? "-" : "+");
            }
            System.out.print(" ");
        }
        System.out.println();
    }
    public void imprimirEscalera (int nivel){
        System.out.println("");
        for (int i = 1; i <= nivel; i++) {
            System.out.print(i+".");
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            System.out.println("|_");
           
        }
    }
}
