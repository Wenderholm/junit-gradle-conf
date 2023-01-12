package pl.zajavka;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calculator {

    public static int add(int left, int right){
        log.debug("some debug message");
        log.info("some info message");
        log.warn("some warn message");
        log.error("some error message");
        return left + right;
    }
    public static int subtract(int left, int right){
        return left - right;
    }

    public static int multiple(int left, int right){
        return left * right;
    }

    public static int divide(int left, int right){
        return left / right;
    }
}
