package Abc;

import java.awt.*;
import javax.swing.*;

public class MyComputer extends JFrame{
	public static void main(String[] args) {
		new MyComputer();
	}
	
	JTextField input1;
	JTextField input2;
	JComboBox<String> fuhao;
	JButton button;
	JTextArea area;
	
	OperationListener operationListener;
	ComputerListener computerListener;
	
	MyComputer(){
		init();
		setVisible(true);
		setBounds(100,100,200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void init() {
		setLayout(new FlowLayout());
		input1 = new JTextField(10);
		input2 = new JTextField(10);
		button = new JButton("¼ÆËã");
		fuhao = new JComboBox<String>();
		fuhao.addItem("ÇëÑ¡Ôñ·ûºÅ:");
		String a[] = {"+","-","*","/"};
		for(String s : a) {
			fuhao.addItem(s);
		}
		
		area = new JTextArea(10,9);
		
		add(input1);
		add(fuhao);
		add(input2);
		add(button);
		add(area);
		
		computerListener = new ComputerListener();	
		operationListener = new OperationListener(fuhao, computerListener);
		computerListener.setSys(this);
		
		fuhao.addItemListener(operationListener);
		button.addActionListener(computerListener);
		
		
	}
	
	
}
