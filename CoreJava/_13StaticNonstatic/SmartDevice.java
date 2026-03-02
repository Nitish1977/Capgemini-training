//package _13StaticNonstatic;
//public class SmartDevice {
//	String deviceName;
//	String os;
//	int battery;
//	public SmartDevice() {
//		this.deviceName="deviceName";
//		this.os="os";
//		this.battery=0;
//	}
//	public SmartDevice(String devicename) {
//		this();
//		this.deviceName=devicename;
//	}
//	public SmartDevice(String os, String dn) {
//		this();
//		this.deviceName=dn;
//		this.os=os;
//	}
//	public SmartDevice(int b, String os, String dn) {
//		this.battery=b;
//		this.deviceName=dn;
//		this.os=os;
//	}
//	public  void details() {
//		System.out.println("device name = "+this.deviceName+", os = "+this.os+", battery = "+this.battery);
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		SmartDevice a=new SmartDevice();
//		a.details();
//		SmartDevice b=new SmartDevice("kulu");
//		b.details();
//		SmartDevice c=new SmartDevice(67,"kulu", "jui");
//		c.details();
//		SmartDevice d=new SmartDevice("gui", "tim");
//		d.details();
//	}
//
//}


package _13StaticNonstatic;
public class SmartDevice {
	String deviceName;
	String os;
	int battery;
	public SmartDevice() {
		this.deviceName="deviceName";
		this.os="os";
		this.battery=0;
	}
	public SmartDevice(String devicename) {
		this();
		this.deviceName=devicename;
	}
	public SmartDevice(String os, String dn) {
		this();
		this.deviceName=dn;
		this.os=os;
	}
	public SmartDevice(int b, String os, String dn) {
		this.battery=b;
		this.deviceName=dn;
		this.os=os;
	}
	public  static void details(SmartDevice thi) {
		System.out.println("device name = "+thi.deviceName+", os = "+thi.os+", battery = "+thi.battery);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartDevice a=new SmartDevice();
		SmartDevice.details(a);
		SmartDevice b=new SmartDevice("kulu");
		SmartDevice.details(b);
		SmartDevice c=new SmartDevice(67,"kulu", "jui");
		SmartDevice.details(c);
		SmartDevice d=new SmartDevice("gui", "tim");
		details(d);
	}

}
