/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/*
 * Esta clase contiene todos los contructores, getters y setters del modelo Functions
 * @author JBuezo
 */
public class Functions {

    /* *
    Las variables que utilizamos para elmodelo de Functions
     */
    private int id;
    private String classification;
    private String hour;
    private String premiere;
    private int movie_id;
    private int usuario_id;
    private String usuariousuario;
    private String moviemovie;
    private Usuario usuario;
    private Movie movie;

    /**
     * Constructores que ocuparemos en los metodos Dao
     */
    public Functions(String classification, String hour, String premiere, int movie_id, int usuario_id) {
        this.classification = classification;
        this.hour = hour;
        this.premiere = premiere;
        this.movie_id = movie_id;
        this.usuario_id = usuario_id;
    }

    public Functions(int id, String classification, Usuario usuario) {
        this.id = id;
        this.classification = classification;
        this.usuario = usuario;
    }

    public Functions(int id, String classification, Movie movie) {
        this.id = id;
        this.classification = classification;
        this.movie = movie;
    }

    public Functions(int id, String classification, String hour, String premiere, String usuariousuario , String moviemovie) {
        this.id = id;
        this.classification = classification;
        this.hour = hour;
        this.premiere = premiere;
        this.usuariousuario = usuariousuario;
        this.moviemovie = moviemovie;
    }

    public Functions(int id, String classification, String hour, String premiere) {
        this.id = id;
        this.classification = classification;
        this.hour = hour;
        this.premiere = premiere;
    }

     public Functions(int id, String classification, String hour, String premiere, int usuario_id) {
        this.classification = classification;
        this.hour = hour;
        this.premiere = premiere;
        this.usuario_id = usuario_id;
    }

    public Functions(int id, String usuariousuario, String moviemovie, Usuario usuario, Movie movie) {
        this.id = id;
        this.usuariousuario = usuariousuario;
        this.moviemovie = moviemovie;
        this.usuario = usuario;
        this.movie = movie;
    }

    public Functions(int id, String classification, String hour, String premiere, int movie_id, int usuario_id, String usuariousuario, String moviemovie, Usuario usuario, Movie movie) {
        this.id = id;
        this.classification = classification;
        this.hour = hour;
        this.premiere = premiere;
        this.movie_id = movie_id;
        this.usuario_id = usuario_id;
        this.usuariousuario = usuariousuario;
        this.moviemovie = moviemovie;
        this.usuario = usuario;
        this.movie = movie;
    }

    public Functions(int aInt, String string, com.models.Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Functions(int id) {
        this.id = id;
    }

    

  

   
    /**
     * Creacion de Metodos Get y Set
     * @return 
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

   

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getPremiere() {
        return premiere;
    }

    public void setPremiere(String premiere) {
        this.premiere = premiere;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getUsuariousuario() {
        return usuariousuario;
    }

    public void setUsuariousuario(String usuariousuario) {
        this.usuariousuario = usuariousuario;
    }

    public String getMoviemovie() {
        return moviemovie;
    }

    public void setMoviemovie(String moviemovie) {
        this.moviemovie = moviemovie;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    private static class Usuario {

        public Usuario() {
        }
    }

    
    
}
