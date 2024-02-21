package org.example;
/*
Methods available:
- Insert at beginning
- Delete at beginning
- ValueAt
- Insert at end
- Delete at end
 */

import java.util.List;

public class LinkedList{
    private Node head;
    public LinkedList(int number){
        this.head = new Node(number);
    }
    public LinkedList(){
        this.head = null;
    }
    private class Node{
        private int val;
        private Node next;
//        Constructors (do not use void, just the scope + name)
        public Node(int number, Node next){
            this.val = number;
            this.next = next;
        }
        public Node(int number){
            this.val = number;
            this.next = null;
        }

        public void setVal(int number){
            this.val = number;
        }
    }

    public void insertBeg(int number){
        Node newNode = new Node(number);
        newNode.next=this.head;
        head = newNode;
    }

    public void deleteBeg(){
        if (head==null){
            System.out.println("no good");
        }
        head = head.next;
    }

    public int valueAt(int index){
        int i = 0;
        Node node = head;
        while (true){
            if (node == null){
            }
            if (i==index){
                break;
            }
            node = node.next;
            i++;
        }
        return node.val;
    }



    public void insertEnd(int number){
        Node newNode = new Node(number);
        newNode.val = number;
        newNode.next = null;
        if (head == null){
            head = newNode;
        }else{
            Node cursor = head;
            while (cursor.next !=null){
                cursor = cursor.next;
            }
            cursor.next = newNode;
        }
    }

    public void deleteEnd(){
        if (head == null){
        }else if(head.next==null){
        }
//        Find second last
        Node cursor = head;
        while (cursor.next.next !=null){
            cursor = cursor.next;
        }
        cursor.next = null;
    }
}

