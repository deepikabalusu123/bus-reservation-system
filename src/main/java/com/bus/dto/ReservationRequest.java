package com.bus.dto;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ReservationRequest {
@NotNull private Long busId;
@NotBlank private String source;
@NotBlank private String destination;
@NotBlank private String reservationType;

public Long getBusId() {
	return this.busId;
	
}

public String getReservationType() {
	return this.reservationType;
}
public String getSource() {
	return this.source;
}
public String getDestination() {
	return this.destination;
}
}