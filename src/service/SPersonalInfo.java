package service;
import java.util.ArrayList;

import valueObject.VPersonalInfo;

public class SPersonalInfo extends Stub{

	private ArrayList<String> sendList;
	
	public SPersonalInfo() {
		sendList = new ArrayList<String>();
	}
	
	public void saveVPersonalInfo(VPersonalInfo vPersonalInfo) {
		sendList.add("vPersonalInfo");
		sendList.add("setId");
		sendList.add(vPersonalInfo.getId());
		
		sendList.add("vPersonalInfo");
		sendList.add("setPassword");
		sendList.add(vPersonalInfo.getPassword());
		
		sendList.add("vPersonalInfo");
		sendList.add("setName");
		sendList.add(vPersonalInfo.getName());
	}
	
	public void saveWriteMethod() {
		sendList.add("sPersonalInfo");
		sendList.add("write");
		sendList.add("");
	}
	
	public void sendPersonalInfo(VPersonalInfo vPersonalInfo) {
		this.saveVPersonalInfo(vPersonalInfo);
		this.saveWriteMethod();
		
		this.send(sendList);
		System.out.println(sendList.get(0));
	}
	


}
