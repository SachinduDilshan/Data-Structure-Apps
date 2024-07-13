/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author ASUS
 */
public class Cat {

    private String name;
    private String Animal; // Whether it’s a Lion , Panther 
    public int age;

    public Cat(String name, String Animal, int age) {
        this.name = name;
        this.Animal = Animal;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAnimal() {
        return Animal;
    }

    public int getAge() {
        return age;
    }
    public void printcatdetails(){
        System.out.println(this.name+"\n"+this.Animal+"\n"+this.age);
    }
}
