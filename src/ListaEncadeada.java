
public class ListaEncadeada {

	private ListaNo head;
    private ListaNo tail;
    
    public void addFirst(int dado)
    {
    	ListaNo no = new ListaNo();
    	no.setDado(dado);
    	
    	ListaNo _nodeAux = this.head;
    	
    	this.head = no;
    	this.head.setProximo(_nodeAux);
    	
    	this.tail = _nodeAux;
    }
    
    public void append(int dado)
    {
    	ListaNo no = new ListaNo();
    	no.setDado(dado);
    	if(this.head == null){
    		this.head = no;
    	}
    	else{
    		this.tail.setProximo(no);
    	}
    	
    	tail = no;
    }  
    
    public void adicionarApos(int posicao, int dado)
    { 	
    	 ListaNo _currentNode = head;
    	 ListaNo _lastNode = head;
    	 
    	 ListaNo no = new ListaNo();
    	 no.setDado(dado);
    	 
         while (_currentNode != null)
         {
        	 _lastNode = _currentNode;
             if(_currentNode.getDado() == posicao)
             {
            	 no.setProximo(_currentNode.getProximo());
                 _currentNode.setProximo(no);
                 break;
             }             
             _currentNode = _currentNode.getProximo();
         }
    }
    
    public void remover(int dado){
    	
    	ListaNo _currentNode = this.head;
    	ListaNo _lastNode = this.head;
    	
    	while(_currentNode != null){
    		if(_currentNode.getDado() == dado){
    			_lastNode.setProximo(_currentNode.getProximo());
    			break;
    		}
    		_lastNode = _currentNode;
    		_currentNode = _currentNode.getProximo();
    	}    	
    }
    
    public void adicionarAntes(int dado){
    	ListaNo _currentNode = this.head;
    	ListaNo _lastNode = this.head;
    	
    	while(_currentNode != null){
    		if(_currentNode.getDado() == dado){
    			_lastNode.setDado(dado);
    			break;
    		}
    		_lastNode = _currentNode;
    		_currentNode = _currentNode.getProximo();
    	} 
    }
    
    public void print(){
    	ListaNo _currentNode = this.head;
        while (_currentNode != null) {
        	System.out.println(_currentNode.getDado());
        	_currentNode = _currentNode.getProximo();
        }
    }
	
}
