class Nadrz {
    private int stav;
    private final int kapacita;
    private final TypObsahu typObsahu;

    public Nadrz(int kapacita, TypObsahu typObsahu) {
        this.kapacita = kapacita;
        this.typObsahu = typObsahu;
        this.stav = 0; // Po vytvoření je nádrž prázdná
    }

    public void plnit(int mnozstvi) throws MyException_PlnaNadrz {
        if (stav + mnozstvi > kapacita) {
            throw new MyException_PlnaNadrz("Nádrž je plná. Nelze přidat " + mnozstvi);
        }
        stav += mnozstvi;
    }

    public void odebrat(int mnozstvi) throws MyException_PrazdnaNadrz {
        if (stav - mnozstvi < 0) {
            throw new MyException_PrazdnaNadrz("Nádrž je prázdná. Nelze odebrat " + mnozstvi);
        }
        stav -= mnozstvi;
    }

    public String getStav() {
        int procenta = (stav * 100) / kapacita;
        return String.format("%d/%d (%d%%), %s", stav, kapacita, procenta, typObsahu);
    }
}
