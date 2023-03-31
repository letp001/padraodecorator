package padraodecorator;

public class CoberturaSemCusto extends Extra {

    public CoberturaSemCusto(String label, double preco, Pedido pedido) {
        super(label, preco, pedido);
    }

    public Double getPreco() {
        return pedido.getPreco();
    }
}
