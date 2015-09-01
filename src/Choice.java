/*
 * Yulong Tan
 * Android App: The Labyrinth
 * 
 * The Choice class represents the decision and the page it will lead
 */

public class Choice {
	private String text;
	private int nextPage;
	
	// Creates a new choice object with text and the page number it will lead to
	public Choice(String text, int nextPage) {
		this.text = text;
		this.nextPage = nextPage;
	}
	
	// Returns the text of the choice
	public String getText() {
		return this.text;
	}
	
	// Sets the text of the choice based on the argument passed in
	public void setText(String text) {
		this.text = text;
	}
	
	// Returns the page number the choice will lead to
	public int getNextPage() {
		return this.nextPage;
	}
	
	// Sets the next page the choice will lead to
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
}
