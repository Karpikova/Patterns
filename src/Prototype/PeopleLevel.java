package Prototype;

import Prototype.Types.ByPeople;

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
public class PeopleLevel extends Parent implements Cloneable {
    private int people;
    private ByPeople type;
    private Parent parent;

    public PeopleLevel(int people, ByPeople type, Parent parent) {
        this.people = people;
        this.type = type;
        this.parent = parent;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public ByPeople getType() {
        return type;
    }

    public void setType(ByPeople type) {
        this.type = type;
    }

    @Override
    public PeopleLevel clone() {
        PeopleLevel peopleLevel = null;
        try {
            peopleLevel = (PeopleLevel) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Smth comes a wrong way");
            e.printStackTrace();
        }
        return peopleLevel;
    }

    public static int getSumArea(PeopleLevel iamMain, List<PeopleLevel> peopleLevels) {
        int sum = 0;
        for (PeopleLevel inst:
                peopleLevels) {
            if (inst.getParent()==null) continue;
            if (inst.getParent().equals(iamMain))
            {
                sum += inst.getPeople();
            }
        }
        return sum;
    }

}


