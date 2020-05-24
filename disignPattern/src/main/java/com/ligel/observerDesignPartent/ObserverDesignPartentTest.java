package com.ligel.observerDesignPartent;

import com.ligel.observerDesignPartent.impl.observerImpl.CurrentConditionsDisplay;
import com.ligel.observerDesignPartent.impl.subjectImp.WeaterDate;

public class ObserverDesignPartentTest {
    public static void main(String[] args) {
        WeaterDate weateDate= new WeaterDate();
        CurrentConditionsDisplay currentConditionsDisplay= new CurrentConditionsDisplay(weateDate);
        weateDate.setMeasurements(80,50,45.3f);
        weateDate.setMeasurements(59,30,23.2f);
    }
}
