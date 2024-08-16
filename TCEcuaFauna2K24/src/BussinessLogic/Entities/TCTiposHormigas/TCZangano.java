package BussinessLogic.Entities.TCTiposHormigas;

import BussinessLogic.Entities.TCAlimentos.TCAlimento;

public class TCZangano extends TCHormiga {
    public TCZangano (){
        setTcTipo("Zángano");
    }

    @Override
    public boolean comer(TCAlimento alimento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comer'");
    }
}
