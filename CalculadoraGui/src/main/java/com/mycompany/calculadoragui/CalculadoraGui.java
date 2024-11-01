/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoragui;

/**
 *
 * @author grone
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGui extends JFrame {
    private JTextField display;
    private double valor1, valor2;
    private String operacao;

    public CalculadoraGui() {
        initComponents();
    }

    private void initComponents() {
        // Criação dos componentes
        display = new JTextField();
        JButton btnSoma = new JButton("+");
        JButton btnSubtracao = new JButton("-");
        JButton btnMultiplicacao = new JButton("*");
        JButton btnDivisao = new JButton("/");
        JButton btnQuadrado = new JButton("x²");
        JButton btnCubo = new JButton("x³");
        JButton btnRaiz = new JButton("√");
        JButton btnFatorial = new JButton("!");
        JButton btnClear = new JButton("C");

        // Configurações do display
        display.setEditable(false);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        add(display, "North");

        JPanel panel = new JPanel();
        add(panel, "Center");

        // Adicionar os botões ao painel
        panel.add(btnSoma);
        panel.add(btnSubtracao);
        panel.add(btnMultiplicacao);
        panel.add(btnDivisao);
        panel.add(btnQuadrado);
        panel.add(btnCubo);
        panel.add(btnRaiz);
        panel.add(btnFatorial);
        panel.add(btnClear);

        // Adicionando eventos aos botões
        btnSoma.addActionListener(e -> setOperacao("+"));
        btnSubtracao.addActionListener(e -> setOperacao("-"));
        btnMultiplicacao.addActionListener(e -> setOperacao("*"));
        btnDivisao.addActionListener(e -> setOperacao("/"));
        btnQuadrado.addActionListener(e -> calcularQuadrado());
        btnCubo.addActionListener(e -> calcularCubo());
        btnRaiz.addActionListener(e -> calcularRaiz());
        btnFatorial.addActionListener(e -> calcularFatorial());
        btnClear.addActionListener(e -> display.setText(""));

        // Configurações da Janela
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void setOperacao(String op) {
        valor1 = Double.parseDouble(display.getText());
        operacao = op;
        display.setText("");
    }

    private void calcularResultado() {
        valor2 = Double.parseDouble(display.getText());
        double resultado = 0;

        switch (operacao) {
            case "+":
                resultado = valor1 + valor2;
                break;
            case "-":
                resultado = valor1 - valor2;
                break;
            case "*":
                resultado = valor1 * valor2;
                break;
            case "/":
                resultado = valor1 / valor2;
                break;
        }
        display.setText(String.valueOf(resultado));
    }

    private void calcularQuadrado() {
        valor1 = Double.parseDouble(display.getText());
        display.setText(String.valueOf(valor1 * valor1));
    }

    private void calcularCubo() {
        valor1 = Double.parseDouble(display.getText());
        display.setText(String.valueOf(valor1 * valor1 * valor1));
    }

    private void calcularRaiz() {
        valor1 = Double.parseDouble(display.getText());
        display.setText(String.valueOf(Math.sqrt(valor1)));
    }

    private void calcularFatorial() {
        valor1 = Double.parseDouble(display.getText());
        int resultado = 1;
        for (int i = 1; i <= valor1; i++) {
            resultado *= i;
        }
        display.setText(String.valueOf(resultado));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalculadoraGui::new);
    }
}


