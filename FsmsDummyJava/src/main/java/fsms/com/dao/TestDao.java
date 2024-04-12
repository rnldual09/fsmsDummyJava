package fsms.com.dao;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;

@Repository("testDao")
public class TestDao extends EgovComAbstractDAO {

	public String testConnection() throws Exception {
		return selectOne("testDao.testConnection", null);
	}

}
