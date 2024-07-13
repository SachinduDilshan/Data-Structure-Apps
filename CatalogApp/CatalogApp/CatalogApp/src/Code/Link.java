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
public class Link {
    private String ISBN;        
    private String title;   
    private String coverPhoto;   
    public Link next;

    public Link(String ISBN, String title, String coverPhoto) {
        this.ISBN = ISBN;
        this.title = title;
        this.coverPhoto = coverPhoto;
        next=null;
    }

    

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getCoverPhoto() {
        return coverPhoto;
    }
    
    
}
