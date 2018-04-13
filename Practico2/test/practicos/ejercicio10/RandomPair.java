package practicos.ejercicio10;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.junit.experimental.theories.ParametersSuppliedBy;

@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(RandomPairGen.class)
public @interface RandomPair{
	int n();
}