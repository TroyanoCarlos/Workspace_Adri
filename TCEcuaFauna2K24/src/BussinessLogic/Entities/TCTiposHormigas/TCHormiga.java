package BussinessLogic.Entities.TCTiposHormigas;

import BussinessLogic.TCInterfaces.TCIHormiga;

public abstract class TCHormiga implements TCIHormiga{
    private String tcTipo;
    private String tcSexo;
    private String tcProvincia;
    private String tcGenoAlimento;
    private String tcIngestaNativa;
    private String tcEstado;

    public String getTcTipo() {
        return tcTipo;
    }
    public void setTcTipo(String tcTipo) {
        this.tcTipo = tcTipo;
    }
    public String getTcSexo() {
        return tcSexo;
    }
    public void setTcSexo(String tcSexo) {
        this.tcSexo = tcSexo;
    }
    public String getTcProvincia() {
        return tcProvincia;
    }
    public void setTcProvincia(String tcProvincia) {
        this.tcProvincia = tcProvincia;
    }
    public String getTcGenoAlimento() {
        return tcGenoAlimento;
    }
    public void setTcGenoAlimento(String tcGenoAlimento) {
        this.tcGenoAlimento = tcGenoAlimento;
    }
    public String getTcIngestaNativa() {
        return tcIngestaNativa;
    }
    public void setTcIngestaNativa(String tcIngestaNativa) {
        this.tcIngestaNativa = tcIngestaNativa;
    }
    public String getTcEstado() {
        return tcEstado;
    }
    public void setTcEstado(String tcEstado) {
        this.tcEstado = tcEstado;
    }
    

}
