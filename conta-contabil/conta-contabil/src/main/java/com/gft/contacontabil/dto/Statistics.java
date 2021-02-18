package com.gft.contacontabil.dto;


import com.gft.contacontabil.domain.Lancamento;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter @Setter
public class Statistics {

	private BigDecimal soma;
	private BigDecimal min;
	private BigDecimal max;
	private int quantidade;

	public Statistics(List<Lancamento> lancamentos) {
		this.soma = BigDecimal.valueOf(lancamentos.stream().map(Lancamento::getValor).mapToDouble(v -> v.doubleValue()).sum());

		this.min = BigDecimal.valueOf(lancamentos.stream().map(Lancamento::getValor).mapToDouble(v -> v.doubleValue()).min().orElse(0));
		this.max = BigDecimal.valueOf(lancamentos.stream().map(Lancamento::getValor).mapToDouble(v -> v.doubleValue()).max().orElse(0));

		this.quantidade = (int) lancamentos.stream().map(Lancamento::getId).mapToInt(v -> (int) v.longValue()).count();

	}


}
