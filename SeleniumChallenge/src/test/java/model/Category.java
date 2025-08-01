package model;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Category {
    public String id;
    public String name;
    public String permalink;
    public List<ChildCategory> children_categories;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public List<ChildCategory> getChildren_categories() {
        return children_categories;
    }

    public void setChildren_categories(List<ChildCategory> children_categories) {
        this.children_categories = children_categories;
    }
}
