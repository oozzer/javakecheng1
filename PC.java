package PC;

import C.CPU;
import H.HardDisk;

public class PC {
	private double  cpu;
	private int HD;
	public void setCPU(CPU c){
		cpu=c.speed;
	}
	public void setHardDisk(HardDisk h){
	HD=h.amount;

}
public void show(){
	System.out.println("cpu的速度："+cpu);
	System.out.println("硬盘的容量："+HD);
}
}