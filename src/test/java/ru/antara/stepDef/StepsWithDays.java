package ru.antara.stepDef;

import io.cucumber.java.ParameterType;
import io.cucumber.java.ru.Пусть;

public class StepsWithDays {
    /**
     * Параметризированный метод enum для передачи дней недели в метод {@link #printDay}
     * @param day Строка для enum
     * @see ru.antara.features Days
     * @return день недели из enum
     */
    @ParameterType(".*")
    public Days days(String day) {
        return Days.valueOf(day);
    }

    /**
     * Способ передать любой объект
     * @see ru.antara.features AllDaysAreFavourite
     * @param day enum день недели
     */
    @Пусть("{days} мой любимый день")
    public void printDay(Days day) {
        System.out.println("Мой любимый день " + day.value + "\n");
    }


}
