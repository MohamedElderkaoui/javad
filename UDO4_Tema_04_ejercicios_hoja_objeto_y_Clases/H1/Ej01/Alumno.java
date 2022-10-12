/**
 * Hoja 1. Ejercicios tema 4: Clases y objetos
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
package Ej01;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

import HojaEstáticosEjerciciosTema4ClasesObjeto.Utilidad;

public class Alumno implements Comparator<Alumno> {
	private String nombre;
	private Integer edad;

	/**
	 * @param nombre
	 * @param edad
	 */
	public Alumno(String nombre, Integer edad) {

		if (nombre != null) {
			if (!nombre.isEmpty()) {
				if (edad > 0) {
					this.nombre = nombre;
					this.edad = edad;
				}
			}
		}

	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre2() {
		return c(20, this.nombre);
	}

	/**
	 * @return the edad
	 */
	public Integer getEdad() {
		return this.edad;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		if (nombre != null) {
			if (nombre.isEmpty()) {
				this.nombre = nombre;
			}
		}
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
//		return String.format("\nAlumno [nombre=%-10s, edad=%-2s]", nombre, edad);
		return String.format("|%s|%s|\n%s", c(20, nombre), c(20, edad),
				String.format("+%s+%s+", c(20, ""), c(20, "")).replace(" ", "-"));
	}

	public static String c(int width, String s) {
		return String.format("%-" + width + "s", String.format("%" + (s.length() + (width - s.length()) / 2) + "s", s));
	}

	public static String c(int width, int s) {
		return String.format("%-" + width + "s",
				String.format("%" + (("" + s).length() + (width - ("" + s).length()) / 2) + "s", s));
	}

	public String toString_table() {
		return String.format("%" + (5 - this.nombre.length()) + "s | %-" + (5 - ("" + this.edad).length()) + "d",
				nombre, edad);
	}

	@Override
	public int compare(Alumno o1, Alumno o2) {
		// TODO Auto-generated method stub
		Comparator<Alumno> C2 = (n1, n2) -> n1.getEdad() - n2.getEdad();
		return 0;
	}

	@Override
	public Comparator<Alumno> reversed() {
		// TODO Auto-generated method stub
		return Comparator.super.reversed();
	}

	@Override
	public Comparator<Alumno> thenComparing(Comparator<? super Alumno> other) {
		// TODO Auto-generated method stub
		return Comparator.super.thenComparing(other);
	}

	@Override
	public <U> Comparator<Alumno> thenComparing(Function<? super Alumno, ? extends U> keyExtractor,
			Comparator<? super U> keyComparator) {
		// TODO Auto-generated method stub
		return Comparator.super.thenComparing(keyExtractor, keyComparator);
	}

	@Override
	public <U extends Comparable<? super U>> Comparator<Alumno> thenComparing(
			Function<? super Alumno, ? extends U> keyExtractor) {
		// TODO Auto-generated method stub
		return Comparator.super.thenComparing(keyExtractor);
	}

	@Override
	public Comparator<Alumno> thenComparingInt(ToIntFunction<? super Alumno> keyExtractor) {
		// TODO Auto-generated method stub
		return Comparator.super.thenComparingInt(keyExtractor);
	}

	@Override
	public Comparator<Alumno> thenComparingLong(ToLongFunction<? super Alumno> keyExtractor) {
		// TODO Auto-generated method stub
		return Comparator.super.thenComparingLong(keyExtractor);
	}

	@Override
	public Comparator<Alumno> thenComparingDouble(ToDoubleFunction<? super Alumno> keyExtractor) {
		// TODO Auto-generated method stub
		return Comparator.super.thenComparingDouble(keyExtractor);
	}

}
