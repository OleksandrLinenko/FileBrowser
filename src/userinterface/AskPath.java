/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userinterface;

import java.util.Scanner;

/**
 *
 * @author oleksandrlinenko
 */
public class AskPath {

    private Scanner sc = new Scanner(System.in);

    public static AskPath create() {
        return new AskPath();
    }

    public String show(String string) {
        System.out.print(string);
        return sc.nextLine();
    }
}
