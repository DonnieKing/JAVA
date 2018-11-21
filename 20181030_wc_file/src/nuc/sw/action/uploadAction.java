package nuc.sw.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.opensymphony.xwork2.ActionSupport;

import nuc.sw.entity.FileItem;

public class uploadAction extends ActionSupport{
	private String title;
	private List<File> upload;
	private List<String> uploadFileName;
	private List<String>  uploadContentType;
	private String  savePath;
	
private List<FileItem> fileItems = new ArrayList<FileItem>();
	
	public List<FileItem> getFileItems() {
		return fileItems;
	}

	public void setFileItems(List<FileItem> fileItems) {
		this.fileItems = fileItems;
	}
 
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<File> getUpload() {
		return upload;
	}

	public void setUpload(List<File> upload) {
		this.upload = upload;
	}

	public List<String> getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(List<String> uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public List<String> getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(List<String> uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getSavePath() {
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(upload);
		System.out.println(uploadFileName);
		System.out.println(uploadContentType);
		//上传文件
		FileItem fileItem;
		 
		for(int i=0;i<upload.size();i++) {
		 String realPath =savePath+"/"+ UUID.randomUUID()+"_"+uploadFileName.get(i);
		 FileInputStream fis = new FileInputStream(upload.get(i));
		 FileOutputStream fos = new FileOutputStream(realPath);
		 byte[] buf = new byte[1024];
		 int len = 0;
		 if((len=fis.read(buf))>0)
		 {
			 fos.write(buf,0,len);
		 }
		 getUploadFileName().set(i,realPath);
		//将上传文件的相关信息封装到模型，并添加到集合中
			fileItem = new FileItem();
			fileItem.setFileName(uploadFileName.get(i));
			fileItem.setFilePath(realPath);
			fileItem.setContentType(uploadContentType.get(i));
			fileItems.add(fileItem);
		}
		return "uploadOK";
	}
}
