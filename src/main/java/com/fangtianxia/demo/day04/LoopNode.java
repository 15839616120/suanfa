package com.fangtianxia.demo.day04;


import lombok.Data;

/**
 * 循环链表
 * @author User
 */
@Data
public class LoopNode {

    /**
     * 节点内容
     */
    private int data;
    /**
     * 下一个节点
     */
    private LoopNode next = this;

    /**
     * 插入一个节点作为当前节点的下一个节点
     */
    public void afterAppend(LoopNode node) {
        //取出当前节点的下一个节点，作为新链表的下下一个节点
        LoopNode NextNext = next;
        //把传进新节点作为当前节点的下一个节点
        this.next = node;
        //把下下一个节点设置成新节点的下一个节点
        node.next = NextNext;
    }
}
