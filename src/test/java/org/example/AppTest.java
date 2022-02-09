package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
      @Test
    public void shouldAnswerWithTrue()
    {
        WebDriverManager.chromedriver().setup();
    }
}

