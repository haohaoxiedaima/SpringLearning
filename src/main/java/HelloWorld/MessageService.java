package HelloWorld;

import org.springframework.stereotype.Component;

//@Component
public class MessageService {
    public MessageService() {
        super();
        System.out.println("MessageService......");
    }

    public String GetMessage(){
        return new String("Hello World!");
    }
}
