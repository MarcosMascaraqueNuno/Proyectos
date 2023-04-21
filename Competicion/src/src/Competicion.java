
package src;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Competicion {
	private List<String> equipos;
	private String[][] resultados;
	
	public Competicion() throws IOException{
		leeEquipos();
	}
	private void leeEquipos() throws FileNotFoundExecption {
		this.equipos= new ArrayList<>();
		FileReader fr= new FileReader(new File("./equipos.txt"));
		BufferedReader br= new BufferedReader(fr);
		br.readLine();
		this.equipos= Arrays.asList(br.readLine().split("\\s*,\\s*"));
		br.close();
		fr.close();
	}
}
