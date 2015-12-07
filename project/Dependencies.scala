import sbt._
import Keys._

object Dependencies {
  lazy val resolvers = Seq("Gephi Releases" at "http://nexus.gephi.org/nexus/content/repositories/releases/","Gephi 3rd Party" at "http://nexus.gephi.org/nexus/content/repositories/thirdparty/","Netbeans Repository" at "http://bits.netbeans.org/nexus/content/groups/netbeans/")
  
  // define the method body in a block (in curly braces)
  private def bulkDep(groupId: String, version: String, artifacts: Seq[String]): Seq[ModuleID] = {
    artifacts.map(groupId % _ % version jar())
  }
  
  private val gephi = Seq("attributes","graph-api","graph-dhns","data-attributes-api","visualization","visualization-api","layout-api","layout-plugin","filters-api","filters-impl","filters-plugin","io-importer-api","io-importer-plugin","io-exporter-api","io-processor-plugin","project-api","partition-api","utils","utils-collection","utils-longtask","ui-utils","dynamic-api","dynamic-impl","gleem")
  
  lazy val gephiDeps = bulkDep("org.gephi","0.8.2",gephi)
  
  //lazy val all = twitterDeps ++ gephiDeps
}