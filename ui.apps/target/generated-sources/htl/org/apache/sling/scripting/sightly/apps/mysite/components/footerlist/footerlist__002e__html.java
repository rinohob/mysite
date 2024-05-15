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
package org.apache.sling.scripting.sightly.apps.mysite.components.footerlist;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class footerlist__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
Object _dynamic_page = bindings.get("page");
Object _dynamic_contentobj = bindings.get("contentobj");
{
    String var_0 = (((((((((((((("<!-- <div class=\"footer-widget\">\n        <h3 class=\"title\">" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title"), "comment"))) + "</h3>\n        <ul data-sly-list.page=\"") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "nav"), "comment"))) + "\">\n            <sly dtat-sly-use.contentobj=\"") + renderContext.getObjectModel().toString(renderContext.call("xss", _dynamic_page, "comment"))) + "/jcr:content\" />\n            <li><a href=\"") + renderContext.getObjectModel().toString(renderContext.call("xss", _dynamic_page, "comment"))) + ".html\">\"") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_contentobj, "jcr:title"), "comment"))) + "</a></li>\n        </ul>\n\n<div class=\"contact-info\"  data-sly-test=\"") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "socailicons"), "comment"))) + "\">\n   ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "txt"), "htmlt"))) + "\n    <div class=\"social\">\n        <a href=\"\"><i class=\"fab fa-twitter\"></i></a>\n        <a href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\n        <a href=\"\"><i class=\"fab fa-linkedin-in\"></i></a>\n        <a href=\"\"><i class=\"fab fa-instagram\"></i></a>\n        <a href=\"\"><i class=\"fab fa-youtube\"></i></a>\n    </div>\n</div>\n</div> -->");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("\n<div class=\"footer-widget\">\n    <h3 class=\"title\">Useful Links</h3>\n    <ul>\n        <li><a href=\"#\">Lorem ipsum</a></li>\n        <li><a href=\"#\">Pellentesque</a></li>\n        <li><a href=\"#\">Aenean vulputate</a></li>\n        <li><a href=\"#\">Vestibulum sit amet</a></li>\n        <li><a href=\"#\">Nam dignissim</a></li>\n    </ul>\n</div>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

