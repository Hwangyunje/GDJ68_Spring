package com.is.main.Board.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.is.main.bankBook.BankBookDTO;
import com.is.main.bankBook.BankBookFileDTO;
import com.is.main.Board.BoardDAO;
import com.is.main.Board.BoardDTO;
import com.is.main.Board.notice.NoticeDTO;
import com.is.main.util.Pager;
@Repository
public class NoticeDAO implements BoardDAO{
	

		@Autowired
		private SqlSession sqlSession;
		
		private final String NAMESPACE="com.is.main.Board.notice.NoticeDAO.";
		@Override
		public Long getTotal(Pager pager) throws Exception{
			return sqlSession.selectOne(NAMESPACE+"getTotal",pager);
		}
		@Override
		public List<NoticeDTO> getList(Pager pager) throws Exception{
			return sqlSession.selectList(NAMESPACE+"getList",pager);
		}
		@Override
		public int setAdd (BoardDTO boardDTO) throws Exception{
			return sqlSession.insert(NAMESPACE+"setAdd", boardDTO);
		}
		@Override
		public int setFileAdd(NoticeFileDTO noticeFileDTO)throws Exception{
			return sqlSession.insert(NAMESPACE+"setFileAdd", noticeFileDTO);
		}

		@Override
		public NoticeDTO getDetail (BoardDTO boardDTO) throws Exception{
			
			return sqlSession.selectOne(NAMESPACE+"getDetail",boardDTO);	
		}
		@Override
		public int setUpdate(BoardDTO boardDTO) throws Exception{
			return sqlSession.update(NAMESPACE+"setUpdate", boardDTO);
		}
		@Override
		public int setDelete (BoardDTO boardDTO) throws Exception{
			 return sqlSession.delete(NAMESPACE+"setDelete", boardDTO);
		}	
		
	
}
