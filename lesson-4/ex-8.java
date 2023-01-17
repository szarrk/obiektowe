package shiritori;

import java.util.Arrays;
import java.util.Scanner;

class Shiritori{
	String[] wordsSaid = new String[0];
	boolean gameOver = false;
	boolean quitGame = false;
	
	boolean quit () {
		quitGame = true;
		return quitGame;
	}
	
	public String[] addWord(String newWord)  {  
	    String[] newWordsSaid = new String[wordsSaid.length+1];  
	    for(int i=0;i<wordsSaid.length;i++)
	    {  
	    	newWordsSaid[i] = wordsSaid[i];  
	    }
	    newWordsSaid[wordsSaid.length] = newWord;
	    return newWordsSaid;  
	}  
	
	public String[] play(String newWord) {
		
		
		if(wordsSaid.length == 0) {
			wordsSaid = addWord(newWord);
			}
			else if(wordsSaid.length > 0){
				String lastWord = wordsSaid[wordsSaid.length-1];
				char lastChar = lastWord.charAt(lastWord.length()-1);
				char firstChar = newWord.charAt(0);
				
				if (lastChar == firstChar && gameOver != false && Arrays.asList(wordsSaid).contains(newWord) == false) {
						wordsSaid = addWord(newWord);
					}
				
				else if(lastChar != firstChar || Arrays.asList(wordsSaid).contains(newWord)) {
					gameOver = true;
					System.out.println("Game over!!!");
					if(lastChar != firstChar) {
						System.out.println(newWord + " does not start with "+ lastChar + ".");
					}
					if(Arrays.asList(wordsSaid).contains(newWord)) {
						System.out.println(newWord + " has already been used.");
					}
				}
				}
	return wordsSaid;
	}
	
		public void restart() {
		this.wordsSaid = new String[0];
		this.gameOver = false ;
		System.out.println("Game restarted");
	}
		
		public void printWords() {
			for(int i=0; i<wordsSaid.length; i++) {
				System.out.println(wordsSaid[i]);
			}
		}
}

public class Main {

	public static void main(String[] args) {
		Shiritori my_shiritori = new Shiritori();
		Scanner gameInput = new Scanner(System.in);
		while(!my_shiritori.quitGame) {
			System.out.println("Please, enter your command (play, restart, printWords, quit): ");
			String command = gameInput.nextLine();
			if (command.equals("play")) {
				System.out.println("Now please, enter your word: ");
				String nextWord = gameInput.nextLine();
				my_shiritori.play(nextWord);
			}
			if (command.equals("restart")) {
				my_shiritori.restart();
			}
			if (command.equals("printWords")) {
				my_shiritori.printWords();
			}
			if (command.equals("quit")) {
				my_shiritori.quit();
			}
		}
	}
}
