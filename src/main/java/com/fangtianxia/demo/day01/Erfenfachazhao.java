package com.fangtianxia.demo.day01;

/**
 * @author wyz
 * 本类实现的功能：二分法查找
 * 二分法查找适用于数据量较大时，但是数据需要先排好顺序
 */
public class Erfenfachazhao {
    public static void main(String[] args) {
        //二分法查找适用于数据量较大时，但是数据需要先排好顺序
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //返回的位置索引
        int index = erfenfachazhao(arr, 7);
        System.out.println("返回的位置索引" + index);

    }

    public static int erfenfachazhao(int[] arr, int value) {
        //数组的起始和结束索引
        int start = 0;
        int ent = arr.length - 1;
        //二分 递归查询
        while (true) {
            int middle = (start + ent) / 2;
           //判断中间元素是不是要查询的元素
            if (value==arr[middle]){
                return middle;
            }
            //如果不等，判断目标元素和中间元素的大小
            if (value>arr[middle]){
                start=middle;
            }
            if (value<arr[middle]){
                ent=middle;
            }
        }
    }
}
