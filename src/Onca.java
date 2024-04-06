public class Onca extends Animal {

    String padraoDasPintas;

    public Onca() {
        this.especie = "Onça";
        this.padraoDasPintas = "Pintada";
    }
    public Onca(int idade) {
        this.especie = "Onça Pintada";
        this.idade = idade;

    }

    public void escalar(){
        System.out.println("A Onça está subindo na árvore");
    }

    public void nadar(){
        System.out.println("A onça entrou no rio");
    }




    @Override
    public void comer() {
      /*  nadar();
        cacar();*/
        System.out.println("A Onça está comendo");
        super.comer();

    }

    @Override
    public void dormir() {
        System.out.println("A onça está cansada.");
        escalar();
        super.dormir();
    }


}
