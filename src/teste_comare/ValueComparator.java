package teste_comare;

import java.util.Comparator;
import java.util.Map;

class ValueComparator implements Comparator<String> {

    Map<String, Operador> base;
    public ValueComparator(Map<String, Operador> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with equals.    
    public int compare(String a, String b) {
        if (base.get(a).freq >= base.get(b).freq) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}
