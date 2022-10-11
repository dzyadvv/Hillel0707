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
        aMessages.balanceInfo(balance);
        aMessages.feeInfo();
        aMessages.feePutLessValue(feePutLess, feePutBoundaryValue);
        aMessages.feePutGreaterEqual(feeGreaterOrEqual, feePutBoundaryValue);
        aMessages.noWithdrawFee();
    }

    //ИП — пополнение с комиссией 1%, если сумма меньше 1000 $. И с комиссией 0,5%, если сумма больше либо равна 1000 $.
    @Override
    double putIntoAccount() {
        aMessages.putIntoAccount();
        double putCash = scanner.nextInt();
        double fee = putCash < feePutBoundaryValue ? putCash * feePutLess : putCash * feeGreaterOrEqual;
        aMessages.feeTotal(fee);
        putCash -= fee;
        return putCash;
    }

    @Override
    double withdraw() {
        aMessages.withdraw();
        return scanner.nextInt();
    }

    @Override
    void accountBalance(double putCash, double takeCash) {
        balance += putCash - takeCash;
        aMessages.balanceInfo(balance);
        aMessages.paragraph();
    }

}