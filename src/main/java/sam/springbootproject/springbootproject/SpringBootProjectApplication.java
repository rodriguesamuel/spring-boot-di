package sam.springbootproject.springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sam.springbootproject.springbootproject.controllers.MyController;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(SpringBootProjectApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In main method");

		System.out.println(controller.sayHello());
	}

}
