package com.example1.videogames.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListController {

/*un metodo con RequestMapping, retorna el nombre del template que se enviara al navegador.
Los templates estan ubicados en el directorio 'templates' del proyecto y generan un HTML.
Cada metodo atiene una URL diferente.
El metodo se ejecuta y retorna un String con el nombre del template que mostrara un HTML
 */
    @RequestMapping("/")
    public String gamesList(){
        //Search of games
        return "List"; //pagina a la cual va a redirigir una vez haga el procesamiento
    }






}
