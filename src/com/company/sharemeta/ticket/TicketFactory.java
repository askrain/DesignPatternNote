package com.company.sharemeta.ticket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TicketFactory {
    static Map<String, Ticket> tickets = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from, String to) {
        String key = from + "-" + to;
        if (tickets.containsKey(key)) {
            System.out.println("使用缓存 ==》" + key);
            return tickets.get(key);
        } else {
            System.out.println("创建对象 ==》" + key);
            TrainTicket ticket = new TrainTicket(from, to);
            tickets.put(key, ticket);
            return ticket;
        }
    }
}
