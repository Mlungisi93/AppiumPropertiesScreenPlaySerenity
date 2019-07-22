package com.expleo.appium.tasks;
import com.expleo.appium.interactions.EnterInputs;
import com.expleo.appium.model.Calculator;
import com.expleo.appium.ui.CalculatorPage;
import com.expleo.appium.ui.OperatorsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
//import net.poc.interactions.EnterANote;
//import net.poc.model.Note;
//import net.poc.ui.AddNotePage;
//import net.poc.ui.NotesWelcomePage;
import net.thucydides.core.annotations.Step;

import java.util.ArrayList;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddNumbers implements Task {

    private final Calculator calculator;

    public AddNumbers(Calculator calculator) {
        this.calculator = calculator;
    }


    @Override
    @Step("{0} adds two numbers")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterInputs.with(calculator),
                Click.on(OperatorsPage.EQUAL_OPERATOR)); //clicks on the buttons
    }

    public static AddNumbers with(Calculator calculator)
    {
       return instrumented(AddNumbers.class, calculator);
    }
}
