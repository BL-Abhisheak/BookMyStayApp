package com.bookmystay.bookmystayapp;

import com.bookmystay.bookmystayapp.service.BookingQueueService;
import com.bookmystay.bookmystayapp.service.InventoryService;
import com.bookmystay.bookmystayapp.service.SearchService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class BookmystayappApplication {

	public static void main(String[] args) {

		BookingQueueService bookingService =
				new BookingQueueService();

		bookingService.addBookingRequest(
				"Abhisheak",
				"Single");

		bookingService.addBookingRequest(
				"Peter",
				"Double");

		bookingService.addBookingRequest(
				"Venom",
				"Suite");

		bookingService.displayWaitingRequests();

		System.out.println(
				"\nPending Requests : "
						+ bookingService.getPendingRequestCount());

		System.out.println(
				"\nProcessing Requests...");

		bookingService.processNextRequest();
		bookingService.processNextRequest();

		bookingService.displayWaitingRequests();
	}
}

