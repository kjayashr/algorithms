class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals,new Comparator<Interval>(){
            @Override
            public int compare(Interval obj0,Interval obj1)
            {
                return obj0.start - obj1.start;
            }
        });
        List<Interval> ret = new ArrayList<>();
        Interval prev = null;
        for(Interval intr : intervals)
        {
            if (prev  == null || (intr.start > prev.end) )
            {
            ret.add(intr); 
            prev = intr;
            }
            else if ( intr.end > prev.end )
            {
                prev.end = intr.end;
            }
            
        }
        return ret;
        
    }
