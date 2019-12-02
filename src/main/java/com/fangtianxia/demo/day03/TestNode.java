package com.fangtianxia.demo.day03;

/**
 * @author wyz
 * 单向链表的测试类
 */
public class TestNode {

    public static void main(String[] args) {
        //创建节点
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        //追加节点
        node1.append(node2);
        node2.append(node3);

        //取出下一个节点
        System.out.println(node1.getData());
        System.out.println(node1.getNext().getData());
        System.out.println(node3.isLast());
        System.out.println(node2.isLast());

    }

}
