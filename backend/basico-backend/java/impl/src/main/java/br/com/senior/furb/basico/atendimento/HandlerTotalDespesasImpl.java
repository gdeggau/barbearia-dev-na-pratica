package br.com.senior.furb.basico.atendimento;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senior.furb.basico.TotalDespesas;
import br.com.senior.furb.basico.TotalDespesasInput;
import br.com.senior.furb.basico.TotalDespesasOutput;
import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class HandlerTotalDespesasImpl implements TotalDespesas{
	
	@Autowired
	AtendimentoRepositoryCustomImpl atendimentoRepositoryCustom;

	@Override
	public TotalDespesasOutput totalDespesas(TotalDespesasInput request) {

		TotalDespesasOutput dados = new TotalDespesasOutput();
		
		Double despesa = atendimentoRepositoryCustom.findTotalDespesasFuncionarios(request.dataInicial, request.dataFinal);
		
		if(despesa > 0) {
			dados.totalGastos = despesa;
			dados.message = "Total gasto: "+dados.totalGastos;
		}else {
			dados.message = "Não houve despesas neste período!";
		}
		
		return dados;
	}

}
