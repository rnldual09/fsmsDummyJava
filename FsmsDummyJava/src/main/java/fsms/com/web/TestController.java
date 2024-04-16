package fsms.com.web;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fsms.com.model.ReturnModel;
import fsms.com.service.TestService;

@RestController
public class TestController {
	
	@Resource(name = "testService")
	private TestService testService;
	
	@GetMapping(value="/test/test.do")
	public void testConnection() throws Exception {
		String test = testService.testConnection();
		System.out.println("test : " + test);
	}
	
	@PostMapping(value = "/test/testAxios")
	public ReturnModel testAxios(@RequestBody Map<String,Object> TaxiMap) throws Exception {
		
		ReturnModel returnModel = new ReturnModel();		
		
		String name = testService.getName(TaxiMap);
		returnModel.setContent("name", name);
		returnModel.setCodeAndMessage("taxi.0000");
		
		return returnModel;
	}
}
