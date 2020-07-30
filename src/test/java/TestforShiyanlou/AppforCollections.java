package TestforShiyanlou;


import Collections.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppforCollections {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionsContext.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer.getLists().toString());

        System.out.println(customer.getSets().toString());

        System.out.println(customer.getMaps().toString());

        System.out.println(customer.toString());
    }
}
