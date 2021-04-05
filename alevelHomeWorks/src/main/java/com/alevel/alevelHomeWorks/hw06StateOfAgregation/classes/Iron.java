package main.java.com.alevel.alevelHomeWorks.hw06StateOfAgregation.classes;

import main.java.com.alevel.alevelHomeWorks.hw06StateOfAgregation.enums.State;
import main.java.com.alevel.alevelHomeWorks.hw06StateOfAgregation.interfaces.Substance;

public class Iron implements Substance {
    private double temp;
    private final static double MELTING_TEMPERATURE = 1539.0;

    private final static double BOILING_TEMPERATURE = 2862.0;

    public Iron(double temp) {
        this.temp = temp;
    }

  /*  @Override
    public State heatUp(double t) {
        temp = +t;
        if (temp <= MELTING_TEMPERATURE) {
            return State.SOLID;
        }
        if (temp >= BOILING_TEMPERATURE) {
            return State.GAS;
        } else {
            return State.LIQUID;
        }
    }*/

}
