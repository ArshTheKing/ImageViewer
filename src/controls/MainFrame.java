package controls;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import userinterface.*;

public class MainFrame extends JFrame{
    private ImageDisplay imageDisplay;

    public MainFrame(){
        this.setTitle("Galeria de imagenes");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(imageDisplay());
        this.getContentPane().add(toolBar(),BorderLayout.SOUTH);
        this.setVisible(true);
    }

    private JPanel imageDisplay() {
        SwingImageDisplay sid= new SwingImageDisplay();
        this.imageDisplay= sid;
        return sid;
    }

    private Component toolBar() {
        JPanel bar = new JPanel();
        bar.add(prevButton());
        bar.add(nextButton());
        return bar;
    }

    private JButton nextButton() {
        JButton jButton = new JButton(">");
        jButton.addActionListener(nextImage());
        return jButton;
    }

    private JButton prevButton() {
        JButton jButton = new JButton("<");
        jButton.addActionListener(prevImage());
        return jButton;
    }


    private ActionListener nextImage() {
        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                imageDisplay.display(imageDisplay.current().next());
            }
        };
    }
    private ActionListener prevImage() {
        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                imageDisplay.display(imageDisplay.current().prev());
            }
        };
    }
    
    public  ImageDisplay getImageDisplay() {
        return imageDisplay;
    } 

    
    
    
}
