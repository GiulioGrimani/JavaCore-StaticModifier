package com.ntt.staticexample;

public class MyObj {

	// variabili di istanza della classe
	private String messaggio;

	// variabile della classe (ovvero condivisa da tutte le istanze della classe)
	private static String myStaticVar = "messaggio iniziale";

	public MyObj(String messaggio) {
		this.messaggio = messaggio;
	}

	public String getMessaggio() {
		return messaggio;
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

	public static String getMyStaticVar() {
		return myStaticVar;
	}

	public static void setMyStaticVar(String myStaticVar) {
		MyObj.myStaticVar = myStaticVar;
	}

	@Override
	public String toString() {
		return "MyObj [messaggio=" + messaggio + "]";
	}

}
