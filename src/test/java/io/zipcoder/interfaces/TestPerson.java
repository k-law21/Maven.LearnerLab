package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;
public class TestPerson {


    @Test

    public void  testConstructor(){
        Person person = new Person(10L,"Kwame");
        String expected = person.getName();
        String  actual = "Kwame";

        Assert.assertEquals(expected,actual);
    }

    @Test

    public void   testSetName () {
        Person person = new Person(10L,"NewName");
        String expectedName = "New";
        person.setName(expectedName);

        String actualName = person.getName();

        Assert.assertEquals(expectedName, actualName);

    }

}