import java.io.File;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) {
		format("asdas.ttl");
	}
	public static String format(String str){
		String [] array = str.split("\\.");
		String format = array[array.length-1];
		System.out.println("format ==> "+format);
		return format;
	}
	
}