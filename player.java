package game;



public class player {
  String name;
    int speed, healthpoint, damage, armor; //variable global
    public player(){
    String name;
    int speed, healthpoint, damage, armor; //variable global
}
    void run() {

        System.out.println(name + " is running...");
        System.out.println("speed: " + speed);
        System.out.println("damage: " + damage);
        System.out.println("armor: " + armor);
    }

    boolean isDead() {

        if (healthpoint <= 0) {
            return true;
        }
        return false;
    }
        boolean isAttacking() {
 
     if (damage >= 60) {
                return true;
    }
            return false;
    }
     boolean isDeffending() {
 
     if (armor<= 60) {
                return true;
    }
            return false;
    }
  public void attack(player target) {
        System.out.println("Player attacking!");
        int damage = calculateDamage();
        target.takeDamage(damage);
    }

    public void defend() {
        System.out.println("Player deffending!");
        // Logika pertahanan dapat ditambahkan di sini jika diperlukan
    }
    public void takeDamage(int damage) {
        int finalDamage = Math.max(0, damage - armor);
        healthpoint -= finalDamage;
        System.out.println("Player menerima " + finalDamage + " damage.");
        if (healthpoint <= 0) {
            System.out.println("Player dead");
        } else {
            System.out.println("Sisa HP: " + healthpoint);
        }
    }
    private int calculateDamage() {
        // Logika perhitungan damage dapat ditambahkan di sini jika diperlukan
        return 10; // Contoh: damage tetap 10
    }
public int getHealth() {
        return healthpoint;
    }

    public int getDefense() {
        return armor;
    }
}
