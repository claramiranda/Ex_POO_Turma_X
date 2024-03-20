public class Calculadora {
    private double valor1;
    private double valor2;


    private double somar(){
        return valor1 + valor2;
    }

    private double subtrair(){
        return valor1 - valor2;
    }

    private double multiplicar(){
        return valor1 * valor2;
    }

    private double dividir(){
        if (valor2 != 0) {
            return valor1 / valor2;
        }
        else{
            System.out.println("Erro: Não é possível realizar uma divisão por zero");
            return Double.NaN;
        }
    }

    public double calcular(String operador){
        switch (operador){
            case "+":
                return somar();

            case "-":
                return subtrair();

            case "*":
                return multiplicar();

            case "/":
                return dividir();

           default:
                System.out.println("Operação inválida");

                //Retornando um valor de Not A Number
                return Double.NaN;
        }
    }


    public static void main(String[] args) {
        Calculadora calc = new Calculadora(10,5);

        //Só pode ser utilizado dentro da própria classe
        System.out.println(calc.somar());
        System.out.println(calc.subtrair());
        System.out.println(calc.multiplicar());
        System.out.println(calc.dividir());

    }


    //CONSTRUCTOR
    public Calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    //GETTERS AND SETTERS
    public double getValor1() {
        return valor1;
    }

    public double getValor2() {
        return valor2;
    }

}
