package piece;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public abstract class Piece{

	/** Location of a piece {x, y} */
	protected int[] location = new int[2];
	/** true=white team, false=black team */
	final private boolean team;
	/** Whether or not a piece has been capture by the opposing team */
	private boolean inPlay;
	/** Whether or not a piece is putting a king in check */
	//private boolean check;
	/** Name for move log */
	private String name;
	/** Image of the piece */
	private ImageView pic;
	/** GridPane of the chess board */
	private GridPane pane;
	
	public Piece(boolean team, int[] location, ImageView pic, GridPane pane) {
        this.team = team;
        this.location = location;
        this.pic = pic;
        this.pane = pane;
        this.inPlay = true;
        this.pic.managedProperty().bind(this.pic.visibleProperty());
        //addDragEventListeners();
    }
	
	public boolean getTeam() {
        return team;
    }

    public int[] getLoc() {
        return location;
    }

    public int getX() {
        return location[0];
    }

    public int getY() {
        return location[1];
    }

    public GridPane getPane() {
        return pane;
    }

    public ImageView getPic() {
        return pic;
    }

    public boolean inPlay() {
        return inPlay;
    }
}
