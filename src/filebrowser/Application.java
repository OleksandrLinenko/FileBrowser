/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filebrowser;

/**
 *
 * @author oleksandrlinenko
 */
public class Application {
    private static Application app = new Application();
    private String path;
    
    private Application() {}
    
    public static Application getInstance() {
        return app;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    
    
    
}
