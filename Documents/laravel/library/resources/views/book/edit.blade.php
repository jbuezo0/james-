<!DOCTYPE html>
<html lang="es" dir="ltr">
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="{{ asset('css/app.css') }}"> <!--este comando me sirve para llamar a Bulma-->
    <title></title>
  </head>
  <body>
    <br><br>
    <div class="columns">
    <div class="column"></div>
    <div class="column">
      <h1 class="subtitle is-2 has-text-centered">Editar Libro</h1>
    <form method="post" action="{{ route('book.update', $book->id) }}">

        @csrf
        @method('PATCH')
        {{ csrf_field() }}

        <div class="field">
          <div class="control">
        <input type="text" name="name" value="{{$book->name}}" class="input is-primary is-large has-text-centered is-rounded" required placeholder""><br>
          </div>
        </div>

        <div class="field">
          <div class="control">
        <input type="text" name="autor" value="{{$book->autor}}" class="input is-primary is-large has-text-centered is-rounded" required placeholder=""><br>
          </div>
        </div>

        <div class="field">
          <div class="control">
        <input type="text" name="page" value="{{$book->page}}" class="input is-primary is-large has-text-centered is-rounded" required placeholder=""><br>
          </div>
        </div>

        <div class="field">
          <div class="control">
        <input type="text" name="total_copies" value="{{$book->total_copies}}" class="input is-primary is-large has-text-centered is-rounded" required placeholder=""><br>
          </div>
        </div>

        <div class="field">
          <div class="control">
        <input type="text" name="available_copies" value="{{$book->available_copies}}" class="input is-primary is-large has-text-centered is-rounded" required placeholder=""><br>
          </div>
        </div>

        <div class="has-text-centered">
        <input type="submit" value="guardar" class="button is-success is-outlined is-active is-medium is-rounded has-text-centered" required>
      </div>
    </form>
    </div>

    <div class="column"></div>

  </div>
  </body>
</html>
