/*
    Author - Pratyay Ganguli
* */

package com.datastucturesalgorithms.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public LinkedList(){
        this.size = 0;
    }
    public void insertHead(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void insertTail(int value){
        Node node = new Node(value);
        if(head == null || tail == null){
            node.next = head;
            head = node;
            tail = node;
            return;

        }
        tail.next = node;
        tail = node;
    }

    public void display(){
        Node node = head;
        System.out.println("Displaying elements : ");
        while(node != null){
            System.out.println(node.value);
            node =  node.next;
        }
        System.out.println("Head :  " + head.value + " Tail : " + tail.value);
    }

    public void deleteHead(){
        System.out.println("Deleting " + head.value);
        head = head.next;
    }

    public void deleteLast(){
        Node node = head;
        if(node == null){
            System.out.println("Nothing to delete");
            return;
        }
        System.out.println("Deleting " + tail.value);
        while(node != null){
            if(node.next == tail){
                node.next = null;
                tail = node;
                break;
            }
            node = node.next;
        }
    }


    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
