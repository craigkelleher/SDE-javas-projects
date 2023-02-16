package com.galvanize;

public class Main {
    public static void main(String[] args) {

//        CallingCard card = new CallingCard(10);
//        card.addDollars(1); // add 100 cents @ 10 cents/minute = 10 minutes added
//
//        CellPhone phone = new CellPhone(card);
//        phone.isTalking();  // => returns false
//
//        phone.call("555-1212");
//        phone.isTalking();  // => returns true
//
//        phone.tick();       // simulate a minute going by
//        phone.tick();       // simulate another minute going by
//
//        phone.endCall();
//        phone.isTalking();  // => returns false (because the call is over)
//        phone.getHistory(); // => returns "555-1212 (2 minutes)"
//
//        card.getRemainingMinutes() // => return 8, because the call lasted 2 minutes;

//        CallingCard card = new CallingCard(10);
//        card.addDollars(1); // add 100 cents @ 10 cents/minute = 10 minutes added
//
//        CellPhone phone = new CellPhone(card);
//        phone.call("555-1111");
//        phone.tick();       // simulate a minute going by
//        phone.endCall();
//
//        phone.call("555-2222");
//        phone.tick();       // simulate a minute going by
//        phone.tick();       // simulate a minute going by
//        phone.endCall();
//
//        phone.getHistory(); // => returns "555-1111 (1 minute), 555-2222 (2 minutes)"
//
//        card.getRemainingMinutes() // => return 7, because the phone used 3 minutes

        CallingCard card = new CallingCard(20);
        card.addDollars(1); // add 100 cents @ 20 cents/minute = 5 minutes added

        CellPhone phone = new CellPhone(card);
        phone.call("555-1111");
        phone.tick();       // 1 minute elapsed
        phone.tick();       // 2 minutes elapsed
        phone.endCall();

        phone.call("555-3333");
        phone.tick();       // 3 minutes elapsed
        phone.tick();       // 4 minutes elapsed
        phone.tick();       // this is the end of the 5th minute, so the call is ended

        phone.getHistory(); // => returns "555-1111 (2 minutes), 555-3333 (cut of at 3 minutes)"

        card.getRemainingMinutes(); // => returns 0, because all 5 minutes have been used up
        System.out.println(card.getRemainingMinutes());
    }
}
