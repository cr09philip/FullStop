package com.zt.fullstop.model;

import java.net.Inet4Address;
import java.net.Inet6Address;

public class msgServerInfo {
	private int _game_type;
	private int _require_type;
	private String _name;
	private int _addr_type;
	private Inet4Address _addr4;
	private Inet6Address _addr6;
	private int _max_count;
	private int _cur_count;
}
