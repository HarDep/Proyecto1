package x.y.z.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;

import static x.y.z.configs.GlobalConfigs.*;

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

    public static Image getAvatarImage(int avatarNumber,int width, int height){
        Image image = null;
        try {
            switch (avatarNumber){
                case AVATAR_1 -> image = ImageIO.read(new File(UtilProperties.getConfig("avatar_1_image_path")))
                        .getScaledInstance(width, height,Image.SCALE_SMOOTH);
                case AVATAR_2 -> image = ImageIO.read(new File(UtilProperties.getConfig("avatar_2_image_path")))
                        .getScaledInstance(width, height,Image.SCALE_SMOOTH);
                case AVATAR_3 -> image = ImageIO.read(new File(UtilProperties.getConfig("avatar_3_image_path")))
                        .getScaledInstance(width, height,Image.SCALE_SMOOTH);
                case AVATAR_4 -> image = ImageIO.read(new File(UtilProperties.getConfig("avatar_4_image_path")))
                        .getScaledInstance(width, height,Image.SCALE_SMOOTH);
                default -> image = ImageIO.read(new File(UtilProperties.getConfig("avatar_5_image_path")))
                        .getScaledInstance(width, height,Image.SCALE_SMOOTH);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return image;
    }

    public static Image getCarTypeImage(int carType,int width, int height){
        Image image = null;
        try {
            switch (carType){
                case CAR_1 -> image = ImageIO.read(new File(UtilProperties.getConfig("car_1_image_path")))
                        .getScaledInstance(width, height,Image.SCALE_SMOOTH);
                case CAR_2 -> image = ImageIO.read(new File(UtilProperties.getConfig("car_2_image_path")))
                        .getScaledInstance(width, height,Image.SCALE_SMOOTH);
                case CAR_3 -> image = ImageIO.read(new File(UtilProperties.getConfig("car_3_image_path")))
                        .getScaledInstance(width, height,Image.SCALE_SMOOTH);
                default -> image = ImageIO.read(new File(UtilProperties.getConfig("car_4_image_path")))
                        .getScaledInstance(width, height,Image.SCALE_SMOOTH);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return image;
    }
}
