package ru.netology.bonusService;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void test(boolean registered, int limit, long amount, int expected) {
        BonusService method = new BonusService();

        long actual = method.calculate(registered, limit, amount);
        Assertions.assertEquals(expected, actual);
    }

}
