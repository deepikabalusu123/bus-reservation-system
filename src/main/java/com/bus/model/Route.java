package com.bus.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Table(name = "route")
public class Route {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="root_id")
private Long routeId;

@Column(name = "route_from", nullable = false)
private String routeFrom;

@Column(name = "route_to", nullable = false)
private String routeTo;

@Column(name = "distance", nullable = false)
private int distance;

@OneToMany(mappedBy = "route")
private List<Bus> buses;

public Long getRouteId() {
	return routeId;
}

public void setRouteId(Long routeId) {
	this.routeId = routeId;
}

public String getRouteFrom() {
	return this.routeFrom;
}

public void setRouteFrom(String routeFrom) {
	this.routeFrom = routeFrom;
}

public String getRouteTo() {
	return routeTo;
}

public void setRouteTo(String routeTo) {
	this.routeTo = routeTo;
}

public int getDistance() {
	return distance;
}

public void setDistance(int distance) {
	this.distance = distance;
}

public List<Bus> getBuses() {
	return buses;
}

public void setBuses(List<Bus> buses) {
	this.buses = buses;
}
public String testGetter() {
    return "TEST";
}



}
