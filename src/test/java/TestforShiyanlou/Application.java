package TestforShiyanlou;

import HelloShiyanlou.Helloworld;
import loosely_coupled.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("OutputGeneratorContext.xml");
        OutputHelper output = (OutputHelper) context.getBean("outputhelper");
        output.GenOutput();

    }
}
