package padraodecorator;

public class CoberturaExtra extends Extra {

    public CoberturaExtra(String label, double preco, Pedido pedido) {
        super(label, preco, pedido);
    }

    public Double getPreco() {
        return this.preco+pedido.getPreco();
    }
}