
package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class CellPhone {
    private CallingCard card;
    private boolean isCalling;
    private int callDuration;
    private String currentNumber;
    private List<String> callHistory = new ArrayList<>();

    public CellPhone(CallingCard card) {
        this.card = card;
    }

    public void call(String number) {
        this.isCalling = true;
        this.callDuration = 0;
        this.currentNumber = number;
    }

    public void tick() {
        if (!isCalling) return;
        if (card.getRemainingMinutes() <= 0) {
            endCall();
            return;
        }
        callDuration++;
        card.useMinutes(1);
    }

    public void endCall() {
        if (!isCalling) return;
        isCalling = false;
        String duration = callDuration + (callDuration > 1 ? " minutes" : " minute");
        callHistory.add(currentNumber + " (" + duration + ")");
        currentNumber = null;
        callDuration = 0;
    }

    public String getHistory() {
        return String.join(", ", callHistory);
    }

    public boolean isTalking() {
        return isCalling;
    }
}
