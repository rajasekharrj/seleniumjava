package com.practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class readfileinputstream {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fs=null;
		Properties prop=null;
		
		fs=new FileInputStream(new File("C:\\Users\\Admin\\eclipse-workspace\\Project1\\propertyfiles\\readfileinputstream"));
        prop =new Properties();
        prop.load(fs);
        
        System.out.println(prop.get("Url"));
        System.out.println(prop.get("userName"));
        System.out.println(prop.get("Password"));
        System.out.println(prop.get("email"));
	}

}
