package br.com.senior.furb.basico.atendimento;

import java.time.LocalDate;

public interface AtendimentoRepositoryCustom {
	
	Double findTotalReceitas(LocalDate dataInicial, LocalDate dataFinal);
	
	Double findTotalDespesasFuncionarios(LocalDate dataInicial, LocalDate dataFinal);
	
	Double findTotalLucro(LocalDate dataInicial, LocalDate dataFinal);
}
