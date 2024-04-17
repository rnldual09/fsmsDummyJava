package fsms.com.model;

import java.util.HashMap;
import java.util.Map;
import egovframework.com.cmm.EgovMessageSource;
import fsms.com.util.BeanUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="리턴모델입니다")
public class ReturnModel {
	
	private EgovMessageSource egovMessageSource = (EgovMessageSource) BeanUtil.getBean("egovMessageSource");
	
	@ApiModelProperty(value="설명1", example="예시1", required=true)
	private Map<String,Object> content = new HashMap<>();
	
	@ApiModelProperty(value="설명2", example="예시2", required=false)
	private String codeAndMessage;
	
	@ApiModelProperty(value="설명3", example="예시3", required=false)
	private String code;
	
	public Map<String, Object> getContent() {
		return content;
	}
	public void setContent(Map<String, Object> content) {
		this.content = content;
	}
	public void setContent(String key, String value) {
		this.content.put(key, value);
	}
	public String getCodeAndMessage() {
		return codeAndMessage;
	}
	public void setCodeAndMessage(String codeAndMessage) {
		this.codeAndMessage = egovMessageSource.getMessage(codeAndMessage);
		this.code = codeAndMessage;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}