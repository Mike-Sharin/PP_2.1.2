import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat catBean1 = applicationContext.getBean("cat", Cat.class);
        System.out.println(catBean1.getMessage());
        Cat catBean2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(catBean2.getMessage());

        System.out.println("Сравнение bean helloWold: " + (bean == bean2));
        System.out.println("Сравнение bean cat: " + (catBean1 == catBean2));
    }
}