package com.is.main.coment;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.is.main.util.Pager;
@Repository
public class ComentDAO {
		@Autowired
		private SqlSession sqlSession;
		
		private final String NAMESPACE="com.is.main.coment.comentDAO.";
		
		public List<ComentDTO> getComentList(Map<String, Object> map)throws Exception{
			return sqlSession.selectList(NAMESPACE+"getComentList",map);
		}
	
		public Long getComentTotal (ComentDTO comentDTO)throws Exception{
			return sqlSession.selectOne(NAMESPACE+"getTotal",comentDTO);
		}
}
