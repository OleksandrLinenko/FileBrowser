/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filebrowser;

import userinterface.Message;

/**
 *
 * @author oleksandrlinenko
 */
public class WriteTreeCommand {

    public static WriteTreeCommand create() {
        return new WriteTreeCommand();
    }

    public void handle() {
        Message.create().show("");
        Directory directory = Application.getInstance().getDirectory();
        Message.create().show(String.format("%s ", directory.toString()));
        Message.create().show("----------------------------------------------");
    }
}
