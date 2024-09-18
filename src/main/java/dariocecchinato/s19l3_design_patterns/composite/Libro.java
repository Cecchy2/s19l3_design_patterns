package dariocecchinato.s19l3_design_patterns.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Libro {
   private List<Autore> autori = new ArrayList<>();
   private double prezzo;


}
