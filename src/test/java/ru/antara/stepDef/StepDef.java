package ru.antara.stepDef;

import io.cucumber.java.ru.А;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Пусть;

import java.util.HashMap;

public class StepDef {
    private static final HashMap<String, Integer> storage = new HashMap<>();

    /**
     * {@code {int} - cucumber expression}
     *
     * @param num колчиство моих огурцов
     */
    @Пусть("у меня есть {int} огурца") // {float}, {word}, {string} 'банановое мороженое', {} = (/.*/)
    public static void getMyCukes(int num) {
        System.out.println("Мои огурцы " + num + "\n");
        storage.put("Мои огурцы", num);
    }

    /**
     * {@code (\d+) - Regexp}
     *
     * @param num колчиство твоих огурцов
     */
    @А("^у тебя (\\d+) огурца$")
    public static void getYourCukes(int num) {
        System.out.println("Твои огурцы " + num + "\n");
        storage.put("Твои огурцы", num);
    }

    /**
     * Сумма твоих и моих огурцов
     */
    @И("сосчитать сколько всего у нас огурцов")
    public static void countSum() {
        System.out.println("Сумма огурцов: " + (storage.get("Мои огурцы") + storage.get("Твои огурцы")) + "\n");
    }

    /**
     * Разница твоих и моих огурцов
     */
    @И("сосчитать нашу разницу в огурцах")
    public static void countSub() {
        System.out.println("Разница огурцов: " + Math.abs(storage.get("Мои огурцы") - storage.get("Твои огурцы")) + "\n");
    }
}
