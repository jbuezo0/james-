<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateOrdersTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('orders', function (Blueprint $table) {
            $table->bigIncrements('id');

            $table->string('order_number', 50);
            $table->DateTime('loan_date');
            $table->DateTime('delivery_date');
            $table->string('state_order');
            $table->bigInteger('client_id')->unsigned();
            $table->timestamps();

            $table->foreign('client_id')->references('id')->on('clients');
          });


    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('orders');
    }
}
