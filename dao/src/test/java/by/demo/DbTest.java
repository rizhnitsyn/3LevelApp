package by.demo;

import org.junit.Assert;
import org.junit.Test;

public class DbTest {


    @Test
    public void test1() {
        Assert.assertEquals( "error","info from database", MyDatabase.getInfoFromDbLayer());
    }
}
