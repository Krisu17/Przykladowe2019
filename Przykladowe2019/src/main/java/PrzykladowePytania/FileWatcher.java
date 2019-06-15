/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrzykladowePytania;
import java.io.File;

/**
 *
 * @author Krzysztof
 */
public class FileWatcher extends Thread {
    private boolean canRead = false;
    private long deley;
    private String path;
    private File file;
    
    public boolean getCanRead () {
        return canRead;
    }
    
    public FileWatcher(String path, long deley) {
        this.path = path;
        this.deley = deley;
        this.file = new File(path);
    }
    
    @Override
    public void run() {
        while(!canRead) {
            try {
                if(file.canRead()){
                    this.canRead = true;
                }
                sleep(deley);
            } catch (InterruptedException e) {
                System.out.println("Przerwali mnie działanie :C");
            }
        }
    }
}
