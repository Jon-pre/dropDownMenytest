package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

public class KundeKontroller {
    private final List<Kunde> kunder = new ArrayList<>();

    @GetMapping("/hentKunder")
    public List<Kunde> alleKunder() {
        return kunder;
    }

    @GetMapping("/hentBiler")
    public List<Bil> hentBiler(){
        List<Bil> listBiler = new ArrayList<>();
        listBiler.add(new Bil("Audi","A1"));
        listBiler.add(new Bil("Volvo","T8"));
        listBiler.add(new Bil("Audi","A11"));
        return  listBiler;
    }

    @PostMapping("/lagreKunde")
    public void leggTilkunde(Kunde innkunde){
        kunder.add(innkunde);
    }

    @GetMapping("/slettAlleKunder")
    public void slettAlleKunder(){
        kunder.clear();
    }
}
