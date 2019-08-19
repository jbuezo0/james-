<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});
/////
Route::resource('book', 'BookController');
Route::resource('client', 'ClientController');
Route::resource('order', 'OrderController');
Route::resource('period', 'SubjectYearController');

Route::get('/add/{book_id}', 'OrderController@add');

// Route::get('/insert', function () {
//     return view('insert');
// });
