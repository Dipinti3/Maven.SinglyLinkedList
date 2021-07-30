package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Target;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testAddNode(){
        //given
        SinglyLinkedList<Integer> list=new SinglyLinkedList<Integer>();
        int expectedValue=4;
        //when
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        int actualValue=list.size();
        //then
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testSize(){
        //given
        SinglyLinkedList<Integer> list=new SinglyLinkedList<Integer>();
        int expectedValue=4;
        //when
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        int actualValue=list.size();
        //then
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testFind(){
        //given
        SinglyLinkedList<Integer> list=new SinglyLinkedList<Integer>();
        int expectedValue=3;
        //when
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        int actualValue=list.findIndex(4);
        //then
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testContains(){
        //given
        SinglyLinkedList<Integer> list=new SinglyLinkedList<Integer>();
        //when
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        boolean actualValue=list.contains(4);
        //then
        Assert.assertTrue(actualValue);
    }

    @Test
    public void testRemove(){
        //given
        SinglyLinkedList<Integer> list=new SinglyLinkedList<Integer>();
        int expectedValue=3;
        //when
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.removeNode(0);
        int actualValue=list.size();
        //then
        Assert.assertFalse(list.contains(1));
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testGet(){
        //given
        SinglyLinkedList<Integer> list=new SinglyLinkedList<Integer>();
        int expectedValue=3;
        //when
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        int actualValue=list.get(2);
        //then
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testCopy(){
        //given
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        Integer expectedValue = 9;
        //when
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(9);
        SinglyLinkedList<Integer> newList = list.copy();
        Integer actualValue = newList.get(3);
        //then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testSort(){
        //given
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        Integer expectedValue = 1;
        //when
        list.addNode(100);
        list.addNode(1);
        list.addNode(1000);
        list.addNode(54);
        list.sort();
        Integer actualValue = list.get(0);
        //then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testReverse(){
        //given
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        String expectedValue="Cereal";
        //when
        list.addNode("Milk");
        list.addNode("Eggs");
        list.addNode("Bread");
        list.addNode("Cereal");
        list.reverse();
        String actualValue = list.get(0);
        //then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testSlice() {
        //given
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        Integer expectedValue = 2;
        //when
        list.addNode("Milk");
        list.addNode("Eggs");
        list.addNode("Bread");
        list.addNode("Cereal");
        SinglyLinkedList<String> slicedList = list.slice(0, 2);
        Integer actualValue = slicedList.size();
        //then
        Assert.assertEquals(expectedValue, actualValue);
    }
}
