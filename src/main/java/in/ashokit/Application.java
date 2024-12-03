package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("hii");
                   int i = 10;
 		SpringApplication.run(Application.class, args);
                   int j = 20;
                System.out.println(i);
                   int k = 30;
                System.out.println(j);

                char gender = 'M';
                int age = 20;

		boolean isSave = false;
		boolean isUpdate = true;

                String name = "ashokit";
                double  price = 123.90;

	}

        // jira 102
        public void m2(){
                //logic
        }
}
