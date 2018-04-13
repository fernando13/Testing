package practicos.ejercicio10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

import practicos.ejercicio6.Pair;

public class RandomPairGen extends ParameterSupplier {
	
	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature sig) {
		RandomPair annotation = sig.getAnnotation(RandomPair.class);
		int lst = annotation.n();
		List<PotentialAssignment> values = new ArrayList<PotentialAssignment>();
		Random rand = new Random();
		for (int i=0; i<lst; i++) {
			Pair k = new Pair((int)rand.nextInt(10),(int)rand.nextInt(10));
			values.add(PotentialAssignment.forValue(k.toString(), k));
		}
		Pair k = new Pair((int)0,(int)0);
		values.add(PotentialAssignment.forValue(k.toString(), k));
		return values;
	}
	
}