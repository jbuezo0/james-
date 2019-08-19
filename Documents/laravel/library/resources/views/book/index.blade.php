<!DOCTYPE html>
<html lang="es" dir="ltr">
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="{{ asset('css/app.css') }}"> <!--este comando me sirve para llamar a Bulma-->
    <title></title>
  </head>
  <body><br><br><br>
    <section class="section">
      <div class="columns is-centered">
        <div class="column is-narrow">
        <input type="submit" value="Libros" class="button is-black is-medium is-fullwidth is-rounded">
        <br>
        <table class="table  is-striped is-narrow is-hoverable is-fullwidt">
          <tr>
            <th>Nombre</th>
            <th>Autor</th>
            <th>Paginas</th>
            <th>Libros Totales</th>
            <th>Libros Diponibles</th>
            <th></th>
            <th></th>
          </tr>

          @foreach($book as $book) <!--la primero "student" es la variable que se creo en el controlador index. -->

          <tr>
            <td>{{ $book->name }}</td>
            <td>{{ $book->autor }}</td>
            <td>{{ $book->page }}</td>
            <td>{{ $book->total_copies }}</td>
            <td>{{ $book->available_copies}}</td>
            <td><a href="{{ route('book.show', $book->id) }}" class="button is-dark">Detalle</a></td>
          </tr>

          @endforeach
        </table>

        <div class="has-text-centered">
          <a href="{{ route('book.create') }}"><h1 class="button is-active is-medium is-rounded has-text-centered">Registrar</h1></a>
        </div>
      </div>
    </div>
      </section>
  </body>
</html>
