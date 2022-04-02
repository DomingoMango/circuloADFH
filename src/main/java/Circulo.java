public class Circulo {
    private float radio, diametro, circunferencia, area;

    public Circulo() {
        System.out.println("No sirvo para nada");
    }

    public Circulo(float radio, float diametro, float circunferencia, float area) {
        this.radio = radio;
        this.diametro = diametro;
        this.circunferencia = circunferencia;
        this.area = area;
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getDiametro() {
        diametro=radio*2;
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getCircunferencia() {
        circunferencia=3.14157f*diametro;
        return circunferencia;
    }

    public void setCircunferencia(float circunferencia) {
        this.circunferencia = circunferencia;
    }

    public float getArea() {
        area=radio*3.1415f;
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}
