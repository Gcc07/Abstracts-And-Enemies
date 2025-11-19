public class Skeleton extends Enemy{

    public Skeleton() {
        super(1, 500, "Sans");
    }
    @Override
    public void update() {
        System.out.println(name + " frighteningly stares you down.");
    };
    @Override
    public void attack() {
        System.out.println(name + " Sends a flurry of careening bones.");
    };
}