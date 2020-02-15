import java.util.*;
//import java.io.*;
//import java.lang.*;

@SuppressWarnings("serial")
class SentenceException_17BCI0108 extends Exception{
	public SentenceException_17BCI0108(String s) {
		super(s);
	}
}
public class User_Defined_Exception_17BCI0108{
	void checkSentence(String a) throws SentenceException_17BCI0108{
		final String[] verbarr = {"open","close","lift","run"};
		if(a.charAt(a.length()-1) == '.') {
			throw new SentenceException_17BCI0108("Declarative Sentence");
		}
		if(a.charAt(a.length()-1) == '?') {
			throw new SentenceException_17BCI0108("Interrogative Sentence");
		}
		if(a.indexOf("what") == 0 || a.indexOf("when") == 0 || a.indexOf("which") == 0 ||a.indexOf("why") == 0 && (a.charAt(a.length()-1) == ' ' || a.charAt(a.length()-1) == '.')) {
			throw new SentenceException_17BCI0108("Interrogative Sentence");
		}
		if(a.charAt(a.length()-1) == '!') {
			throw new SentenceException_17BCI0108("Exclaimatory Sentence Sentence");
		}
		for(String v:verbarr) {
			if(a.indexOf(v) == 0) {
				throw new SentenceException_17BCI0108("Imperative Exception");
			}
		}
	}
		
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence: ");
		String s = sc.nextLine();
		User_Defined_Exception_17BCI0108 ude = new User_Defined_Exception_17BCI0108();
		try {
			ude.checkSentence(s);
		}
		catch(SentenceException_17BCI0108 x) {
			System.out.println("The error in sentnce is :"+x.getMessage());
		}
		
	}

}
