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
            <th>Diponibles</th>
            <th></th>
          </tr>

          @foreach($book as $book) <!--la primero "student" es la variable que se creo en el controlador index. -->

          <tr>
            <td>{{ $book->name }}</td>
            <td>{{ $book->autor }}</td>
            <td>{{ $book->available_copies}}</td>
            <td><a href="/add/{{ $book->id }}" class="button is-dark">Generar orden</a></td>
          </tr>

          @endforeach
        </table>

      </div>
    </div>
      </section>
  </body>
</html>
