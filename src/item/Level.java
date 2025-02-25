package item;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Level {
    private String name;
    private String author;
    private int stars;
//    private Image image;

    private int height;

    private int width;


    public Level(String name, String author, int stars, int width, int height) {
        setName(name);
        setAuthor(author);
        setStars(stars);
//        setImageByPath(imagePath);
        setWidth(width);
        setHeight(height);
    }

    public Level(String name, String author, String stars, String description) {
        setName(name);
        setAuthor(author);
        try {
            int rating = Integer.parseInt(stars);
            setStars(rating);
        } catch (NumberFormatException ignored) {
            setStars(0);
        }
//        setImageByPath(imagePath);
//        setDescription(description);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.isBlank() ? "Untitled" : name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author.isBlank() ? "Anonymous" : author;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = Math.max(Math.min(stars, 5), 0);
    }

//    public Image getImage() {
//        return image;
//    }

//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }

//    public void setImageByPath(String imagePath) {
//        try {
//            this.image = new Image(new FileInputStream(imagePath));
//        } catch (FileNotFoundException e1) {
//            try {
//                this.image = new Image(new FileInputStream("res/6.png"));
//            } catch (FileNotFoundException e2) {
//                this.image = null;
//            }
//        }
//    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
