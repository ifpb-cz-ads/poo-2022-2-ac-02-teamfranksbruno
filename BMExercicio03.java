public class BMExercicio03 {
    public static void main(String[] args) throws Exception {
        double item1 = 2.95;
        double item2 = 3.50;

        System.out.println("O item 1 custa " + item1 + "R$, e o item 2 custa " + item2 + "R$");

        double somaDosItens = item1 + item2;

        System.out.println("A soma dos preços é " + somaDosItens + "R$");

        final double taxaCalculada = somaDosItens * 0.0825;

        System.out.println("O preço com a taxa é " + taxaCalculada + "R$");

        item1 += taxaCalculada;
        item2 += taxaCalculada;

        double novoCusto = item1 + item2;

        boolean muitoCaro = novoCusto > 10;

        System.out.println("O preço está muito caro: " + muitoCaro);
    }
}
