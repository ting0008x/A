package Abc;
import java.awt.event.*;

public class ComputerListener implements ActionListener{
	
	String fuhao;
	MyComputer sys;
	public ComputerListener() {
		// TODO Auto-generated constructor stub
	}
	
	public void setFuhao(String fuhao) {
		this.fuhao = fuhao;
	}
	public void setSys(MyComputer sys) {
		this.sys = sys;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		double result = 0;
		try {
			double a = Double.parseDouble(sys.input1.getText());
			double b = Double.parseDouble(sys.input2.getText());
			if(fuhao.equals("+")) {
				result = a+b;
			}else if(fuhao.equals("-")) {
				result = a - b;
			}else if(fuhao.equals("*")) {
				result = a*b;
			}else if(fuhao.equals("/")) {
				result = a/b;
			}
			
			sys.area.append(a+" "+fuhao+" "+b+ " = "+result+"\n");
		}catch(Exception exp) {
			System.out.println(e);
		}
		
		
		
	}
}
