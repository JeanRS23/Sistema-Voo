package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class VooEmirates extends Voo {

    private int capacidadePassageiros;

    public VooEmirates (String numerovoo, String origem, String destino, String dataPartida, int capacidadePassageiros) {
        super(numerovoo, origem, destino, dataPartida);
        this.capacidadePassageiros = capacidadePassageiros;
    }

    @Override
    public int getCapacidadePassageiros(){
        return capacidadePassageiros;
    }
}
