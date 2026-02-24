package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        issues.add(new Issue("GPA Appeal", 2));
        issues.add(new Issue("Expulsion Risk", 1));
        issues.add(new Issue("Course Conflict", 3));
        issues.add(new Issue("Scholarship Problem", 2));
        issues.add(new Issue("Internship Deadline", 1));
    }

    public void showMostUrgent() {
        System.out.println("Most Urgent: " + issues.peek());
    }

    public void resolveIssues() {
        issues.poll();
        issues.poll();
        System.out.println("Two most urgent issues resolved.");
    }

    public void printRemainingIssues() {
        Iterator<Issue> iterator = issues.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void addNewIssue(String description, int urgency) {
        issues.add(new Issue(description, urgency));
    }
}
