package constructor.copyconstructor.copytwelve;

public class Session {
    private String sessionId;
    private long createdAt;

    public Session(String sessionId, long createdAt) {
        this.sessionId = sessionId;
        this.createdAt = createdAt;
    }
    public Session(Session other) {
        this.sessionId = other.sessionId;
        this.createdAt = other.createdAt;
    }
    public String toString(){
        return sessionId + " at " + createdAt;
    }}
