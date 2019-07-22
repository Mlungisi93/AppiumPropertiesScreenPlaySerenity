package com.expleo.appium.question.factory;

import com.expleo.appium.question.Results;
import net.serenitybdd.screenplay.Question;

public class OutputScreen {
    public static Question<String> results()
    {
       return new Results();
    }
}
