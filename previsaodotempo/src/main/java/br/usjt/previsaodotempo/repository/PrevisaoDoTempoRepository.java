package br.usjt.previsaodotempo.repository;

import	org.springframework.data.jpa.repository.JpaRepository;	

import br.usjt.previsaodotempo.model.Previsao;

public interface PrevisaoDoTempoRepository extends JpaRepository<Previsao, Integer>
{
	
}
