public class ExerciciosString {

    /*
    * 1. Limpar a frase OK
    * 2. Inverter a frase e armazenar em uma variavel auxiliar
    * 3. Compara as duas frases
    * */

    public boolean validarPalindromo(String frase){
        boolean resultado = false;
        String aux = new String();

        frase = frase.replace(" ", "");
        //System.out.println(frase);

        for (int i = frase.length()-1; i >= 0 ; i--) {
            aux = aux.concat(String.valueOf(frase.charAt(i)));
            //System.out.println(frase.charAt(i));
        }

        System.out.println(aux);
        if(frase.compareToIgnoreCase(aux) == 0){
            resultado = true;
            System.out.println("é um palindromo");
        }
        else {
            System.out.println("não é palindromo");
        }

        return resultado;
    }



    public static void main(String[] args) {

        ExerciciosString ex = new ExerciciosString();

        System.out.println(ex.validarPalindromo("   ame    o    poema   "));
        System.out.println(ex.validarPalindromo("rene ri"));
        System.out.println(ex.validarPalindromo("irene ri"));
        System.out.println(ex.validarPalindromo("boa noite hoje eh sexta"));

    }
}
