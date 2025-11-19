

public class GameDriver {
 
    public static void main(String[] args) {
 
        //Enemy e = new Enemy();
 
        // TODO: Create an Enemy[] array with:
        Enemy[] enemies = {new Slime(), new Skeleton(), new Dragon()};
 
        // TODO: Loop through the array and call:
        for (Enemy enemy : enemies) {
            enemy.attack();
            enemy.update();
            enemy.takeDamage(20);
        }

    }
}