package test;

import com.company.Country;
import com.company.Kettle;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KettleTest {

    @Test
    void size() {
        Kettle kettle = new Kettle("Magio", Country.CHINA, 1.9);
        String expected = "The kettle has medium size.";
        String actual = kettle.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    void continent() {
        Kettle kettle = new Kettle("Magio", Country.CHINA, 1.9);
        String expected = "The kettle made in Asia.";
        String actual = kettle.continent();
        Assert.assertEquals(expected, actual);
    }
}