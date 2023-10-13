package model;

public class Task {
    private String title;
    private String description;
    private String priority;

    private String limitDate;

    
    public Task(String title, String description, String priority, String limitDate) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.limitDate = limitDate;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getPriority() {
        return priority;
    }


    public void setPriority(String priority) {
        this.priority = priority;
    }


    public String getLimitDate() {
        return limitDate;
    }


    public void setLimitDate(String limitDate) {
        this.limitDate = limitDate;
    }


    @Override
    public String toString() {
        return "\nTask" + title + ", description=" + description + ", priority=" + priority + ", limitDate=" + limitDate;
    }

    
    
}
