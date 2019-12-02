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
     */
    public void removeNextNode() {
        //取出下下一个节点
        Node newNext = this.next.next;
        //将下下一个节点设置为当前节点的下一个节点【这样就把下一个节点给删除了】
        this.next = newNext;
    }

    /**
     * 显示所有节点信息
     */
    public void show(){
        //当前节点
        Node currentNode =this;
        //下一个节点
        Node nextNode;
        //循环
        while(true){
            System.out.print(currentNode.getData());
            //取出下一个节点
            nextNode = currentNode.next;
            //判断是否为最后一个节点
            if (nextNode==null){
                //如果是最后一个节点
                break;
            }
        }
        System.out.println(nextNode);
    }

}

