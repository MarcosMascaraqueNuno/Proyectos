package aeropuerto;

import java.time.LocalDate;

public interface Vuelo {
	String getDestino();
	Double getPrecio();
	Integer getNumPlazas();
	Integer getNumPasajeros();
	String getCodigo();
	LocalDate getFecha();
	void setNumeroPlazas(Integer numPlazas);
	void setPrecio(double precio);
	

}
