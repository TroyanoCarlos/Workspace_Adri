import java.util.Arrays;
import java.util.Random;

/**
 * Esta clase implementa operaciones básicas con conjuntos utilizando arreglos de caracteres.
 */
public class TeoriaDeConjuntos {

    /**
     * El método main es el punto de entrada del programa.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        System.out.println("");
        // Definir el tamaño del universo y los conjuntos
        int tamanoUniverso = 10;
        int tamanoConjuntos = 5;
        char[] universo = generarUniverso(tamanoUniverso);
        char[] conjuntoA = generarConjuntoAleatorio(universo, tamanoConjuntos);
        char[] conjuntoB = generarConjuntoAleatorio(universo, tamanoConjuntos);
        char[] conjuntoC = generarConjuntoAleatorio(universo, tamanoConjuntos);

        // Imprimir los conjuntos y el universo
        System.out.println("Conjunto A: " + Arrays.toString(conjuntoA));
        System.out.println("Conjunto B: " + Arrays.toString(conjuntoB));
        System.out.println("Conjunto C: " + Arrays.toString(conjuntoC));
        System.out.println("Universo: " + Arrays.toString(universo));

        // Realizar operaciones con conjuntos
        System.out.println("\nOperaciones con conjuntos:");
        System.out.println("Unión de A y B: " + Arrays.toString(union(conjuntoA, conjuntoB)));
        System.out.println("Intersección de B y C: " + Arrays.toString(interseccion(conjuntoB, conjuntoC)));
        System.out.println("Diferencia de A y B: " + Arrays.toString(diferencia(conjuntoA, conjuntoB)));
        System.out.println("Complemento de C en el universo: " + Arrays.toString(complemento(conjuntoC, universo)));
    }

    /**
     * Genera un universo de caracteres aleatorios.
     *
     * @param tamano El tamaño del universo.
     * @return Un arreglo de caracteres que representa el universo.
     */
    public static char[] generarUniverso(int tamano) {
        char[] universo = new char[tamano];
        for (int i = 0; i < tamano; i++) {
            universo[i] = (char) ('a' + i);
        }
        return universo;
    }

    /**
     * Genera un conjunto aleatorio a partir del universo dado.
     *
     * @param universo El universo del que se generarán los elementos del conjunto.
     * @param tamano   El tamaño del conjunto.
     * @return Un arreglo de caracteres que representa el conjunto.
     */
    public static char[] generarConjuntoAleatorio(char[] universo, int tamano) {
        Random rand = new Random();
        char[] conjunto = new char[tamano];
        for (int i = 0; i < tamano; i++) {
            conjunto[i] = universo[rand.nextInt(universo.length)];
        }
        return conjunto;
    }

    /**
     * Calcula la unión de dos conjuntos.
     *
     * @param conjunto1 El primer conjunto.
     * @param conjunto2 El segundo conjunto.
     * @return La unión de los conjuntos.
     */
    public static char[] union(char[] conjunto1, char[] conjunto2) {

        char[] union = Arrays.copyOf(conjunto1, conjunto1.length + conjunto2.length);
        int pos = conjunto1.length;
        for (char c : conjunto2) {
            if (!contiene(conjunto1, c)) {
                union[pos++] = c;
            }
        }
        return Arrays.copyOf(union, pos);
    }

    /**
     * Calcula la intersección de dos conjuntos.
     *
     * @param conjunto1 El primer conjunto.
     * @param conjunto2 El segundo conjunto.
     * @return La intersección de los conjuntos.
     */
    public static char[] interseccion(char[] conjunto1, char[] conjunto2) {

        char[] interseccion = new char[Math.min(conjunto1.length, conjunto2.length)];
        int pos = 0;
        for (char c : conjunto1) {
            if (contiene(conjunto2, c)) {
                interseccion[pos++] = c;
            }
        }
        return Arrays.copyOf(interseccion, pos);
    }

    /**
     * Calcula la diferencia entre dos conjuntos.
     *
     * @param conjunto1 El primer conjunto.
     * @param conjunto2 El segundo conjunto.
     * @return La diferencia de los conjuntos.
     */
    public static char[] diferencia(char[] conjunto1, char[] conjunto2) {

        char[] diferencia = new char[conjunto1.length];
        int pos = 0;
        for (char c : conjunto1) {
            if (!contiene(conjunto2, c)) {
                diferencia[pos++] = c;
            }
        }
        return Arrays.copyOf(diferencia, pos);
    }

    /**
     * Calcula el complemento de un conjunto en un universo dado.
     *
     * @param conjunto El conjunto.
     * @param universo El universo.
     * @return El complemento del conjunto en el universo.
     */
    public static char[] complemento(char[] conjunto, char[] universo) {
        if (universo.length < conjunto.length) {
            throw new IllegalArgumentException("El tamaño del universo debe ser mayor o igual al tamaño del conjunto");
        }
        char[] complemento = new char[universo.length - conjunto.length];
        int index = 0;
        for (char c : universo) {
            if (!contiene(conjunto, c)) {
                complemento[index++] = c;
            }
        }
        return complemento;
    }

    /**
     * Verifica si un elemento está presente en un conjunto.
     *
     * @param conjunto El conjunto.
     * @param elemento El elemento a verificar.
     * @return true si el elemento está presente en el conjunto, false de lo contrario.
     */
    public static boolean contiene(char[] conjunto, char elemento) {
        for (char c : conjunto) {
            if (c == elemento) {
                return true;
            }
        }
        return false;
    }

    /**
     * Reemplaza un elemento en un conjunto si está presente.
     *
     * @param conjunto      El conjunto.
     * @param elementoAntiguo El elemento a reemplazar.
     * @param elementoNuevo    El nuevo elemento.
     */
    public static void reemplazarElemento(char[] conjunto, char elementoAntiguo, char elementoNuevo) {
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i] == elementoAntiguo) {
                conjunto[i] = elementoNuevo;
            }
        }
    }
}
