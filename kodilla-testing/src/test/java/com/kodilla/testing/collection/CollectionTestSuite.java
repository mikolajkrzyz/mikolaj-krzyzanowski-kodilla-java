package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void start () {
        System.out.println("starting test");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList () {
        //Given
        OddNumberExterminator exterminator = new OddNumberExterminator ();
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        ArrayList<Integer> result = exterminator.exterminate(emptyList);
        //Then
        Assert.assertEquals(0, result.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList () {
        //Given
        OddNumberExterminator exterminator = new OddNumberExterminator ();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(524);
        list.add(5);
        list.add(4);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(524);
        expected.add(4);
        //When
        ArrayList<Integer> result = exterminator.exterminate(list);
        //Then
        Assert.assertEquals(expected,result);
    }
    @After
    public void end () {
        System.out.println("ending test");
    }
}
