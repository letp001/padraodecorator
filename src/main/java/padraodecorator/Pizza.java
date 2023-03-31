package padraodecorator;

public class Pizza implements Pedido {
    private String label;
    private double preco;

    public Pizza(String label, double preco) {
        this.label=label;
        this.preco=preco;
    }

    public Double getPreco(){
        return this.preco;
    }

    public String getLabel(){
        return this.label;
    }
}