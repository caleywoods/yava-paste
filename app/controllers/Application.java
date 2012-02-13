package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
      List<Snippet> allSnippets = Snippet.find(
          "order by createdAt desc"
      ).from(0).fetch(10);
      render(allSnippets);
    }

}
