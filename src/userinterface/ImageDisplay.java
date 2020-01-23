package userinterface;
import imageviewer.model.Image;
public interface ImageDisplay {
    
    Image current();
    void display(Image image);
}
