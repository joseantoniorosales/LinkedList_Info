# LinkedList_Info


### 1.- ¿QUÉ ES UNA LINKEDLIST?

LinkedList es una implementación de la interfaz List que nos permite crear colecciones donde los elementos están secuenciados (uno detrás de otro) conectados al siguiente elemento de la lista por medio de un enlace. La principal utilidad de esta colección es crear listas en las que cada elemento (conocido como nodo en esta colección) está formado por 2 partes: la primera es donde se guarda la información principal del nodo, siendo estos valores genéricos, y una referencia que lo enlaza con el siguiente elemento de la lista, así como una referencia al elemento anterior (cabe destacar que el primer elemento no tiene referencia anterior y el último no la tiene al posterior, como es lógico).  

### 2.- DIFERENCIAS ENTRE LINKEDLIST Y ARRAYLIST

Las principales diferencias entre LinkedList y ArrayList son:
		 
     -Mientras que ArrayList solo guarda un valor en una única posición, LinkedList guarda 3 valores diferentes (las referencias tanto al elemento anterior y al posterior, así como la información del elemento en sí) en una posición.
	
    -ArrayList genera un array redimensionable mientras que LinkedList proporciona la implementación de la lista doble que hereda de List.
		
    -Cuando se añade un elemento, ArrayList lo mete en el siguiente espacio disponible, mientras que LinkedList es capaz de insertarlo en cualquier lugar cambiando los valores de la referencia posterior y anterior.
		
    -ArrayList es capaz de acceder a cualquier elemento de forma aleatoria usando índices, mientras que LinkedList tiene que ser iterado desde el primer elemento hasta llegar al elemento buscado.
		
    -ArrayList tiene un almacenamiento limitado (aunque redimensionable), mientras que LinkedList posee almacenamiento infinito (al menos hasta la máxima potencia de tu ordenador).

## 3.- PRINCIPALES MÉTODOS DE LINKEDLIST
	
    -add(Elemento): Añade un elemento a continuación del último elemento de la lista.
	
    -addFirst(Elemento): Añade un elemento en la primera posición de la lista.
	 
    -addLast(Elemento): Añade un elemento en la última posición de la lista.
  
    -get(Index): Devuelve el valor de la posición especificada de la lista.
	
    -clear(): Limpia la lista (La vacía).
