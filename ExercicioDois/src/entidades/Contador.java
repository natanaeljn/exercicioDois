package entidades;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Contador {

	NumberFormat df = new DecimalFormat("#0.00");

	private Double numero;

	public Contador() {
		super();
	}

	public Double getNumero() {
		return numero;
	}

	public void setNumero(Double numero) {
		this.numero = numero;
	}

	/* metodo que calcula o total de cedulas */
	public Integer totalCedula(Double num, Integer ced) {
		Integer n = (int) (num / ced);
		return n;

	}

	/* metodo que calcula total de moedas */
	public Integer totalMoedas(Double num, Double ced) {
		Integer n = (int) (num / ced);
		return n;

	}

	/* metodo que auxilia para diminuir o valor */
	public Double numeroTotal(Integer n, Double cedula) {
		Double tot = n * cedula;
		return tot;
	}

	/* formatador decimal em duas casas */
	public Double formatadorDecimal(Double numero) {
		String str = df.format(numero);
		return numero = Double.parseDouble(str);
	}

	public String verificador(Double numero) {

		String cem = "0 nota(s) de R$ 100.00";
		String cinquentao = "0 nota(s) de R$ 50.00";
		String vinte = "0 nota(s) de R$ 20.00";
		String dez = "0 nota(s) de R$ 10.00";
		String cinco = "0 nota(s) de R$ 5.00";
		String dois = "0 nota(s) de R$ 2.00";
		String um = "0 nota(s) de R$ 1.00";
		String cinquentaCentavos = "0 moeda(s) de R$ 0.50";
		String vinteCentavos = "0 moeda(s) de R$ 0.20";
		String dezCentavos = "0 moeda(s) de R$ 0.10";
		String cincoCentavos = "0 moeda(s) de R$ 0.05";
		String umCentavo = "0 moeda(s) de R$ 0.01";
		while (numero != 0) {
			if (numero >= 100) {
				cem = this.totalCedula(numero, 100) + "  nota(s) de R$ 100.00";
				numero -= this.numeroTotal(this.totalCedula(numero, 100), 100.00);
				numero = this.formatadorDecimal(numero);
			} else if (numero >= 50) {
				cinquentao = this.totalCedula(numero, 50) + "  nota(s) de R$ 50.00";
				numero -= this.numeroTotal(this.totalCedula(numero, 50), 50.00);
				numero = this.formatadorDecimal(numero);
			} else if (numero >= 20) {
				vinte = this.totalCedula(numero, 20) + "  nota(s) de R$ 20.00";
				numero -= this.numeroTotal(this.totalCedula(numero, 20), 20.00);
				numero = this.formatadorDecimal(numero);
			} else if (numero >= 10) {
				dez = this.totalCedula(numero, 10) + "  nota(s) de R$ 10.00";
				numero -= this.numeroTotal(this.totalCedula(numero, 10), 10.00);
				numero = this.formatadorDecimal(numero);
			} else if (numero >= 5) {
				cinco = this.totalCedula(numero, 5) + "  nota(s) de R$ 5.00";
				numero -= this.numeroTotal(this.totalCedula(numero, 5), 5.00);
				numero = this.formatadorDecimal(numero);
			} else if (numero >= 2) {
				dois = this.totalCedula(numero, 2) + "  nota(s) de R$ 2.00";
				numero -= this.numeroTotal(this.totalCedula(numero, 2), 2.00);
				numero = this.formatadorDecimal(numero);
			} else if (numero >= 1) {
				um = this.totalCedula(numero, 1) + "  moeda(s) de R$ 1.00";
				numero -= this.numeroTotal(this.totalCedula(numero, 1), 1.00);
				numero = this.formatadorDecimal(numero);
			} else if (numero >= 0.50) {
				cinquentaCentavos = this.totalMoedas(numero, 0.50) + "  moeda(s) de R$ 0.50";
				numero -= this.numeroTotal(this.totalMoedas(numero, 0.50), 0.50);
				numero = this.formatadorDecimal(numero);
			} else if (numero >= 0.25) {
				vinteCentavos = this.totalMoedas(numero, 0.25) + "  moeda(s) de R$ 0.25";
				numero -= this.numeroTotal(this.totalMoedas(numero, 0.25), 0.25);
				numero = this.formatadorDecimal(numero);
			} else if (numero >= 0.10) {
				dezCentavos = this.totalMoedas(numero, 0.10) + "  moeda(s) de R$ 0.10";
				numero -= this.numeroTotal(this.totalMoedas(numero, 0.10), 0.10);
				numero = this.formatadorDecimal(numero);
			} else if (numero >= 0.05) {
				cincoCentavos = this.totalMoedas(numero, 0.05) + "  moeda(s) de R$ 0.05";
				numero -= this.numeroTotal(this.totalMoedas(numero, 0.05), 0.05);
				numero = this.formatadorDecimal(numero);
			} else if (numero >= 0.01) {
				umCentavo = this.totalMoedas(numero, 0.01) + "  moeda(s) de R$ 0.01";
				numero -= this.numeroTotal(this.totalMoedas(numero, 0.01), 0.01);
				numero = this.formatadorDecimal(numero);
			}

		}

		return "Notas : " + "\r\n" + cem + "\r\n" + cinquentao + "\r\n" + vinte + "\r\n" + dez + "\r\n" + cinco + "\r\n"
				+ dois + "\r\n" + "Moedas: \r\n " + um + "\r\n" + cinquentaCentavos + "\r\n" + vinteCentavos + "\r\n"
				+ dezCentavos + "\r\n" + cincoCentavos + "\r\n" + umCentavo;
	}

}
