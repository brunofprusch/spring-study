import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Server {

	public static void main(String[] args) {

		try {
	           ApplicationContext context = new ClassPathXmlApplicationContext("/spring-core.xml");
	           Object lock = new Object();
	           synchronized (lock) {
	               lock.wait();  
	           }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
}
