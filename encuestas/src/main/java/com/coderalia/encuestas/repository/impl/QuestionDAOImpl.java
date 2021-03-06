package com.coderalia.encuestas.repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import com.coderalia.encuestas.domain.Question;
import com.coderalia.encuestas.repository.QuestionDAO;

@Repository
public class QuestionDAOImpl implements QuestionDAO {

	private SessionFactory sessionFactory;
	public List<Question> getAllQuestions() {
		Session session = this.sessionFactory.openSession();
	     List<Question> questionList = session.createQuery("from questions").list();
	     session.close();
	     return questionList;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	

}
