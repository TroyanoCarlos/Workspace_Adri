package BussinessLogic.Entities.TCTiposHormigas;

import BussinessLogic.Entities.TCAlimentos.TCAlimento;

public class TCLarva extends TCHormiga {
    TCZangano tcLarvaEvolucionada;
    private boolean tcEvolucion;
    private boolean tcVitalidad;

    public TCLarva() {
        super();
        tcEvolucion = false;
        setTcTipo("Larva");
        tcVitalidad = true;
        setTcEstado("VIVO");
    }

    @Override
    public boolean comer(TCAlimento alimento) {
        if (!tcEvolucion && tcVitalidad && alimento.getTcNombre().equals("XY")) {
            tcLarvaEvolucionada = new TCZangano();
            tcEvolucion = true;
            System.out.println("Larva evolucionada");
        }
        if (tcEvolucion && tcVitalidad &&(alimento.getTcNombre().equals("Insectívoro")
        || alimento.getTcNombre().equals("Nectarívoro"))) {
            tcVitalidad = false;
            setTcEstado("MUERTO");
        }
        return true;
    }
}