
package game;


public class enemy {
     private int health;

    // Constructor default
    public enemy() {
        this.health = 50; // Nilai default
    }

    // Method untuk menyerang player
    public void attack(player player) {
        System.out.println("enemy attacking player!");
        player.defend();
    }

    // Method untuk menerima damage
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Musuh menerima " + damage + " damage.");
        if (health <= 0) {
            System.out.println("enemy dead!");
        } else {
            System.out.println("Sisa HP enemy: " + health);
        }
    }

    public int getHealth() {
        return health;
    }
}


