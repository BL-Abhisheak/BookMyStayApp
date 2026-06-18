package com.bookmystay.bookmystayapp;

import com.bookmystay.bookmystayapp.model.Reservation;
import com.bookmystay.bookmystayapp.model.Service;
import com.bookmystay.bookmystayapp.service.*;


public class BookmystayappApplication {

	public static void main(String[] args) {

		BookingHistoryService historyService =
				new BookingHistoryService();

		Reservation reservation1 =
				new Reservation(
						"Abhisheak",
						"Mega");

		Reservation reservation2 =
				new Reservation(
						"Peter",
						"Double");

		Reservation reservation3 =
				new Reservation(
						"Venom",
						"Duplex");

		historyService.addReservation(
				reservation1);

		historyService.addReservation(
				reservation2);

		historyService.addReservation(
				reservation3);

		historyService.displayBookingHistory();

		historyService.cancelReservation(
				"Venom");

		historyService.displayBookingHistory();

		historyService.generateReport();
	}
}

