public class Slime extends Enemy{

    public Slime() {
        super(100, 50, "Slime");
    }
    @Override
    public void update() {
        System.out.println(name + " Oozes Nearer.");
    };
    @Override
    public void attack() {
        System.out.println(name + " fires a ball of slime.");
    };
}