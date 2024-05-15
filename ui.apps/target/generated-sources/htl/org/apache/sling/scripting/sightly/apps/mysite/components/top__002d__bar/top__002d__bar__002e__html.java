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
package org.apache.sling.scripting.sightly.apps.mysite.components.top__002d__bar;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class top__002d__bar__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
Collection var_collectionvar2_list_coerced$ = null;
Object _global_contenobj = null;
Object _dynamic_contentobj = bindings.get("contentobj");
out.write("<div class=\"top-bar\">\n    <div class=\"container\">\n        <div class=\"row\">\n            <div class=\"col-md-6\">\n                <div class=\"tb-contact\">\n                    <p><i class=\"fas fa-envelope\"></i>");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "mail"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</p>\n                    <p><i class=\"fas fa-phone-alt\"></i>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "number"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\n                </div>\n            </div>\n            <div class=\"col-md-6\">\n                ");
{
    Object var_collectionvar2 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "nav");
    {
        long var_size3 = ((var_collectionvar2_list_coerced$ == null ? (var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2)) : var_collectionvar2_list_coerced$).size());
        {
            boolean var_notempty4 = (var_size3 > 0);
            if (var_notempty4) {
                {
                    long var_end7 = var_size3;
                    {
                        boolean var_validstartstepend8 = (((0 < var_size3) && true) && (var_end7 > 0));
                        if (var_validstartstepend8) {
                            out.write("<div class=\"tb-menu\">");
                            if (var_collectionvar2_list_coerced$ == null) {
                                var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2);
                            }
                            long var_index9 = 0;
                            for (Object page : var_collectionvar2_list_coerced$) {
                                {
                                    boolean var_traversal11 = (((var_index9 >= 0) && (var_index9 <= var_end7)) && true);
                                    if (var_traversal11) {
                                        out.write("\n                    ");
_global_contenobj = renderContext.call("use", (renderContext.getObjectModel().toString(page) + "/jcr:content"), obj());
                                        out.write("\n                     <a");
                                        {
                                            String var_attrcontent12 = (renderContext.getObjectModel().toString(renderContext.call("xss", page, "uri")) + ".html");
                                            out.write(" href=\"");
                                            out.write(renderContext.getObjectModel().toString(var_attrcontent12));
                                            out.write("\"");
                                        }
                                        out.write(">");
                                        {
                                            Object var_13 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_contentobj, "jcr:title"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_13));
                                        }
                                        out.write("</a>\n                    \n                ");
                                    }
                                }
                                var_index9++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar2_list_coerced$ = null;
}
out.write("\n            </div>\n        </div>\n    </div>\n</div>\n\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

