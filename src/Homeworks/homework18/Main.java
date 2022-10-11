package Homeworks.homework18;

public class Main {
    public static void main(String[] args) {

        System.out.println("Физицеское лицо:");
        PhysicalPerson physicalPerson = new PhysicalPerson();
        physicalPerson.accountInfo();
        double putCashPerson = physicalPerson.putIntoAccount();
        double takeCashPerson = physicalPerson.withdraw();
        physicalPerson.accountBalance(putCashPerson, takeCashPerson);
        System.out.println("----------------");


        System.out.println("Индивидуальный предпрениматель:");
        Individual individual = new Individual();
        individual.accountInfo();
        double putCashIndividual = individual.putIntoAccount();
        double takeCashIndividual = individual.withdraw();
        individual.accountBalance(putCashIndividual, takeCashIndividual);
        System.out.println("----------------");


        System.out.println("Юридическое лицо:");
        Legal legal = new Legal();
        legal.accountInfo();
        double putCashLegal = legal.putIntoAccount();
        double takeCashLegal = legal.withdraw();
        legal.accountBalance(putCashLegal, takeCashLegal);
        System.out.println("----------------");


    }
}
