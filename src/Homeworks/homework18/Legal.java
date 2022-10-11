package Homeworks.homework18;

import java.util.Scanner;

public class Legal extends aClient {
    Scanner scanner = new Scanner(System.in);

    double balance = 1000;
    double feeWithdraw = 0.01;

    @Override
    void accountInfo() {
        iMessages.balanceInfo(balance);
        iMessages.feeInfo();
        iMessages.noFillFee();
        iMessages.feeWithdraw(feeWithdraw);
    }

    @Override
    double putIntoAccount() {
        iMessages.putIntoAccount();
        return scanner.nextInt();
    }

    //У юридических лиц — снятие с комиссией 1%.
    @Override
    double withdraw() {
        iMessages.withdraw();
        double takeCash = scanner.nextInt();
        double fee = takeCash * feeWithdraw;
        iMessages.feeTotal(fee);
        takeCash += fee;
        return takeCash;
    }

    @Override
    void accountBalance(double putCash, double takeCash) {
        balance += putCash - takeCash;
        iMessages.balanceInfo(balance);
        iMessages.paragraph();
    }
}