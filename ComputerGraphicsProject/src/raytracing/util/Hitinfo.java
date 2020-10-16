package raytracing.util;

public class Hitinfo {
    public int amountOfHits;
    public double t1;
    public double t2;

    public Hitinfo(int amountOfHits, double t1, double t2){
        this.amountOfHits = amountOfHits;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getAmountOfHits() {
        return amountOfHits;
    }

    public void setAmountOfHits(int amountOfHits) {
        this.amountOfHits = amountOfHits;
    }

    public double getT1() {
        return t1;
    }

    public void setT1(double t1) {
        this.t1 = t1;
    }

    public double getT2() {
        return t2;
    }

    public void setT2(double t2) {
        this.t2 = t2;
    }
}

