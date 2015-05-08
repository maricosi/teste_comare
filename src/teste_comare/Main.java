package teste_comare;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		
		HashMap<String, Operador> ops = new HashMap<String, Operador>();
        ValueComparator bvc =  new ValueComparator(ops);
		TreeMap<String, Operador> sorted_ops = new TreeMap<String, Operador>(bvc);
		
		Operador op =  new Operador("+");
		ops.put("Add", op);
		op.setFreq(10);
		
		Operador op2 = new Operador("-");
		ops.put("Sub", op2);
		op2.setFreq(15);
		
		Operador op3 = new Operador("/");
		ops.put("Div", op3);
		op3.setFreq(1);
		
		
		
		for (Operador o : ops.values()) {
			System.out.println(o);
			
		}
		
		System.out.println("===================");
		
		sorted_ops.putAll(ops);
		
		
		for (Operador o : sorted_ops.values()) {
			System.out.println(o);
			
		}
		
		
		
		
	}
	
	
}
