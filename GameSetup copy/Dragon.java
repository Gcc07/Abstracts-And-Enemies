public class Dragon extends Enemy{

    public Dragon() {
        super(400, 25, "Lichdragon Fortissax");
    }
    @Override
    public void update() {
        System.out.println(name + " soars menacingly");
    };
    @Override
    public void attack() {
        System.out.println(name + " summons tracts of lightning");
    };
}