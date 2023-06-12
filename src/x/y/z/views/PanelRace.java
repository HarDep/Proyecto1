package x.y.z.views;

import x.y.z.utils.UtilImages;
import x.y.z.utils.UtilProperties;

import javax.swing.*;
import java.awt.*;

public class PanelRace extends JPanel {
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.drawImage(UtilImages.getImage(getWidth(),getHeight(), UtilProperties.getConfig(
                "innit_image_path")),0,0,null);
        //TODO pintar
    }
}
