/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author sa22527974
 */
public class Queue {

    private int maxSize;
    private Team queueArray[];
    private int front;
    private int rear;
    private int nItems;

   /* public Queue(int maxSize) {
        maxSize = 5;
        queueArray = new Team[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }*/

    public Queue(int maxSize) {
        this.maxSize = 5;
        this.queueArray = new Team[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }
    
    

    public boolean isEmpty() {
        if(nItems==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull() {
        return (rear==maxSize-1);
    }

    public void insert(Team t) {
        if(isFull()){
            System.out.println("Error! Its full now");
        }
        else{
            queueArray[++rear]=t;
            nItems++;
        }
    }

    public Team remove() {
        if(isEmpty()){
            return null;
        }
        else{
            nItems--;
            return queueArray[front++];
        }    

    }

    public Team peek() {
        if(isEmpty())
        {
            return null;
        }
        else{
            return queueArray[front];
        }
    }
}
