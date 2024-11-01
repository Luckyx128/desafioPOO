package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso = new Curso("Java","Curso inicial de java",25);
		Mentoria mentoria = new Mentoria("Aula 1","Aula que é a primeira",LocalDate.now());
		System.out.println(curso);
		System.out.println(mentoria);
	}
}
