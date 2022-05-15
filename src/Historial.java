public class Historial{
  //Clase nodo
    private class Node<T> {
        private T data;
        private Node<T> next; 

        private Node(T data){ 
            this.data = data; 
            this.next = null; 
        } 

        public Node() 
        { this(null); } 

        public T getData() 
        { return data; } 

        public void setData(T data) 
        { this.data = data; } 

        public Node getNext() 
        { return next; } 

        public void setNext(Node<T> next) 
        { this.next = next; }
    }
    
//Implementación pila usando referencias
  
  Node cabeza;
        
  public Historial(){
    this.cabeza = null;
  }
        
  public void insert(String dato){
    Node nElemento = new Node(dato);
    if (this.isEmpty()){
      cabeza = nElemento;
    }else{
      nElemento.setNext(cabeza);
      cabeza = nElemento;
    }
  }
        
  public boolean isEmpty()
    {
      return cabeza == null; 
    }
  
    public void printHistorial(){
      Node elemento = cabeza;
      System.out.println("Historial de Tareas Completas:");
      while(elemento != null){
        System.out.println( "* "  + elemento.getData() + "."); 
        elemento = elemento.getNext();
      }
    }
}

  
