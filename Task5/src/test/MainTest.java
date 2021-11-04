package test;

import com.company.Breed;
import com.company.Dog;
import com.company.HTTPError;
import com.company.Main;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void belong1() {
        boolean actual = Main.belong(0.5F);
        Assert.assertTrue(actual);
    }

    @Test
    public void belong2() {
        boolean actual = Main.belong(-5);
        Assert.assertTrue(actual);
    }

    @Test
    public void belong3() {
        boolean actual = Main.belong(5);
        Assert.assertTrue(actual);
    }

    @Test
    public void belong4() {
        boolean actual = Main.belong(6);
        Assert.assertFalse(actual);
    }

    @Test
    void max() {
        int integers[] = new int[]{5, 3, -7};
        Assert.assertEquals(5, Main.max(integers));
    }

    @Test
    void min() {
        int integers[] = new int[]{5, 3, -7};
        Assert.assertEquals(-7, Main.min(integers));
    }

    @Test
    void httpError() {
        HTTPError expected = HTTPError.BADREQUEST;
        HTTPError actual = HTTPError.valueOf(400);
        Assert.assertEquals(expected, actual);
    }

    @Test
    void sameNames() {
        Dog dog1 = new Dog("Naida", Breed.RETRIEVER, 7);
        Dog dog2 = new Dog("Lisa", Breed.LABRADOR, 5);
        Dog dog3 = new Dog("Reks", Breed.TERRIER, 3);
        Dog dogs[] = new Dog[]{dog2, dog1, dog3};
        boolean actual = Main.sameNames(dogs);
        Assert.assertEquals(false, actual);
    }

    @Test
    void theOldest() {
        Dog dog1 = new Dog("Naida", Breed.RETRIEVER, 7);
        Dog dog2 = new Dog("Lisa", Breed.LABRADOR, 5);
        Dog dog3 = new Dog("Reks", Breed.TERRIER, 3);
        Dog dogs[] = new Dog[]{dog1, dog2, dog3};
        int expected = 0;
        int actual = Main.theOldest(dogs);
        Assert.assertEquals(expected, actual);
    }
}