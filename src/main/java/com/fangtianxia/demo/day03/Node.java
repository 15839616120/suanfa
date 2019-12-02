package com.fangtianxia.demo.day03;

import lombok.Data;

/**
 * @author wyz
 * 节点类
 * 单链表
 */
@Data
public class Node {

    /**
     * 节点内容
     */
    private int data;
    /**
     * 下一个节点
     */
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    /**
     * 为节点追加节点
     */
    public Node append(Node node) {
        //循环往后找
        while (true) {
            //取出下一个节点
            Node nextNode = this.next;
            //如果下一个节点为null，当前节点已经是最后一个节点,将下一个节点（传进来的值）赋值给当前节点的next属性
            if (nextNode == null) {
                this.next = node;
                break;
            }
        }
        return next;
    }

    /**
     * 判断当前节点是否是最后一个节点
     */
    public boolean isLast() {
        return next == null;
    }

    /**
     * 删除下一个节点
     * 逻辑思路：将当前节点的下下个节点 赋值 给当前节点的下一个节点属性上面，就实现了将下一个节点删除的逻辑
     */
    public void removeNextNode() {
        //取出下下一个节点
        Node newNext = this.next.next;
        //将下下一个节点设置为当前节点的下一个节点【这样就把下一个节点给删除了】
        this.next = newNext;
    }

    /**
     * 插入一个节点作为当前节点的下一个节点
     */
    public void afterAppend(Node node) {
        //取出当前节点的下一个节点，作为新链表的下下一个节点
        Node NextNext = this.next;
        //把传进新节点作为当前节点的下一个节点
        this.next = node;
        //把下下一个节点设置成新节点的下一个节点
        node.next = NextNext;
    }

    /**
     * 显示所有节点信息
     */
    public void show() {
        //当前节点
        Node currentNode = this;
        //循环
        while (true) {
            System.out.print(currentNode.getData());
            //取出下一个节点,然后赋值给当前节点，继续循环
            currentNode = currentNode.next;
            //判断是否为最后一个节点
            if (currentNode == null) {
                //如果是最后一个节点
                break;
            }
        }
    }

}

