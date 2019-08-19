<!DOCTYPE html>
<html lang="es" dir="ltr">
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="{{ asset('css/app.css') }}">
    <title></title>
  </head>
  <body><br><br>
    <div class="columns">
      <div class="column"></div>

    <div class="column">
      <h1 class="subtitle is-2 has-text-centered">Registrar Libro</h1>
    <form method="post" action="{{ route('book.store') }}">

        {{ csrf_field() }}
        <div class="field">
          <div class="control">
            <input type="text" name="name"  class="input is-primary is-large has-text-centered is-rounded" required placeholder="Nombre"><br>
          </div>
        </div>

        <div class="field">
          <div class="control">
            <input type="text" name="autor" class="input is-primary is-large has-text-centered is-rounded"  required placeholder="Nombre Autor"><br>
          </div>
        </div>

        <div class="field">
          <div class="control">
            <input type="text" name="page" class="input is-primary is-large has-text-centered is-rounded"  required placeholder="Numero de paginas"><br>
          </div>
        </div>

        <div class="field">
          <div class="control">
            <input type="text" name="total_copies" class="input is-primary is-large has-text-centered is-rounded"  required placeholder="Copias totales"><br>
          </div>
        </div>

        <div class="field">
          <div class="control">
            <input type="text" name="available_copies" class="input is-primary is-large has-text-centered is-rounded"  required placeholder="Copias disponible"><br>
          </div>
        </div>



        <input type="submit" value="guardar" class="button is-primary is-medium is-fullwidth is-rounded"  required>
    </form>
  </div>

  <div class="column"></div>

  </div>
  </body>
</html>
