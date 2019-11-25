package com.fangtianxia.demo.day02;

/**
 * @author wyz
 * 本类实现的功能：实现 栈 数据结构的运算
 */
public class Stack {

    /**
     *   栈的底层使用数组来存储数据【new int[0] 为初始化数组结构】
     */
    static int[] elements = new int[0];

    public static void main(String[] args) {
        int[] push = push(1);
        for (int i = 0;i<push.length;i++){
            System.out.println(push[i]);
        }
        int[] push2 = push(2);
        for (int i = 0;i<push2.length;i++){
            System.out.println(push2[i]);
        }
    }

    //压入元素
    public static int[] push(int element){
        //创建一个新的数组
        int[] arr = new int[elements.length+1];
        //把原有数组中的元素复制到新的数组中
        for (int i = 0;i<elements.length;i++){
            arr[i]=elements[i];
        }
        //把添加的元素放入到新数组中
        arr[elements.length]=element;

        //使用新的数组替换旧的数组
        elements=arr;
        return elements;
    }
}
