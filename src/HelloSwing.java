import javax.swing.*;
import java.util.concurrent.*;

import TestPackage.SwingConsole;

public class HelloSwing extends JFrame {
	JLabel label;
	
	public HelloSwing(){
		SwingConsole sc = new SwingConsole();
		sc.run(this, 300, 100);
		label = new JLabel("A label");
		add(label);
		
	}
	static HelloSwing hw;
	
	public static void main(String[] args) throws Exception{
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){hw = new HelloSwing();}
		});
		TimeUnit.SECONDS.sleep(1);
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				hw.label.setText("Hey THis is Different!");
			}
		});
		
	}
}
