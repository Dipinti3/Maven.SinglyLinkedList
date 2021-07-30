package com.zipcodewilmington.singlylinkedlist;

import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T extends Comparable<T>> {
    //defining inner class
    class Node{
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head=null;
    public Node tail=null;

    public void addNode(T data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }


   public void removeNode(int index){
        Node current=head;
        Node last=head;
       for (int i = 0; i < size(); i++) {
           if(i!=index){
               last=current;
               current=current.next;
           }
           else{
               while(i<size()-1){
                   last.next=current.next;
               }
           }
       }
   }

    public boolean contains(T data){
        Node current=head;
        while(current!=null){
            if(current.data==data) {
                return true;
            }
            current=current.next;
        }
        return false;}

    public int find(Object data){
        Node current=head;
        for (int i = 0; i < size(); i++) {
            if(!(current.data==data))
                current=current.next;
        }
        return -1;
    }

    public int size(){
        int count=0;
        Node current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    public Object get(int index){
        Node current=head;
        for (int i = 0; i < size(); i++) {
            if(i==index)
                return current.data;
            else
                current=current.next;
        }
        return null;
    }

    public SinglyLinkedList copy(){
        SinglyLinkedList<T> newList=new SinglyLinkedList<T>();
        Node current=head;
        while(current!=null){
            newList.addNode(current.data);
            current=current.next;
        }
        return newList;
    }

    public void sort(){
        Node current=head;
        for (int i = 0; i < size(); i++) {
             current=head;
             while (current.next!=null){
                 if(current.data.compareTo(current.next.data)>0){
                     T temp=current.next.data;
                     current.next.data=current.data;
                     current.data=temp;
                 }
                 current=current.next;
             }
        }
    }


}
