package teoria2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;


public class IntBetweenSupplier extends ParameterSupplier {
	
	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature sig) {
		IntBetween annotation = sig.getAnnotation(IntBetween.class);
		int fst = annotation.first();
		int lst = annotation.last();
		List<PotentialAssignment> values = new ArrayList<PotentialAssignment>();
		Random rand = new Random();
		for (int i=0; i<100; i++) {
			int k = rand.nextInt(lst) + fst;
			values.add(PotentialAssignment.forValue(Integer.toString(k), k));
		}
		return values;
	}
	
}
	
	
