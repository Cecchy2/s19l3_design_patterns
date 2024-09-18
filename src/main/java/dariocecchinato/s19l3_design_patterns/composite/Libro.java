package dariocecchinato.s19l3_design_patterns.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Libro implements LibroInterfaccia{
   private List<Autore> autori = new ArrayList<>();
   private List<LibroInterfaccia> contenuto = new ArrayList<>();
   private double prezzo;


   @Override
   public void stampa() {
      for (LibroInterfaccia elemento: contenuto){
         elemento.stampa();
      }
   }

   @Override
   public int getNumeroPagine() {
      int numeroTotalePagine = 0;
      for (LibroInterfaccia elemento : contenuto) {
         numeroTotalePagine += elemento.getNumeroPagine(); // Somma tutte le pagine
      }
      return numeroTotalePagine;
   }
}
