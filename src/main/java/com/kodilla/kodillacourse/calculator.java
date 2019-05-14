package com.kodilla.kodillacourse;
class Calculator {
    private int numberA;
    private int numberB;
    public Calculator(int numberA, int numberB){
        this.numberA = numberA;
        this.numberB = numberB;
    }
    public void sum(){
        int sumAB = numberA + numberB;
        System.out.println(numberA + " + " + numberB + " = " + sumAB);
        System.out.println("It works!");
    }
    public void sub(){
        int subAB = numberA - numberB;
        System.out.println(numberA + " - " + numberB + " = " + subAB);
        System.out.println("It works!");
    }
    public static void main(String args[]){
        Calculator calculator = new Calculator(1, 1);
        calculator.sum();
    }
}