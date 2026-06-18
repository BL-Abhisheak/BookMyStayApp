package com.bookmystay.bookmystayapp;

import com.bookmystay.bookmystayapp.model.Reservation;
import com.bookmystay.bookmystayapp.service.BookingQueueService;
import com.bookmystay.bookmystayapp.service.InventoryService;
import com.bookmystay.bookmystayapp.service.ReservationConfirmationService;


public class BookmystayappApplication {

	public static void main(String[] args) {

		InventoryService inventoryService =
				new InventoryService();

		inventoryService.addRoomType(
				"Master",
				6,
				7500,
				"WiFi, TV");

		inventoryService.addRoomType(
				"Double",
				1,
				4500,
				"WiFi, TV, Breakfast");

		ReservationConfirmationService
				confirmationService =
				new ReservationConfirmationService(
						inventoryService.getRoomInventory());

		Reservation reservation1 =
				new Reservation(
						"Abhisheak",
						"Single");

		Reservation reservation2 =
				new Reservation(
						"Peter",
						"Single");

		Reservation reservation3 =
				new Reservation(
						"Venom",
						"Single");

		confirmationService
				.confirmReservation(
						reservation1);

		confirmationService
				.confirmReservation(
						reservation2);

		confirmationService
				.confirmReservation(
						reservation3);

		confirmationService
				.displayAllocatedRooms();

		confirmationService
				.displayBookedRoomIds();

		inventoryService
				.displayInventory();
	}
}

