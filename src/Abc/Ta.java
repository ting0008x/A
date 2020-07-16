package Abc;
import java.util.Arrays;
import java.util.Random;
import java.io.*;
public class Ta {
	public int[] getRandmNum(int max,int amount) {
		int randomNum[] = new int[amount];
		Random random = new Random();
		for(int i=0;i<amount;i++) {
			randomNum[i] = random.nextInt(max)+1;
		}		
		return randomNum;
	}
	
	public void writeToFile(int num[]) {
		try {
			File file = new File("src/a.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			FileOutputStream outputStream = new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(outputStream);
			out.writeObject(num);
		}catch(Exception e) {}
	}
	
	
	public int[] getNumFromFile() {
		int num[] = null ;
		try{
			File file = new File("src/a.txt");
			FileInputStream inputStream = new FileInputStream(file);
			ObjectInputStream  in = new ObjectInputStream(inputStream);
			num = (int[])in.readObject();
		}catch(Exception e) {}
		return num;
	}
	
	
	
	public static void main(String[] args) {
		Ta t = new Ta();
		int num[] = t.getRandmNum(10000, 5000);
		t.writeToFile(num);
		num = t.getNumFromFile();
		System.out.println(Arrays.toString(num));
		
		int min = num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i] < min) {
				min = num[i];
			}	
		}
		System.out.println("最小的:"+min);
		int max = num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i] > min) {
				min = num[i];
			}	
		}
		System.out.println("最大的:"+min);
	}
}
