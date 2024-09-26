class Process implements Comparable<Process> {
    private Integer id;
    private String name;
    private Integer priority;

    public Process(Integer id, String name, Integer priority) {
        this.id = id;
        this.name = name;
        setPriority(priority);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Process{id=" + id + ", name='" + name + "', priority=" + priority + "}";
    }
    
    @Override
    public int compareTo(Process p) {
        return this.priority.compareTo(p.priority);
    }
}