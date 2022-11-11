public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma(3, 4);
        Calculadora.subtracao(5, 2);
        Calculadora.multiplicacao(3, 2);
        Calculadora.divisao(5, 2.5);


        //Mensagem
        System.out.println("exercicio Mensagem");
        Mensagem.obterMensagem( 9);
        Mensagem.obterMensagem( 14);
        Mensagem.obterMensagem( 1);

        //Emprestimo
        System.out.println("exercício Emprestimo");
        Emprestimo.calcular( 1000 , Emprestimo.getDuasParcelas() );
        Emprestimo.calcular( 1000 , Emprestimo.getTresParcelas() );
        Emprestimo.calcular(1000, 5 );

    }


}