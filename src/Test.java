public class Test {
	
	public static void main(String[] args) {
		int wordCount = 0;
		int charCount = 0;
		Story story = new Story();
		for (int i = 0; i <= 41; i++) {
			int words = story.getWordCount(story.getPage(i).getText());
			int characters = story.getCharCount(story.getPage(i).getText());
			wordCount += words;
			charCount += characters;
			System.out.println("Page " + i + ": " + words 
					+ " words and " + characters + " characters");
		}
		System.out.println();
		System.out.println("Total words: " + wordCount);
		System.out.println("Total characters: " + charCount);
		System.out.println();
		
		System.out.println("Method word total: " + story.getTotalWordCount(41));
		System.out.println("Method character total: " + story.getTotalCharCount(41));
		
		
		
		
		
	}

}
