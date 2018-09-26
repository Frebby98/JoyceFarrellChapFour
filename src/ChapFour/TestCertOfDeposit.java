/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapFour;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Frebby
 */
public class TestCertOfDeposit {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
            System.out.println("Certificate Number: ");
    int certNum = input.nextInt();
        System.out.println("Account Holder Name: ");
    String name = input.next();
            System.out.println("Balance: ");
    double balance = input.nextDouble();
    LocalDate issued = LocalDate.now();
    LocalDate matured = issued.plusYears(1);
    
    CertOfDeposit cert1 = new CertOfDeposit(certNum, name, balance, 
            issued, matured);
        CertOfDeposit cert2 = new CertOfDeposit(certNum, name, balance,
                issued, matured);

    System.out.println(cert1.getCertNum());
    System.out.println(cert1.getAcctHoldName());
    System.out.println(cert1.getBalance());
    System.out.println(cert1.getIssueDate());
    System.out.println(cert1.getMaturityDate());
    
}
}