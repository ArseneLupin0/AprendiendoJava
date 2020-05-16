package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.II_Variado.TiposNumerados_I;

public enum UsoTallasEnum {
    MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
    private String abreviatura;

    UsoTallasEnum(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getAbreviatura() {
        return abreviatura;
    }
}
