
public class Page {
	private int imageId;
	private String text;
	private Choice choice1;
	private Choice choice2;
	private boolean isFinal = false;
	
	// Constructor used for death screens (no choices)
	public Page(int imageId, String text) {
		this.imageId = imageId;
		this.text = text;
	}
	
	// EXPERIMENTAL: Constructor used for simply continuing to the next page if text is too long
	// Use the set invisibility option with the text "continue to next page"
	public Page(int imageId, String text, Choice choice) {
		this.imageId = imageId;
		this.text = text;
		this.choice1 = null;
		this.choice2 = choice;
	}
	
	// Constructor used for non-death screens (two choices)
	public Page(int imageId, String text, Choice choice1, Choice choice2) {
		this.imageId = imageId;
		this.text = text;
		this.choice1 = choice1;
		this.choice2 = choice2;
	}
	
	public int getImageId() {
		return this.imageId;
	}
	
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	
	public String getText() {
		return this.text;
	}
	
	public void setText() {
		this.text = text;
	}
	
	public Choice getChoice1() {
		return this.choice1;
	}
	
	public void setChoice1(Choice choice1) {
		this.choice1 = choice1;
	}
	
	public Choice getChoice2() {
		return this.choice2;
	}
	
	public void setChoice2(Choice choice2) {
		this.choice2 = choice2;
	}
	
	public boolean isFinal() {
		return this.isFinal;
	}
	
	public void setIsFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}
}
