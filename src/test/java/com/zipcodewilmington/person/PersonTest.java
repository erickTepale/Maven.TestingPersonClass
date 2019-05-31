package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getHeight() {
        // Given String name, int age, float height, String hairColor, String eyeColor, String favColor, int phoneNumber
        Person person = new Person("", 1, (float) 1.2, "hair", "","",8880000);
        Float expected = (float) 1.2;

        // When
        ///person.getPhoneNumber();

        // Then
        Float actual = person.getHeight();
        Assert.assertEquals((float) expected, (float) person.getHeight(), .1);
    }

    @Test
    public void setHeight() {
        // Given String name, int age, float height, String hairColor, String eyeColor, String favColor, int phoneNumber
        Person person = new Person("", 1, (float) 1.2, "hair", "","",1110000);
        float expected = (float) 6.2;

        // When
        person.setHeight(( float) expected);

        // Then
        float actual = person.getHeight();
        Assert.assertEquals((float) expected, (float) actual, .1);
    }

    @Test
    public void getHairColor() {
        // Given String name, int age, float height, String hairColor, String eyeColor, String favColor, int phoneNumber
        Person person = new Person("", 1, (float) 1.2, "hair", "","",8880000);
        String expected = "hair";

        // When
        ///person.getPhoneNumber();

        // Then
        String actual = person.getHairColor();
        Assert.assertEquals(expected, person.getHairColor());
    }

    @Test
    public void setHairColor() {
        // Given String name, int age, float height, String hairColor, String eyeColor, String favColor, int phoneNumber
        Person person = new Person("", 1, (float) 1.2, "hair", "","",1110000);
        String expected = "Col";

        // When
        person.setHairColor(expected);

        // Then
        String actual = person.getHairColor();
        Assert.assertEquals( expected, actual);
    }

    @Test
    public void getEyeColor() {
        // Given String name, int age, float height, String hairColor, String eyeColor, String favColor, int phoneNumber
        Person person = new Person("", 1, (float) 1.2, "hair", "","",8880000);
        String expected = "";

        // When
        ///person.getPhoneNumber();

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals( expected, person.getEyeColor());
    }

    @Test
    public void setEyeColor() {
        // Given String name, int age, float height, String hairColor, String eyeColor, String favColor, int phoneNumber
        Person person = new Person("", 1, (float) 1.2, "hair", "","",1110000);
        String expected = "Col";

        // When
        person.setEyeColor(expected);

        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals( expected, actual);
    }

    @Test
    public void getFavColor() {
        // Given String name, int age, float height, String hairColor, String eyeColor, String favColor, int phoneNumber
        Person person = new Person("", 1, (float) 1.2, "hair", "","",8880000);
        String expected = "";

        // When
        ///person.getPhoneNumber();

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, person.getFavColor());
    }

    @Test
    public void setFavColor() {
        // Given String name, int age, float height, String hairColor, String eyeColor, String favColor, int phoneNumber
        Person person = new Person("", 1, (float) 1.2, "hair", "","",1110000);
        String expected = "fav";

        // When
        person.setFavColor(expected);

        // Then
        String actual = person.getFavColor();
        Assert.assertEquals( expected, actual);
    }

    @Test
    public void getPhoneNumber() {
        // Given String name, int age, float height, String hairColor, String eyeColor, String favColor, int phoneNumber
        Person person = new Person("", 1, (float) 1.2, "hair", "","",8880000);
        int expected = 8880000;

        // When
        ///person.getPhoneNumber();

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals((int) expected, (int) person.getPhoneNumber());
    }

    @Test
    public void setPhoneNumber() {
        // Given String name, int age, float height, String hairColor, String eyeColor, String favColor, int phoneNumber
        Person person = new Person("", 1, (float) 1.2, "hair", "","",1110000);
        int expected = 8880000;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals((int) expected, (int) actual);
    }
}