package com.expleo.appium.model;

import org.yecht.Data;

public class Calculator {

    private String input;
    private String output;

    public String getInput() {
        return input;
    }

    public String getOutput() {
        return output;
    }

    public Calculator() {
        this.input = ""; // TODO : varification of input and write it on my report
        this.output = "";
    }

    public Calculator(String input, String output) {
        this.input = input;
        this.output = output;
    }

    public static class CalculatorBuilder
    {
        private String input = "";
        private String output = "";

        public CalculatorBuilder()
        {

        }

        public CalculatorBuilder called(String input)
        {
            this.input = input;
            return this;
        }

        public CalculatorBuilder withOutput(String output)
        {
            this.output = output;
            return this;
        }

        public Calculator build()
        {
            return new Calculator(input, output);
        }


    }
}
