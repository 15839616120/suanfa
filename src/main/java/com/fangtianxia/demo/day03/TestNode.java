package com.fangtianxia.demo.day03;

public class TestNode {

    public static void main(String[] args) {
        //创建节点
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        //追加节点
        node1.append(node2);
        node2.append(node3);
        node3.append(node4);

        //取出下一个节点
        System.out.println(node1.getData());
        System.out.println(node1.next().getData());
        System.out.println(node2.next().getData());
        System.out.println(node3.next().getData());
    }

}
