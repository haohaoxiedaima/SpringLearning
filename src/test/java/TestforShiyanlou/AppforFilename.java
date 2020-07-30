package TestforShiyanlou;

import SpringIOC.FilenameGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppforFilename {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("FilenameGenContext.xml");
        System.out.println("finish0");
        FilenameGenerator gen = (FilenameGenerator)context.getBean("FilenameGenerator");
        gen.printFilename();
        System.out.println("finish");
    }
}
