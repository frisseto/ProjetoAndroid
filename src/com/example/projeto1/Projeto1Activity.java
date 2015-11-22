package com.example.projeto1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Projeto1Activity extends Activity {

	private EditText txtNumero1;
	private EditText txtNumero2;
	private Button btnSomar;
	private Button btnSubtrair;
	private Button btnMultiplicar;
	private Button btnDividir;
	private TextView txtResultadoFinal;
	private double numero1;
	private double numero2;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_projeto1);

		txtNumero1 = (EditText) findViewById(R.id.txtNumero1);
		txtNumero2 = (EditText) findViewById(R.id.txtNumero2);
		btnSomar = (Button) findViewById(R.id.btnSomar);
		btnSubtrair = (Button) findViewById(R.id.btnSubtrair);
		btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
		btnDividir = (Button) findViewById(R.id.btnDividir);
		txtResultadoFinal = (TextView) findViewById(R.id.txtResultadoFinal);
		btnSomar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				numero1 = Double.parseDouble(txtNumero1.getText().toString());
				numero2 = Double.parseDouble(txtNumero2.getText().toString());
				
				Double resultadoSoma = calcularSoma(numero1, numero2);
				txtResultadoFinal.setText(resultadoSoma.toString());
				
			}
		});
		
		btnSubtrair.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				numero1 = Double.parseDouble(txtNumero1.getText().toString());
				numero2 = Double.parseDouble(txtNumero2.getText().toString());
				
				Double resultadoSubtracao = calcularSubtracao(numero1, numero2);
				txtResultadoFinal.setText(resultadoSubtracao.toString());
				
			}
		});
		
		btnMultiplicar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				numero1 = Double.parseDouble(txtNumero1.getText().toString());
				numero2 = Double.parseDouble(txtNumero2.getText().toString());
				
				Double resultadoMultiplicacao = calcularMultiplicacao(numero1, numero2);
				txtResultadoFinal.setText(resultadoMultiplicacao.toString());
				
			}
		});
		
		btnDividir.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				numero1 = Double.parseDouble(txtNumero1.getText().toString());
				numero2 = Double.parseDouble(txtNumero2.getText().toString());
				
				Double resultadoDivisao = calcularDivisao(numero1, numero2);
				txtResultadoFinal.setText(resultadoDivisao.toString());
				
			}
		});

	}

	private double calcularSoma(double n1, double n2) {
		double resultadoSoma = (n1 + n2);
		return resultadoSoma;
	}
	
	private double calcularSubtracao(double n1, double n2) {
		double resultadoSubtracao = (n1 - n2);
		return resultadoSubtracao;
	}
	
	private double calcularMultiplicacao(double n1, double n2) {
		double resultadoMultiplicacao = (n1 * n2);
		return resultadoMultiplicacao;
	}
	
	private double calcularDivisao(double n1, double n2) {
		double resultadoDivisao = (n1 / n2);
		return resultadoDivisao;
	}

}
