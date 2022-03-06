import java.io.File;
public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
    File file = new File("File.txt");
    if(file.createNewFile()) {
    	System.out.println("File Created:" + file.getName());
    }
    else {
    	System.out.println("File already exists.");
    }
     
	}
		catch(Exception e) {
			System.out.println("File already EXISTS.");
		}
	}
}
