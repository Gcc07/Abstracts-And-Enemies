
public abstract class Enemy {
    protected int health;
    protected int damage;
    protected String name;
    public Enemy(int health, int damage, String name) {
        this.health = health;
        this.damage = damage;
        this.name = name;
    }
    public abstract void update();
    public abstract void attack();

    public void takeDamage(int amount) {
        health = health - amount;
        System.out.println(name + "'s health has dropped to " + health + "!");

        if (health < 0) {
            System.out.println(name + " has perished!");
        }
    }
    public String getName() {
        return name;
    }
}