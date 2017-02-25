package pl.sda.facade;

import pl.sda.sort.Sort;
import pl.sda.sort.impl.InsertSort;

public class SortFacade {

    public int[] sortThroughFacade(int[] arrayToSort) {
        Sort sort = new InsertSort();
        return sort.sort(arrayToSort);
    }
}
