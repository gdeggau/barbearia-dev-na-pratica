package br.com.senior.furb.basico.atendimento;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senior.furb.basico.TotalReceitas;
import br.com.senior.furb.basico.TotalReceitasInput;
import br.com.senior.furb.basico.TotalReceitasOutput;
import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class HandlerTotalReceitasImpl implements TotalReceitas{
	
	@Autowired
	AtendimentoRepositoryCustom atendimentoRepositoryCustom;

	@Override
	public TotalReceitasOutput totalReceitas(TotalReceitasInput request) {

		TotalReceitasOutput dados = new TotalReceitasOutput();
		
		Double receita = atendimentoRepositoryCustom.findTotalReceitasByDataInicial(request.dataAtendimento);
		
		if(receita > 0 ) {
			dados.totalRecebido = receita;
			dados.message = "Total recebido!";
		}else {
			dados.message = "Não forma encontradas receitas a partir desta data!";
		}
		
		return dados;
	}

}
