package com.dl.scope.singleton;

public class Honda {

	private int vno;
	private String vname;
	
	public int getVno() {
		return vno;
	}
	public void setVno(int vno) {
		this.vno = vno;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	
	@Override
	public String toString() {
		return "Honda [vno=" + vno + ", vname=" + vname + "]";
	}
	
}