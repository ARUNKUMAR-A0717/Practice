class stackArray{
      int [] Stack= new int[10];
        int top=-1;
        
void push(int value){
       if(top == 9){
          System.out.println(" stack over flow ");
       }
    else {
    Stack[++top]=value;
          System.out.println("element added in the stack " +value);
    }
    }
void pop(){ 
  if(top == -1){
          System.out.println(" stack underflow");
}
    else {

          System.out.println("element poped " +Stack[top]);
          top--;
    }
  
}
    
void peek(){
     if(top == -1){
          System.out.println(" stack showesd");
    }
    else {
   
          System.out.println("peeked element " +Stack[top]);
    }

}

void display(){
    if(top == -1){
        System.out.println("Stack empty");
    }
    else{
        System.out.println("Stack elements :");
        for (int i = top;i>=0;i--){
            System.out.println(Stack[i]);
        }
    }
}


    public static void main (String [] args){
      
        stackArray s = new stackArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.peek();
        s.pop();
        s.peek();
        s.display();
        

    } 

    
}