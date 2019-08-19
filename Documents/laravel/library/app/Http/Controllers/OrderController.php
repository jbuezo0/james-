<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Book;

class OrderController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
      $book = Book::all();
      // session(['books'=>'hello']);
      return view('order.create', compact('book'));
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        //
    }

    public function add(Request $request)
    {
      // $book = session('books');
      // session()->forget('books');//esto es para cerrar la sesion. (forget) es para olvidar.


      // $books = session('books');
      // $request->session()->forget('books'))
      $id = $request->book_id;
      //$request->session()->forget('books');

      if($request->session()->exists('books')){
        $books = $request->session()->get('books');
        array_push($books, $id);
        $request->session()->put('books', $books);
      }else{
        $request->session()->put('books', array($id));
      }

      dd($request->session()->get('books'));//empty sirve para ver si esta vacia la variable, si nos da true, es que esta vacio.

      $book = Book::all();
      return view('order.create', compact('book'));

      // session(['books'=>$books]);

      // $book=Book::all();
      // return view('order.create', compact('book'));
    }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show($id)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function edit($id)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, $id)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function destroy($id)
    {
        //
    }
}
