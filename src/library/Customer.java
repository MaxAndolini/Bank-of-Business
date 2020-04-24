/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author ercan
 */
public class Customer extends User {

    private String cardNumber;
    private String job;
    private String phoneNumber;
    private BigDecimal dollar;
    private BigDecimal euro;
    private BigDecimal pound;
    private BigDecimal turkishLira;

    public Customer() {
        super();
        this.cardNumber = "-";
        this.job = "-";
        this.phoneNumber = "0";
        this.dollar = BigDecimal.valueOf(0);
        this.euro = BigDecimal.valueOf(0);
        this.pound = BigDecimal.valueOf(0);
        this.turkishLira = BigDecimal.valueOf(0);
    }

    public Customer(String cardNumber, String job, String phoneNumber, BigDecimal dollar, BigDecimal euro, BigDecimal pound, BigDecimal turkishLira, String ID, String name, String dateOfBirth, String homeAddress, String password) {
        super(ID, name, dateOfBirth, homeAddress, password);
        this.cardNumber = cardNumber;
        this.job = job;
        this.phoneNumber = phoneNumber;
        this.dollar = dollar;
        this.euro = euro;
        this.pound = pound;
        this.turkishLira = turkishLira;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber, int save) {
        this.cardNumber = cardNumber;
        if (save == 1) {
            Database.set("Accounts", "ID", getId().getID(), "CardNumber", cardNumber);
        }
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job, int save) {
        this.job = job;
        if (save == 1) {
            Database.set("Accounts", "ID", getId().getID(), "Job", job);
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber, int save) {
        this.phoneNumber = phoneNumber;
        if (save == 1) {
            Database.set("Accounts", "ID", getId().getID(), "PhoneNumber", phoneNumber);
        }
    }

    public BigDecimal getDollar() {
        return dollar;
    }

    public void setDollar(BigDecimal dollar, int save) {
        this.dollar = dollar;
        if (save == 1) {
            Database.set("Accounts", "ID", getId().getID(), "Dollar", dollar);
        }
    }

    public BigDecimal getEuro() {
        return euro;
    }

    public void setEuro(BigDecimal euro, int save) {
        this.euro = euro;
        if (save == 1) {
            Database.set("Accounts", "ID", getId().getID(), "Euro", euro);
        }
    }

    public BigDecimal getPound() {
        return pound;
    }

    public void setPound(BigDecimal pound, int save) {
        this.pound = pound;
        if (save == 1) {
            Database.set("Accounts", "ID", getId().getID(), "Pound", pound);
        }
    }

    public BigDecimal getTurkishLira() {
        return turkishLira;
    }

    public void setTurkishLira(BigDecimal turkishLira, int save) {
        this.turkishLira = turkishLira;
        if (save == 1) {
            Database.set("Accounts", "ID", getId().getID(), "TurkishLira", turkishLira);
        }
    }

    public String showCardNumber() {
        return this.cardNumber.replaceAll(".{4}(?!$)", "$0-");
    }

    public static String generateCardNumber() {
        String result = "1";
        SecureRandom rand = new SecureRandom();
        for (int i = 0; i < 15; i++) {
            result += rand.nextInt(10);
        }
        if (!checkLuhn(result)) {
            return generateCardNumber();
        }
        if (Database.exists("Users", "CardNumber", result)) {
            return generateCardNumber();
        }
        return result;
    }

    public static boolean checkLuhn(String cardNumber) {
        int nDigits = cardNumber.length();
        int nSum = 0;
        boolean isSecond = false;
        for (int i = nDigits - 1; i >= 0; i--) {
            int d = cardNumber.charAt(i) - '0';
            if (isSecond == true) {
                d = d * 2;
            }
            nSum += d / 10;
            nSum += d % 10;
            isSecond = !isSecond;
        }
        return (nSum % 10 == 0);
    }

    public static String currencyFormat(int type, BigDecimal n) {
        switch (type) {
            case 0:
                return NumberFormat.getCurrencyInstance(Locale.US).format(n);
            case 1:
                return NumberFormat.getCurrencyInstance(Locale.GERMANY).format(n);
            case 2:
                return NumberFormat.getCurrencyInstance(Locale.UK).format(n);
            case 3:
                return NumberFormat.getCurrencyInstance(new Locale("tr", "TR")).format(n);
        }
        return null;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(toString() + "'s telephone number: " + getPhoneNumber());
        System.out.println(toString() + "'s home adress: " + getHomeAddress());
        System.out.println(toString() + "'s job: " + getJob());
        System.out.println(toString() + "'s dollar amount: " + getDollar());
        System.out.println(toString() + "'s euro amount: " + getEuro());
        System.out.println(toString() + "'s pound amount: " + getPound());
        System.out.println(toString() + "'s turkish lira amount: " + getTurkishLira());
    }

    public void deposit(int money) {
        //setMoneyAmount(moneyAmount + money);
    }

    public void withdraw(int money) {
        //setMoneyAmount(moneyAmount - money);
    }

    public void transferID(String ID) {

    }

    public void transferPhoneNumber(String telNo) {

    }
}
