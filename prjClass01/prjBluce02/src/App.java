public class App {
    public static void main(String[] args) throws Exception {
        BucleFor   bf; // Declarar
        BucleWhile bw;

        bf = new BucleFor(); // Instanciar
        bw = new BucleWhile();
        
        //bf.signosAlternosMejorado(); // Llamar al metodo
        //bf.signosAlternos(); // Llamar al metodo
        //bf.imprimirEscalera(20);
        bw.signosAlternos();
        bw.signosAlternosMejorado();
    }
}
