package Prototype;

import Prototype.Types.ByBudget;

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
public class BudgetLevel extends Parent implements Cloneable{
    private int budget;
    private ByBudget type;
    private Parent parent;

    public BudgetLevel(int budget, ByBudget type, Parent parent) {
        this.budget = budget;
        this.type = type;
        this.parent = parent;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public ByBudget getType() {
        return type;
    }

    public void setType(ByBudget type) {
        this.type = type;
    }

    @Override
    public BudgetLevel clone() {
        BudgetLevel budgetLevel = null;
        try {
            budgetLevel = (BudgetLevel) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Smth comes a wrong way");
            e.printStackTrace();
        }
        return budgetLevel;
    }


}
