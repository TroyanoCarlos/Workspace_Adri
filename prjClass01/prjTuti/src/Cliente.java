public class Cliente {
    private Float dinero;

    public Float getDinero() {
        return dinero;
    }

    public void setDinero(Float dinero) {
        this.dinero = dinero;
    }

    public void seleccionarProducto() {
    }

    public String seleccionarProductoOnline() {
        return "";
    }

    public Boolean pagarProducto(String listaProduto) {
        return true;
    }
}
