package br.com.senior.furb.basico.atendimento;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senior.furb.basico.TotalDespesasInput;
import br.com.senior.furb.basico.TotalDespesasOutput;
import br.com.senior.furb.basico.TotalLucro;
import br.com.senior.furb.basico.TotalLucroInput;
import br.com.senior.furb.basico.TotalLucroOutput;
import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class HandlerTotalLucroImpl implements TotalLucro{
	
	@Autowired
	AtendimentoRepositoryCustomImpl atendimentoRepositoryCustom;


	@Override
	public TotalLucroOutput totalLucro(TotalLucroInput request) {
		TotalLucroOutput dados = new TotalLucroOutput();
		
		
		Double lucro = atendimentoRepositoryCustom.findTotalLucro(request.dataInicial, request.dataFinal);
		dados.totalLucro = lucro;
		if(lucro > 0) {
			dados.message = "Total lucro: "+dados.totalLucro;
		}else {
			dados.message = "Esse mês fechou no prejuízo, saldo de: "+dados.totalLucro;
		}
		
		return dados;
	}

}
