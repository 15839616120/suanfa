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
        node1.append(node2).append(node3).append(new Node(4));
        //取出下一个节点
//        System.out.println(node1.getData());
//        System.out.println(node1.getNext().getData());
//        System.out.println(node3.isLast());
//        System.out.println(node2.isLast());

        //显示所有节点
        node1.show();
        //删除一个节点
//        node1.removeNextNode();
        //显示所有节点
//        node1.show();
        //插入一个新节点
        node1.afterAppend(new Node(7));
        //显示所有节点
        node1.show();
    }

}
