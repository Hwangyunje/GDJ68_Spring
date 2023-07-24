package com.is.main.notice;

import org.springframework.stereotype.Repository;

public class NoticeDAO {
	@Repository
	public class NoticeDAO{
		@Autowired
		private sqlSession sqlSession;
		
		private final String NAMESPACE="com.is.main.notice.noticeDAO";
		
		
		public List<NoticeDTO> getList() throws Exception{
			return sqlSession.selectList(NAMESPACE+"getList");
		}
	}
	
	
}
