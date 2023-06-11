package x.y.z.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;

public class UtilImages {
    public static Image getImage(int width, int height, String path){
        Image image = null;
        try {
            image = ImageIO.read(new File(path)).getScaledInstance(width, height,Image.SCALE_SMOOTH);
        }catch (Exception e){
            e.printStackTrace();
        }
        return image;
    }
}
