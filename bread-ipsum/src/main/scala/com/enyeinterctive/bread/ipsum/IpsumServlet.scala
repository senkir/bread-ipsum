package com.enyeinterctive.bread.ipsum

import org.scalatra._
import scalate.ScalateSupport

class IpsumServlet extends BreadIpsumStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
