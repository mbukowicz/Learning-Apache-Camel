package example;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ExampleProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        String name = exchange.getIn().getBody(String.class);

        String response = "Hello, " + name + "!";

        exchange.getOut().setBody(response);
    }
}
