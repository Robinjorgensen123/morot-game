package java.Java.Enemies;

public class enemy {
    private int enemySpeed = 5;
    private int enemyHealth = 100;
    private int enemyDamage = 10;
    private String enemyName;

    public int getEnemySpeed() {

        return enemySpeed;
    }
    public int getEnemyHealth() {
        return enemyHealth;
    }
    public int getEnemyDamage() {
        return enemyDamage;
    }
    public String setEnemyName(String name) {
        this.enemyName = name;
        return enemyName;
    }
    public String getEnemyName() {
        return enemyName;
    }

}
