
import javax.swing.*;
/**
 *
 * @author Prince kumar
 */

public class SnakeFrame extends JFrame {
    
	SnakeFrame(){
		this.add(new SnakePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

//    private void add(SnakePanel snakePanel) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
