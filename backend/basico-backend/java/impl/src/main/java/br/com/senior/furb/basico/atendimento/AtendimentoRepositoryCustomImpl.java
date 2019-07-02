package br.com.senior.furb.basico.atendimento;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQuery;

import br.com.senior.furb.basico.FuncionarioEntity;
import br.com.senior.furb.basico.QAtendimentoEntity;
import br.com.senior.furb.basico.QFuncionarioEntity;
import br.com.senior.furb.basico.core.RepositoryBaseJpa;

@Repository
public class AtendimentoRepositoryCustomImpl extends RepositoryBaseJpa implements AtendimentoRepositoryCustom{

	@Override
	public Double findTotalReceitas(LocalDate dataInicial, LocalDate dataFinal) {
		
		QAtendimentoEntity atendimentos = QAtendimentoEntity.atendimentoEntity;
		
		JPAQuery<Double> query = select(atendimentos.valorTotal.sum()).from(atendimentos).where(atendimentos.dataAtendimento.between(dataInicial, dataFinal));
		
		return query.fetch().get(0).doubleValue();
	}

	@Override
	public Double findTotalDespesasFuncionarios(LocalDate dataInicial, LocalDate dataFinal) {
		
		QAtendimentoEntity atendimentos = QAtendimentoEntity.atendimentoEntity;
		QFuncionarioEntity funcionarios = QFuncionarioEntity.funcionarioEntity;
		
		JPAQuery<FuncionarioEntity> q1 = select(atendimentos.funcionario).from(atendimentos).where(atendimentos.dataAtendimento.between(dataInicial, dataFinal));
		
		JPAQuery<Double> q2 = select(funcionarios.salario.sum()).from(funcionarios).where(funcionarios.in(q1));
		
		/*
		JPAQuery<Double> query = select((funcionarios.salario.sum()).divide(funcionarios.countDistinct()))
								.from(funcionarios)
								.innerJoin(atendimentos)
								.on(atendimentos.funcionario.eq(funcionarios))
								.where(atendimentos.dataAtendimento.between(dataInicial, dataFinal));*/

		
		return q2.fetch().get(0).doubleValue();
	}

	@Override
	public Double findTotalLucro(LocalDate dataInicial, LocalDate dataFinal) {
		Double r = this.findTotalReceitas(dataInicial, dataFinal);
		Double d = this.findTotalDespesasFuncionarios(dataInicial, dataFinal);
		return r - d;
	}	
	
}
