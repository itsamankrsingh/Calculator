package com.aman.calculator;

public class Digit {
    private float inputOne;
    private float inputTwo;
    private float result;

    public Digit() {

    }

    public Digit(float inputOne, float inputTwo) {
        this.inputOne = inputOne;
        this.inputTwo = inputTwo;
    }

    public float getInputOne() {
        return inputOne;
    }

    public void setInputOne(float inputOne) {
        this.inputOne = inputOne;
    }

    public float getInputTwo() {
        return inputTwo;
    }

    public void setInputTwo(float inputTwo) {
        this.inputTwo = inputTwo;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
}
