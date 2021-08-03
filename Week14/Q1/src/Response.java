import java.io.Serializable;
class Loan implements Serializable {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    @Override
    public String toString() {
        return "Loan" +
                " annualInterestRate - " + annualInterestRate +
                ", numberOfYears - " + numberOfYears +
                ", loanAmount - " + loanAmount;
    }
}

public class Response implements Serializable {
    private double monthlyPayment;
    private double totalPayment;

    public Response(double monthlyPayment, double totalPayment) {
        this.monthlyPayment = monthlyPayment;
        this.totalPayment = totalPayment;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public String toString() {
        return "Total Payment - " + getTotalPayment() + "\nMonthly Payment - " + getMonthlyPayment();
    }
}