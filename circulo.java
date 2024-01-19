class Circulo {
    private double radio;

    public Circulo(double radio) {
        if (radio < 0) {
            this.radio = 0;
        } else {
            this.radio = radio;
        }
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return Math.PI * (radio * radio);
    }
}

class Cilindro extends Circulo {
    private double altura;

    public Cilindro(double radio, double altura) {
        super(radio);

        if (altura < 0) {
            this.altura = 0;
        } else {
            this.altura = altura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public double calcularVolumen() {
        return super.getArea() * altura;
    }


    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);

        System.out.println("Radio del circulo: " + circulo.getRadio());
        System.out.println("Área circulo: " + circulo.getArea());

        Cilindro cilindro = new Cilindro(3.0, 5.0);

        System.out.println("Radio del cilindro: " + cilindro.getRadio());
        System.out.println("Altura del cilindro: " + cilindro.getAltura());
        System.out.println("Área de la base del cilindro: " + cilindro.getArea());
        System.out.println("Volumen del cilindro: " + cilindro.calcularVolumen());
    }
}

