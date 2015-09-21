
public class Test {
	
	public static void main(String[] args) {
		Story story = new Story();
		for (int i = 0; i <= 36; i++) {
			System.out.println("Page " + i + ": " + story.getWordCount(story.getPage(i).getText()) 
					+ " words and " + story.getCharCount(story.getPage(i).getText()) + " characters");
		}
	}

}
