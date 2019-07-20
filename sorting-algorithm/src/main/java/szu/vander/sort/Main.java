package szu.vander.sort;

import lombok.AllArgsConstructor;
import lombok.ToString;
import szu.vander.sort.bubblesort.BubbleSorter;
import szu.vander.sort.insertsort.InsertSorter;

import java.util.Arrays;
import java.util.List;

/**
 * @author : Vander
 * @date :   2019/7/16
 * @description :
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 2, 4, 3, 1, 4, 7, 1, 2, 3, 58, 96, 0, 0, 100);

        List<Student> students = Arrays.asList(new Student(3), new Student(2),
                new Student(4), new Student(3), new Student(1), new Student(4), new Student(7));
//        QuickSorter quickSorter = new QuickSorter();
//        BubbleSorter bubbleSorter = new BubbleSorter();
        InsertSorter insertSorter = new InsertSorter();
        // 比较数字
        System.out.println("--比较数字--");
        insertSorter.sort(nums);
        System.out.println(nums);

        // 根据学号比较学生类
        System.out.println("--根据学号比较学生类--");
        insertSorter.sort(students);
        System.out.println(students);
    }

    @ToString
    @AllArgsConstructor
    static class Student implements Comparable<Student> {

        /**
         * 学号
         */
        private int stuNo;

        @Override
        public int compareTo(Student student) {
            if (this.stuNo > student.stuNo) {
                return 1;
            } else if (this.stuNo < student.stuNo) {
                return -1;
            } else {
                return 0;
            }
        }

    }

}
