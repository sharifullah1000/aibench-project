/*
 * #%L
 * The AIBench basic runtime and plugin engine
 * %%
 * Copyright (C) 2006 - 2017 Daniel Glez-Peña and Florentino Fdez-Riverola
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */
package es.uvigo.ei.aibench.repository;

/**
 * Exception thrown when an instance that should have been initialized is not.
 * 
 * @author Miguel Reboiro Jato
 *
 */
public class NotInitializedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NotInitializedException() {
	}

	public NotInitializedException(String message) {
		super(message);
	}

	public NotInitializedException(Throwable cause) {
		super(cause);
	}

	public NotInitializedException(String message, Throwable cause) {
		super(message, cause);
	}

}
