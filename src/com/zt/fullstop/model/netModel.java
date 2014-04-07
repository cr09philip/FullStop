package com.zt.fullstop.model;

public class netModel {
	//constant value
	public static final int CMD_UDP_SERVER_CREATE = 0;
	public static final int CMD_UDP_SERVER_CLOSE = 1;
	public static final int CMD_UDP_GET_SERVER = 2;
	public static final int CMD_UDP_SERVER_CHANGE = 3;
	

	
	private int _cmd;
	private int _size;
	
	protected netModel(int cmd){
		this._cmd = cmd;
	}

	public int getCmd() {
		return _cmd;
	}

	public void setCmd(int _cmd) {
		this._cmd = _cmd;
	}

	public int getSize() {
		return _size;
	}

	public void setSize(int _size) {
		this._size = _size;
	}
}
