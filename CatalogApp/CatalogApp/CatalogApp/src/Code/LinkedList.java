/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author Gayana Fernando
 */
public class LinkedList {

    private Link first;

    public LinkedList() {
        first =null;
    }

   
    public Link getFirst() {
        return first;
    }      

    public boolean isEmpty() {
        return(first==null);
    }

    public void insertFirst(String isbn,String t, String cp) {
        Link newLink=new Link(isbn,t,cp);
        newLink.next=first;
        first=newLink;
    }

    public void insertLast(String isbn,String t, String cp) {
        Link newLink=new Link(isbn,t,cp);
        newLink.next=first;
        first=newLink;
       
    }

    public Link deleteFirst() {
        Link temp=first;
        first = first.next;
        return temp;
        
    }

    public void insertAfter(String ex_isbn, String isbn, String t, String cp) {
        Link newLink = new Link(isbn, t, cp);
        Link current = first;

        while (current != null) {
                if(current.getISBN()==ex_isbn)
                {
                    newLink.next=current.next;
                    current.next=newLink;
                }
                current=current.next;
        }
    }   //Key is the ISBN of the existing book     

    public Link find(String isbn) {
        Link current=first;
        while(current !=null){
            if(current.getISBN()==isbn)
            {
                return current;      
            }
            current=current.next;
        }
        return null;
    }

    public Link delete(String isbn) {
        Link current = first; 
        Link previous = current;

        while (current != null) {
            if (current.getISBN() == isbn) {
                if (current == first) 
                {
                    first = first.next; 
                } else {
                    previous.next = current.next;
                }
                return current;
            } else {
                previous = current;
                current = current.next;
            }
        }
        return null;
    }
}
