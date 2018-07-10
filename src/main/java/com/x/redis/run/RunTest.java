package com.x.redis.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.x.redis.dao.UserDAO;
import com.x.redis.pojo.User;

public class RunTest {

	public static void main(String[] args) {
       ApplicationContext cxt=new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
       UserDAO userDAO=(UserDAO) cxt.getBean("userDAO");
       User user1=new User();
       user1.setId("1");
       user1.setName("obama");
       userDAO.saveUser(user1);
       User user2=userDAO.getUser("1");
       System.out.println(user2.getName());
       
	}

}
