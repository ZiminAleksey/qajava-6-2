package ru.netology.bonusService;

public class BonusService {
    public long calculate(boolean registered, int limit, long amount) {
        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }

}
