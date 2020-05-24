package com.ligel.javaInner_observerDesignPartent;

import com.ligel.javaInner_observerDesignPartent.domain.WeaterDate;
import com.ligel.javaInner_observerDesignPartent.impl.CurrentConditionsDisplay;

import java.util.Observer;

public class ObserverInnerTest {
    public static void main(String[] args) {
        WeaterDate weaterData= new WeaterDate();
        Observer current= new CurrentConditionsDisplay(weaterData);
        weaterData.setMeasurements(30,40,45.4f);
        weaterData.setMeasurements(23,44,48.4f);
    }
}
