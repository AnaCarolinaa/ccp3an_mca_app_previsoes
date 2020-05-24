package br.usjt.previsaodotempo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.previsaodotempo.model.Previsao;
import br.usjt.previsaodotempo.repository.PrevisaoDoTempoRepository;
import br.usjt.previsaodotempo.service.PrevisaoDoTempoService;

@Controller
public class PrevisaoDoTempoController 
{
	@Autowired
	private PrevisaoDoTempoService previsaoDoTempoService;
	
	@Autowired
	public PrevisaoDoTempoController(PrevisaoDoTempoService previsaoDoTempoService)
	{
		this.previsaoDoTempoService = previsaoDoTempoService;
	}
	
	@GetMapping("/previsao")
	public ModelAndView listaPrevisaoDoTempo()
	{
		ModelAndView modelAndView = new ModelAndView("lista_previsao");
		modelAndView.addObject(new Previsao());
		List<Previsao> previsao = previsaoDoTempoService.listarTodos();
		modelAndView.addObject("previsao", previsao);
		return modelAndView;
	}
	
	@PostMapping("/previsao")
	public String salvar(Previsao previsao)	
	{	
		 previsaoDoTempoService.salvar(previsao);
		 return	"redirect:/previsao";	
	}		
}
