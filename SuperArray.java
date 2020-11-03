public class SuperArray{

  private String [] data;
  private int size;

  public SuperArray(){
    data = new String[10];
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
    String hello[] = new String[data.length+1];
    for (int i=0; i < data.length; i++){
      hello[i] = data[i];
    }
      data = hello;
  }

  public boolean add(String element){
    int current = size();
    if (current==data.length){
      resize();
      data[data.length-1]=element;
    }
    else{
      data[current]=element;
    }
    size += 1;
    return true;
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    String replaced = data[index];
    data[index]=element;
    return replaced;
  }

}
