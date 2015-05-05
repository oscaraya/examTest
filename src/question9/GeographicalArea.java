package question9;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GeographicalArea {
	// Name of this geographical area
	private String name;
	// Areas contained by the current one
	private ArrayList<GeographicalArea> subAreas;
	// Areas that contain the current one
	private ArrayList<GeographicalArea> containedBy;
	// Events pertaining to this area
	private ArrayList<HistoricalEvent> events;

	public GeographicalArea(String name) {
		this.name = name;
		subAreas = new ArrayList<GeographicalArea>();
		containedBy = new ArrayList<GeographicalArea>();
		events = new ArrayList<HistoricalEvent>();
	}

	public void addSubArea(GeographicalArea subArea) {

		// [... see part a-ii) of the question ...]

	}

	public void addEvent(HistoricalEvent event) {
		events.add(event);
	}

	public List<HistoricalEvent> getEvents(Date fromDate, Date toDate) {
		ArrayList<HistoricalEvent> ls = new ArrayList<HistoricalEvent>();
		Iterator<HistoricalEvent> i = events.iterator();
		while (i.hasNext()) {
			HistoricalEvent event = i.next();
			Date eventDate = event.getDate();
			if (eventDate.after(fromDate) && eventDate.before(toDate)) {
				ls.add(event);
			}
		}
		return ls;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// [... code omitted ...]
}
