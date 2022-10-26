package com.eon.spring.springcoreadvanced.injecting.interfaces.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBOImpl implements OrderBO {

	@Autowired
	@Qualifier("dao1")
	private OrderDAO dao;

	@Override
	public void placeOrder() {
		System.out.println("Inside orderBO");
		dao.createOrder();
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}


/* Two class OrderDAOImpl and OrderDAOImpl2 implements through same interface so. while using need to specifiy correct bean name 
 * otherwise we will get error as  
Unsatisfied dependency expressed through field 'dao'; nested exception 
is org.springframework.beans.factory.NoUniqueBeanDefinitionException

to solve this need to diffrent bean name for each class which imolements same interface
by using @Component("dao1")
         @Component("dao2")
         
         
         by using @Qualifier we will get this value
*/
