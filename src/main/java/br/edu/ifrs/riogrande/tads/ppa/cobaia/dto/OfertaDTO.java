package br.edu.ifrs.riogrande.tads.ppa.cobaia.dto;

import lombok.Data;

@Data
public class OfertaDTO {

  private String codigoComponente;
  private int periodoAno;
  private int periodoMetade;
  private int vagas;
  private double overbook;

}