package Homeworks.homework18;

public abstract class aMessages {

    static void balanceInfo(double balance) {
        System.out.println("На Вашем счете " + balance + "$.");
    }

    static void feeInfo() {
        System.out.println("Комиссия при пополнении счета:");
    }

    static void noFillFee() {
        System.out.println("Без комиссии при пополнении счета.");
    }

    static void feePutLessValue(double feePercent, double feePutBoundaryValue) {
        System.out.println(feePercent * 100 + "%, если сумма пополнения менее " + feePutBoundaryValue + "$.");
    }

    static void feePutGreaterEqual(double feePercent, double feePutBoundaryValue) {
        System.out.println(feePercent * 100 + "%, если сумма пополнения больше либо равна " + feePutBoundaryValue + "$.");
    }

    static void feeWithdraw(double feePercent) {
        System.out.println(feePercent * 100 + "%, при снятии денежных средств со счета.");
    }

    static void feeTotal(double fee) {
        System.out.println("Комиссия: " + fee + "$.");
    }

    static void noWithdrawFee() {
        System.out.println("Без комиссии при снятии денежных средств со счета.");
    }

    static void putIntoAccount() {
        System.out.println("Положить денежные средства на счет: ");
    }

    static void withdraw() {
        System.out.println("Снять денежные средства: ");
    }

    static void paragraph() {
        System.out.println();
    }
}

