/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filebrowser;

/**
 *
 * @author oleksandrlinenko
 */
public class CustomFile {
    private String name;
    private int size;

    public CustomFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
    
    @Override
    public String toString() {
        return String.format("%s , %d", name, size);
    }
}
