package BussinessLogic.Entities;

import java.util.ArrayList;
import java.util.List;

import BussinessLogic.Entities.TCTiposHormigas.TCHormiga;
import BussinessLogic.Entities.TCTiposHormigas.TCLarva;

public class TCExperto {
    private String tcNombre;
    private String tcCedula;
    public List <TCHormiga> hormiguero;
    public TCLarva tcHormigaEscogida;
    public Integer tcNumeroHormiga;

    public TCExperto (){
        setTcNombre("Experto");
        setTcCedula("0123456789");
        hormiguero = new ArrayList<>();
        tcNumeroHormiga = 0;
    }

    public TCExperto (String nombre, String cedula){
        setTcNombre(nombre);
        setTcCedula(cedula);
        hormiguero = new ArrayList<>();
        tcNumeroHormiga = 0;
    }

    public void tcCrearHormiga (){
        tcHormigaEscogida = new TCLarva();
       tcNumeroHormiga ++;
        Integer tcIntRdn = (int)(Math.random()*(24+1));
        switch (tcIntRdn) {
            case 1:
                tcHormigaEscogida.setTcProvincia("Esmeraldas");
                break;
            case 2:
                tcHormigaEscogida.setTcProvincia("Manabí");
                break;
            case 3:
                tcHormigaEscogida.setTcProvincia("Los Ríos");
                break;
            case 4:
                tcHormigaEscogida.setTcProvincia("Guayas");
                break;
            case 5:
                tcHormigaEscogida.setTcProvincia("Santa Elena");
                break;
            case 6:
                tcHormigaEscogida.setTcProvincia("El Oro");
                break;
            case 7:
                tcHormigaEscogida.setTcProvincia("Santo Domingo de los Tsáchilas");
                break;
            case 8:
                tcHormigaEscogida.setTcProvincia("Carchi");
                break;
            case 9:
                tcHormigaEscogida.setTcProvincia("Imbabura");
                break;
            case 10:
                tcHormigaEscogida.setTcProvincia("Pichincha");
                break;
            case 11:
                tcHormigaEscogida.setTcProvincia("Cotopaxi");
                break;
            case 12:
                tcHormigaEscogida.setTcProvincia("Tungurahua");
                break;
            case 13:
                tcHormigaEscogida.setTcProvincia("Bolívar");
                break;
            case 14:
                tcHormigaEscogida.setTcProvincia("Chimborazo");
                break;
            case 15:
                tcHormigaEscogida.setTcProvincia("Cañar");
                break;
            case 16:
                tcHormigaEscogida.setTcProvincia("Azuay");
                break;
            case 17:
                tcHormigaEscogida.setTcProvincia("Loja");
                break;
            case 18:
                tcHormigaEscogida.setTcProvincia("Napo");
                break;
            case 19:
                tcHormigaEscogida.setTcProvincia("Orellana");
                break;
            case 20:
                tcHormigaEscogida.setTcProvincia("Pastaza");
                break;
            case 21:
                tcHormigaEscogida.setTcProvincia("Morona Santiago");
                break;
            case 22:
                tcHormigaEscogida.setTcProvincia("Sucumbíos");
                break;
            case 23:
                tcHormigaEscogida.setTcProvincia("Zamora Chinchipe");
                break;
            case 24:
                tcHormigaEscogida.setTcProvincia("Galápagos");
                break;
            default:
                tcHormigaEscogida.setTcProvincia("Provincia desconocida");
                break;
        }
        hormiguero.add(tcHormigaEscogida);

    }
    



    public String getTcNombre() {
        return tcNombre;
    }
    public void setTcNombre(String tcNombre) {
        this.tcNombre = tcNombre;
    }
    public String getTcCedula() {
        return tcCedula;
    }
    public void setTcCedula(String tcCedula) {
        this.tcCedula = tcCedula;
    }

    
}
