/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filebrowser;

import java.io.File;

/**
 * Write all available folders in a given directory;
 * @author oleksandrlinenko
 */
public class WriteFoldersCommand {
    public static WriteFoldersCommand create() {
        return new WriteFoldersCommand();
    }

    public void handle(String folder) {
        File file = new File(folder);
        
        // Выписать все доступные папки в заданой директории;
    }
}
