package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WordScramble implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton view = new JButton();
	JButton play = new JButton();
	ArrayList<String> words = new ArrayList<String>();
	
	public static void main(String[] args) {
		WordScramble scram = new WordScramble();
	}
	
	WordScramble() {
		frame.setVisible(true);
		
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		panel.add(play);
		
		add.setSize(100, 40);
		view.setSize(100, 40);
		play.setSize(100,40);
		
		add.setText("Add");
		view.setText("View");
		play.setText("Play");

		add.addActionListener(this);
		view.addActionListener(this);
		play.addActionListener(this);
		
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add) {
			words.add(JOptionPane.showInputDialog("Please type a word."));
		}
		if(e.getSource() == view) {
			String x = "";
			int i = 1;
			for(String w : words) {
				x+=i + ". " + w + "  ";
				i++;
			}	
			
			JOptionPane.showMessageDialog(null, x);
		}
		if(e.getSource() == play) {
                    Random r = new Random();
                    String choice = scramble(words.get(r.nextInt(words.size())));
                    JOptionPane.showInputDialog(choice);
		}
	}
	
	public String scramble(String tobe) {
		Random rand = new Random();
                String swap = "";
                ArrayList<Integer> place = new ArrayList<Integer>();
                
                for(int i = 0; i <= tobe.length() - 1; i++) {
                    place.add(rand.nextInt(tobe.length()));
                    
                    System.out.println(place);
                }
                
                
		/*
                char tobe2[] = tobe.toCharArray();
		
		for(int i = tobe.length() - 1; i > 0; i--) {
			int x = rand.nextInt(i + 1);
			int temp = tobe2[x];
			tobe2[x] = tobe2[i];
			tobe2[i] = temp;
		}
		*/

			
		
		return swap;
	}
}

