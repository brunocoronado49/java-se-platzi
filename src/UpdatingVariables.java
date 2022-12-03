public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        // Bono 200
        salary = salary + 200;
        System.out.println(salary);

        // Beneficios 50 descuento
        salary = salary - 50;
        System.out.println(salary);

        // trabbajo 2 horas extra a 30 pesos la hora
        // cupon de comida por 45
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        // Actualizando cadenas de texto
        String employyename = "Bruce Rangel";
        employyename = employyename + " Coronado";
        System.out.println(employyename);
    }
}
