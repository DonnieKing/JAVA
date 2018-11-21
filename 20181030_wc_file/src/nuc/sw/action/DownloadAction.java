package nuc.sw.action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport {
	
	private String inputPath;
	private String contentType;
	private String downFileName;
	public String getInputPath() {
		return inputPath;
	}
	public void setInputPath(String inputPath) throws UnsupportedEncodingException {
		this.inputPath = new String(inputPath.getBytes("iso-8859-1"),"utf-8");
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getDownFileName() {
		return downFileName;//重新编码，确保在struts.xml文件中取出时不会出中文丢失（乱码）的问题
	}
	public void setDownFileName(String downFileName) throws UnsupportedEncodingException {
		this.downFileName = new String(downFileName.getBytes("iso-8859-1"),"utf-8");
	}
	
	public InputStream getTargetFile() throws FileNotFoundException{
		InputStream is = new FileInputStream(inputPath);
		return is;
	}
	
}
