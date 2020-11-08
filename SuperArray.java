public class SuperArray{

  private String [] data;
  private int size;

  public SuperArray(){
    data = new String[10];
  }

  public SuperArray(int InitialCapacity){
    data = new String[InitialCapacity];
  }

  public int size(){
    size = data.length;
    for (int i = 0;i<data.length;i++){
      if (data[i]==null){
        size = i;
        return i;
      }
    }
    return size;
  }

  public void resize(){
    String hello[] = new String[data.length*2];
    for (int i=0; i < data.length; i++){
      hello[i] = data[i];
    }
      data = hello;
  }

  public boolean add(String element){
    int current = size();
    if (current==data.length){
      resize();
    }
    data[current]=element;
    size += 1;
    return true;
  }

  public void add(int index, String element){
    size = size();
    if (size==data.length){
      resize();
    }
    for (int i = size-1; i > index; i++){
      data[i+1]=data[i];
    }
    data[index]=element;
    size += 1;
  }

   public String remove(int index){
     String removed = data[index];
     int curr = size();
     for (int i = index; i<curr ;i++){
       data[i]=data[i+1];
     }
     size = size -1;
     return removed;
   }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    String replaced = data[index];
    data[index]=element;
    return replaced;
  }

  public boolean isEmpty(){
    int curr = size();
    return curr == 0;
  }

  public String toString(){
    int curr = size();
    if (curr==0){
      return "[]";
    }
    String total = "[";
    for (int i = 0; i<curr-1;i++){
      total = total + data[i] + ", ";
    }
    return total + data[curr-1]+"]";
  }

  public boolean contains(String s){
    for (int i = 0; i<data.length;i++){
      if (data[i].equals(s)){
        return true;
      }
    }
    return false;
  }

  public void clear(){
    int curr = size();
    for (int i = 0;i<curr;i++){
      data[i]=null;
    }
    size = size();
  }

   public int indexOf(String s){
     int index = -1;
     int curr = size();
     for (int i = 0; i< curr;i++){
       if (data[i].equals(s)){
         return i;
       }
     }
     return index;
   }

   public int lastIndexOf(String value){
     int index = -1;
     int curr = size();
     for (int i = curr-1; i>=0;i--){
       if (data[i].equals(value)){
         return i;
       }
     }
     return index;
   }

    public String[] toArray(){
      int curr = size();
      String hello[] = new String[curr];
      for (int i=0; i < data.length; i++){
        hello[i] = data[i];
      }
      return hello;
    }
}
