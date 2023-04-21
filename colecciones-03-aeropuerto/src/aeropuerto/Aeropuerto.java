package aeropuerto;

import java.time.LocalDate;

public interface Aeropuerto {
	
	//añade vuelo
	void addVuelo(Vuelo vuelo);
	void removeVuelo (Vuelo vuelo);
	Integer getVuelosFecha(LocalDate fecha);
	Integer getVuelosCompletos();
	Double getRecaudacionDestino(String destino);
	Vuelo getVueloBaratoDestino(String destino);
	Vuelo getVueloMasLibre(String destino);
	Vuelo getVueloMasOcupado(LocalDate fecha);
	void aumentarPrecio(int porcentaje, LocalDate fecha);
	
	
}
