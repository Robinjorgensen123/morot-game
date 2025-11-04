package gamelogic.Bosses;

public class Boss {
    int bossSpeed = 4;
    int bossHealth = 300;
    int bossDamage = 25;
    String bossName;

    public int getBossSpeed() {
        return bossSpeed;
    }
    public int getBossHealth() {
        return bossHealth;
    }
    public int getBossDamage() {
        return bossDamage;
    }
    public String setBossName(String name) {
        this.bossName = name;
        return bossName;
    }
    public String getBossName() {
        return bossName;
    }
}
