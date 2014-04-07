/**
 * 
 */
/**
 * @author ss
 *
 */
package com.zt.net;

class udpUtils{
	private static udpUtils mInstance;
	private udpUtils(){
		
	}
	
	static udpUtils instance(){
		synchronized (mInstance) {
			if(mInstance == null){
				synchronized (udpUtils.class) {
					mInstance = new udpUtils();
				}
			}
		}
		return mInstance;
	}
}