package com.core;

import com.core.couple.Animal;
import com.core.couple.Cat;
import com.core.couple.Dog;
import com.core.couple.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import test.Test;

@SpringBootApplication
@ComponentScan(basePackages = {"test", "com.core.couple"})
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


		Person personBean = context.getBean(Person.class);
		personBean.playWithAnimal();


		Test testBean = context.getBean(Test.class);
		testBean.testing();


		Animal catBean = context.getBean("cat", Animal.class);
		catBean.play();

		Animal dogBean = context.getBean("dog", Animal.class);
		dogBean.play();

	}

}
