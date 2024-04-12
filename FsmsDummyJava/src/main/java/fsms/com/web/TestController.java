package fsms.com.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import fsms.com.service.TestService;

@Controller
public class TestController {
	
	@Resource(name = "testService")
	private TestService testService;
	
	@GetMapping(value="/test/test.do")
	public void testConnection() throws Exception {
		String test = testService.testConnection();
		System.out.println("test : " + test);
	}
	
}
