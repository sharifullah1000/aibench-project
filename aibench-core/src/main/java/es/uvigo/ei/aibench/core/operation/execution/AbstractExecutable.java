/*
Copyright 2007 Daniel Gonzalez Peña, Florentino Fernandez Riverola


This file is part the AIBench Project. 

AIBench Project is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

AIBench Project is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Lesser Public License for more details.

You should have received a copy of the GNU Lesser Public License
along with AIBench Project.  If not, see <http://www.gnu.org/licenses/>.
*/

/*  
 * AbstractExecutable.java
 * Created inside the SING research group (http://sing.ei.uvigo.es)
 * University of Vigo
 *
 */
package es.uvigo.ei.aibench.core.operation.execution;

import java.util.Arrays;

public abstract class AbstractExecutable implements Executable {

	public static void checkElementsNotNull(Iterable<?> iterable)
			throws IllegalArgumentException {
		for (Object object : iterable) {
			if (object == null)
				throw new IllegalArgumentException(
						"all the elements must be not null");
		}
	}

	public static void checkElementsNotNull(Object... elements) {
		checkElementsNotNull(Arrays.asList(elements));
	}

	public abstract ExecutionSession openExecutionSession(ResultsCollector collector);

}
