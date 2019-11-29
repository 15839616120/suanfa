package com.fangtianxia.demo.day03;

import lombok.Data;

/**
 * @author wyz
 * 节点类
 * 单链表
 */
@Data
public class Node {

    //节点内容
    private int data;
    //下一个节点
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    /**
     * 为节点追加节点
     */
    public void append(Node node) {
        this.next = node;
    }

    /**
     * 获取下一个节点
     */
    public Node next() {
        return this.next;
    }

    /**
     * 判断当前节点是否是最后一个节点
     */
    public boolean isLast() {
        return next == null;
    }
}

