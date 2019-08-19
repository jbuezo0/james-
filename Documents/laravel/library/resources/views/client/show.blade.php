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
      <input type="submit" value="{{ $client->fullname }}" class="button is-black is-medium is-fullwidth is-rounded">
        <br>
        <table class="table is-striped is-narrow is-hoverable is-fullwidth">
          <!--<tr>
            <th>Nombre</th><td>{{ $client->name }}</td>
          </tr>-->
          <tr>
            <th>Codigo</th><td>{{ $client->code }}</td>
          </tr>
          <tr>
            <th>Nombre</th><td>{{ $client->fullname }}</td>
          </tr>
          <tr>
            <th>Fecha Nacimiento</th><td>{{ $client->birthdate }}</td>
          </tr>
          <tr>
            <th>Activo</th><td>{{ $client->is_active }}</td>
          </tr>

        </table>
        <br>
        <form action="{{ route('client.destroy', $client->id)}}" method="post">
          @csrf
          @method('DELETE')
          <div class="has-text-centered">
          <a href="{{ route('client.index') }}" class="button is-link is-normal is-info is-rounded has-text-centered">Volver</a>
          <a href="{{ route('client.edit', $client->id) }}" class="button is-success is-normal is-info is-rounded has-text-centered">Editar</a>
          <input type="submit" value="Eliminar" class="button is-danger is-normal is-info is-rounded has-text-centered">
        </div>
        </form>
    </div>

    <div class="column"></div>

    </div>
  </body>
</html>
