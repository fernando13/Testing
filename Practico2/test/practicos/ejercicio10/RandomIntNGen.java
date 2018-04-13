package practicos.ejercicio10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

public class RandomIntNGen extends ParameterSupplier {
		
	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature sig) {
		RandomIntN annotation = sig.getAnnotation(RandomIntN.class);
		int lst = annotation.last();
		List<PotentialAssignment> values = new ArrayList<PotentialAssignment>();
		Random rand = new Random();
		for (int i=0; i<lst; i++) {
			int k = rand.nextInt();
			values.add(PotentialAssignment.forValue(Integer.toString(k), k));
		}
		return values;
	}
	
}