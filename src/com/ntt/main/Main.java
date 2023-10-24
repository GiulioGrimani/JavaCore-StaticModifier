package com.ntt.main;

import com.ntt.staticexample.MyObj;
import com.ntt.staticexample.Persona;

public class Main {
	public static void main(String[] args) {
		/*
		 * Un membro di una classe dichiarato static e' un membro che e' condiviso da
		 * TUTTE LE ISTANZE della classe. Per questo, vi si accede NON da una
		 * particolare istanza, ma direttamente dalla classe. Si parla quindi di
		 * variabili di istanza (variabili NON static) e variabili di classe (variabili
		 * static)
		 */

		// istanza di MyObj
		MyObj myObj1 = new MyObj("first message");
		MyObj myObj2 = new MyObj("second message");

		// accedo all'attributo dell'istanza
		String istanceVariable1 = myObj1.getMessaggio();
		String istanceVariable2 = myObj2.getMessaggio();
		System.out.println("Valore attributo myObj1: " + istanceVariable1);
		System.out.println("Valore attributo myObj2: " + istanceVariable2);
		System.out.println();

		// accedo all'attributo della classe passando per le istanze
		String myString1 = myObj1.getMyStaticVar();
		String myString2 = myObj2.getMyStaticVar();
		System.out.println("Valore campo della classe passando per una istanza: " + myString2);
		System.out.println("Il campo della classe e' uguale per entrambe le istanze? " + (myString1 == myString2));
		System.out.println();

		// modifico il valore dell'attributo della classe passando
		// correttamente dalla classe
		System.out.println("Cambio il valore del campo static della classe...");
		MyObj.setMyStaticVar("imposto il valore del campo static");
		System.out.println();

		// faccio vedere che ora il valore del campo statico della classe
		// e' cambiato per entrambe le istanze
		myString1 = myObj1.getMyStaticVar();
		myString2 = myObj2.getMyStaticVar();
		System.out.println("Valore campo della classe passando per una istanza: " + myString2);
		System.out.println("Il campo della classe e' uguale per entrambe le istanze? " + (myString1 == myString2));
		System.out.println();

		/*
		 * Caso d'uso: assegno dinamicamente, ovvero alla creazione dell'istanza, un
		 * nuovo id all'istanza di tipo Persona
		 */

		System.out.println("Caso d'uso con istanze di tipo Persona");
		Persona p1 = new Persona("Giulio", "Grimani");
		System.out.println("Stampo id della istanza p1: " + p1.getId());
		System.out.println("Stampo su p1 il valore dell'id statico: " + p1.getStaticId());
		System.out.println("Stampo il valore dell'id statico sulla classe: " + Persona.getStaticId());

		System.out.println();

		Persona p2 = new Persona("Pinco", "Pallo");
		System.out.println("Stampo id della istanza p2: " + p2.getId());
		System.out.println("Stampo su p1 il valore dell'id statico: " + p1.getStaticId());
		System.out.println("Stampo il valore dell'id statico sulla classe: " + Persona.getStaticId());

		// Invoco un metodo static, quindi lo invoco sulla classe e non su
		// una istanza (sebbene funzionerebbe lo stesso)
		Persona.tellMeCurrentClassId();

	}
}
