package main.java.com.alevel.alevelHomeWorks.hw06StateOfAgregation.classes;

import main.java.com.alevel.alevelHomeWorks.hw06StateOfAgregation.enums.State;
import main.java.com.alevel.alevelHomeWorks.hw06StateOfAgregation.interfaces.Substance;

public class Water implements Substance {
    private double temperature;

    /*@Override
    public State heatUp(double t) {
        this.temperature=t;
        if (t>0){
            return State.LIQUID;
        }else if (t<0){
            return State.SOLID;
        }else if (t>100) {
            return State.GAS;
        }
    }*/
}
