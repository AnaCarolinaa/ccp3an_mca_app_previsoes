package br.usjt.previsaodotempo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import br.usjt.previsaodotempo.repository.PrevisaoDoTempoRepository;
import br.usjt.previsaodotempo.model.Previsao;

@Controller
public class PrevisaoDoTempoController 
{
	@Autowired
	private PrevisaoDoTempoRepository previsaoDoTempoRepository;
	
	@GetMapping("/previsao")
	public ModelAndView listaPrevisaoDoTempo()
	{
		ModelAndView modelAndView = new ModelAndView("lista_previsao");
		List<Previsao> previsao = previsaoDoTempoRepository.findAll();
		modelAndView.addObject("previsao", previsao);
		return modelAndView;
	}
	
	@PostMapping("/previsao")
	public String salvar(Previsao previsaoDoTempo)	
	{	
		 previsaoDoTempoRepository.save(previsaoDoTempo);	
		 return	"redirect:/previsao";	
	}		
}
