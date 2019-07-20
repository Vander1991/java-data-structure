package szu.vander.sort.insertsort;

import szu.vander.sort.Sorter;

import java.util.List;

/**
 * @author : Vander
 * @date :   2019/7/16
 * @description : 插入排序算法
 */
public class InsertSorter implements Sorter {

    @Override
    public <T extends Comparable<? super T>> void sort(List<T> numbers) {
        insertSort(numbers);
    }

    private <T extends Comparable<? super T>> void insertSort(List<T> numbers) {
        int length = numbers.size();
        // 从第二个位置的数字开始遍历
        for (int i = 1; i < length; i++) {
            T temp;
            // 若第i个数比第i-1个数要小，需要将第i个数先存放起来
            if (numbers.get(i).compareTo(numbers.get(i - 1)) < 0) {
                // 将第i个数存放到变量temp中
                temp = numbers.get(i);
                int j = 0;
                // temp依次跟 i-1到0 位置的数进行比较
                for (j = i - 1; j >= 0 && temp.compareTo(numbers.get(j)) < 0; j--) {
                    // 当前比较的数往右边移动
                    numbers.set(j + 1, numbers.get(j));
                }
                // 将临时变量赋给不满足条件的位置
                // 不满足条件：1、已经移动完最左边的数，退出循环了
                //            2、temp不比当前比较的数小
                numbers.set(j+1, temp);
            }
        }
    }

}
