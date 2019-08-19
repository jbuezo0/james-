<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Client;


class ClientController extends Controller
{
  /**
  * Mostrar una lista del los clientes.
  * @return \Illuminate\Http\Response
  */
  public function index()
  {
    $client = Client::all();
    return view('client.index', compact('client'));
  }

  /**
  * Mostrar el formulario para crear un nuevo cliente.
  * @return \Illuminate\Http\Response
  */
  public function create()
  {
    return view('client/create');
  }

  /**
  *Almacene un cliente recién creado en el almacenamiento.
  * @param  \Illuminate\Http\Request  $request
  * @return \Illuminate\Http\Response
  */
  public function store(Request $request)
  {
    $client = Client::create($request->all());
    return view('client.show', compact('client'));
  }

  /**
  * Mostrar el cliente especificado.
  * @param  int  $id
  * @return \Illuminate\Http\Response
  */
  public function show($id)
  {
    $client = Client::findOrFail($id);
    return view('client.show', compact('client'));
  }

  /**
  * Mostrar el formulario para editar el cliente especificado.
  * @param  int  $id
  * @return \Illuminate\Http\Response
  */
  public function edit($id)
  {
    $client = Client::findOrFail($id);
    return view('client.edit', compact('client'));
  }

  /**
  * Actualiza el cliente especificado en el almacenamiento.
  * @param  \Illuminate\Http\Request  $request
  * @param  int  $id
  * @return \Illuminate\Http\Response
  */
  public function update(Request $request, $id)
  {
    $client = Client::find($id);
    $client -> update($request->all());
    return view('client.show', compact('client'));
  }

  /**
  * Eliminar el cliente especificado del almacenamiento.
  * @param  int  $id
  * @return \Illuminate\Http\Response
  */
  public function destroy($id)
  {
    Client::find($id)->delete();
    $client = Client::all();
    return view('client.index', compact('client'));
  }
}
