package com.support.ticketing.contracts;

import lombok.Data;

import java.util.List;

@Data
public class DashboardResponse {

    private Long userId;
    private String name;
    private String surname;
    private String activeReservation;
    private List<String> reservationsInQue;

    public DashboardResponse(Long userId, String name, String surname, String activeReservation, List<String> reservationsInQue) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.activeReservation = activeReservation;
        this.reservationsInQue = reservationsInQue;
    }
}
