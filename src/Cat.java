public class Cat {
    String nome;
    float peso;
    boolean ehArisco;
    String cor;

    public void dormir(){
        System.out.println(nome + ": ZzZzZ, a mimir");
    }

    public void comer(){
        System.out.println(nome + " :nhom nhom nhom, delicia de ração <3 ");
    }

    public void comer(boolean sache){
        System.out.println(nome + " :miau miau miau eu amo um sachezinho <3");

    }

    public void fazerManha(){
        System.out.println(nome + " :miau miau miau, pfvr me da atenção humano!!");
    }

    public void fazerBagunca(){
        System.out.println(nome + " :hahaha, vo destruir esas casa todinha ò_ó");
    }



    public Cat(String nome, float peso, boolean ehArisco, String cor) {
        this.nome = nome;
        this.peso = peso;
        this.ehArisco = ehArisco;
        this.cor = cor;
    }

    public Cat(String nome, String cor){
        this.nome = nome;
        this.cor = cor;
        ehArisco = false;
        peso = 4.0f;
    }




   public String toString(){
        return "nome: " + this.nome +"\npeso: " + this.peso +"\ncor: " + this.cor + "\narisco: " + this.ehArisco + "\n";
    }



    public static void main(String[] args) {
        Cat pudim = new Cat("Pudim",4.5f, true, "laranja");
        Cat pingado = new Cat("Pingado", 6.0f,false,"frajola");
        Cat paozinho = new Cat("Paozinho", 5.0f, true, "frajola");
        //Cat ruby = new Cat("Ruby",3.5f, false, "furia da noite");

        Cat ruby = new Cat("Ruby","Pretinha");

        ruby.comer(true);
        System.out.println(ruby.toString());

        pudim.comer();
        System.out.println(pudim.toString());


        //System.out.println(pudim);

        //System.out.println(pingado);

        //System.out.println(paozinho);

        //System.out.println(ruby);

        //System.out.println(pudim.toString());

    }


}
