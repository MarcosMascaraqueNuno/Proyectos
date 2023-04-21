package aeropuerto;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class VueloImp implements Vuelo, Comparable<Vuelo>{
	private String destino;
	private Double precio;
	private Integer numPlazas;
	private Integer numPasajeros;
	private String codigo;
	private LocalDate fecha;
	
	
	
	
	
	public VueloImp(String destino, Double precio, Integer numPlazas, Integer numPasajeros, String codigo,
			LocalDate fecha) throws IllegalArgumentException{
		if (destino==null) 
		{
			throw new IllegalArgumentException("Destino nulo");
		}
		this.destino = destino;
		this.precio = precio;
		this.numPlazas = numPlazas;
		this.numPasajeros = numPasajeros;
		this.codigo = codigo;
		this.fecha = fecha;
	}
	
	
	public VueloImp(String vuelo) throws IllegalArgumentException
	{
		String [] propiedad= vuelo.split(", ");
		if (propiedad.length!=6) 
		{
			throw new IllegalArgumentException("Cadena vuelo invalida");
		}
		String destino=propiedad[0].trim();
		/*
		if (propiedad.length!=6) 
		{
			List<String> []propiedad=Arrays.asList(vuelo.split(", "))
		}
		String destino = propiedad.get[0].trimp();
		*/
		
	}
	@Override
	public String getDestino() {
		return destino;
	}
	@Override
	public Double getPrecio() {
		return precio;
	}
	@Override
	public Integer getNumPlazas() {
		return numPlazas;
	}
	
	@Override
	public Integer getNumPasajeros() {
		return numPasajeros;
	}
	@Override
	public String getCodigo() {
		return codigo;
	}
	@Override
	public LocalDate getFecha() {
		return fecha;
	}
	@Override
	public void setNumeroPlazas(Integer numPlazas) {
		this.numPlazas=numPlazas;

	}
	@Override
	public void setPrecio(double precio) {
		this.precio=precio;
		
	}

	
	
	@Override
	public int compareTo(Vuelo vuelo) {
		int r = this.fecha.compareTo(vuelo.getFecha());
		if (r==0) 
		{
			r = this.codigo.compareTo(vuelo.getCodigo());
		}
		return r;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo, fecha);
	}
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		VueloImp other = (VueloImp) o;
		return Objects.equals(codigo, other.codigo) && Objects.equals(fecha, other.fecha);
	}
	
	
	
}
