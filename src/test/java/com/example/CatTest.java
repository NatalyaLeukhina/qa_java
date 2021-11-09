package com.example;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.List;



@RunWith(MockitoJUnitRunner.class)
public class CatTest {

   @Mock
   Feline feline;


    @Test
    public void getSoundReturnCat() {
        Cat cat = new Cat(feline);

        String expectedGetSound = "Мяу";
        String actualGetSound = cat.getSound();
        Assert.assertEquals(expectedGetSound, actualGetSound);



    }
    @Test//(expected = Exception.class)
    public void getFoodReturnPredatorsFoodList () throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedFoodList = List.of("Макадамия", "Кокос");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFoodList);

        List<String>actualPredatorsFoodList = cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
        Assert.assertEquals(expectedFoodList, actualPredatorsFoodList);

    }
}
