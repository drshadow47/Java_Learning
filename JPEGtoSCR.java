package com.spicemoney.nsdl.ikit;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JPEGtoSCR {
    public static void main(String[] args) {
        // Path to your JPEG image
        String imagePath = "C:\\Users\\sanjeev.kumar2_spice\\Downloads\\Screensaver Final JPG.jpg";

        // Load the JPEG image
        try {
            BufferedImage image = ImageIO.read(new File(imagePath));

            // Create a blank image with the same dimensions as the JPEG
            BufferedImage screensaverImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D g = screensaverImage.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, screensaverImage.getWidth(), screensaverImage.getHeight());
            g.drawImage(image, 0, 0, null);
            g.dispose();

            // Save the screensaver file to the desktop
            String desktopPath = System.getProperty("user.home") + "/Desktop/";
            File screensaverFile = new File(desktopPath + "vijay.scr");
            ImageIO.write(screensaverImage, "jpeg", screensaverFile);

            System.out.println("Screensaver saved to: " + screensaverFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
