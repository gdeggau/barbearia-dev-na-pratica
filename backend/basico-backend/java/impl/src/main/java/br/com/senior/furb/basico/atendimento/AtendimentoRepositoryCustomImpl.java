package br.com.senior.furb.basico.atendimento;

import java.time.LocalDate;

import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQuery;

import br.com.senior.furb.basico.QAtendimentoEntity;
import br.com.senior.furb.basico.core.RepositoryBaseJpa;

@Repository
public class AtendimentoRepositoryCustomImpl extends RepositoryBaseJpa implements AtendimentoRepositoryCustom{

	@Override
	public Double findTotalReceitasByDataInicial(LocalDate dataAtendimento) {
		
		QAtendimentoEntity atendimentos = QAtendimentoEntity.atendimentoEntity;
		
		JPAQuery<Double> query = select(atendimentos.valorTotal.sum()).from(atendimentos).where(atendimentos.dataAtendimento.after(dataAtendimento));
		
		return query.fetch().get(0).doubleValue();
	}	
	
}
