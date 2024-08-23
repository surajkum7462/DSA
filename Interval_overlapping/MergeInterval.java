package Interval_overlapping;


import java.util.*;

class Interval
{
    int start;
    int end;
    Interval(int start ,int end)
    {
        this.start=start;
        this.end=end;
    }
    @Override
    public String toString()
    {
        return "[" + start + "," + end + "]";
    }
}

public class MergeInterval {

   public static List<Interval> merge(List<Interval> intervals)
    {
        if(intervals.size() < 2)
        {
            return intervals;
        }
        intervals.sort(Comparator.comparingInt(in -> in.start));
        List<Interval> result=new LinkedList<>();
        Interval first=intervals.get(0);
        int start=first.start;
        int end=first.end;

        for(int i=1;i<intervals.size();i++)
        {
            Interval current=intervals.get(i);
            if(current.start <= end)
            {
                end=Math.max(current.end,end);
            }
            else{
                result.add(new Interval(start,end));
                start=current.start;
                end=current.end;
            }
        }
        result.add(new Interval(start,end));
        return result;
    }

    


    public static void main(String[] args) {
        List<Interval> intervals=new LinkedList<>(Arrays.asList(
            new Interval(1, 3),
            new Interval(2, 6),
            new Interval(7, 9)
        ));
        
        List<Interval> mergedIntervals =merge(intervals);
        for(Interval interval :mergedIntervals)
        {
            System.out.println(interval);
        }
    }
}
    

