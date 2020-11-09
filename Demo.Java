public class Demo{
  public static void removeDuplicates(SuperArray s){
    int size = s.size();
    for (int i=0;i<size;i++){
      for (int j=0;j<size;j++){
        if (i!=j && (s.get(i)).equals(s.get(j))){
          s.remove(j);
          size = s.size();
        }
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray hello = new SuperArray();
    int size = a.size();
    for (int i = 0;i<size;i++){
      for (int j = 0; j<b.size();j++){
        if (a.get(i).equals(b.get(j))){
          hello.add(a.get(i));
        }
      }
    }
    removeDuplicates(hello);
    return hello;
  }

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray out = new SuperArray();
    int time = 0;
    if (a.size()>b.size()){
      time = a.size();
    }
    else{
      time = b.size();
    }

    for (int i=0; i<time; i++){
      if (i< a.size()){
        out.add(a.get(i));
      }
      if (i< b.size()){
        out.add(b.get(i));
      }
    }
    return out;
  }
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    SuperArray words1 = new SuperArray();
    words1.add("kani");   words1.add("uni");    words1.add("ebi");     words1.add("kani");
    words1.add("ebi");     words1.add("toro");  words1.add("ebi");

    SuperArray words2 = new SuperArray();
    words2.add("kani");   words2.add("uni");    words2.add("ebi");     words2.add("kani");
    words2.add("ebi");     words2.add("toro");

    System.out.println(words);
    System.out.println(zip(words, words1));
    System.out.println(words.lastIndexOf("ebi"));
    System.out.println(words.equals(words1));
    System.out.println(words2.equals(words1));
    removeDuplicates(words);
    System.out.println(words);
    System.out.println(findOverlap(words,words1));
    System.out.println(words.lastIndexOf("ebi"));
  }
}
