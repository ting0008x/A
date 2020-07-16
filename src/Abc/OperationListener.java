package Abc;

import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;

public class OperationListener implements ItemListener{
	JComboBox<String> fuhao;
	ComputerListener com;
	public OperationListener(JComboBox<String> fuhao,ComputerListener com) {
		this.fuhao = fuhao;
		this.com = com;
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		String fuhao = (String)this.fuhao.getSelectedItem();
		com.setFuhao(fuhao);
	}
	
}
