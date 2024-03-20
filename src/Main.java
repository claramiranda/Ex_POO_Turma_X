public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Calculadora calc = new Calculadora(10,5);

        //Acessando operações através de método público
        double soma = calc.calcular("+");
        double subtracao = calc.calcular("-");
        double multiplicacao = calc.calcular("*");
        double divisao = calc.calcular("/");

        System.out.println("Soma dos valores: " + calc.getValor1() + " + " + calc.getValor2() + " = " + soma);

        System.out.println("Resultado da Subtração: "  + calc.getValor1() + " - " + calc.getValor2() + " = " + subtracao );

        System.out.println("Resultado da Multiplicacao: " + calc.getValor1() + " * " + calc.getValor2() + " = " + multiplicacao);

        System.out.println("Resultado da Divisao: " + calc.getValor1() + " / " + calc.getValor2() + " = " + divisao);




        //Métodos inacessíveis fora da classe Calculadora
       /* System.out.println(calc.somar());
        System.out.println(calc.somar());
        System.out.println(calc.subtrair());
        System.out.println(calc.multiplicar());
        System.out.println(calc.dividir());*/


    }
}