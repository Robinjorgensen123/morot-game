package gamelogic;

import gamelogic.Enemies.FlutterMouse;

public class app {
    public static void main(String[] args) {   
        FlutterMouse flutterMouse = new FlutterMouse();
        
        flutterMouse.enemyImage();
        flutterMouse.enemyName();
        flutterMouse.enemyHealth();
        flutterMouse.enemyDamage();
        flutterMouse.enemySpeed();
        
    }
}
