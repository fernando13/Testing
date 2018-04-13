package practicos.ejercicio1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	countPositiveTest.class,
	findLastTest.class,
	lastZeroTest.class,
	numZeroTest.class,
	oddOrPosTest.class
})

public class Ejercicio1Test {
	// Para cada programa responda:
	// 1- Cuál es el defecto en el programa?
	// 2- Si es posible, provea un test junit que no ejecute el defecto
	// 3- Si es posible, provea un test junit que ejecute el defecto y no resulte en una falla
	// 4- Si es posible, provea un test junit que ejecute el defecto y produzca una falla
	// 5- Corrija el defecto y vuelva a ejecutar los tests hasta que todos sean exitosos
}
