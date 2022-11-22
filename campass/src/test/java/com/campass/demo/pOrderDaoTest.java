package com.campass.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.campass.demo.dao.POrderDao;
import com.campass.demo.entity.PdtOrder;

@SpringBootTest
public class pOrderDaoTest {

	@Autowired
	POrderDao orderDao;
	
	//@Test
	public void diTest() {
		assertNotNull(orderDao);
	}
	
	//주문처리 (테스트필요)
	@Test
	public void orderSaveTest() {
		
		PdtOrder porder = PdtOrder.builder().username("spring").shipName("주문자명").build();
		assertEquals(1, orderDao.orderSave(porder));
	}
	

}
