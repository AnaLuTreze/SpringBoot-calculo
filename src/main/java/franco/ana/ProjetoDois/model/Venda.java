package franco.ana.ProjetoDois.model;

public class Venda {

    private double valorProduto1;
    private double valorProduto2;

    public Venda(){


    }
    public Venda(double valorProduto1, double valorProduto2){
        this.valorProduto1 = valorProduto1;
        this.valorProduto2 = valorProduto2;
    }

    public double getValorProduto1() {
        return valorProduto1;
    }
    public void setValorProduto1(double valorProduto1) {
        this.valorProduto1 = valorProduto1;

    }

    public double getValorProduto2() {
        return valorProduto2;
    }

    public void setValorProduto2(double valorProduto2) {
        this.valorProduto2 = valorProduto2;
    }

    public double calcularProduto(){
        return this.valorProduto1 + this.valorProduto2;

    }

    @Override
    public String toString() {
        return "Valor total da venda{" +
                "ValorProduto1=" + valorProduto1 +
                ", ValorProduto2=" + valorProduto2 +
                ", Valor total" + calcularProduto() +
                '}';
    }
}

