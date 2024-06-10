import java.util.Arrays;

public class Juego {
    public Jugador usuario;
    private String[] ladoIzquierdo;
    private String[] ladoDerecho;
    private Boolean vikingoEstaIzq;
    private String barca;
    private String rio;
    
    public Juego() {
        // Inicializar el valor o instaciarlo es mejor hacerlo en el constructor
        this.usuario = new Jugador();
        this.vikingoEstaIzq = true;
        this.ladoIzquierdo = new String[] { "V", "L", "C", "U" };
        this.ladoDerecho = new String[] { "", "", "", "" };
        this.barca = "\\_V_;_?_/";
        this.rio = "..".repeat(20);
    }
    
    public void HiJuego() {
        System.out.println("Hola desde juego");
    }
    
    public boolean jugarLobito (){
        do {
            short opcMenu = mostrarMenu();
            String individuo = " ";
    
            if(vikingoEstaIzq){
                individuo = ladoIzquierdo[opcMenu];
                ladoIzquierdo[opcMenu] = " ";
            }
            else{     
                individuo = ladoDerecho[opcMenu]; 
                ladoDerecho[opcMenu] = " ";
            }
            
            moverBarca(individuo);
            vikingoEstaIzq =! vikingoEstaIzq;
    
            if(vikingoEstaIzq){
                ladoIzquierdo[opcMenu] = individuo;
                setBarcaRio(1, " ");
            }
            else{
                ladoDerecho[opcMenu] = individuo;
                setBarcaRio(rio.length(), " ");
            }
            verificarRegla();
        } while (true);
    }

    // - verificarRegla(): String
    private void verificarRegla (){
        String msg = "";

        if (vikingoEstaIzq){
            //R1: lobo come caperucita
            if(ladoDerecho[1].equals("L")&&ladoDerecho[2].equals("C"))
                msg += "\n El lobo se comio a la caperucita. ";
            //R2: caperucita come uvas
            if (ladoDerecho[2].equals("C")&&ladoDerecho[3].equals("U"))
                msg += "\n La caperucita se comio las uvas. ";
        }else{
            //R1: lobo come caperucita
            if(ladoIzquierdo[1].equals("L")&&ladoIzquierdo[2].equals("C"))
                msg += "\n El lobo se comio a la caperucita. ";
            //R2: caperucita come uvas
            if (ladoIzquierdo[2].equals("C")&&ladoIzquierdo[3].equals("U"))
                msg += "\n La caperucita se comio las uvas. ";
        }
        if(ladoDerecho[1].equals("L")&&ladoDerecho[2].equals("C")&&ladoDerecho[3].equals("U"))
            msg = "¡Felicidades! Has ganado el juego";

        if (!msg.isEmpty()){
            System.out.println("\n\n"+msg);
            System.exit(0);
        }
        
    }


    private short mostrarMenu() {
        int opc = -1;
        // System.out.println(" ".repeat(10) + barca + rio);
        System.out.println("\n 0 Vikingo va solo"
                         + "\n 1 Lobo           "
                         + "\n 2 Caperucita     "
                         + "\n 3 Uvas           "
                         + "\n 4 Salir          ");

        do {
            try {
                opc = -1;
                String personaje = "";
                System.out.println("[+] Ingresa una opc");
                opc = App.sc.nextInt();
                
                
                if (opc == 4) {
                System.out.println("Gracias por jugar!");
                System.exit(0);
                }
                
                personaje = vikingoEstaIzq
                ? ladoIzquierdo[opc] 
                : ladoDerecho[opc];
                
                
                
                
                if (personaje.trim().isEmpty() && opc > 0 && opc < 4){
                    opc = -1;
                    System.out.println("No existe ese personaje");
                }



            } catch (Exception e) {
                App.sc.nextLine();
            }

        } while (opc < 0 || opc >= 4);
        
        return (short)opc;
    }

    private void moverBarca(String individuo ) {
        
        if (vikingoEstaIzq) {
            for (int i = 0; i < rio.length(); i++) {

                setBarcaRio(i, individuo);
            }
        } else{
            
            for (int i = rio.length()-1; i >= 0; i--) {
                setBarcaRio(i, individuo);
            }
        }

    }

    private void setBarcaRio(int posicionBarca, String individuo) {
        
        String personajeIzq = Arrays.toString(ladoIzquierdo);
        String personajeDer = Arrays.toString(ladoDerecho);
        String rioBarca = "\r"
                            + personajeIzq      
                            +".".repeat(posicionBarca) 
                            + barca.replace("?", individuo) 
                            + ".".repeat(rio.length()-posicionBarca)
                            + personajeDer;

        System.out.print(rioBarca);
        try {
            Thread.sleep(50);
        } catch (Exception e) {
        }
    }

}