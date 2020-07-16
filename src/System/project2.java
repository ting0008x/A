package System;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTree;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class project2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project2 frame = new project2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public project2() {
		setTitle("\u901A\u8BAF\u5F55");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 1, 0, 0));
		setLocationRelativeTo(getOwner());    //窗口显示在中间
		JPanel Myaddbook = new JPanel();
		contentPane.add(Myaddbook);
		Myaddbook.setLayout(new GridLayout(1, 2, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		Myaddbook.add(scrollPane);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("分组") {
				{
					DefaultMutableTreeNode tree1,tree2,tree3;
					tree1 = new DefaultMutableTreeNode("家人");
					tree1.add(new DefaultMutableTreeNode("爸爸"));
					tree1.add(new DefaultMutableTreeNode("妈妈"));
					tree1.add(new DefaultMutableTreeNode("哥哥"));
					tree1.add(new DefaultMutableTreeNode("姐姐"));
					add(tree1);
					
						tree2 = new DefaultMutableTreeNode("朋友");
						tree2.add(new DefaultMutableTreeNode("小强"));
						tree2.add(new DefaultMutableTreeNode("小刚"));
						tree2.add(new DefaultMutableTreeNode("小红"));
						tree2.add(new DefaultMutableTreeNode("小李"));
					add(tree2);
						tree3 = new DefaultMutableTreeNode("同学");
						tree3.add(new DefaultMutableTreeNode("张三"));
						tree3.add(new DefaultMutableTreeNode("李四"));
						tree3.add(new DefaultMutableTreeNode("王五"));
					add(tree3);
				}
			}
		));
		scrollPane.setViewportView(tree);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		Myaddbook.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setEnabled(false);
		scrollPane_1.setViewportView(textArea);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		b1 = new JButton("新建联系人");
		b1.setBounds(64, 39, 113, 27);
		panel.add(b1);
		b1.addActionListener(this);
		
	    b2 = new JButton("删除联系人");
		b2.addActionListener(this);
		b2.setBounds(355, 39, 113, 27);
		panel.add(b2);
		
		b3 = new JButton("编辑");
		b3.addActionListener(this);
		b3.setBounds(64, 119, 113, 27);
		panel.add(b3);
		
		b4 = new JButton("退出");
		b4.addActionListener(this);
		b4.setBounds(355, 119, 113, 27);
		panel.add(b4);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
				if (e.getSource()==b1) {
					new NewPersonWin();
				}else if(e.getSource()==b2){
//					DetPeoson();
				}else if(e.getSource()==b3){
//					Edit();
				}else if(e.getSource()==b4){
					System.exit(0);
				}

			}
}
				
		
	

	

