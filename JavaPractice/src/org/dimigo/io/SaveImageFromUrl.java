package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;



public class SaveImageFromUrl {
	
	public static void main(String[] args) {
		
		String imageUrl = "https://www.google.co.kr/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0CAMQjRxqFQoTCPa-oaOJ2MgCFYItpgodIFEHbg&url=http%3A%2F%2Fwww.fmkorea.com%2F41324732&psig=AFQjCNH7ruplvhOMAemHwi6fw2qAZvctBw&ust=1445671802526196";
		try{
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/logo.png")){
				int result;
				byte[] buf = new byte[100];
				
				while((result = is.read(buf)) != -1){
					os.write(buf, 0, result);
				}
				System.out.println("파일 생성 완료!");
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		
		
	
	
	
	
	
	
	
	
	
	
	}

}
