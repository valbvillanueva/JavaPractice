package JavaExercises.JavaExcercisePenny.Penny.src.attributes;

import application.MySavings;

public class Penny extends MySavings {
    private int dime;
    private int nickel;
    private int quarter;
    private int penny, bank;

    public int getDime() {
        return dime;
    }

    public void setDime(int newDime) {
        this.dime += newDime;
    }

    public int getNickel() {
        return nickel;
    }

    public void setNickel(int newNickel) {
        this.nickel += newNickel;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int newQuarter) {
        this.quarter += newQuarter;
    }

    public int getPenny() {
        return penny;
    }

    public void setPenny(int newPenny) {
        this.penny += newPenny;
    }

    public void setBank(int bank) {
        this.bank += bank;
    }

    public int getBank() {
        return bank;
    }


    
}
