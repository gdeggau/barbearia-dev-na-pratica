package br.com.senior.furb.basico.atendimento;

import java.time.LocalDate;

public interface AtendimentoRepositoryCustom {
	
	Double findTotalReceitasByDataInicial(LocalDate dataAtendimento);
	
}
