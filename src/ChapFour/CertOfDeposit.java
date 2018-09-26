/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapFour;

import java.time.LocalDate;

/**
 *
 * @author Frebby
 */
public class CertOfDeposit {
    private int certNum;
private String acctHoldName;
private double balance;
private LocalDate issueDate;
private LocalDate maturityDate;

    public CertOfDeposit(int certNum, String acctHoldName, double balance, LocalDate issueDate, LocalDate maturityDate) {
        this.certNum = certNum;
        this.acctHoldName = acctHoldName;
        this.balance = balance;
        this.issueDate = issueDate;
        this.maturityDate = maturityDate;
    }

    public int getCertNum() {
        return certNum;
    }

    public void setCertNum(int certNum) {
        this.certNum = certNum;
    }

    public String getAcctHoldName() {
        return acctHoldName;
    }

    public void setAcctHoldName(String acctHoldName) {
        this.acctHoldName = acctHoldName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(LocalDate maturityDate) {
        this.maturityDate = maturityDate;
    }

}
