package ejlee.javatoy.behind;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextInfoTest {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

//    @Test
//    void findAllBean() {
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            Object bean = context.getBean(beanDefinitionName);
//            System.out.println("name = " + beanDefinitionName + "bean = " + bean);
//        }
//    }

    @Test
    void findApplicationBean() {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = context.getBeanDefinition(beanDefinitionName);
            System.out.println("bean" + beanDefinition);
            if (beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                Object bean = context.getBean(beanDefinitionName);
                System.out.println("name = " + beanDefinitionName + "bean = " + bean);
            }
        }

    }
}
