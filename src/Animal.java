public class Animal {
    String nome;
    int idade;
    String especie;

    public void comer(){
        System.out.println("Animal está comendo");
    }

    public void dormir(){
        System.out.println("ZzZz, o Animal está mimindo ");
    }

    public void reproduzir(){
        System.out.println("Animal está produzindo novos filhotes");
    }

    public void cacar(){
        System.out.println("Animal está caçando");
    }


    public Animal() {
        this.nome = "nome desconhecido";
        this.idade = 0;
        this.especie = "espécie desconhecida";
    }

    public String toString(){
        return "\nNome: " + this.nome + "\nEspécie: " + this.especie + "\nIdade: " + this.idade;

    }
}
