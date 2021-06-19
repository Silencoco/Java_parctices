package Test;

import Junit.Calculator;

import static org.junit.Assert.*;

public class CalculatorTest {

    @org.junit.Test
    public void add() {
//        System.out.println("我被执行了……");
        Calculator c = new Calculator();
        int result = c.add(1, 3);
        System.out.println(result);
    }

    @org.junit.Test
    public void sub() {
    }
}