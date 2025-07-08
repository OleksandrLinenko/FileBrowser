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

    @Override
    public String toString() {
        return String.format("%s, size: %d", name, size);
    }
}
