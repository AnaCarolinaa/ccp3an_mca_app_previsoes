package br.usjt.previsaodotempo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="previsao")
public class Previsao implements Serializable  
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	int id;
	String diadasemana;
	double temperaturamax;
	double temperaturamin;
	double humidadedoar;
	String descricao; 
	double latitude;
	double longitude;
	String datahora;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getDiadasemana() 
	{
		return diadasemana;
	}
	public void setDiadasemana(String diadasemana) 
	{
		this.diadasemana = diadasemana;
	}
	public double getTemperaturamax() 
	{
		return temperaturamax;
	}
	public void setTemperaturamax(double temperaturamax)
	{
		this.temperaturamax = temperaturamax;
	}
	public double getTemperaturamin() 
	{
		return temperaturamin;
	}
	public void setTemperaturamin(double temperaturamin) 
	{
		this.temperaturamin = temperaturamin;
	}
	public double getHumidadedoar() 
	{
		return humidadedoar;
	}
	public void setHumidadedoar(double humidadedoar) 
	{
		this.humidadedoar = humidadedoar;
	}
	public String getDescricao() 
	{
		return descricao;
	}
	public void setDescricao(String descricao) 
	{
		this.descricao = descricao;
	}
	public double getLatitude() 
	{
		return latitude;
	}
	public void setLatitude(long latitude) 
	{
		this.latitude = latitude;
	}
	public double getLongitude() 
	{
		return longitude;
	}
	public void setLongitude(long longitude) 
	{
		this.longitude = longitude;
	}
	public String getDatahora() 
	{
		return datahora;
	}
	public void setDatahora(String datahora) 
	{
		this.datahora = datahora;
	}
}
