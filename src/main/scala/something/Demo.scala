package something

object Demo {
  import mail._

  def main(args: Array[String]): Unit = {



  send a new Mail (
    from = "john.smith@mycompany.com" -> "John Smith",
    to = "dev@mycompany.com" :: "marketing@mycompany.com" :: Nil,
    subject = "Our 5-year plan",
    message = "Here is the presentation with the stuff we're going to for the next five years.",
//    attachment = new java.io.File("/home/boss/important-presentation.ppt")
//    attachment = new java.io.File("/Users/work/Dev/Workspaces/JavaStuff/demo/src/main/resources/dddexplained.png")
    attachment = new java.io.File("dddexplained.png")
  )


      send a new Mail (
        from = ("fmi@gmail.com", "John Smith"),
        to = "fm7@gmail.com",
    //    cc = "hr@mycompany.com",
        subject = "Import stuff",
        message = "Dear Boss..."
      )

      send a new Mail (
        from = "john.smith@mycompany.com" -> "John Smith",
        to = Seq("dev@mycompany.com", "marketing@mycompany.com"),
        subject = "Our New Strategy (tm)",
        message = "Please find attach the latest strategy document.",
        richMessage = "Here's the <blink>latest</blink> <strong>Strategy</strong>..."
      )


  }

}