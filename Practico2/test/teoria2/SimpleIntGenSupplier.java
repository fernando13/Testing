package teoria2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;


public class SimpleIntGenSupplier extends ParameterSupplier {
	
	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature sig) {
		List<PotentialAssignment> values = new ArrayList<PotentialAssignment>();
		Random rand = new Random();
		for (int i=0; i<5; i++) {
			int k = rand.nextInt();
			values.add(PotentialAssignment.forValue(Integer.toString(k), k));
		}
		return values;
	}
    
}
	
	
