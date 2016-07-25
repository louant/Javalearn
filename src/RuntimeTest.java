import static TestPackage.SwingConsole.*;

import java.lang.Runtime.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class RuntimeTest  extends JFrame{
	private JButton b = new JButton("Open the CMD");
	
	public RuntimeTest(){
		setLayout(new FlowLayout());
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Runtime r = Runtime.getRuntime();
				
				try{
					Process pro = r.exec("cmd /f dir > %dest%", new String[]{"dest=f:\\test.txt",new File("f:\\code")});
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		add(b);
	}
	
	public static void main(String[] args){
		run(new RuntimeTest(),200,300);
	}
}
