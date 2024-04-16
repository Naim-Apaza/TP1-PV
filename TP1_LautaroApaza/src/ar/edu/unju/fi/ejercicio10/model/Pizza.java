package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {

    private float diametro;
    private float precio;
    private float area;
    private boolean ingredientesEspeciales;
    private final short ESPECIAL_20 = 500;
    private final short ESPECIAL_30 = 750;
    private final short ESPECIAL_40 = 1000;
    private final double PI = Math.PI;
    public Pizza() {
    }

    public float calcularPrecio() {
        switch ((int)getDiametro()) {
            case 20:
                setPrecio(4500);
                return ingredientesEspeciales ? getPrecio() + this.ESPECIAL_20 : getPrecio();
            case 30:
                setPrecio(4800);
                return ingredientesEspeciales ? getPrecio() + this.ESPECIAL_30 : getPrecio();
            case 40:
                setPrecio(5500);
                return ingredientesEspeciales ? getPrecio() + this.ESPECIAL_40 : getPrecio();
            default:
                return 0;
        }
    }

    public float calcularArea() {
        return (float) (PI * Math.pow(getDiametro()/2, 2))/4;
    }

    @Override
    public String toString() {
        return
                "- diametro=" + (int)diametro + '\n' +
                "- ingredientes Especiales= " + ingredientesEspeciales + '\n' +
                "- precio=" + calcularPrecio() + '\n' +
                "- area=" + calcularArea();
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }
}
