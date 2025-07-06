/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filebrowser;

import userinterface.AskPath;

/**
 *
 * @author oleksandrlinenko
 */
public class AskPathCommand {
    
    public String path;

    public static AskPathCommand create() {
        return new AskPathCommand();
    }
    
    public void handle() {
        path = AskPath.create().show("Enter path: ");
        Application.getInstance().setPath(path);
    }   
}
