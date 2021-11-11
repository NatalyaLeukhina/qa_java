package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class LionParametrizedTest {

    private final String sexInput;
    private final boolean expectedSexReturn;

    public LionParametrizedTest(String sexInput, boolean expectedSexReturn) {
        this.sexInput = sexInput;
        this.expectedSexReturn = expectedSexReturn;

    }

    @Parameterized.Parameters
    public static Object[][] getSexParameters() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Конь в пальто", false}
        };
    }
    @Test
    public void doesHaveManeReturnTrue () {
        Feline feline = Mockito.mock(Feline.class);
        try {
            Lion lion = new Lion(feline, sexInput);
            boolean actualSexReturn = lion.doesHaveMane();
            Assert.assertEquals(expectedSexReturn, actualSexReturn);
        } catch (Exception exception) {
            Assert.assertTrue(!sexInput.equals("Самец") && !sexInput.equals("Самка"));
        }

    }
}

