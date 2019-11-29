package com.fangtianxia.demo.day03;

/**
 * @author wyz
 * 节点类
 * 单链表
 */
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
}

