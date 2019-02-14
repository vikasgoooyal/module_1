import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class CopyDataThread extends Thread{
	
	@Override
	public void run() {
		
		
		String sourcePath="C:\\Source.txt";
		String destinationPath="C:\\Destination.txt";
		
		int i=0;
		try {  
			FileWriter fileWriter = new FileWriter(destinationPath);
			FileReader fileReader = new FileReader(sourcePath);

			int ch = fileReader.read();
		    while(ch != -1) {
//		        System.out.print((char)ch);-
		        ch = fileReader.read();
		        fileWriter.write(ch);
		        i++;
		        if(i %10 == 0) {
		        	System.out.println("10 characters are copied");
		        	Thread.sleep(5000);
		        }
		    }
		    fileReader.close();
		    fileWriter.close();
		} catch (FileNotFoundException e) {
		    System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("IO Exception");
		} catch (InterruptedException e) {
			System.out.println("Int Exception");
		}
		
		
	}
}
public class Problem1 {

	public static void main(String[] args) {
		
		CopyDataThread cp = new CopyDataThread();
		Thread thread = new Thread(cp);
		thread.start();
		
//		String absolutePath="C:\\Source.txt";
//		try(FileReader fileReader = new FileReader(absolutePath)) {  
//		    int ch = fileReader.read();
//		    while(ch != -1) {
//		        System.out.print((char)ch);
//		        ch = fileReader.read();
//		    }
//		} catch (FileNotFoundException e) {
//		    // exception handling
//		} catch (IOException e) {
//		    // exception handling
//		}
	}
}
