package fsms.com.serviceImpl;

import java.util.Map;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import fsms.com.dao.TestDao;
import fsms.com.service.TestService;

@Service("testService")
public class TestServiceImpl extends EgovAbstractServiceImpl implements TestService {

	@Resource(name="testDao")
	private TestDao testDao;
	
	@Override
	public String testConnection() throws Exception {
		return testDao.testConnection();
	}

	@Override
	public String getName(Map<String, Object> paramMap) throws Exception {
		return testDao.getName(paramMap);
	}

}
