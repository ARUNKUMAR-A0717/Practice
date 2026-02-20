class book{
    void name(){
        System.out.println("the tree");
    }

class title extends book{
    void topic(){
    System.out.println("the art of tree");
    }
}
class author extends book{
    void name1(){
        System.out.println("arun");
    }
}
    public static void main(String[] args){
        book bo = new book();
        bo.name();
    }
}
