package org.milan.algorithm.greedy;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * refer {@link @https://www.geeksforgeeks.org/find-maximum-meetings-in-one-room/}
 * <p>
 * Time complexity: O(nlogn)
 * Space complexity: O(1)
 *
 * @author Milan Rathod
 */
public class MaximumMeeting {

    static class Meeting {
        int start;

        int end;

        int pos;

        public Meeting(int start, int end, int pos) {
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }

    public int maxMeeting(int[] start, int[] end, int n) {

        List<Meeting> meetingList = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            meetingList.add(new Meeting(start[i], end[i], i + 1));
        }

        // Sorting of meeting according to their finish time
        meetingList.sort(Comparator.comparingInt(o -> o.end));

        // time_limit to check whether new
        // meeting can be conducted or not.
        int timeLimit = Integer.MIN_VALUE;

        Iterator<Meeting> iterator = meetingList.iterator();

        while (iterator.hasNext()) {
            Meeting meeting = iterator.next();
            if (meeting.start < timeLimit) {
                iterator.remove();
            } else {
                // Update time limit
                timeLimit = meeting.end;
            }
        }

        return meetingList.size();
    }
}
