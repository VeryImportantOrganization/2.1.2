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
        System.out.println(bean2.getMessage());

        Cat kitty = (Cat) applicationContext.getBean("cat");
        System.out.println(kitty.getCatVoice());
        Cat tom = (Cat) applicationContext.getBean("cat");
        System.out.println(tom.getCatVoice());

        System.out.println("HelloWorld's beans equal: " + (bean == bean2));
        System.out.println("Cat's beans equal: " + (kitty == tom));
    }
}