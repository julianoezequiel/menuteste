package controllers;

import java.util.ArrayList;
import java.util.Date;

import models.CalculoDiario;

public class CalculoDiarioController {

	private static ArrayList<CalculoDiario> diarias = new ArrayList<CalculoDiario>();
	
	public static ArrayList<CalculoDiario> listar(){
		return diarias;
	}
	
	public static boolean cadastrar(CalculoDiario calculo) {
		for(CalculoDiario calculoEncontrado : listar()) {
			if(calculoEncontrado.getData().equals(calculo.getData())) {
				return false;
			}
		}
		diarias.add(calculo);
		return true;
	}
	
	public static double calcular(double minTrab, double valorHora) {
		return (minTrab/60) * valorHora;
	}
	
	public static ArrayList<CalculoDiario> listarPorDia(Date data){
		ArrayList<CalculoDiario> calculosDia = new ArrayList<CalculoDiario>();
		for(CalculoDiario calculoEncontrado : listar()) {
			if(calculoEncontrado.getData().equals(data)) {
				calculosDia.add(calculoEncontrado);
			}
		}
		return calculosDia;
	}
}
