package com.campass.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.campass.demo.dao.POrderItemDao;
import com.campass.demo.entity.pOrderItem;

@SpringBootTest
public class POrderItemDaoTest {

	
	@Autowired
	POrderItemDao dao;
	
	//@Test
	public void dTest() {
		assertNotNull(dao);
	}
	
	// 주문상품 추가
//	@Test
//	public void orderItemSaveTest() {
//		pOrderItem orderItem = pOrderItem .builder().pOrderNo(1). pCode(42). pdtCartAmo(1).pOrderStatus(OrderStatus.구매완료).build();
//		
//		assertEquals(1, dao.orderItemSave(orderItem));
//	}
}
