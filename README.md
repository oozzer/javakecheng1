# javakecheng1
javazuoye
#阅读程序
##实验目的
正确理解并能够熟练操作和使用JAVA的类，对象和方法
##实验过程
（1）main方法中创建一个CPU对象cpu，cpu将自己的speed设置为2200
（2）main方法中创建一个HardDisk对象disk，disk将自己的amount设置为200
（3）main方法中创建一个PC对象的pc

##核心方法
（1）pc调用setCPU（CPU c）方法，调用时参数是cpu
（2）pc调用setHardDisk（HardDisk h）方法，调用时参是disk
（3）pc调用show（）方法
（4）把多个类放置在不同的包中，使用public和private方法
public class Test {

	 public static void main(String args[]) {
	       CPU cpu = new CPU();

	       HardDisk HD=new HardDisk();

	       cpu.setSpeed(2200);
	       cpu.setSize(88);

	       HD.setAmount(200);
	       HD.setA(188);
	       

	       PC pc =new PC();

	       pc.setCPU(cpu);

	       pc.setHardDisk(HD);

	       pc.show();

	    }

	}
  package hhxx;

public class PC {
	CPU cpu;

    HardDisk HD;

    void setCPU(CPU cpu) {
        this.cpu = cpu;

    }

     void setHardDisk(HardDisk HD) {
        this.HD = HD;

    }

    void show(){
       System.out.println("CPU速度:"+cpu.gatSpeed());
       System.out.println("CPU大小:"+cpu.getSize());

       System.out.println("硬盘容量:"+HD.getAmount());
       System.out.println("硬盘大小:"+HD.getA());

    }

}
##实验结果
运行结果为Test主类显示结果为CPU速度是2200 硬盘容量是200
##实验感想
我学会了如何建立类和对象，分别输出期中包含的成员值。以及分别引用各方法，实现不同的操作。
在该程序中，我进一步了解了如何定义成员方法和成员属性以及方法的调用，特别是我掌握了利用构造方法对成员属性赋初始值。
