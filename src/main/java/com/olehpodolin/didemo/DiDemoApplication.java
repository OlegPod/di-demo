package com.olehpodolin.didemo;

import com.olehpodolin.didemo.controllers.ConstructorInjectedController;
import com.olehpodolin.didemo.controllers.MyController;
import com.olehpodolin.didemo.controllers.PropertyInjectedController;
import com.olehpodolin.didemo.controllers.SetterInjectedController;
import com.olehpodolin.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());

	}
}
