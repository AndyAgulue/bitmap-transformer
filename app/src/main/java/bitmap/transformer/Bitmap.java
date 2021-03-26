package bitmap.transformer;
import javax.imageio.ImageIO;
//import java.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.*;
// shout out to Stephen, Ed and James for this suggestion on the starter code
public class Bitmap {
    BufferedImage pixels;
    public Bitmap(String fileName) throws IOException {
        File image = new File(fileName);
        this.pixels = ImageIO.read(image);
    }

    public void convertToPink() {
        for (int i=0; i < this.pixels.getWidth(); i++){
            for(int j=0; j < this.pixels.getHeight(); j++){
                Color control = new Color(this.pixels.getRGB(i, j));
                int r = control.getRed();
                int g = control.getGreen();
                int b = control.getBlue();
                Color pinkColor = new Color (255, 0, 144);
                this.pixels.setRGB(i, j, pinkColor.getRGB());
            }
        }
    }

    public void convertToGrayScale() {
        for (int i=0; i < this.pixels.getWidth(); i++){
            for(int j=0; j < this.pixels.getHeight(); j++){
        Color control = new Color(this.pixels.getRGB(i, j));
        int r = control.getRed();
        int g = control.getGreen();
        int b = control.getBlue();
        int gray = (r + g + b) / 3;
        Color grayColor = new Color (gray, gray, gray);
        this.pixels.setRGB(i, j, grayColor.getRGB());
            }
        }
    }

    public void convertToReds() {
        for (int i=0; i < this.pixels.getWidth(); i++){
            for(int j=0; j < this.pixels.getHeight(); j++){
                Color control = new Color(this.pixels.getRGB(i, j));
                int r = control.getRed();
                int g = control.getGreen();
                int b = control.getBlue();
                Color redColor = new Color (255, 0, 0);
                this.pixels.setRGB(i, j, redColor.getRGB());
            }
        }
    }

    public void write(String fileToWriteTo) throws IOException{
        File image = new File(fileToWriteTo);
        ImageIO.write(this.pixels, "bmp", image);
    }
}
