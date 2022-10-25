package InnerAndAbstractClassesAndInterfaces.Saveable;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    // tạo field
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    // Contructor
    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public List<String> write() {
        // List<String> values = new ArrayList<String>();
        List<String> values = new ArrayList<>();
        // TODO Auto-generated method stub
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        values.add(3, this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        // TODO Auto-generated method stub
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);

        }
    }

    // getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Player{" + "name = " + name + '\'' + ", hitPoints = " + hitPoints + ", strength = " + strength
                + ", weapon = " + weapon + '\'' + '}';
    }

}
