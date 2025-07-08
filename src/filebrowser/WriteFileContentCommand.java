/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filebrowser;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import userinterface.AskPath;
import userinterface.ErrorMessage;
import userinterface.Message;

/**
 *
 * @author oleksandrlinenko
 */
public class WriteFileContentCommand {
    
    public static WriteFileContentCommand create() {
        return new WriteFileContentCommand();
    }

    public void handle() throws FileNotFoundException, IOException {
        String file = AskPath.create().show("Set file: ");
        String path = Application.getInstance().getPath() + "/" + file;
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while((line = br.readLine()) != null) {
                sb.append(String.format("%s\n", line));
            }
            
            Message.create().show(sb.toString());
        } catch(IOException ex) {
            ErrorMessage.create().show(ex.getMessage());
        }   
    }
}
