package fsms.com.service;

import java.util.Map;

public interface TestService {

	String testConnection() throws Exception;

	String getName(Map<String, Object> paramMap) throws Exception;

}
