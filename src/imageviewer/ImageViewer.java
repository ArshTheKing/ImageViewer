package imageviewer;

import controls.MainFrame;
import imageviewer.model.FileImageLoader;
import imageviewer.model.Image;
import java.io.File;

public class ImageViewer {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\AZAEL\\Desktop\\rwby\\");
        FileImageLoader fileImageLoader = new FileImageLoader(file);
        Image image= fileImageLoader.load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().display(image);
        
    }
    
}
