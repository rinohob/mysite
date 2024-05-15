/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.mysite.components.navigation;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class navigation__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("<div class=\"nav-bar\">\n    <div class=\"container\">\n        <nav class=\"navbar navbar-expand-md bg-dark navbar-dark\">\n            <a href=\"#\" class=\"navbar-brand\">MENU</a>\n            <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\">\n                <span class=\"navbar-toggler-icon\"></span>\n            </button>\n\n            <div class=\"collapse navbar-collapse justify-content-between\" id=\"navbarCollapse\">\n                <div class=\"navbar-nav mr-auto\">\n                    <a href=\"index.html\" class=\"nav-item nav-link active\">Home</a>\n                    <div class=\"nav-item dropdown\">\n                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Dropdown</a>\n                        <div class=\"dropdown-menu\">\n                            <a href=\"#\" class=\"dropdown-item\">Sub Item 1</a>\n                            <a href=\"#\" class=\"dropdown-item\">Sub Item 2</a>\n                        </div>\n                    </div>\n                    <a href=\"single-page.html\" class=\"nav-item nav-link\">Single Page</a>\n                    <a href=\"contact.html\" class=\"nav-item nav-link\">Contact Us</a>\n                </div>\n                <div class=\"social ml-auto\">\n                    <a href=\"\"><i class=\"fab fa-twitter\"></i></a>\n                    <a href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\n                    <a href=\"\"><i class=\"fab fa-linkedin-in\"></i></a>\n                    <a href=\"\"><i class=\"fab fa-instagram\"></i></a>\n                    <a href=\"\"><i class=\"fab fa-youtube\"></i></a>\n                </div>\n            </div>\n        </nav>\n    </div>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

