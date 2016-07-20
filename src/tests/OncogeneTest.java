package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

public class OncogeneTest
{
	@Test
	public void testOncogeneDetector()
	{
		OncogeneDetector oncogeneDetector = new OncogeneDetector();

		ArrayList<String> healthySequences = new ArrayList<String>();
		for (char c : "TGCATCC AAATTTGGGCCC ATGCGCTA GGGTACGGAG TTAATTGGG".toCharArray())
			healthySequences.add("" + c);

		ArrayList<String> cancerSequences = new ArrayList<String>();
		for (char c : "ATTTGCAGG TGCAAATTA AAAGGGCCCTTT TGCGATACGTAGGACCA ACTCATTAGTGC AAACGCTAGACACACAAG".toCharArray())
			cancerSequences.add("" + c);

		assertTrue(oncogeneDetector.isOncogene(healthySequences, cancerSequences, "TGC"));
		assertFalse(oncogeneDetector.isOncogene(healthySequences, cancerSequences, "GGG"));
	}

}

class OncogeneDetector
{
	public boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequences, String candidate)
	{
		int healthySamp = 5;
		int cancerSamp = 6;
		
		int healthyCount = 0;
		int cancerCount = 0;
		
		float healthyPer;
		float cancerPer;
		
		String current = "";
		
		for(String h : healthySequences) {
			if(!(h.equals(" "))) {
				current+=h;
				if(current.contains(candidate))
					healthyCount++;
			}
			else 
				current = "";
		}
			
		current = "";
		for(String c : cancerSequences) {
			if(!(c.equals(" "))) {
				current+=c;
				if(current.contains(candidate)) 
					cancerCount++;
			}
			else 
				current = "";
		}	
		
		healthyPer = healthyCount / healthySamp;
		cancerPer = cancerCount / cancerSamp;
		
		if(cancerPer > healthyPer)
			return true;
		
		return false;
	}
}
