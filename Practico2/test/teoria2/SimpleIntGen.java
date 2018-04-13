package teoria2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


import org.junit.experimental.theories.ParametersSuppliedBy;

@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(SimpleIntGenSupplier.class)
public @interface SimpleIntGen {

}


