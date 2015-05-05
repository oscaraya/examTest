package question9;

import java.util.ArrayList;
import java.util.HashMap;

public class HistoryManager {
	private HashMap<String, GeographicalArea> areas;
	private ArrayList<HistoricalEvent> events;

	// Constructor: perform all necessary initialization.

	public HistoryManager() {

		// [... see part b-ii) of the question ...]

	}

	// Return the GeographicalArea object corresponding to the area name.
	// Returns void if there is no area for this name.
	public GeographicalArea getArea(String areaName) {
		return (areas.get(areaName));
	}

	// Get a full list of the areas included within the named area,
	// including the root area, to any level of depth of containment.
	// Returns void if there is no area for this name.
	public GeographicalArea[] getAreaWithSubareas(String areaName) {

		// [... see part c) of the question ...]
		return null;

	}

	// Add a GeographicalArea object to the table, using the area name
	// as the key
	public void addArea(GeographicalArea area) {
		areas.put(area.getName(), area);
	}

	// Add an event object to the events list

	public void addEvent(HistoricalEvent event) {
		events.add(event);
	}

}
