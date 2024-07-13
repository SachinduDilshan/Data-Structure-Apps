/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author SA22527974
 */
public class Stack {
    int maxSize;  
    Car stackArray[]; // to hold Car objects  int top; 
    int top; 

    public Stack(int maxSize) {
        top=-1;
        this.maxSize = maxSize;
        this.stackArray=new Car[maxSize];
    }

    public void push(Car a) {
        if(isFull()){
            System.out.println("Error! Garage is full");
        }
        else{
           stackArray[++top]=a;
        }
    }
    
    public boolean isEmpty(){
        if (top==1) {
            return true;
        }
        else{
            return false;
        }
    }

    public Car pop() {
        if(isEmpty()){
            return null;
        }
        else{
            return stackArray[top--];
        }
        
    }

    public Car peek() {
        if (isEmpty()) {
            return null;

        } else {
            return stackArray[top--];
        }
    }

    public boolean isFull() {
        return(top==maxSize-1);
    }
}
