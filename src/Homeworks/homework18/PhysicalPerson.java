package Homeworks.homework18;

import java.util.Scanner;

public class PhysicalPerson extends aClient {

    Scanner scanner = new Scanner(System.in);

    double balance = 100;

    @Override
    void accountInfo() {
        aMessages.balanceInfo(balance);
        aMessages.noFillFee();
        aMessages.noWithdrawFee();
    }

    @Override
    double putIntoAccount() {
        aMessages.putIntoAccount();
        return scanner.nextInt();
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
