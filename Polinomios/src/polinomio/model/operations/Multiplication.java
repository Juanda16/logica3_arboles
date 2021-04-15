package model.operations;

import model.entities.*;

public class Multiplication {

     public Polinomio multiply(Polinomio pol1, Polinomio pol2) {
          
          Polinomio result = new Polinomio();
          Nodo nodoRecord1 = pol1.getCabeza().getLiga();
          Nodo nodoRecord2 = pol2.getCabeza().getLiga();
          Nodo last = result.getCabeza();
          int sizePol1 = pol1.getSize();
          int sizePol2 = pol2.getSize();
          Nodo newNodo;

          for (int j = 0; j < sizePol1; j++) {
               int expPol1TermnJ = nodoRecord1.getTermino().getExp();
               int coefPol1TermnJ = nodoRecord1.getTermino().getCoef();
               for (int i = 0; i < sizePol2; i++) {
                    // Variables de exponente y coeficiente de terminos

                    int expPol2TermnJ = nodoRecord2.getTermino().getExp();
                    int coefPol2TermnJ = nodoRecord2.getTermino().getCoef(); // error noderecord2=null

                    int newExp = expPol1TermnJ + expPol2TermnJ;
                    int newCoef = coefPol1TermnJ * coefPol2TermnJ;
                    Termino newTermino = new Termino(newExp, newCoef);

                    newNodo = result.insertTermn(newTermino, last);
                    last = newNodo;
                    nodoRecord2 = nodoRecord2.getLiga(); 

               }
               nodoRecord1 = nodoRecord1.getLiga();
          }

          //result.simplify();
          //result.sort();
          return result;
     }

}
