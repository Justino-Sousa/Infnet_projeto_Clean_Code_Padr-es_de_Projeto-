package br.com.js.enums;

public enum TaxaAssinatura {
	  	
		BASIC(150.20),
	    PREMIUM(200.00),
	    DELUXE(300.00);

	    private double valorTaxa;

	    TaxaAssinatura(double valorTaxa) {
	        this.valorTaxa = valorTaxa;
	    }

	    public double getValorTaxa() {
	        return valorTaxa;
	    }
}
