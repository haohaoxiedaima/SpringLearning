package TestforShiyanlou;

import SpringIOC.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppforPersonCustomer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("PersonCustomerContext.xml");
        Customer customer = (Customer) context.getBean("customer1");
        System.out.println(customer.toString());
    }
}
