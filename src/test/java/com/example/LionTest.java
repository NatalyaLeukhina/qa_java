package com.example;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;


    @Test
    public void getKittensReturnFelineGetKittens () throws Exception {
        Lion lion = new Lion(feline, "Самец");
        int expectedKittensCount = 3;
        Mockito.when(feline.getKittens()).thenReturn(expectedKittensCount);
        int actualKittensCount = lion.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }
    @Test
    public void getFoodReturnFelineGetFood () throws Exception {
        Lion lion = new Lion(feline, "Самец");
        List<String> expectedLionFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedLionFood);
        List<String>actualLionFood= lion.getFood();
        Assert.assertEquals(expectedLionFood, actualLionFood);
    }
}
