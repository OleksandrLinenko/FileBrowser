/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userinterface;

/**
 *
 * @author oleksandrlinenko
 */
public class ErrorMessage {
    
    public static ErrorMessage create() {
        return new ErrorMessage();
    }
    
    public void show(String string) {
        System.out.println("Error Error Error");
        System.out.println(string);
    }
}
