interface Attackable {
    void attack(int damage);
    default void battleCry() {
        System.out.println("For The Kingdom");
    }
}
interface Healable {
    void heal(int health);
}

class Warrior implements Attackable, Healable {
    private String name;
    Warrior(String name) {
        this.name = name;
    }
    @Override
    public void attack(int damage) {
        System.out.println(name + " : ");
        System.out.println("Damage Done : " + damage + " Using Sword.");
    }

    @Override
    public void heal(int health) {
        System.out.println(name + " : ");
        System.out.println("Health Recovered : " + health + " By Drinking Health Porion.");
    }
}

class Mage implements Attackable, Healable {
    private String name;
    Mage(String name) {
        this.name = name;
    }
    @Override
    public void attack(int damage) {
        System.out.println(name + " : ");
        System.out.println("Damage Done : " + damage + " Using FireBall.");
    }

    @Override
    public void heal(int health) {
        System.out.println(name + " : ");
        System.out.println("Health Recovered : " + health + " By Casting Healing Spell.");
    }
}

class Battle {
    public void attackEnemy(Attackable player, int damage) {
        player.attack(damage);
    }

    public void gainHealth(Healable player, int health) {
        player.heal(health);
    }
}
public class RPG {
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.attackEnemy(
            new Warrior("Warrior"),
            55
        );
        battle.gainHealth(
            new Mage("Mage"),
            45
        );
        battle.attackEnemy(
            new Mage("Mage"),
            40
        );
        battle.gainHealth(
            new Warrior("Warrior"),
            40
        );

    }
}
