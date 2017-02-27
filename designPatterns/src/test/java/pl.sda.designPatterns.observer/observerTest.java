package pl.sda.designPatterns.observer;

import org.junit.Test;
import pl.sda.designPatterns.facade.SortFacade;

import java.util.Arrays;

/**
 * Created by Grzegorz on 2017-02-27.
 */
public class observerTest {

    @Test
    public void observeTest(){
        Observer observer = new Observer();
        SortFacade sortFacade = new SortFacade(observer);

        int[] input = new int[]{4823, 432, 6, 1, 867, 956, 44, -1};

        System.out.println(Arrays.toString(input));
        int[] result = sortFacade.sortUsingCountSort(input);
        System.out.println(Arrays.toString(result));
    }


}
