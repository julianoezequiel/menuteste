package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Console 
{
	private static Scanner sc = new Scanner(System.in);
	public static int leInt(String msg)
	{
		int valor = 0;
		boolean valorLido = false;
		do {
		try {
			System.out.println(msg);
			valor = Integer.parseInt(sc.next());
			valorLido = true;
		} catch (Exception e) {
			System.out.println("Somente numeros");
		}
		}while(!valorLido);
		return valor;
	}
	public static String primMaius(String msg)
	{
		String valor = null;
		boolean valorLido = false;
		do 
		{
			try {
				System.out.println(msg);
				valor = sc.next().toLowerCase();
				valorLido = true;
			} catch (Exception e) {
				System.out.println("\n Erro \n");
			}
		}while(!valorLido);
		return valor;
	}
	
	public static double leDouble(String msg)
	{
		double valor = 0;
		boolean valorLido = false;
		do 
		{
			try {
				System.out.println(msg);
				valor = Double.parseDouble(sc.next());
				valorLido = true;
			} catch (Exception e) {
				System.out.println("\n Apenas numeros \n");
			}
		}while(!valorLido);
		return valor;
	}
	
	public static Date transData(String msg)
	{
		Date dataMed = null;
		boolean datalida = false;
		SimpleDateFormat hora = new SimpleDateFormat("dd/MM/yyyy");
		do {
		try {
			System.out.println(msg);
			dataMed = hora.parse(sc.next());
			datalida = true;
		} catch (ParseException e) {
			System.out.println("\n Digite uma data valida! \n");
		}
		}while(!datalida);
		return dataMed;
	}
	
	public static Date transHora(String msg)
	{
		Date dataHor = null;
		boolean horalida = false;
		SimpleDateFormat hora = new SimpleDateFormat("HH:mm");
		do {
		try {
			System.out.println(msg);
			dataHor = hora.parse(sc.next());
			horalida = true;
		} catch (ParseException e) {
			System.out.println("\n Digite uma hora valida! \n");
		}
		}while(!horalida);
		return dataHor;
	}
	
	public static Date transFolha(String msg)
	{
		Date dataMed = null;
		boolean datalida = false;
		SimpleDateFormat hora = new SimpleDateFormat("MM/yyyy");
		do {
		try {
			System.out.println(msg);
			dataMed = hora.parse(sc.next());
			datalida = true;
		} catch (ParseException e) {
			System.out.println("\n Digite uma data valida! \n");
		}
		}while(!datalida);
		return dataMed;
		
	}

}
