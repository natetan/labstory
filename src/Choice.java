
public class Choice {
	private String text;
	private int nextPage;
	
	public Choice(String text, int nextPage) {
		this.text = text;
		this.nextPage = nextPage;
	}
	
	public String getText() {
		return this.text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public int getNextPage() {
		return this.nextPage;
	}
	
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
}
