package practicos.ejercicio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import practicos.ejercicio11.SinglyLinkedList;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

public class RandomListGen extends ParameterSupplier {
	
	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature sig) {
		RandomList annotation = sig.getAnnotation(RandomList.class);
		int n = annotation.n();
		List<PotentialAssignment> values = new ArrayList<PotentialAssignment>();
		Random rand = new Random();
		for (int i=0; i<n; i++) {
		
			int size = (int)rand.nextInt(10);	//Longitud de la lista
			SinglyLinkedList list = new SinglyLinkedList();
			
			for(int j=0; j<size; j++){
				list.addFirst((int)rand.nextInt(10));	
			}
			
			values.add(PotentialAssignment.forValue(list.toString(), list));
		}
		return values;
	}
	
}