package practicos.ejercicio10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

public class RandomIntGen extends ParameterSupplier {
	
	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature sig) {
		List<PotentialAssignment> values = new ArrayList<PotentialAssignment>();
		Random rand = new Random();
		for (int i=0; i<10; i++) {
			int k = rand.nextInt(10);
			values.add(PotentialAssignment.forValue(Integer.toString(k), k));
		}
		return values;
	}
    
}
