package texteditorsystem;
// Updated documentation comment for version tracking
public class LogEntry {
    private String id;
    private long timestamp;

    public LogEntry(String id) {
        this.id = id;
        this.timestamp = System.currentTimeMillis();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getTimestamp() {
        return timestamp;
    }
}