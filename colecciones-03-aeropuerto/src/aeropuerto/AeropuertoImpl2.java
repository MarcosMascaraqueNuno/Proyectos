package aeropuerto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class AeropuertoImpl2 implements Aeropuerto  {

	private String nombre;
	private SortedSet<Vuelo> vuelos;
	
	public AeropuertoImpl2(String nombre) 
	{
		this.nombre=nombre;
		//this.vuelos=new TreeSet<>();
		this.vuelos = new TreeSet<>(new ComparatorDestino());
		
	}

	@Override
	public void addVuelo(Vuelo vuelo) {
		this.vuelos.add(vuelo);
		
	}

	@Override
	public void removeVuelo(Vuelo vuelo) {
		this.vuelos.remove(vuelo);
		
	}

	@Override
	public Integer getVuelosFecha(LocalDate fecha) {
		int vuelosFecha=0;
		for(Vuelo vuelo : this.vuelos){
			   if (vuelo.getFecha()==fecha) 
			   {
				  vuelosFecha++;
			   }
			}
		return vuelosFecha;
		
	}

	@Override
	public Integer getVuelosCompletos() {
		int vuelosCompletos=0;
		for(Vuelo vuelo : this.vuelos){
			   if (vuelo.getNumPlazas()==vuelo.getNumPasajeros()) 
			   {
				   vuelosCompletos++;
			   }
			}
		return vuelosCompletos;
		
	}

	@Override
	public Double getRecaudacionDestino(String destino) {
		double recaudacionDestino = 0;
		for(Vuelo vuelo : this.vuelos){
			   if (vuelo.getDestino()==destino) 
			   {
				   int numPasajerosVuelo=vuelo.getNumPasajeros();
				   double precioVuelo=vuelo.getPrecio();
				   recaudacionDestino=numPasajerosVuelo*precioVuelo;
			   }
			}
		return recaudacionDestino;
		
	}

	@Override
	public Vuelo getVueloBaratoDestino(String destino) {
		 Vuelo[] vuelos = this.vuelos.toArray(new Vuelo[this.vuelos.size()]);
		 ArrayList<Vuelo> vuelosDestino = new ArrayList<Vuelo>();
		 Vuelo vueloMasBarato = null;
		 
		 for (int i=0; i<vuelos.length; i++) 
		 {
			 if (vuelos[i].getDestino()==destino)
			 {
				 vuelosDestino.add(vuelos[i]);
			 }
		 }
		 
		 double precioVueloMasBarato=vuelosDestino.get(0).getPrecio();
		 
		 for (int i=0; i<vuelosDestino.size(); i++) 
		 {
			 if (vuelosDestino.get(i).getPrecio()<precioVueloMasBarato)
			 {
				 precioVueloMasBarato=vuelosDestino.get(i).getPrecio();
				 vueloMasBarato=vuelosDestino.get(i);
			 }
		 }
		 
		return vueloMasBarato;
		 
	}

	@Override
	public Vuelo getVueloMasLibre(String destino) {
		Vuelo[] vuelos = this.vuelos.toArray(new Vuelo[this.vuelos.size()]);
		 ArrayList<Vuelo> vuelosDestino = new ArrayList<Vuelo>();
		 Vuelo vueloMasLibre = null;
		 
		 for (int i=0; i<vuelos.length; i++) 
		 {
			 if (vuelos[i].getDestino()==destino)
			 {
				 vuelosDestino.add(vuelos[i]);
			 }
		 }
		 
		 int cantidadPasajerosVuelo=vuelosDestino.get(0).getNumPasajeros();
		 
		 for (int i=0; i<vuelosDestino.size(); i++) 
		 {
			 if (vuelosDestino.get(i).getNumPasajeros()<cantidadPasajerosVuelo)
			 {
				 cantidadPasajerosVuelo=vuelosDestino.get(i).getNumPasajeros();
				 vueloMasLibre=vuelosDestino.get(i);
			 }
		 }
		 
		return vueloMasLibre;
	}

	@Override
	public Vuelo getVueloMasOcupado(LocalDate fecha) {
		Vuelo[] vuelos = this.vuelos.toArray(new Vuelo[this.vuelos.size()]);
		 ArrayList<Vuelo> vuelosFecha = new ArrayList<Vuelo>();
		 Vuelo vueloMasOcupado = null;
		 
		 
		 for (int i=0; i<vuelos.length; i++) 
		 {
			 if (vuelos[i].getFecha()==fecha)
			 {
				 vuelosFecha.add(vuelos[i]);
			 }
		 }
		 
		
		double mayorPorcentaje = vuelosFecha.get(0).getNumPasajeros()/vuelosFecha.get(0).getNumPlazas();
		 
		 for (int i=0; i<vuelosFecha.size(); i++) 
		 {
			 if ((vuelosFecha.get(i).getNumPasajeros()/vuelosFecha.get(i).getNumPlazas())>mayorPorcentaje)
			 {
				 mayorPorcentaje=vuelosFecha.get(i).getNumPasajeros()/vuelosFecha.get(i).getNumPlazas();
				 vueloMasOcupado=vuelosFecha.get(i);
			 }
		 }
		 
		return vueloMasOcupado;
	}

	@Override
	public void aumentarPrecio(int porcentaje, LocalDate fecha) {
		
		 for(Vuelo vuelo : this.vuelos)
		 {
			  if (vuelo.getFecha()==fecha) 
			  {
				  double aumento=1+(porcentaje/100);
				  double precio_final=vuelo.getPrecio()+aumento;
				  vuelo.setPrecio(precio_final);
			  }
		 }
		
	}

}
