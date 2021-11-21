
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Iterator;
import java.util.Random;

public class ReadWriteFile {

	public static void main(String[] args) {
		double [][] arrayGraph = readCSV ();
		printArray(arrayGraph);

	}
	
	public static double [][]  genData (int n) {
		
	
		return res;
	}
	
	public static void writeResult(double [][] result, int dataset) {
		
		
	}
	
	public static double [][] readCSV () {
		
		String file = "graph.csv";
		double [][] graph = null;
		
		try {
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String line = null;
			int row=0;
			int col=0;
			
			while((line=br.readLine())!=null) {
				row++;
				String [] rowLine = line.split(",");
				col = rowLine.length;
			}
			
			graph = new double [row][col];
			
			br = new BufferedReader(new FileReader(file));
			int i=0;
			line = null;
			
			while ((line=br.readLine())!=null) {
				
				String colData [] = line.split(",");
				for (int j=0; j<colData.length; j++) {
					graph[i][j]=Double.parseDouble(colData[j]); 
				}
				i++;
			}
			
		}
		catch (Exception e) {
			System.err.println("Error in reading the file");
		}
		
		return graph;	
	}
	
	public static void printArray (double [][] array) {
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array.length; j++) {
				System.out.print(array[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	

}
