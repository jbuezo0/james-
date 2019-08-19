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
      <h1 class="subtitle is-2 has-text-centered">Registrar cliente</h1>
    <form method="post" action="{{ route('client.store') }}">

        {{ csrf_field() }}
        <div class="field">
          <div class="control">
            <input type="text" name="code"  class="input is-black is-large has-text-centered is-rounded" required placeholder="Codigo"><br>
          </div>
        </div>

        <div class="field">
          <div class="control">
            <input type="text" name="fullname" class="input is-primary is-large has-text-centered is-rounded"  required placeholder="Nombre Completo"><br>
          </div>
        </div>

        <div class="field">
          <div class="control">
            <input type="date" name="birthdate" class="input is-primary is-large has-text-centered is-rounded"  required placeholder="Fecha de Nacimiento"><br>
          </div>
        </div>

        <div class="field">
          <div class="control">
            <div class="select is-large  is-primary is-rounded is-fullwidth">
              <select name="is_active">
                <option  class="is-rounded" value="1">Activo</option>
                <option value="0">Inactivo</option>
              </select>
            </div>
          </div>
        </div>

        <input type="submit" value="guardar" class="button is-active is-medium is-rounded has-text-centered"  required>
    </form>
  </div>

  <div class="column"></div>

  </div>
  </body>
</html>
