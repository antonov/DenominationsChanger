package com.company;

/**
 * Denominations Changer class.
 */
public class DenominationsChanger {
    private int[] denominations = {100, 50, 20, 10, 5};

    /**
     * Return the minimal number of bills of denominations by specified amount.
     * @param amount
     * @return number of bills
     */
    public int MakeChanges(int amount) {
        int denomination_bills;
        int total_bills = 0;
        for (int denomination: denominations) {
            if (amount >= denomination) {
                denomination_bills = amount / denomination;
                amount -= denomination_bills * denomination;
                total_bills += denomination_bills;
            }
        }

        return total_bills;
    }

}
