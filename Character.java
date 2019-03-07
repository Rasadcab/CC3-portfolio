package rpg;

public class Character {

    public String name;
    public int strength;
    public int dexterity;
    public int intelligence;
    public int maxlife;
    public int currentlife;

    static Dice dice = new Dice();

    public Character(String n, int s, int d, int i) {
        name = n;
        strength = s;
        dexterity = d;
        intelligence = i;
        maxlife = dice.roll()*10;
        currentlife = maxlife;

    }

    public int attack() {
        int attack = dice.roll();

        return attack;
    }

    public void wound(int damage) {

        currentlife = currentlife - damage;
        
    }

    public void heal(int heal) {
        currentlife = currentlife + heal;
        if(currentlife > maxlife){
            System.out.println("maxlife");
        }else
            System.out.println("healed");
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getCurrentLife() {
        return currentlife;
    }

    public int getMaxLife() {
        return maxlife;
    }
}
