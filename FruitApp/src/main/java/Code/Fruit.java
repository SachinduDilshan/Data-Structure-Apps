/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author SACHINDU
 */
public class Fruit {
    private String name;
    private String Type;
    private String color;
    private String Image;

    public Fruit(String name, String Type, String color) {
        this.name = name;
        this.Type = Type;
        this.color = color;
    }

    public Fruit(String name, String Type, String color, String Image) {
        this.name = name;
        this.Type = Type;
        this.color = color;
        this.Image = Image;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return Type;
    }

    public String getColor() {
        return color;
    }

    public String getImage() {
        return Image;
    }
    
    
}
