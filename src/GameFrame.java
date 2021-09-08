
import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	GameFrame(){ //constructors
		
		//GamePanel panel = new GamePanel();short bellow;
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}

