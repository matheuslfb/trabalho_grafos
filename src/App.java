import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		/*Scanner entrada = new Scanner(System.in);
		
		int nodo;
		Grafo g=null;
		try {
			g = new Grafo("src\\gr3_3105.txt");
		} catch (IOException e) {
			System.out.println("Imposs�vel ler grafo!");
		}
		System.out.println(g);
		
		System.out.println("Informe o nodo:\n");
		nodo = entrada.nextInt();
		System.out.println("Grau de sa�da nodo: " + g.grauDeSaida(nodo));
		System.out.println("Grau de entrada nodo: " + g.grauDeEntrada(nodo));
		System.out.println("Vertice mais proximo: " + g.getAdjacenteProximo(nodo));
		System.out.println("Arestas: " + g.getArestas());*/



		ArrayList<CiaAerea> listAirlines = null;
        try {

            BufferedReader in = new BufferedReader(new FileReader(new File("src\\data\\airlines.dat")));
            System.out.println("File open successful!");
            listAirlines = new ArrayList<>();
            in.readLine();
            String line;
            while ((line = in.readLine()) != null) {
                String[] temp;
                String delimiter = ";";
                temp = line.split(delimiter);
                CiaAerea airline = new CiaAerea();
                airline.codigo = temp[0];
                airline.nome = temp[1];
                listAirlines.add(airline);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler airlines.dat");
        }
        
//        for(CiaAerea a: listAirlines){
//        	System.out.println(a);
//        }
        
        
        ArrayList<Pais> listPais = null;
        try {

            BufferedReader in = new BufferedReader(new FileReader(new File("src\\data\\countries.dat")));
            System.out.println("File open successful!");
            listPais = new ArrayList<>();
            in.readLine();
            String line;
            while ((line = in.readLine()) != null) {
                String[] temp;
                String delimiter = ";";
                temp = line.split(delimiter);
                Pais pais = new Pais();
                pais.codigo = temp[0];
                pais.nome = temp[1];
                listPais.add(pais);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler countries.dat");
        }
        
//        for(Pais p : listPais){
//        	System.out.println(p);
//        }  
        
        ArrayList<Aeroporto> listAero = null;
        try {

            BufferedReader in = new BufferedReader(new FileReader(new File("src\\data\\airports.dat")));
            System.out.println("File open successful!");
            listAero = new ArrayList<>();
            in.readLine();
            String line;
            while ((line = in.readLine()) != null) {
                String[] temp;
                String delimiter = ";";
                temp = line.split(delimiter);
                Aeroporto a = new Aeroporto();
                a.codAero = temp[0];
                a.latitude = (Double.parseDouble(temp[1]));
                a.longitude = (Double.parseDouble(temp[2]));
                a.nome = temp[3];
               a.codPais = (temp[4]);
                listAero.add(a);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler airports.dat");
        }
        
//       for(Aeroporto p : listAero){
//       	System.out.println(p);
//       }
        
        
        ArrayList<Rota> listRota = null;
        try {

            BufferedReader in = new BufferedReader(new FileReader(new File("src\\data\\routes.dat")));
            System.out.println("File open successful!");
            listRota = new ArrayList<>();
            in.readLine();
            String line;
            while ((line = in.readLine()) != null) {
                String[] temp;
                String delimiter = ";";
                temp = line.split(delimiter);
                Rota r = new Rota();
                r.origem = temp[0];
                r.destino = temp[1];
                r.distancia = Double.parseDouble(temp[2]);
                r.codCiaa = temp[3];
                listRota.add(r);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler routes.dat");
        }
        
       for(Rota r : listRota){
        	System.out.println(r);
        }
        
        
		
	}

}