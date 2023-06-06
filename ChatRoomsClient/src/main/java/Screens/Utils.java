package Screens;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Utils {
    public static ImageIcon makeImageIcon(String url, int width, int height) throws IOException {
        File img = new File(url);
        BufferedImage bufferedImage = ImageIO.read(img);
        ImageIcon imageIcon = new ImageIcon(bufferedImage);
        Image im = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        ImageIcon imIcn = new ImageIcon(im);
        return imIcn;
    }
}
