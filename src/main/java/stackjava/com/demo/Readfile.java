package stackjava.com.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Readfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String data = FileUtils.readFileToString(new File("a.txt"), "UTF-8");
		System.out.println(data);

	}

}
