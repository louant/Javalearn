import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public abstract class ComboboxTest implements ItemListener,ActionListener{
	String[] fontsize = {"12","14","16","18","20","22","24","26","28"};
	String defaultMessage = "请选择或直接输入文字大小！";
	Font font = null;
	JComboBox combo = null;
	JLabel label = null;
	public ComboboxTest(){
		JFrame f = new JFrame("JComboBoxTest");
		Container contentPane = f.getContentPane();
		contentPane .setLayout(new GridLayout(2,1));
		label = new JLabel("Swing",JLabel.CENTER);
		font = new Font("SansSerif",Font.PLAIN,12);
		label.setFont(font);
		combo = new JComboBox(fontsize);
		combo.setBorder(BorderFactory.createTitledBorder("请选择你要的文字大小："));
		combo.setEditable(true);
		ComboBoxEditor editor = combo.getEditor();
		combo.configureEditor(editor, defaultMessage);
		
		combo.addItemListener(this);
		combo.addActionListener(this);
		contentPane.add(label);
		contentPane.add(combo);
		f.pack();
		f.show();
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args){
//		new ComboboxTest();
	}
	
	public void actionPerformed(ActionEvent e){
		boolean isaddItem = true;
		int fontsize = 0;
		String tmp = (String)combo.getSelectedItem();
		try{
			fontsize = Integer.parseInt(tmp);
			for(int i = 0;i<combo.getItemCount();i++){
				if(combo.getItemAt(i).equals(tmp)){
					isaddItem = false;
					break;
				}
			}
			
		}catch(NumberFormatException ne){
			
		}
	}
}
