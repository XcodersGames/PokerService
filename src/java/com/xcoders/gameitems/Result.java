/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xcoders.gameitems;

import java.io.Serializable;

/**
 *
 * @author ravindu
 */
public class Result implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Player winner;
    private Player looser;
    private Integer winnerAmount;
    private Integer looserAmount;
    private Card[] winnerCards;
    private Card[] looserCards;
    
    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Player getLooser() {
        return looser;
    }

    public void setLooser(Player looser) {
        this.looser = looser;
    }

    public Integer getWinnerAmount() {
        return winnerAmount;
    }

    public void setWinnerAmount(Integer winnerAmount) {
        this.winnerAmount = winnerAmount;
    }

    public Integer getLooserAmount() {
        return looserAmount;
    }

    public void setLooserAmount(Integer looserAmount) {
        this.looserAmount = looserAmount;
    }

    public Result() {
    }

    public Result(Player winner, Player looser, Integer winnerAmount, Integer looserAmount) {
        this.winner = winner;
        this.looser = looser;
        this.winnerAmount = winnerAmount;
        this.looserAmount = looserAmount;
    }

    public Card[] getWinnerCards() {
        return winnerCards;
    }

    public void setWinnerCards(Card[] winnerCards) {
        this.winnerCards = winnerCards;
    }

    public Card[] getLooserCards() {
        return looserCards;
    }

    public void setLooserCards(Card[] looserCards) {
        this.looserCards = looserCards;
    }
    
    
    
}
