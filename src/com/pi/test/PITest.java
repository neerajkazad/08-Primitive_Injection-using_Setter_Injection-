package com.pi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pi.beans.Account;

public class PITest {
	public static void main(String[] args) {
		Account account = new Account();
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/pi/common/application-context.xml"));
		account = factory.getBean("account", Account.class);
		System.out.println(account);
	}
}
