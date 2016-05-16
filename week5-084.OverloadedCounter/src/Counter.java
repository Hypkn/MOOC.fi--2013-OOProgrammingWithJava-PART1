/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dev
 */
public class Counter {

    private int number;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.number = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.number = startingValue;
        this.check = false;
    }

    public Counter(boolean check) {
        this.check = check;
        this.number = 0;

    }

    public Counter() {
        this.number = 0;
        this.check = false;

    }

    public int value() {
        return this.number;
    }

    public void increase() {
        this.number++;
    }

    public void decrease() {
        this.number--;
        if (check) {
            if (this.number < 0) {
                this.number = 0;
            }
        }

    }

    public void increase(int increaseAmount) {

        if (increaseAmount >= 0) {
            this.number += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {

        if (check) {
            if (this.number - decreaseAmount < 0) {
                this.number = 0;
                if (this.number - decreaseAmount > 0) {
                    this.number -= decreaseAmount;
                }
            }
        } else if (decreaseAmount > 0) {
            this.number -= decreaseAmount;
        }

    }
}
