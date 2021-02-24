package com.data.structure;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author: Miro
 * @date: 2021/2/19 22:13
 * @description: 自定义栈容器
 */
public class MyStack<E> {

    private Object[] arr; //存放元素的物理结构
    private int stackLength = 4; //数组默认长度
    private int size; //记录栈容器的元素个数
    private int index = -1; //操作数组下标位置的指针

    /**
     * 判断容器是不是空
     */
    public boolean empty(){
        return this.size == 0;
    }

    /**
     * 获取栈顶元素
     * @return
     */
    public E pop(){
        //如果没有元素报异常
        if(index == -1){
            throw new EmptyStackException();
        }
        //记录元素个数
        this.size--;
        //返回元素
        return (E) this.arr[index--];
    }

    /**
     * 向栈容器中添加元素
     * @param item
     * @return
     */
    public E push(E item){
        //初始化数组
        this.capacity();
        //向数组中添加元素
        this.arr[++index] = item;
        //记录元素个数
        this.size++;
        return item;
    }

    /**
     * 完成数组的初始化和数组1.5倍扩容
     *
     */

    private void capacity(){
        //初始化数组
        if(this.arr == null){
            this.arr = new Object[this.stackLength];
        }
        //1.5倍扩容
        if(this.size - (this.stackLength-1) >=0){
            this.stackLength = this.stackLength + (this.stackLength >> 1);
            this.arr = Arrays.copyOf(this.arr,this.stackLength);
        }

    }

    public static void main(String[] args) {
        MyStack<Object> myStack = new MyStack<>();
        myStack.push("a");
        myStack.push("c");
        myStack.push("d");
        myStack.push("d");
        myStack.push("e");
        myStack.push("f");
        System.out.println(myStack.size);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());


    }
}
