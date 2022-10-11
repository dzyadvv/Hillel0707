package Homeworks.homework18;

import java.util.Scanner;

public class Legal extends aClient {
    Scanner scanner = new Scanner(System.in);

    double balance = 1000;
    double feeWithdraw = 0.01;

    @Override
    void accountInfo() {
        aMessages.balanceInfo(balance);
        aMessages.feeInfo();
        aMessages.noFillFee();
        aMessages.feeWithdraw(feeWithdraw);
    }

    @Override
    double putIntoAccount() {
        aMessages.putIntoAccount();
        return scanner.nextInt();
    }

    //У юридических лиц — снятие с комиссией 1%.
    @Override
    double withdraw() {
        aMessages.withdraw();
        double takeCash = scanner.nextInt();
        double fee = takeCash * feeWithdraw;
        aMessages.feeTotal(fee);
        takeCash += fee;
        return takeCash;
    }

    @Override
    void accountBalance(double putCash, double takeCash) {
        balance += putCash - takeCash;
        aMessages.balanceInfo(balance);
        aMessages.paragraph();
    }
}