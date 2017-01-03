package pl.mariuszczarny.model;

import java.time.LocalDateTime;
import java.util.Set;

public final class Project {
	private final Long id;
	private final String name;
	private final LocalDateTime startDate;
	private final LocalDateTime finishDate;
	private final String description;
	private final Set<Technology> technologySet;
	
	public Project(Long id, String name, LocalDateTime startDate, LocalDateTime finishDate, String description,
			Set<Technology> technologySet) {
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.description = description;
		this.technologySet = technologySet;
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public LocalDateTime getFinishDate() {
		return finishDate;
	}

	public String getDescription() {
		return description;
	}

	public Set<Technology> getTechnologySet() {
		return technologySet;
	}

	@Override
	public String toString() {
		return "Project [name=" + name + ", startDate=" + startDate + ", finishDate=" + finishDate + ", description="
				+ description + ", technologyList=" + technologySet + "]";
	}
}
