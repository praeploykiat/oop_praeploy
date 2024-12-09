package piece;

import javafx.scene.image.Image;

public class King {
    private final Image image;

    public King() {
        // Load the image when the King object is created
        this.image = new Image(ClassLoader.getSystemResource("piece/kingB.png").toString());
    }

    public Image getImage() {
        return image;
    }
}
