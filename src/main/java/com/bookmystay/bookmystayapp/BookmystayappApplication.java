package com.bookmystay.bookmystayapp;

import com.bookmystay.bookmystayapp.model.Reservation;
import com.bookmystay.bookmystayapp.model.Service;
import com.bookmystay.bookmystayapp.service.AddOnServiceManager;
import com.bookmystay.bookmystayapp.service.BookingQueueService;
import com.bookmystay.bookmystayapp.service.InventoryService;
import com.bookmystay.bookmystayapp.service.ReservationConfirmationService;


public class BookmystayappApplication {

	public static void main(String[] args) {

		AddOnServiceManager serviceManager =
				new AddOnServiceManager();

		String reservationId = "S1";

		serviceManager.addService(
				reservationId,
				new Service(
						"Morning Food",
						500));

		serviceManager.addService(
				reservationId,
				new Service(
						"Gaming",
						1500));

		serviceManager.addService(
				reservationId,
				new Service(
						"Night Stay",
						800));

		serviceManager.displayServices(
				reservationId);

		serviceManager.displayTotalServiceCost(
				reservationId);
	}
}

