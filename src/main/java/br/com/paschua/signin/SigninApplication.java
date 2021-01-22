package br.com.paschua.signin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SigninApplication {

    public static void main(String[] args) {
        SpringApplication.run(SigninApplication.class, args);
    }
    
//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//            System.out.println("Beans provided by SpringBoot:");
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//        };
//    }
}
