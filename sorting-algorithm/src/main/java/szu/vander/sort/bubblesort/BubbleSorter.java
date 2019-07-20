package szu.vander.sort.bubblesort;

import szu.vander.sort.Sorter;

import java.util.List;

/**
 * @author : Vander
 * @date :   2019/7/16
 * @description : 冒泡排序算法
 */
public class BubbleSorter implements Sorter {

    @Override
    public <T extends Comparable<? super T>> void sort(List<T> numbers) {
        bubbleSort(numbers);
    }

    private <T extends Comparable<? super T>> void bubbleSort(List<T> numbers) {
        int length = numbers.size();
        // 共需要比较length-1轮
        for(int i=0; i<length-1; i++) {
            for(int j=0; j<length-i-1; j++) {
                // 实现相邻两数间的比较
                if(numbers.get(j).compareTo(numbers.get(j+1)) >= 0) {
                    T temp = numbers.get(j+1);
                    numbers.set(j+1, numbers.get(j));
                    numbers.set(j, temp);
                }
            }

        }
    }

}
