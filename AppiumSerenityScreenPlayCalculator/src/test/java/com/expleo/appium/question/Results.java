package com.expleo.appium.question;

import com.expleo.appium.ui.CalculatorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Results implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {


        return CalculatorPage.INPUTBOXTEXT.resolveFor(actor).getText().trim();
    }
}
