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

  
}
