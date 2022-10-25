package InnerAndAbstractClassesAndInterfaces.Saveable;

import java.util.ArrayList;
import java.util.List;

public class Monter implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monter(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

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

    @Override
    public List<String> write() {
        // TODO Auto-generated method stub
        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        // TODO Auto-generated method stub
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));

        }
    }

    public String toString() {
        // TODO Auto-generated method stub
        return "Monter{" + "name = " + name + '\'' + ", hitPoints = " + hitPoints + ", strength = " + strength
                + '\'' + '}';
    }

}
