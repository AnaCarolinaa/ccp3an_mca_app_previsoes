package br.usjt.previsaodotempo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.previsaodotempo.model.Previsao;
import br.usjt.previsaodotempo.repository.PrevisaoDoTempoRepository;

@Service
public class PrevisaoDoTempoService 
{
	@Autowired
	private PrevisaoDoTempoRepository previsaoDoTempoRepository;
	
	public void salvar(Previsao previsao)
	{
		previsaoDoTempoRepository.save(previsao);
	}
	
	public List <Previsao> listarTodos()
	{
		return previsaoDoTempoRepository.findAll();
	}
}
