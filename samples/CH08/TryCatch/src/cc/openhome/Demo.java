package cc.openhome;

import java.io.*;
public class Demo {

	public static void main(String[] args) {



	}


	static void doSome(String arg) 
            throws FileNotFoundException, EOFException {
	    try {
	        if("one".equals(arg)) {
	            throw new FileNotFoundException();
	        } else {
	            throw new EOFException();
	        }
	    } catch(IOException ex) {
	        ex.printStackTrace();
	        throw ex;
	    }    
	}

	
	
	

}
