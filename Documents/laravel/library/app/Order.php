<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Order extends Model
{

  protected $fillable = ['client_id', 'order_number', 'loan_date', 'delivery_date', 'state_order'];

  /**
  * Esta funcion sirve para hacer referencia a la tabla padre que seria
  * la de client ya que en este caso la tabla clien es padre de order.
  */
  public function client()
  {
    return $this->belongsTo('App\Client');
  }
  /**
  * Esta funcion sirve para hacer referencia a la tabla hijo que
  * seria hijo de la tabla Order.
  */
  public function orderDetail()
  {
    return $this->hasMany('App\OrderDetail');
  }
}
