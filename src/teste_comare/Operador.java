package teste_comare;

public class Operador implements Comparable<Operador> {
	String symbol;
	int freq  = 0;
	
	public Operador(String sy) {
		symbol = sy;
	}
	
	public void setFreq(int freq) {
		this.freq = freq;
	}
	
	@Override
	public String toString() {

		return symbol + " " + freq;
	}
	
	@Override
	public int compareTo(Operador o) {
		if (o == null)
			return -1;
		return (o.freq > this.freq) ? 1 : -1;
	}
}
