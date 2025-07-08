/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filebrowser;

import java.io.File;

/**
 *
 * @author oleksandrlinenko
 */
public class CustomFile {

    private String name;
    private long size;

    public CustomFile(String name, long size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    public CustomFile findFile(String path, String fileName) {
        File directory = new File(path);
        if (!directory.exists() || !directory.isDirectory()) {
            return null;
        }

        for (File file : directory.listFiles()) {
            if (file.isDirectory()) {
                CustomFile found = findFile(file.getPath(), fileName);
                if (found != null) {
                    return found;
                }
            } else {
                if (file.getName().equals(fileName)) {
                    return new CustomFile(file.getPath(), file.length());
                }
            }
        }

        return null; 
    }

        @Override
        public String toString
        
            () {
        return String.format("%s, size: %d", name, size);
        }
    }
