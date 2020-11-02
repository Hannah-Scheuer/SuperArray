public class SuperArray{

  private String [] data;
  private int size;

  public SuperArray(){
    data = new String[10];
  }

  public int size(){
    size = data.length();
    for (int i = 0;i<data.length();i++){
      if (data[i]==null){
        size = i;
        return i;
      }
    }
    return size;
  }

  public void moreSpace(){
    int hello[] = new String[data.length()+1];
    for (int i=0; i < data.length(); i++){
      hello[i] = data[i];
    }
      data = hello;
  }

  public boolean add(String element){
    if (size>data.length()){
      data.moreSpace();
      data[data.length()-1]=element;
    }
    else{
      data[data.size()]=element;
    }
  }

  public String get(int index){
    return data[index];
  }
}
