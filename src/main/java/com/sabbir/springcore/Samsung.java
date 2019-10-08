package com.sabbir.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

	//@Autowired
	//@Qualifier("snapDragon")
	MobileProcessor cpu;
	
	
	  public Samsung() {
	  
	  }
	 
	  @Autowired
	public void SetObj(MediaTek cpu) {
		//super();
		this.cpu = cpu;
	}

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Octa core, 4Gb ram, 12MP camera.");
		cpu.process();
	}
}
