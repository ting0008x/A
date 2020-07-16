package System;

import java.io.*;
import java.util.regex.*;

import javax.swing.JOptionPane;

public class FindPeople {
	String name ;
	public static void main(String[] args) {
		FindPeople f = new FindPeople("李四");
		String str = f.find("src/System/data.txt");
	}
	
	FindPeople(String name){
		this.name = name;
	}
	
	public String find(String filePath) {
		StringBuffer stringBuffer = new StringBuffer();
		try {
			File file = new File(filePath);
			Reader in = new FileReader(file);
			BufferedReader read = new BufferedReader(in);
			String str = null;
			
			int count = 0;
			while((str=read.readLine())!=null) {
				count++;
				stringBuffer.append(str+"\n");
				if(count%7==0) {
					String s = getOne(stringBuffer);
					if(s != "") {
						return s;
					}else {
						stringBuffer.delete(0, stringBuffer.length());
					}
					
				}
			}
			read.close();
			in.close();
		}catch(IOException ioe) {
			new JOptionPane().showMessageDialog(null, ioe);
		}
		return stringBuffer.toString();
	}
	
	
	public String getOne(StringBuffer stringBuffer) {
		String re = "姓名 : .+";
		Pattern p =Pattern.compile(re);
		Matcher m = p.matcher(stringBuffer);
		String str = null;
		while(m.find()) {
			str=m.group();
			if(str.equals("姓名 : "+this.name)) {				
				return stringBuffer.toString();
			}else {
				return "";
			}
		}
		return "";
	}
//	public void ShowInEdit(TheSecond theSecond) {
//		
//	}
}
