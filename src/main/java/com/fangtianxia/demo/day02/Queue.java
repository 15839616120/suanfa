package com.fangtianxia.demo.day02;

/**
 * @author wyz
 * 队列数据结构
 * 队列的特点：先进先出
 */
public class Queue {
    /**
     * 队列的底层使用数组来存储数据【new int[0] 为初始化数组结构】
     */
    static int[] elements = new int[0];

    public static void main(String[] args) {
        // 入队
        int[] add = add(1);
        for (int i = 0; i < add.length; i++) {
            System.out.println(elements[i]);
        }

        // 出队
        int delete = delete();
        System.out.println(delete);

        // 打印执行入队和出队之后的元素
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }
    /**
     * 入队
     * 返回值为新数组所有的元素
     */
    public static int[] add(int element) {
        //创建一个新的数组
        int[] arr = new int[elements.length + 1];
        //把原有数组中的元素复制到新的数组中
        for (int i = 0; i < elements.length; i++) {
            arr[i] = elements[i];
        }
        //将新元素放到新数组中
        arr[elements.length] = element;
        //使用新的数组替换旧的数组
        elements = arr;
        return elements;
    }

    /**
     * 出队
     * 返回值为出队的元素
     */

    public static int delete() {
        //取出索引为0的元素
        int element = elements[0];
        //创建一个新的数组
        int[] arr = new int[elements.length-1];
        //把原有数组中的元素复制到新的数组中
        for (int i = 0; i < elements.length-1; i++) {
            arr[i] = elements[i];
        }
        //使用新的数组替换旧的数组
        elements = arr;
        return element;
    }

}
