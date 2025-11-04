package gamelogic.Enemies;

public class FlutterMouse extends enemy {

    public void enemySpeed() {
        this.enemySpeed = 6;
        System.out.println("Enemy Speed: " + this.enemySpeed);
    }

    public void enemyHealth() {
        this.enemyHealth = 80;
        System.out.println("Enemy Health: " + this.enemyHealth);
    }

    public void enemyDamage() {
        this.enemyDamage = 12;
        System.out.println("Enemy Damage: " + this.enemyDamage);
    }

    public void enemyName() {
        this.enemyName = "Flutter Mouse";
        System.out.println("Enemy Name: " + this.enemyName);
    }

    public void enemyImage() {
        this.enemyImage = "src/game/Graphics/Characters/Enemies/FlutterMouse.png";
        System.out.println("Image Path: " + this.enemyImage);
    }
    
}
