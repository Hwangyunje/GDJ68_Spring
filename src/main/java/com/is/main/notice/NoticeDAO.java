package com.is.main.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.is.main.bankBook.BankBookDTO;
import com.is.main.bankBook.BankBookFileDTO;
import com.is.main.notice.NoticeDTO;
import com.is.main.util.Pager;
@Repository
public class NoticeDAO {
	

		@Autowired
		private SqlSession sqlSession;
		
		private final String NAMESPACE="com.is.main.notice.NoticeDAO.";
		
		public Long getTotal(Pager pager) throws Exception{
			return sqlSession.selectOne(NAMESPACE+"getTotal",pager);
		}
		
		public List<NoticeDTO> getList(Pager pager) throws Exception{
			return sqlSession.selectList(NAMESPACE+"getList",pager);
		}
	
		public int setAdd (NoticeDTO noticeDTO) throws Exception{
			return sqlSession.insert(NAMESPACE+"setAdd", noticeDTO);
		}
		public int setFileAdd(NoticeFileDTO noticeFileDTO)throws Exception{
			return sqlSession.insert(NAMESPACE+"setFileAdd", noticeFileDTO);
		}

		
		public NoticeDTO getDetail (NoticeDTO noticeDTO) throws Exception{
			
			return sqlSession.selectOne(NAMESPACE+"getDetail",noticeDTO);	
		}
		public int setUpdate(NoticeDTO noticeDTO) throws Exception{
			return sqlSession.update(NAMESPACE+"setUpdate", noticeDTO);
		}
		public int setDelete (Long No) throws Exception{
			 return sqlSession.delete(NAMESPACE+"setDelete", No);
		}	
		
	
}
