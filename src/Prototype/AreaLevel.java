package Prototype;

import Prototype.Types.ByArea;

import java.util.List;

/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 03.05.2017
 * 
 * Karpikova
 */
public class AreaLevel extends Parent implements Cloneable {
    private int area;
    private ByArea type;
    private Parent parent;

    public AreaLevel(Parent parent, int square, ByArea type) {
        this.parent = parent;
        this.area = square;
        this.type = type;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }


    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public ByArea getType() {
        return type;
    }

    public void setType(ByArea type) {
        this.type = type;
    }

    @Override
    public AreaLevel clone() {
        AreaLevel areaLevel = null;
        try {
            areaLevel = (AreaLevel) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Smth comes a wrong way");
            e.printStackTrace();
        }
        return areaLevel;
    }

    public static int getSumArea(AreaLevel iamMain, List<AreaLevel> areaLevel) {
        int sum = 0;
        for (AreaLevel inst:
             areaLevel) {
            if (inst.getParent()==null) continue;
            if (inst.getParent().equals(iamMain))
            {
                sum += inst.getArea();
            }
        }
        return sum;
    }
}
