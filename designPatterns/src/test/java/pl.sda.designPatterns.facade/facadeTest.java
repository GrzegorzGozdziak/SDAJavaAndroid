package pl.sda.designPatterns.facade;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Grzegorz on 2017-02-27.
 */
public class facadeTest {

    @Test
    public void facadeTest(){
        int[] tab = new int[]{553, 55, 1, 67, 1, 77, 0};
        System.out.println(Arrays.toString(tab));
        SortFacade sort = new SortFacade();
        int[] result = sort.sortThroughFacade(tab);
        System.out.println(Arrays.toString(result));
    }
}
