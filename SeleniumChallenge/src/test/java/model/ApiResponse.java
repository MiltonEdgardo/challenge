package model;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse {
    public List<Department> departments;
    public List<Landing> landings;
    public MoreCategories more_categories;
    public List<HighPriority> high_priority;

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Landing> getLandings() {
        return landings;
    }

    public void setLandings(List<Landing> landings) {
        this.landings = landings;
    }

    public MoreCategories getMore_categories() {
        return more_categories;
    }

    public void setMore_categories(MoreCategories more_categories) {
        this.more_categories = more_categories;
    }

    public List<HighPriority> getHigh_priority() {
        return high_priority;
    }

    public void setHigh_priority(List<HighPriority> high_priority) {
        this.high_priority = high_priority;
    }
}
