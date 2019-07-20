package szu.vander.sort.quicksort;

import szu.vander.sort.Sorter;

import java.util.List;

/**
 * @author : Vander
 * @date :   2019/7/16
 * @description : 快速排序算法
 */
public class QuickSorter implements Sorter {

    @Override
    public <T extends Comparable<? super T>> void sort(List<T> numbers) {
        quickSort(numbers, 0, numbers.size() - 1);
    }

    private <T extends Comparable<? super T>> void quickSort(List<T> numbers, int head, int tail) {
        if (tail <= head) {
            return;
        }
        int start = head;
        int end = tail;
        T standard = numbers.get(start);
        while (end > start) {
            // 从最右边开始进行比较
            while (end > start && numbers.get(end).compareTo(standard) >= 0) {
                end--;
            }
            // 若右边的数比基准数小，则替换掉start的位置的数
            if(end > start) {
                numbers.set(start, numbers.get(end));
            }
            // 比较左边的数是否比基准数小
            while (end > start && numbers.get(start).compareTo(standard) < 0) {
                start++;
            }
            // 若左边的数比基准数大，则替换到end的位置的数
            if(end > start) {
                numbers.set(end, numbers.get(start));
            }

            // 将基准数给到start跟end相遇的位置
            if (end == start) {
                numbers.set(start, standard);
            }
        }
        quickSort(numbers, head, end);
        quickSort(numbers, end + 1, tail);
    }

}
