package com.sabbir.springcore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MediaTek implements MobileProcessor {

	public void process() {
		System.out.println("Second Best processor");

	}

}
