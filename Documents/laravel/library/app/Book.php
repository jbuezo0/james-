<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Book extends Model
{
  protected $fillable = ['name', 'autor', 'page', 'total_copies', 'available_copies'];

  /**
  * esta funcion sirve para hacer referencia a la tabla hijo que seria
  */
  public function orderDetail()
  {
    return $this->hasMany('App\orderDetail');// la tabla OrderDetail
  }
}
