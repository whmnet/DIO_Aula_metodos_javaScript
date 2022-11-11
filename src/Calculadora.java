public class Calculadora {
    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println("a soma do número: " + numero1 + " mais o número: " + numero2 + " e igual a: " + resultado);
    }
    public static void subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("a subtracao do número: " + numero1 + " menos o número: " + numero2 + " e igual a: " + resultado);
    }
    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println("a multiplicacao do número: " + numero1 + " vezes o número: " + numero2 + " e igual a: " + resultado);
    }
    public static void divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;
        System.out.println("a divisão do número: " + numero1 + " dividindo o número: " + numero2 + " e igual a: " + resultado);
    }
}
