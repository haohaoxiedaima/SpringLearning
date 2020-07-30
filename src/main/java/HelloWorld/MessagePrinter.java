package HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class MessagePrinter {
    private MessageService MS;

    public MessagePrinter() {
        super();
        System.out.println("MessagePrinter......");
    }

    //@Autowired
    /*public void MSsetter(MessageService MS){
        this.MS = MS;
    }*/

    public void MSprint(){
        System.out.println(MS.GetMessage());
    }

    public void setMS(MessageService ms) {
        this.MS = ms;
    }
}
