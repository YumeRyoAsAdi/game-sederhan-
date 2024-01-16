
package game;


public class Game {


    public static void main(String[] args) {

        player hero = new player();
       enemy enemy = new enemy();
       
        hero.name = "Choki";
        hero.speed = 80;
        hero.healthpoint = 100;
        hero.damage= 50;
        hero.armor=50;
        
        enemy.damage = 80;
        hero.armor = 30;
        
        
        hero.run();
        
        if(hero.isDead()){
            System.out.println("Game Over :v");
        
       }
        
    if (hero.getHealth() > 0) {
            System.out.println("Player masih hidup!");
        } else {
            System.out.println("Player telah dikalahkan!");
        }
        }
   
   
    }
 

