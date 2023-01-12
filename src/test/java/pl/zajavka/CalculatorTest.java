package pl.zajavka;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;


    //  @BeforeAll - wykonuje kod przed uruchomieniem testów. musi byc static
//    @BeforeAll
//    static void beforeAll() {
//        System.out.println("beforeAll");
//    }

    // @BeforeEach - bedzie wykonywany pomiedzy każdym testem
//    realne użycie: do dodania obiektu calculator do każdego testu. w każdym teście jest inny obiekt
//    widać to na wydruku po hashCodzie
    @BeforeEach
    void beforeEach() {
        calculator = new Calculator();
        System.out.printf("beforeEach: %s%n" ,calculator);
    }

    //  @AfterAll - wykonuje kod po przejściu testów. musi byc static
//    @AfterAll
//    static void afterAll() {
//        System.out.println("afterAll");
//    }

    @Test
    @DisplayName("Testing method which tests adding")
    void add() {
        System.out.printf("add(): %s%n",calculator);
//    given
        int left = 5;
        int right = 7;
        Integer expected = 12;
//    when
        Integer result = Calculator.add(left, right);
//    then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void subtract() {
        System.out.printf("subtract(): %s%n",calculator);
//    given
        int left = 5;
        int right = 7;
        Integer expected = -2;
//    when
        Integer result = Calculator.subtract(left, right);
//    thenv
        Assertions.assertEquals(expected, result);
    }

    @Test
    void multiple() {
        System.out.printf("multiple(): %s%n",calculator);
//    given
        int left = 5;
        int right = 7;
        Integer expected = 35;
//    when
        Integer result = Calculator.multiple(left, right);
//    then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void divide() {
        System.out.printf("divide(): %s%n",calculator);
//    given
        int left = 5;
        int right = 7;
        Integer expected = 0;
//    when
        Integer result = Calculator.divide(left, right);
//    then
        Assertions.assertEquals(expected, result);
    }

}