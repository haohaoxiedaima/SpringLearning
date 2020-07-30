package Test;

import HelloWorld.MessagePrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import sun.misc.resources.Messages;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application Start......");

        /*MessageService MSservice = new MessageService();
        MessagePrinter MSprinter = new MessagePrinter();

        MSprinter.MSsetter(MSservice);
        MSprinter.MSprint();*/
        /*ApplicationContext mycontext = new AnnotationConfigApplicationContext(Application.class);*/
        ApplicationContext mycontext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessagePrinter printer = mycontext.getBean(MessagePrinter.class);
       // System.out.println(printer);
        
        /*MessageService service = mycontext.getBean(MessageService.class);

        printer.MSsetter(service);*/
        printer.MSprint();

    }
}
