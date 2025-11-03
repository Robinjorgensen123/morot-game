package java.Java.Paragons;

public class paragon {
    int paragonSpeed = 7;
    int paragonHealth = 100;
    int paragonDamage = 10;
    int paragonLevel = 1;
    String paragonName;

    public int getParagonSpeed() {
        return paragonSpeed;
    }
    public int getParagonHealth() {
        return paragonHealth;
    }
    public int getParagonDamage() {
        return paragonDamage;
    }
    public int getParagonLevel() {
        return paragonLevel;
    }
    public String setParagonName(String name) {
        this.paragonName = name;
        return paragonName;
    }
    public String getParagonName() {
        return paragonName;
    }

}
