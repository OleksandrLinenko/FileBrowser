/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userinterface;

import filebrowser.Application;
import filebrowser.AskPathCommand;
import filebrowser.WriteFileContentCommand;
import filebrowser.WriteTreeCommand;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author oleksandrlinenko
 */
public class MainMenu {

    private static Scanner sc = new Scanner(System.in);
    
    public static MainMenu create() {
        return new MainMenu();
    }

    public void show() throws IOException {
        boolean endProgram = false;
        do {
            menu();
            int option = readOption();
            endProgram = doOption(option);
        } while (!endProgram);
    }

    private void menu() {
        System.out.println("1. Set path to directory");
        System.out.println("2. Show tree");
        System.out.println("3. Write choosen file content");
        System.out.println("0. End program");
    }

    private int readOption() {
        System.out.print("Set the option");
        int option;
        try {
            option = sc.nextInt();
        } catch (InputMismatchException ex) {
            return -1;
        }

        return option;
    }

    private boolean doOption(int option) throws IOException {
        switch (option) {
            case 0:
                return true;
            case 1:
                setPath();
                break;
            case 2:
                showTree();
                break;
            case 3:
                writeFileContent();
                break;
            default:
                System.out.println("Undefined option");
        }

        return false;
    }

    private void setPath() {
        AskPathCommand.create().handle();
    }
    
    private void showTree() {
        WriteTreeCommand.create().handle();
    }
    

    private void writeFileContent() throws IOException {
        WriteFileContentCommand.create().handle();
    }

}
