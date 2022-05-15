
public class ListaEnlazadaTareas {
	private Nodo cabeza;
	private Nodo cola;
	
	public ListaEnlazadaTareas(){
		this.cabeza = null;
		this.cola = null;
	}
	public void agregarNodoInicio(Tarea tarea) {
		Nodo nuevoNodo = new Nodo(tarea);
		nuevoNodo.setSiguiente(cabeza);
		cabeza = nuevoNodo;
	}
	public void agregarNodoFinal(Tarea tarea) {
		Nodo nuevoNodo = new Nodo(tarea);
		nuevoNodo.setAnterior(cola);
		cola = nuevoNodo;
	}
	public void imprimirListaEnlazada(Nodo puntero) {
		if(puntero != null) {
			if(puntero != cabeza) {
				System.out.println(",");	
			}
			System.out.println(puntero.getTarea().getTitulo()+","+puntero.getTarea().getDescripcion()+","+puntero.getTarea().getFecha()+","+puntero.getTarea().getPrioridad());
			imprimirListaEnlazada(puntero.getSiguiente());
		}
	}
}
