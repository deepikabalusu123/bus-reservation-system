package com.bus.model;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Feedback {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long feedbackId;
private int driverRating;
private int serviceRating;
private int overallRating;
private String comments;
private Date feedbackDate;

@ManyToOne @JoinColumn(name = "user_id")
private User user;

@ManyToOne @JoinColumn(name = "bus_id")
private Bus bus;

@ManyToOne @JoinColumn(name = "reservation_id") 
private Reservation reservation;

private LocalDateTime submittedAt;

private int rating;

public Long getFeedbackId() {
	return feedbackId;
}

public void setFeedbackId(Long feedbackId) {
	this.feedbackId = feedbackId;
}

public int getDriverRating() {
	return driverRating;
}

public void setDriverRating(int driverRating) {
	this.driverRating = driverRating;
}

public int getServiceRating() {
	return serviceRating;
}

public void setServiceRating(int serviceRating) {
	this.serviceRating = serviceRating;
}

public int getOverallRating() {
	return overallRating;
}

public void setOverallRating(int overallRating) {
	this.overallRating = overallRating;
}

public String getComments() {
	return comments;
}

public void setComments(String comments) {
	this.comments = comments;
}

public Date getFeedbackDate() {
	return feedbackDate;
}

public void setFeedbackDate(Date feedbackDate) {
	this.feedbackDate = feedbackDate;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public Bus getBus() {
	return bus;
}

public void setBus(Bus bus) {
	this.bus = bus;
}

public Reservation getReservation() {
	return reservation;
}

public void setReservation(Reservation reservation) {
	this.reservation = reservation;
}

public LocalDateTime getSubmittedAt() {
	return submittedAt;
}

public void setSubmittedAt(LocalDateTime submittedAt) {
	this.submittedAt = submittedAt;
}

public int getRating() {
	return rating;
}

public void setRating(int rating) {
	this.rating = rating;
}

}