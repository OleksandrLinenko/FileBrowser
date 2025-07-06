/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filebrowser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oleksandrlinenko
 */
public class Directory {

    private String name;
    private List<CustomFile> files = new ArrayList();
    private List<Directory> directories = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<CustomFile> getFiles() {
        return files;
    }

    public List<Directory> getDirectories() {
        return directories;
    }

    public int filesQuantity() {
        return files.size();
    }

    public int directoryQuantity() {
        return directories.size();
    }

    public void addDirectory(Directory directory) {
        directories.add(directory);
    }

    public void addFile(CustomFile file) {
        files.add(file);
    }

    public void fill(String path, Directory directory) {
        if (path == null || directory == null) {
            path = Application.getInstance().getPath();
            directory = Application.getInstance().getDirectory();
        }
        File pathFile = new File(path);
        for (File file : pathFile.listFiles()) {
            if (file.isDirectory()) {
                Directory directoryTemp = new Directory(file.getPath());
                directory.addDirectory(directoryTemp);
                fill(file.getPath(), directoryTemp);
            } else {
                directory.addFile(new CustomFile(file.getPath(), file.length()));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Directory %s with %d files and %d folders \n", getName(), filesQuantity(), directoryQuantity()));
        for (Directory dir : directories) {
            sb.append(dir);
        }

        for (CustomFile fl : files) {
            sb.append(String.format("%s\n", fl.toString()));
        }

        return sb.toString();
    }

    public String toString2() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Directory %s with %d files and %d folders \n", getName(), filesQuantity(), directoryQuantity()));
        for (Directory dir : directories) {
            sb.append(String.format("Directory %s with %d files and %d folders \n", dir.getName(), dir.filesQuantity(), dir.directoryQuantity()));
            for (CustomFile fl : dir.getFiles()) {
                sb.append(String.format("%s\n", fl.toString()));
            }
        }

        return sb.toString();
    }

}
