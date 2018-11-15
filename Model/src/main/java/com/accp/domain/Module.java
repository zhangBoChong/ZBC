package com.accp.domain;

import java.util.List;

public class Module {
	private int mid;
	private String cname;
	private String ename;
	private String url;
	private int type;
	private int parentid;
	
	public int getParentid() {
		return parentid;
	}
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	private List<Module> mlist;
	
	
	public List<Module> getMlist() {
		return mlist;
	}
	public void setMlist(List<Module> mlist) {
		this.mlist = mlist;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
