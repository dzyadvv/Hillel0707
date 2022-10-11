package Homeworks.homework18;

import java.util.Scanner;

public class Individual extends aClient {
    Scanner scanner = new Scanner(System.in);

    double balance = 500;
    double feePutBoundaryValue = 1000;
    double feePutLess = 0.01;
    double feeGreaterOrEqual = 0.005;

    @Override
    void accountInfo() {
        iMessages.balanceInfo(balance);
        iMessages.feeInfo();
        iMessages.feePutLessValue(feePutLess, feePutBoundaryValue);
        iMessages.feePutGreaterEqual(feeGreaterOrEqual, feePutBoundaryValue);
        iMessages.noWithdrawFee();
    }

    //ИП — пополнение с комиссией 1%, если сумма меньше 1000 $. И с комиссией 0,5%, если сумма больше либо равна 1000 $.
    @Override
    double putIntoAccount() {
        iMessages.putIntoAccount();
        double putCash = scanner.nextInt();
        double fee = putCash < feePutBoundaryValue ? putCash * feePutLess : putCash * feeGreaterOrEqual;
        iMessages.feeTotal(fee);
        putCash -= fee;
        return putCash;
    }

    @Override
    double withdraw() {
        iMessages.withdraw();
        return scanner.nextInt();
    }

    @Override
    void accountBalance(double putCash, double takeCash) {
        balance += putCash - takeCash;
        iMessages.balanceInfo(balance);
        iMessages.paragraph();
    }

}