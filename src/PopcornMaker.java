import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("What flavor popcorn?");
	String min = JOptionPane.showInputDialog("How many minutes?");
	int minutes = Integer.parseInt(min); 
	Popcorn pop = new Popcorn(flavor);
	Microwave m = new Microwave();
	m.putInMicrowave(pop);
	m.setTime(minutes);
	m.startMicrowave();
	
	
}
}
