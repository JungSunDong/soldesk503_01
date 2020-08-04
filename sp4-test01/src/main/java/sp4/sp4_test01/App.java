package sp4.sp4_test01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
    	Greeter gr = ctx.getBean("gr", Greeter.class);
    	String msg = gr.greet("정선동");
    	System.out.println(msg);
    	
    	
        System.out.println( "Hello World!" );
    }
}
