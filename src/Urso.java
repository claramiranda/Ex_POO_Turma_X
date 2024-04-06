public class Urso extends Animal {
    public Urso(){
        this.especie = "urso";
    }

    @Override
    public String toString() {
        return "GRRRRRR" + super.toString();
    }
}
