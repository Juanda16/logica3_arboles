/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinomios;

/**
 *
 * @author JD
 */
public class PolinomioVectorForma1 {

    private int[] arreglo;

    public PolinomioVectorForma1(int[] arreglo) {

        this.arreglo = arreglo;
    }

    public PolinomioVectorForma1(int n) {
        arreglo = new int[n + 2];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 0;
        }
        arreglo[0] = n;
    }

    public PolinomioVectorForma1() {
        arreglo = new int[1];
        this.arreglo[0] = -1;
    }

    
    /** 
     * @return int
     */
    public int getGrado() {
        int grado;

        if (this.arreglo != null) {
            grado = arreglo[0];
        } else
            grado = -1;

        return grado;
    }

    
    /** 
     * @param grade
     * @return int
     */
    public int getCoef(int grade) {

        int length = this.arreglo.length;
        if (length >= grade + 1) {
            return this.arreglo[length - grade - 1];
        } else
            return -1;

    }

    
    /** 
     * @param pos
     * @return int
     */
    public int getExp(int pos) {
        int length = this.arreglo.length;
        if (length >= pos + 1) {
            return length - pos - 1; // revisar
        } else
            return -1;

    }

    
    /** 
     * @param coef
     * @param grade
     */
    public void setCoef(int coef, int grade) {
        int length = this.arreglo.length;
        this.arreglo[length - grade] = coef;

    }

    
    /** 
     * @param polinomioB
     * @return PolinomioVectorForma1
     */
    public PolinomioVectorForma1 sumar(PolinomioVectorForma1 polinomioB) {

        return (polinomioB);
    }

    
    /** 
     * @return int[]
     */
    public int[] getArreglo() {
        return this.arreglo;
    }

    private void normalizar() {
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder cadenaTemporalPolinomio = new StringBuilder();
        try {
            for (int i = 1; i < arreglo.length; i++) {
                int j = arreglo[i];
                // Para adicionar el simbolo del coeficiente para numeros positivos, excluyendo
                // el simbolo + del primer termino si es positivo.
                if (j >= 0 && i != 1) {
                    cadenaTemporalPolinomio.append("+");
                }
                cadenaTemporalPolinomio.append(j).append("X^").append(getExp(i)).append(" ");
            }
        } catch (Exception e) {
            cadenaTemporalPolinomio.append("El arreglo estaba NULO");
        }
        return cadenaTemporalPolinomio.toString();
    }

}
