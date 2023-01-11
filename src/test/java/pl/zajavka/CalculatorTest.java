package pl.zajavka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
// jezeli wpiszemy w terminalu "mvn verify -DskipTests" wykonamy porgram bez testów


    @Test
    void add() {
//    given
        int left = 5;
        int right = 7;
        Integer expected = 12;
//    when
        Integer result = Calculator.add(left, right);
//    then
        Assertions.assertEquals(expected,result);
    }

    @Test
    void subtract() {
//    given
        int left = 5;
        int right = 7;
        Integer expected = -2;
//    when
        Integer result = Calculator.subtract(left, right);
//    thenv
        Assertions.assertEquals(expected,result);
    }
    @Test
    void multiple() {
//    given
        int left = 5;
        int right = 7;
        Integer expected = 5;
//    when
        Integer result = Calculator.multiple(left, right);
//    then
        Assertions.assertEquals(expected,result);
    }

    @Test
    void divide() {
//    given
        int left = 5;
        int right = 7;
        Integer expected = 0;
//    when
        Integer result = Calculator.divide(left, right);
//    then
        Assertions.assertEquals(expected,result);
    }

}