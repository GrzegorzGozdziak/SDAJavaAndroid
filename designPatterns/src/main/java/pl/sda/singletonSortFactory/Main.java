package pl.sda.singletonSortFactory;

import pl.sda.sort.Sort;
import pl.sda.sort.factory.SortTypeEnum;

import java.util.Arrays;

/**
 * Created by RENT on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {
        SingletonSortFactory factory = SingletonSortFactory.getInstance();

        Sort sort = factory.produce(SortTypeEnum.BUBBLE);

        int[] sortedArray = sort.sort(new int[]{432, 234234, 43, 2323, 4321, 234, 233});
        System.out.println(Arrays.toString(sortedArray));
    }
}
