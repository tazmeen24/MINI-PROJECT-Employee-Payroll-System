package service;

import utils.PayrollConstants;

public class TaxCalculator {

    public double calculateTax(double grossPay) {
        return grossPay*PayrollConstants.TAX_RATE;
    }

    public double calculatePF(double grossPay) {
        return grossPay*PayrollConstants.PF_RATE;
    }

    public double calculateNetPay(double grossPay) {
        double tax = calculateTax(grossPay);
        double pf = calculatePF(grossPay);
        return grossPay - tax - pf;
    }
}
