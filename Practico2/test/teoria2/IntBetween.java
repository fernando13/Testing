package teoria2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


import org.junit.experimental.theories.ParametersSuppliedBy;

@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(IntBetweenSupplier.class)
public @interface IntBetween {
	int first();
	int last();
}


