package fsms.com.model;

import java.util.HashMap;
import java.util.Map;
import egovframework.com.cmm.EgovMessageSource;
import fsms.com.util.BeanUtil;

public class ReturnModel {
	
	private EgovMessageSource egovMessageSource = (EgovMessageSource) BeanUtil.getBean("egovMessageSource");
	private Map<String,Object> content = new HashMap<>();
	private String codeAndMessage;
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