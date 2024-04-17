package fsms.com.web;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fsms.com.model.ReturnModel;
import fsms.com.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = {"Test Controller 입니다(**대제목)"}, description = "API 서비스 예시(**소제목)")
@RestController
public class TestController {
	
	@Resource(name = "testService")
	private TestService testService;
	
	@GetMapping(value="/test/test.do")
	public void testConnection() throws Exception {
		String test = testService.testConnection();
		System.out.println("test : " + test);
	}
	
	@ApiOperation(value = "axios 통신테스트(**사용목적)", notes = "front에서 axios로 호출 시 잘 작동 되는지 테스트를 위하여 작성(**설명)")
//	@ApiImplicitParams({
//            @ApiImplicitParam(
//                name = "변수명1"
//                , value = "변수값1"
//                , required = false
//                , dataType = "string"
//                , paramType = "path"
//                , defaultValue = "None"
//            )
//        ,
//            @ApiImplicitParam(
//                name = "변수명2"
//                , value = "변수값2"
//                , required = false
//                , dataType = "string"
//                , paramType = "query"
//                , defaultValue = ""
//            )
//        })
	@ApiResponses({
        @ApiResponse(code=200, message="성공"),
        @ApiResponse(code=401, message="접근 권한이 없습니다.")
	})
	
	@PostMapping(value = "/test/testAxios")
	public ReturnModel testAxios(@RequestBody Map<String,Object> TaxiMap) throws Exception {
		
		ReturnModel returnModel = new ReturnModel();		
		
		String name = testService.getName(TaxiMap);
		returnModel.setContent("name", name);
		returnModel.setCodeAndMessage("taxi.0000");
		
		return returnModel;
	}
}
