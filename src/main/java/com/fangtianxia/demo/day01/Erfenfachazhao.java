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
        //二分 递归查询【这个等号不要忘记了】
        while (start <= ent) {
            //中间位置的索引[进行取模运算]
            int middle = (start + ent) / 2;
            //递归查询定位到指定位置
            if (value == arr[middle]) {
                return middle;
            }
            if (value < arr[middle]) {
                ent = middle - 1;
            }
            if (value > arr[middle]) {
                start = middle + 1;
            }
        }
        //指定异常结果码值-1，如果返回-1，说明是没有找到指定的值
        return -1;
    }
}
