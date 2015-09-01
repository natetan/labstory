/*
 * Yulong Tan
 * Android App: The Labyrinth
 * 
 * The Page class serves as the visual for the user and changes the page text, choice text,
 * image ID, and sounds for the user when a page is loaded
 */

public class Page {
	
	// Fields and member variables
	private int imageId;
	private String text;
	private Choice choice1;
	private Choice choice2;
	private boolean isFinal = false;
	private boolean isOneChoice = false;
	
	// Constructor used for death screens (no choices)
	public Page(int imageId, String text) {
		this.isFinal = true;
		this.imageId = imageId;
		this.text = text;
	}
	
	/*
	 * Constructor used for continuing on to the next page when the text gets too long
	 * since I don't have a scroll object and don't know how to make one yet
	 */
	public Page(int imageId, String text, Choice choice) {
		this.isOneChoice = true;
		this.imageId = imageId;
		this.text = text;
		this.choice1 = null;
		this.choice2 = choice;
	}
	
	// Main constructor used for pages with an image, text, and 2 choices
	public Page(int imageId, String text, Choice choice1, Choice choice2) {
		this.imageId = imageId;
		this.text = text;
		this.choice1 = choice1;
		this.choice2 = choice2;
	}
	
	// Returns the ID of the image used
	public int getImageId() {
		return this.imageId;
	}
	
	// Sets the ID of the image to the one passed in
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	
	// Returns the text of the page
	public String getText() {
		return this.text;
	}
	
	// Sets the text of the page to the one passed in
	public void setText(String text) {
		this.text = text;
	}
	
	// Returns the first choice object
	public Choice getChoice1() {
		return this.choice1;
	}
	
	// Sets the first choice to whatever is passed in
	public void setChoice1(Choice choice1) {
		this.choice1 = choice1;
	}
	
	// Returns the second choice object
	public Choice getChoice2() {
		return this.choice2;
	}
	
	// Sets the second choice to whatever is passed in
	public void setChoice2(Choice choice2) {
		this.choice2 = choice2;
	}
	
	// Returns true if the page is a gameover page and false otherwise
	public boolean isFinal() {
		return this.isFinal;
	}
	
	// Sets the page to be final or not
	public void setIsFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}
	
	// Returns true if the page will be a continuation and false otherwise
	public boolean isOneChoice() {
		return this.isOneChoice;
	}
	
	// Sets the page to be once choice or not
	public void setIsOneChoice(boolean isOneChoice) {
		this.isOneChoice = isOneChoice;
	}
}
