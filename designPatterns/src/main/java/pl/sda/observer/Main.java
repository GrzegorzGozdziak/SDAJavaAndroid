package pl.sda.observer;

import pl.sda.facade.SortFacade;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Observer observer = new Observer();
        SortFacade sortFacade = new SortFacade(observer);

        int[] input = new int[] {4823, 432, 6, 1, 867, 956, 44, -1};

        int[] result = sortFacade.sortUsingCountSort(input);
        System.out.println(Arrays.toString(result));
    }
}
