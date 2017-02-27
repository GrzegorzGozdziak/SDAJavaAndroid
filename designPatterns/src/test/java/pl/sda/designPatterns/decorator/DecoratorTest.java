package pl.sda.designPatterns.decorator;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.sort.impl.BubbleSort;

public class DecoratorTest {
    @Test
    public void DecoratorTest() {
        //given
        int[] arrayToSort = new int[] {55,33,77,1,-33,0,-222,5,-111};
        SortDecoratorWithReverse sortDecoratorWithReverse = new SortDecoratorWithReverse(new BubbleSort());

        //when
        int[] result = sortDecoratorWithReverse.sort(arrayToSort);

        //then
        Assert.assertEquals(77, result[0]);
        Assert.assertEquals(-222, result[result.length - 1]);
    }
}
