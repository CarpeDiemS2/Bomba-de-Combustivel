package exercicio;

/**
 *
 * @author igor de oliveira
 */
public class bombaCombustivel {

    private String tipoCombustivel;
    private float valorLitro;
    private float quantidadeCombustivel;

    public bombaCombustivel(String tipoCombustivel) {
        System.out.println("Bem-vindo ao posto Margens plácidas");
        System.out.println("Selecione o tipo de combustivel para saber os preços e a quantiade disponivel em nosso posto OBS: temos somente gasolina e diesel.");
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;

        if (this.tipoCombustivel.equals("gasolina")) {

            this.valorLitro = 6f;
            this.quantidadeCombustivel = 10000f;
            System.out.printf("\ncombustivel selecionado gasolina");
            System.out.printf("\nValor por litro %.2f ", this.valorLitro);
            System.out.printf("\nquantidade de litros em nosso tanque %.2f L", this.quantidadeCombustivel);
            System.out.printf("\n");
        }

        if (this.tipoCombustivel.equals("diesel")) {
            this.valorLitro = 5f;
            this.quantidadeCombustivel = 20000f;
            System.out.printf("\ncombustivel selecionado diesel");
            System.out.printf("\nValor por litro %.2f ", this.valorLitro);
            System.out.printf("\nquantidade de litros em nosso tanque %.2f L", this.quantidadeCombustivel);
            System.out.printf("\n");

        }

        if (!this.tipoCombustivel.equals("gasolina") && !this.tipoCombustivel.equals("diesel")) {
            System.out.println("\nTipo de combustivel incorreto, Por favor tente novamente");
        }
    }

    public void abastecerPorValor(float abastecerPorValor) {

        System.out.printf("\nValor a ser abastecido R$%.2f", abastecerPorValor);
        System.out.println("");
        if (abastecerPorValor / this.getValorLitro() < 0.99f) {
            System.out.printf("Mililitros colocados no veículo %.2f ML", abastecerPorValor / this.getValorLitro());/*
        } else if (abastecerPorValor < 4.98f) {
            System.out.printf("Mililitros colocados no veículo %.2f ML", abastecerPorValor / this.getValorLitro());*/
        } else {
            System.out.printf("Litros colocados no veículo %.2f L", abastecerPorValor / this.getValorLitro());
        }

        System.out.println("");
        System.out.println("Quantidade de Litros no tanque ANTIGA: " + this.getQuantidadeCombustivel() + " L");
        this.setQuantidadeCombustivel(this.getQuantidadeCombustivel() - abastecerPorValor / this.getValorLitro());
        System.out.println("Quantidade de litros no tanque ATUAL: " + this.getQuantidadeCombustivel() + " L");

    }

    public void abastecerPorLitro(float abastecerPorLitro) {
        System.out.println("\nQuantidade em litros " + abastecerPorLitro + " L");
        float tot1 = abastecerPorLitro * this.getValorLitro();
        System.out.printf("Total a ser Pago R$%.2f", tot1);
        System.out.println("");
        System.out.println("Quantidade de Litros no tanque ANTIGA: " + this.getQuantidadeCombustivel());
        this.setQuantidadeCombustivel(this.getQuantidadeCombustivel() - abastecerPorLitro);
        System.out.println("Quantidade de litros no tanque ATUAL: " + this.getQuantidadeCombustivel());

    }

    /*
    altera o valor do litro do combustível.
    
     */
    public void alterarValor(float alterarValor) {

        //System.out.println(this.getValorLitro());
        System.out.println("\nTipo combustivel: " + this.getTipoCombustivel());
        System.out.printf("Valor antigo: R$%.2f", getValorLitro());
        this.setValorLitro(alterarValor);
        System.out.printf("\nNovo valor: R$%.2f", this.getValorLitro());
        System.out.println("\n");

    }

    public void alterarCombustivel(String alterarCombustivel) {
        this.setTipoCombustivel(alterarCombustivel);
        System.out.println("Combustivel alterado para " + alterarCombustivel);

    }

    public void alterarQuantidadeCombustivel(float alterarQuantidadeCombustivel) {
        System.out.println("\nQuantidade de Litros no tanque ANTIGA: " + this.getQuantidadeCombustivel());
        this.setQuantidadeCombustivel(alterarQuantidadeCombustivel);
        System.out.println("Quantidade de Litros no tanque ATUAL " + this.getQuantidadeCombustivel());

    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;

    }

    public float getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

}
