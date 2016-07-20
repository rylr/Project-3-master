package tests;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.junit.Test;

public class Palindromes {
	
	@Test
		public void paltest() throws IOException {
			String pal = "racecar";
			String notPal = "caca";
			assertTrue(isPalindrome(pal));
			assertFalse(isPalindrome(notPal));
	}

	private Boolean isPalindrome(String norm) throws IOException {
		Boolean isPal;
		norm = norm.toLowerCase();
		char convert[] = norm.toCharArray();
		String flip = "";
		
		for(int i = norm.length() - 1; i >= 0; i--) {
			flip += convert[i];
		}	
		
		if(flip.equals(norm))
			isPal = true;
		else
			isPal = false;
		
		
		ArrayList<String> list = URLReader();
		for(String w : list){
			w = w.toLowerCase();
			char listArray[] = w.toCharArray();
			String flipList = "";
			for(int y = w.length() - 1; y >= 0; y--)
				flipList += listArray[y];
			
			if(flipList.equals(w))
				System.out.println(flipList);
		}
		
		return isPal;
	}
	
	public ArrayList<String> URLReader() throws IOException {
		ArrayList<String> wordList = new ArrayList<String>();
		URL list = new URL("https://raw.githubusercontent.com/eneko/data-repository/master/data/words.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(list.openStream()));
		String inputLine;
		while((inputLine = br.readLine()) != null)
			wordList.add(inputLine);
		
		return wordList;
	}
}
