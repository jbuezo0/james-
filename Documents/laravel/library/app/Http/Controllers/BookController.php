<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Book;

class BookController extends Controller
{
    /**
     * Mostrar una lista del los libros.
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
      $book = Book::all();
    return view('book.index', compact('book'));
    }

    /**
     * Mostrar el formulario para crear un nuevo Libro.
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
          return view('book/create');
    }

    /**
     *Almacene un Libro recién creado en el almacenamiento.
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
      $book = Book::create($request->all());
      return view('book.show', compact('book'));
    }

    /**
     * Mostrar el Libro especificado.
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show($id)
    {
      $book = Book::findOrFail($id);
    return view('book.show', compact('book'));
    }

    /**
     * Mostrar el formulario para editar el libro especificado.
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function edit($id)
    {
      $book = book::findOrFail($id);
    return view('book.edit', compact('book'));
    }

    /**
     * Actualiza el libro especificado en el almacenamiento.
     * @param  \Illuminate\Http\Request  $request
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, $id)
    {
      $book = Book::find($id);
      $book -> update($request->all());
      return view('book.show', compact('book'));
    }

    /**
     * Eliminar el libro especificado del almacenamiento.
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function destroy($id)
    {
      Book::find($id)->delete();
      $book = Book::all();
      return view('book.index', compact('book'));
    }
}
