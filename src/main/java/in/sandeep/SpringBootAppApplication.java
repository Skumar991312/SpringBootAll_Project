package in.sandeep;


import in.sandeep.util.PwdUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootAppApplication {

    public static void main(String[] args) {



       ConfigurableApplicationContext context= SpringApplication.run(SpringBootAppApplication.class, args);

        System.out.println(context.getClass().getName());

    }
        @Bean
        public PwdUtils getinstamce(){

            return new PwdUtils();
        }
    }


