 --lo trabajo del ejerciccio y examen de laravel.
 -- consultas: 
 --tenemos cuatro tablas en la cual empezaremos agregar datos a las tablas padre.
 --aca vamos agregar un cliente.
 
 --1) aca agregamos nuestro segundo cliente ya que el primer se llama "Edgar."
 App\Client::create(['code'=>'002', 'fullname'=>'Jaime Buezo', 'birthdate'=>'1995-06-27','is_active'=>'1']);

 --2) aca vamos agregar un nuevo libro, este seria el segundo libro que agrego.
 App\Book::create(['name'=>'El libro negro del programador', 'autor'=>'Rafael Gomez Blanes','page'=>'135', 'total_copies'=>30, 'available_copies'=>25]);

--3) aca vamos agregar una orde a la tabla hijo, ya este si lleva mas de un paso para poder realizarlo.
 	-- paso 1. 
 	-- asignamos a la variable client, el cliente numero 1 que tenemos. 
  
 $client = App\Client::find(1);
 
 	-- paso 2.
 	-- Creamos nuestra orden, aca al campo cliente_id, le asignamo los valores
 	-- que lleva la variable cliente que fue la que declaramos anteriormente. 
 
 App\Order::create(['client_id'=>$client->id, 'order_number'=>'002', 'loan_date'=>'2019-07-31 20:36:15', 'delivery_date'=>'2020-07-31 20:36:15', 'state_order'=>'1']); 
  
 --4) ahora vamos agregar un detalle de orden, para eso vamos a seguir estos pasos;

 	--1) vamos a consultar todos los libros que tenemos y vamos aguardar un libro de esos dentro de una variable.
 	 1) App\book::all()
 	 2) $book = App\Book::find(1)

 	--2) ahora vamos a consultar todas nuestrar ordenes y vamos asiganar una de ella dentro de una variable.
 	1) App\order::all()
 	2) $order = App\Book::find(1)

 	--3) por ultimo vamos agregar nuestra detalle de orden.
 	App\OrderDetail::create(['book_id'=>$book->id, 'order_id'=>$order->id, 'quantity'=>5]);


 	$orderDetail = new App\orderDetail();
 	$order = App\Order::find(1);
 	$client = App\Client::find(1);
 	$book = App\Book::find(1);