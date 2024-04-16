package fsms.com.util;

import org.springframework.context.ApplicationContext;

public class BeanUtil {
	
	public static Object getBean(String beanName) {
		ApplicationContext ac = ApplicationContextProvider.getApplicationContext();
		return ac.getBean(beanName);
	}
}
