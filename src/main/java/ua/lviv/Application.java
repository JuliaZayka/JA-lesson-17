package ua.lviv;

import java.text.DateFormat;   

import java.text.ParseException;
import java.text.SimpleDateFormat;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.domain.Univercity;
import ua.lviv.service.UnivercityService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws ParseException {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		UnivercityService service = ctx.getBean(UnivercityService.class);

		Univercity univercity = new Univercity();
		univercity.setName("Univer1");
		univercity.setLevel(1);
		univercity.setAmount(100);
		univercity.setAddress("Adress1");

		// save user to DB
         service.save(univercity);
         
        Univercity univercity2 = new Univercity();
 		univercity2.setName("Univer2");
 		univercity2.setLevel(2);
 		univercity2.setAmount(150);
 		univercity2.setAddress("Adress2");

 		// save user to DB
          service.save(univercity2);

          Univercity univercity3 = new Univercity();
   		univercity3.setName("Univer3");
   		univercity3.setLevel(3);
   		univercity3.setAmount(300);
   		univercity3.setAddress("Adress3");

   		// save user to DB
            service.save(univercity3);
		
         // read from DB
		System.out.println(service.findById((Integer) 1));

		System.out.println(service.findByAddress("Address1"));
		
		// update from DB
        Univercity forUpdate = service.findById((Integer) 2);
		forUpdate.setLevel(5);
		service.update(forUpdate);

		// readAll
		service.findAll().stream().forEach(System.out::println);
		
		// delete
		service.deleteById((Integer)2);

	}
}