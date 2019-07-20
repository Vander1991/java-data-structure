package szu.vander.sort;

import java.util.List;

/**
 * @author : Vander
 * @date :   2019/7/16
 * @description :
 */
public interface Sorter {

    /**
     * 对传入的List进行排序
     * @param list
     * @param <T>
     */
    <T extends Comparable<? super T>> void sort(List<T> list);

}
