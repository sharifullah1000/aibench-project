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
 * OperationResultsCollector.java
 *
 * This class is part of the AIBench Project.
 * Created inside the SING research group (http://sing.ei.uvigo.es)
 * University of Vigo
 *
 * Created on 11/05/2007
 */
package es.uvigo.ei.aibench.workbench;

import java.util.List;

import es.uvigo.ei.aibench.core.clipboard.ClipboardItem;

/**
 * @author Daniel Glez-Peña
 *
 */
public interface OperationResultsCollector {
	public void resultsGetted(List<ClipboardItem> results);

	
}