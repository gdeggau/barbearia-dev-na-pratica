package br.com.senior.furb.basico.core;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.querydsl.core.Tuple;
import com.querydsl.core.types.EntityPath;
import com.querydsl.core.types.Expression;
import com.querydsl.jpa.impl.JPAQuery;

public class RepositoryBaseJpa {
	
	@PersistenceContext
	protected EntityManager entityManager;

	public <U> JPAQuery<U> select(Expression<U> expr){
		return new JPAQuery<U>(entityManager).select(expr);
	}
	
	public JPAQuery<Tuple> select(Expression<?>... exprs){
		return new JPAQuery<>(entityManager).select(exprs);
	}
	
	public <U> JPAQuery<U> from (EntityPath<U> entityPath){
		return select(entityPath).from(entityPath);
	}
}
