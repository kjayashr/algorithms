class Solution {
    public int minMeetingRooms(Interval[] intervals) {
        if(intervals == null || intervals.length == 0)
            return 0;
       Arrays.sort(intervals, new Comparator<Interval> () {
           @Override 
          public int compare (Interval i1, Interval i2)
          {
              return i1.start - i2.start;
          }
       });
        
        PriorityQueue<Interval> heap = new PriorityQueue<Interval>(intervals.length,new Comparator<Interval>()
                                                                  {
                                                                      @Override 
                                                                      public int compare(Interval i1,Interval i2)
                                                                      {
                                                                          return i1.end-i2.end;
                                                                      }
                                                                  });
        heap.add(intervals[0]);
     for(int i =1;i<intervals.length;i++)
     {
         Interval current = heap.poll();
         if(intervals[i].start >= current.end)
         {
             current.end = intervals[i].end;
         }
         else
         {
             heap.add(intervals[i]);
         }
         
         heap.add(current);
     }
        return heap.size();
    }
}
