package CollectionTest;

import NewCollection.OddNumberExterminator;
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
        OddNumberExterminator exterminator = new OddNumberExterminator ();
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        ArrayList<Integer> result = exterminator.exterminate(emptyList);
        Assert.assertTrue(result.size()==0);
    }
    @Test
    public void testOddNumbersExterminatorNormalList () {
        OddNumberExterminator exterminator = new OddNumberExterminator ();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(9);
        list.add(524);
        list.add(5);
        list.add(4);

        ArrayList<Integer> result = exterminator.exterminate(list);
        Assert.assertTrue(result.size()!=0);
        for (Integer element : result) {
            Assert.assertTrue(element %2==0);

        }
    }
    @After
    public void end () {
        System.out.println("ending test");
    }
}
