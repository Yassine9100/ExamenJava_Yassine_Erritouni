public class TestEquation {
    public static void main(String[] args) {
        Equation Eq1 = new Equation(1,0,3);
        Equation Eq2 = new Equation(1,-1,-2);

        System.out.println(Eq1);
        System.out.println(Eq2);

        System.out.println(Eq1.VerifierEquation(2));
        System.out.println(Eq2.VerifierEquation(2));

        System.out.println(Eq2.calculerSolutions());

        Equation Eq3 = new Equation(-1,2);
        System.out.println(Eq3);
    }

}
