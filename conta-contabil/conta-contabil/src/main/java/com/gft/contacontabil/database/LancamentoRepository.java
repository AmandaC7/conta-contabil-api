package com.gft.contacontabil.database;

import com.gft.contacontabil.domain.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
