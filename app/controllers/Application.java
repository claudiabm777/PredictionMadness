package controllers;

import models.ArbolC45;
import models.RandomF;
import models.RegresionLineal;
import models.TablaDe;
import play.*;
import play.data.DynamicForm;
import play.mvc.*;

import views.html.*;

import java.io.File;

import static play.data.Form.form;

public class Application extends Controller {

    public Result index() {
        return ok(index.render());
    }

    public Result clasifica() {
        return ok(services.render());
    }
    public Result nosotros() {
        return ok(about.render());
    }
    public Result regresion() {
        return ok(servicesregres.render());
    }

    public Result contacto() {
        return ok(contact.render());
    }
    public Result formu() {
        return ok(form.render());
    }
    public Result formutab() {
        return ok(formtab.render());
    }
    public Result formurand() {
        return ok(formrand.render());
    }
    public Result formureg() {
        return ok(formreg.render());
    }
    public  Result arbol() {
        try {
            ArbolC45 mundo = new ArbolC45();
            DynamicForm bindedForm = form().bindFromRequest();
            String a1 = bindedForm.get("a1").trim();
            String a2 = bindedForm.get("a2").trim();
            String a3 = bindedForm.get("a3").trim();
            String a4 = bindedForm.get("a4").trim();
            String a5 = bindedForm.get("a5").trim();
            String a6 = bindedForm.get("a6").trim();
            String a7 = bindedForm.get("a7").trim();
            String a8 = bindedForm.get("a8").trim();
            String a9 = bindedForm.get("a9").trim();
            String a10 = bindedForm.get("a10").trim();
            String a11 = bindedForm.get("a11").trim();
            String a12 = bindedForm.get("a12").trim();
            String a13 = bindedForm.get("a13").trim();
            String a14 = bindedForm.get("a14").trim();
            String a15 = bindedForm.get("a15").trim();
            String a16 = bindedForm.get("a16").trim();
            String a17 = "0";
            String a18 = "0";
            String a19 = "0";
            if (a16.equals("L")) {
                a16 = "1";
            } else if (a16.equals("V")) {
                a16 = "0";
                a17 = "1";
            } else if (a16.equals("D")) {
                a16 = "0";
                a18 = "1";
            } else {
                a16 = "0";
            }
            mundo.imprimirResultados(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19);
            String respuesta = mundo.darPrediccion();
            return ok(mensajeclasif.render(respuesta));
        } catch (Exception ee) {
            return badRequest(error.render());
        }
    }

    public  Result tabla(){
        try {
            TablaDe mundo = new TablaDe();
            DynamicForm bindedForm = form().bindFromRequest();
            String a1 = bindedForm.get("a1").trim();
            String a2 = bindedForm.get("a2").trim();
            String a3 = bindedForm.get("a3").trim();
            String a4 = bindedForm.get("a4").trim();
            String a5 = bindedForm.get("a5").trim();
            String a6 = bindedForm.get("a6").trim();
            String a7 = bindedForm.get("a7").trim();
            String a8 = bindedForm.get("a8").trim();
            String a9 = bindedForm.get("a9").trim();
            String a10 = bindedForm.get("a10").trim();
            String a11 = bindedForm.get("a11").trim();
            String a12 = bindedForm.get("a12").trim();
            String a13 = bindedForm.get("a13").trim();
            String a14 = bindedForm.get("a14").trim();
            String a15 = bindedForm.get("a15").trim();
            String a16 = bindedForm.get("a16").trim();
            String a17 = "0";
            String a18 = "0";
            String a19 ="0";
            if(a16.equals("L")){
                a16="1";
            }else if(a16.equals("V")){
                a16="0";
                a17="1";
            }else if(a16.equals("D")){
                a16="0";
                a18="1";
            }else{
                a16="0";
            }
            mundo.imprimirResultados(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19);
            String respuesta=mundo.darPrediccion();
            return ok(mensajereg.render(respuesta));
        }catch (Exception ee){
            return badRequest(error.render());
        }
    }

    public  Result regresionlin(){
        try {
            RegresionLineal mundo = new RegresionLineal();
            DynamicForm bindedForm = form().bindFromRequest();
            String a1 = bindedForm.get("a1").trim();
            String a2 = bindedForm.get("a2").trim();
            String a3 = bindedForm.get("a3").trim();
            String a4 = bindedForm.get("a4").trim();
            String a5 = bindedForm.get("a5").trim();
            String a6 = bindedForm.get("a6").trim();
            String a7 = bindedForm.get("a7").trim();
            String a8 = bindedForm.get("a8").trim();
            String a9 = bindedForm.get("a9").trim();
            String a10 = bindedForm.get("a10").trim();
            String a11 = bindedForm.get("a11").trim();
            String a12 = bindedForm.get("a12").trim();
            String a13 = bindedForm.get("a13").trim();
            String a14 = bindedForm.get("a14").trim();
            String a15 = bindedForm.get("a15").trim();
            String a16 = bindedForm.get("a16").trim();
            String a17 = "0";
            String a18 = "0";
            String a19 ="0";
            if(a16.equals("L")){
                a16="1";
            }else if(a16.equals("V")){
                a16="0";
                a17="1";
            }else if(a16.equals("D")){
                a16="0";
                a18="1";
            }else{
                a16="0";
            }
            mundo.imprimirResultados(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19);
            String respuesta=mundo.darPrediccion();
            return ok(mensajereg.render(respuesta));
        }catch (Exception ee){
            return badRequest(error.render());
        }
    }

    public  Result random(){
        try {
            RandomF mundo = new RandomF();
            DynamicForm bindedForm = form().bindFromRequest();
            String a1 = bindedForm.get("a1").trim();
            String a2 = bindedForm.get("a2").trim();
            String a3 = bindedForm.get("a3").trim();
            String a4 = bindedForm.get("a4").trim();
            String a5 = bindedForm.get("a5").trim();
            String a6 = bindedForm.get("a6").trim();
            String a7 = bindedForm.get("a7").trim();
            String a8 = bindedForm.get("a8").trim();
            String a9 = bindedForm.get("a9").trim();
            String a10 = bindedForm.get("a10").trim();
            String a11 = bindedForm.get("a11").trim();
            String a12 = bindedForm.get("a12").trim();
            String a13 = bindedForm.get("a13").trim();
            String a14 = bindedForm.get("a14").trim();
            String a15 = bindedForm.get("a15").trim();
            String a16 = bindedForm.get("a16").trim();
            String a17 = "0";
            String a18 = "0";
            String a19 ="0";
            if(a16.equals("L")){
                a16="1";
            }else if(a16.equals("V")){
                a16="0";
                a17="1";
            }else if(a16.equals("D")){
                a16="0";
                a18="1";
            }else{
                a16="0";
            }
            mundo.imprimirResultados(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19);
            String respuesta=mundo.darPrediccion();
            return ok(mensajeclasif.render(respuesta));
        }catch (Exception ee){
            return badRequest(error.render());
        }
    }

}
