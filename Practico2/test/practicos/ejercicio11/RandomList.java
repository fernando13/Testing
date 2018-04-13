package practicos.ejercicio11;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.junit.experimental.theories.ParametersSuppliedBy;

@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(RandomListGen.class)
public @interface RandomList {
	int n();
}

