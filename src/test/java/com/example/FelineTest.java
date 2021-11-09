package com.example;


import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {

    @Test
    public void getFamilyReturnFeline () {
        Feline feline = new Feline();
        final String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);

    }

    @Test
    public void getKittensReturnCount () {
        Feline feline = new Feline();
        final int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);

    }

    @Test//(expected = Exception.class)
    public void testWithException () throws Exception {
        Feline feline = new Feline();

        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualPredatorsFoodList = feline.eatMeat();
        Assert.assertEquals(expectedFoodList, actualPredatorsFoodList);
    }
        }

