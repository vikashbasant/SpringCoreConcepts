package com.core;

import com.core.typeofinjection.Animal;
import com.core.typeofinjection.Person;
import com.core.typeofinjection.Samosa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import test.Test;

@SpringBootApplication
@ComponentScan(basePackages = {"test", "com.core", "com.core.typeofinjection"})
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {

		// => About The Beans:
		// => @Component

		// => About The Dependencies:
		// => @Autowired


		// => Where to scan for Beans:
		// => com.core.couple package:
		// => ComponentScan():


		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);


		Person personBean = context.getBean( Person.class);
		personBean.playWithAnimal();


		Test testBean = context.getBean(Test.class);
		testBean.testing();


		Animal catBean = context.getBean("t-cat", Animal.class);
		catBean.play();

		Animal dogBean = context.getBean("t-dog", Animal.class);
		dogBean.play();




	}




}
