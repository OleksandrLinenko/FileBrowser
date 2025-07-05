/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filebrowser;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author oleksandrlinenko
 */
public class UI {

    private static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean endProgram = false;
        do {
            menu();
            int option = readOption();
            endProgram = doOption(option);
        } while (!endProgram);
    }

    private static void menu() {
        System.out.println("1. Set path to directory");
        System.out.println("2. Write all folders form directory");
        System.out.println("3. Write all files from folder");
        System.out.println("4. Write choosen file content");
        System.out.println("0. End program");
    }

    private static int readOption() {
        System.out.print("Set the option");
        int option;
        try {
            option = sc.nextInt();
        } catch (InputMismatchException ex) {
            return -1;
        }

        return option;
    }

    private static boolean doOption(int option) {
        switch (option) {
            case 0:
                return true;
            case 1:
                setPath();
                break;
            case 2:
                writeFolders();
                break;
            case 3:
                writeFiles();
                break;
            case 4:
                writeFileContent();
                break;
            default:
                System.out.println("Undefined option");
        }

        return false;
    }

    private static void setPath() {

    }

    private static void writeFolders() {

    }

    private static void writeFiles() {

    }

    private static void writeFileContent() {

    }

}
