package System;

	import java.awt.GridLayout;
import java.util.*;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
	import javax.swing.border.EmptyBorder;
	import javax.swing.border.TitledBorder;

	public class NewPersonWin extends JFrame implements ActionListener{
		JPanel contentPane;
		JTextField name;
		 JTextField bir;
		 JTextField phone;
		 JTextField mail;
		 JTextField group;
		 JTextField other;
		 JButton save;
		 JButton cancle;
		 List<Person> persons = new ArrayList<>();
	     
		
			// TODO Auto-generated method stub
			public NewPersonWin() {
				// TODO Auto-generated constructor stub
				setVisible(true);
				setTitle("新建联系人");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 573, 473);
				contentPane = new JPanel();
				contentPane.setToolTipText("");
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(new GridLayout(1, 0, 0, 0));
				
				JPanel panel = new JPanel();
				panel.setBorder(new TitledBorder(null, "个人信息", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				contentPane.add(panel);
				panel.setLayout(null);
				
				JLabel label = new JLabel("姓名");
				label.setBounds(31, 48, 72, 18);
				panel.add(label);
				
				JLabel label_1 = new JLabel("生日");
				label_1.setBounds(31, 92, 72, 18);
				panel.add(label_1);
				
				JLabel label_2 = new JLabel("手机");
				label_2.setBounds(31, 138, 72, 18);
				panel.add(label_2);
				
				JLabel label_3 = new JLabel("电子邮箱");
				label_3.setBounds(31, 187, 85, 18);
				panel.add(label_3);
				
				JLabel label_4 = new JLabel("分组");
				label_4.setBounds(31, 240, 72, 18);
				panel.add(label_4);
				
				JLabel label_5 = new JLabel("备注");
				label_5.setBounds(31, 295, 72, 18);
				panel.add(label_5);
				
				name = new JTextField();
				name.setBounds(117, 45, 121, 24);
				panel.add(name);
				name.setColumns(10);
				
				bir = new JTextField();
				bir.setColumns(10);
				bir.setBounds(117, 89, 121, 24);
				panel.add(bir);
				
				phone = new JTextField();
				phone.setColumns(10);
				phone.setBounds(117, 135, 121, 24);
				panel.add(phone);
				
				mail = new JTextField();
				mail.setColumns(10);
				mail.setBounds(117, 184, 121, 24);
				panel.add(mail);
				
				group = new JTextField();
				group.setColumns(10);
				group.setBounds(117, 234, 121, 24);
				panel.add(group);
				
				other = new JTextField();
				other.setColumns(10);
				other.setBounds(117, 289, 121, 24);
				panel.add(other);
				
				JLabel lblNewLabel = new JLabel("\u59D3\u540D\u4E0D\u80FD\u4E3A\u7A7A\uFF01\u4E0D\u80FD\u91CD\u590D\uFF01\u5FC5\u987B\u552F\u4E00\uFF01");
				lblNewLabel.setBounds(262, 48, 269, 18);
				panel.add(lblNewLabel);
				
				JLabel lblxxxxxxxx = new JLabel("\u65E5\u671F\u683C\u5F0F\uFF1Axxxx-xx-xx");
				lblxxxxxxxx.setBounds(262, 92, 251, 18);
				panel.add(lblxxxxxxxx);
				
				JLabel lblxxxxxxxcom = new JLabel("\u90AE\u7BB1\u683C\u5F0F\uFF1Axxx@xxxx.xxx");
				lblxxxxxxxcom.setBounds(262, 187, 251, 18);
				panel.add(lblxxxxxxxcom);
				
				save = new JButton("保存");
				save.setBounds(305, 356, 63, 27);
				panel.add(save);
				save.addActionListener(this);
				
				
				cancle = new JButton("取消");
				cancle.setBounds(411, 356, 63, 27);
				panel.add(cancle);
				cancle.addActionListener(this);
			
				}
	
			public void Serializ(List<Person> list) {
				String massgename = "名字："+ name.getText();
				String massgebir = "生日："+ bir.getText();
				String massgephone = "手机："+ phone.getText();
				String massgemail = "电子邮箱："+ mail.getText();
				String massgegroup = "分组："+ group.getText();
				String massgeother = "备注："+ other.getText();
			 Person person = new Person(massgename, massgebir, massgephone, massgemail, massgegroup, massgeother);
			 persons.add(new Person(massgename, massgebir, massgephone, massgemail, massgegroup, massgeother));
			 
			 
				try {												//如果电话簿不存在，创建电话簿
					File file = new File("src/System/phbook.txt");
					if(!file.exists())
					{
						file.createNewFile();
					}
					OutputStream outputStream = new FileOutputStream(file);
					ObjectOutputStream out = new ObjectOutputStream(outputStream);
					out.writeObject(list);
					out.close();
				
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
			}
			}
			
			public void DeSerializ(List<Person> list) {
				try {												//如果电话簿不存在，创建电话簿
					File file = new File("src/System/phbook.txt");
					
					InputStream inputStream = new FileInputStream(file);
					ObjectInputStream in = new ObjectInputStream(inputStream);
					List<Person> person = (List<Person>)in.readObject();
					list = person;
					for(int i = 0; i<list.size();i++){
						System.out.println(file.exists());
						System.out.println(list.get(i).bir);
						System.out.println(list.get(i).phone);
					}
					in.close();
			
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
			}
			}
			

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource()== save){
		    Serializ(persons);
		    DeSerializ(persons);
		}else if(arg0.getSource() == cancle){
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewPersonWin();

	}

}
