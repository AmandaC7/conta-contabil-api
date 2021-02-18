package com.gft.contacontabil.database;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import com.gft.contacontabil.domain.Lancamento;
import com.gft.contacontabil.dto.Statistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/lancamentos-contabeis")
public class LancamentoResource {

	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	
	@GetMapping
	public List<Lancamento> listar() {
		return lancamentoRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void criar(@RequestBody Lancamento lancamento) {
		lancamentoRepository.save(lancamento);
		
	}
	
	@GetMapping("/{Id}")
	public ResponseEntity<?> buscarPeloId(@PathVariable Long Id, HttpServletResponse response) {
		Optional<Lancamento> lancamentos = lancamentoRepository.findById(Id);

		return !lancamentos.isEmpty() ? ResponseEntity.ok(lancamentos) : ResponseEntity.notFound().build();

	}

	@GetMapping("/stats")
	public Statistics getStats(){
		return new Statistics(listar());
	}
	
//	
//	@DeleteMapping("/{Id}")
//	@ResponseStatus(HttpStatus.NO_CONTENT)	
//	public void remover(@PathVariable Long Id) {
//		lancamentoRepository.deleteById(Id);
//	}
	
	
}








