package x.y.z.views;

import x.y.z.utils.UtilImages;
import x.y.z.utils.UtilProperties;

import javax.swing.*;
import java.awt.*;

public class PanelRace extends JPanel {
    public PanelRace() {
        add(new JLabel("aa"));
        repaint();
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.drawImage(UtilImages.getImage(getWidth(),getHeight(), UtilProperties.getConfig(
                "innit_image_path")),0,0,null);
        graphics2D.setColor(Color.green);
        graphics2D.drawString("aa",5,5);
        graphics2D.drawPolyline(new int[]{34,55,67},new int[]{78,56,67},3);
        //TODO pintar
    }
}
