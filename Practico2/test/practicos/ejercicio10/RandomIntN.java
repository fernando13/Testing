package practicos.ejercicio10;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.junit.experimental.theories.ParametersSuppliedBy;

@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(RandomIntNGen.class)
public @interface RandomIntN {
	int last();
}