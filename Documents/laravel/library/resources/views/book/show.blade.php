<!DOCTYPE html>
<html lang="es" dir="ltr">
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="{{ asset('css/app.css') }}">
    <title></title>
  </head>
  <body>
    <br><br><br><br><br>
    <div class="columns">

    <div class="column"></div>

    <div class="column">
      <input type="submit" value="{{ $book->name }}" class="button is-dark is-medium is-fullwidth is-rounded">
        <br>
        <table class="table is-striped is-narrow is-hoverable is-fullwidth">
          <!--<tr>
            <th>Nombre</th><td>{{ $book->name }}</td>
          </tr>-->
          <tr>
            <th>Nombre</th><td>{{ $book->name }}</td>
          </tr>
          <tr>
            <th>Autor</th><td>{{ $book->autor }}</td>
          </tr>
          <tr>
            <th>Numero de Paginas</th><td>{{ $book->page }}</td>
          </tr>
          <tr>
            <th>Copias totales</th><td>{{ $book->total_copies }}</td>
          </tr>
          <tr>
            <th>Copias disponibles</th><td>{{ $book->available_copies}}</td>
          </tr>
        </table>
        <br>
        <form action="{{ route('book.destroy', $book->id)}}" method="post">
          @csrf
          @method('DELETE')
          <div class="has-text-centered">
            <a href="{{ route('book.index') }}" class="button is-link is-normal is-info is-rounded has-text-centere">Volver</a>
          <a href="{{ route('book.edit', $book->id) }}" class="button is-success is-normal is-info is-rounded has-text-centered">Editar</a>
          <input type="submit" value="Eliminar" class="button is-danger is-normal is-info is-rounded has-text-centered">
        </div>
        </form>
    </div>

    <div class="column"></div>

    <span class="icon has-text-warning">
      <i class="fas fa-exclamation-triangle"></i>
    </span>
    </div>
  </body>
</html>
