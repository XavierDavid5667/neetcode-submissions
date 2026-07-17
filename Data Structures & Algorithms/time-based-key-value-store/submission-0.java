class Pair{
    String value;
    int timeStamp;

    public Pair(String value,int timeStamp){
        this.value=value;
        this.timeStamp=timeStamp;
    }
}

class TimeMap {
    Map<String,List<Pair>>map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        Pair pair=new Pair(value,timestamp);
        if(map.containsKey(key)){
           List<Pair>list= map.get(key);
           list.add(pair);
           map.put(key,list);
        }else{
            List<Pair> list=new ArrayList<>();
            list.add(new Pair(value,timestamp));
            map.put(key,list);
        }
    }
    
    public String get(String key, int timestamp) {
           List<Pair>list= map.get(key);
           if(list==null){
            return "";
           }
           int left=0;
           int right=list.size()-1;
           Pair ans=null;

           while(left<=right){
               int mid=left+(right-left)/2;
              Pair pair= list.get(mid);
              if(pair.timeStamp<=timestamp){
                 ans=pair;
                 left=mid+1;
              }else{
                right=mid-1;
              }
           }
           if(ans==null){
            return "";
           }
           return ans.value;
        
    }
}