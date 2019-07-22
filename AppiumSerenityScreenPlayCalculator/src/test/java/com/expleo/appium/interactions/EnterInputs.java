package com.expleo.appium.interactions;

import com.expleo.appium.model.Calculator;
import com.expleo.appium.ui.CalculatorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class EnterInputs implements Interaction {

    private Calculator calculator;

    public EnterInputs(Calculator calculator)
    {

        this.calculator = calculator;
    }


    @Override
    @Step("{0} fills the calculator input box")
    public <T extends Actor> void performAs(T actor) {
        if(!calculator.getInput().isEmpty())
        {
            /*CalculatorPage.INPUTBOXTEXT.resolveFor(actor).type(calculator.getInput());*/
           actor.attemptsTo( Enter.theValue(calculator.getInput()).into(CalculatorPage.INPUTBOXTEXT));

        }

    }

    public static Interaction with(Calculator calculator)
    {
        return instrumented(EnterInputs.class, calculator);
    }
}
