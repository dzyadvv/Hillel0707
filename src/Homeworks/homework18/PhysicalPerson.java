package Homeworks.homework18;

import java.util.Scanner;

public class PhysicalPerson extends aClient implements iMessages {

    Scanner scanner = new Scanner(System.in);

    double balance = 100;

    @Override
    void accountInfo() {
        iMessages.balanceInfo(balance);
        iMessages.noFillFee();
        iMessages.noWithdrawFee();
    }

    @Override
    double putIntoAccount() {
        iMessages.putIntoAccount();
        return scanner.nextInt();
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
