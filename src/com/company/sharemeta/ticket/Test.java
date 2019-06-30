package com.company.sharemeta.ticket;

public class Test {
    public static void main(String[] args) {
        Ticket ticket01 = TicketFactory.getTicket("北京", "青岛");
        ticket01.showTicketInfo("上铺");

        Ticket ticket02 = TicketFactory.getTicket("北京", "青岛");
        ticket02.showTicketInfo("下铺");

        Ticket ticket03 = TicketFactory.getTicket("北京", "青岛");
        ticket03.showTicketInfo("下铺");

    }
}
