package com.fangtianxia.demo.day01;

/**
 * @author wyz
 * 查询算法 ：线性查找 和 二分法查找
 * 本类实现的功能：实现线性查找
 */
public class Xianxingchazhao {

    public static void main(String[] args) {
        //目标数组
        int[] arrs = {2,3,4,5,6,7,8,9,1,0};
        //目标元素
        int target = 8;
        //目标元素坐在的下标[0为初始化值]
        int index = -1;
        //寻找下标
        for (int i = 0; i<arrs.length;i++) {
            if (target==arrs[i]){
                index=i;
                break;
            }
        }
        //打印目标元素的下标
        System.out.println("目标元素的下标index="+index);
    }

}
