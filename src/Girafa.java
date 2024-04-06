public class Girafa extends Animal{

    float comprimentoDoPescoco;
    public Girafa() {
        this.especie = "girafa";
        this.comprimentoDoPescoco = 3.5f;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncomprimento do pescoço: " + this.comprimentoDoPescoco;
    }
}
