package net.liftweb.http

/*                                                *\
  (c) 2007 WorldWide Conferencing, LLC
  Distributed under an Apache License
  http://www.apache.org/licenses/LICENSE-2.0
  \*                                                 */
    
import scala.xml.Node

case class XmlResponse(xml: Node) extends ToResponse {
  def docType = None
  def code = 200
  def headers = Map("Content-Type" -> "text/xml")
  def out = xml
}


