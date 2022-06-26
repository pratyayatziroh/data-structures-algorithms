package com.datastucturesalgorithms;

import com.datastucturesalgorithms.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertHead(123);
        list.insertHead(124);
        list.insertHead(125);
        list.display();
        list.deleteHead();
        list.display();
        list.insertTail(130);
        list.insertTail(131);
        list.insertTail(132);
        list.display();
        list.deleteLast();
        list.display();
    }
}
