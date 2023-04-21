package aeropuerto;
import java.util.Comparator;

public class ComparatorDestino implements Comparator<Vuelo> {

	@Override
	public int compare(Vuelo vuelo1, Vuelo vuelo2) {
		
		return vuelo1.getDestino().compareTo(vuelo2.getDestino());
	}

}
