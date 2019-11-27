package com.yash.pms;

import static org.mockito.Mockito.times;

import java.util.HashMap;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PmsApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Mock
	HashMap<String,Integer> mckHashMap;

	@Test
	public void saveTest(){
		mckHashMap.put("A",101);
		mckHashMap.put("A",201);
		
		Mockito.verify(mckHashMap,times(2)).put("A",101);
	}

}
