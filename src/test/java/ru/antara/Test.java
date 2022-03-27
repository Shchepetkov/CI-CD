package ru.antara;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/ru/antara/features",//путь до feature файлов
        glue = "ru.antara.stepDef",//название пакета с шагами
        tags = "@1 or @2 or @3" //Теги по которым будет запускаться сценарий
)
@SuppressWarnings("All")
public class Test {
    @org.junit.Test
    public static void run(String[] args) {

    }
}
