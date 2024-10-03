package com.core;

import com.core.beanscope.Pepsi;
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


//		Person personBean = context.getBean( Person.class);
//		personBean.playWithAnimal();
//
//
//		Test testBean = context.getBean(Test.class);
//		testBean.testing();
//
//
//		Animal catBean = context.getBean("t-cat", Animal.class);
//		catBean.play();
//
//		Animal dogBean = context.getBean("t-dog", Animal.class);
//		dogBean.play();



//		// => Bean Scope: for Singleton Scope
//		// Only one Bean is created.
//		Pepsi pepsiBean = context.getBean(Pepsi.class);
//		System.out.println(pepsiBean); // Pepsi@339ea70
//		pepsiBean.drink();
//
//
//		Pepsi pepsiBean1 = context.getBean(Pepsi.class);
//		System.out.println(pepsiBean1); // Pepsi@339ea70
//		pepsiBean1.drink();


//		// => Bean Scope: for Prototype Scope
//		// Only every time a new instance of Bean is created.
//
//		// first request for the pepsi bean:
//		Pepsi pepsiBean = context.getBean(Pepsi.class);
//		System.out.println(pepsiBean); // Pepsi@33daf016
//		pepsiBean.drink();
//
//
//		// second request for the pepsi bean:
//		Pepsi pepsiBean1 = context.getBean(Pepsi.class);
//		System.out.println(pepsiBean1); // Pepsi@ee82dd0d
//		pepsiBean1.drink();


	}




}
