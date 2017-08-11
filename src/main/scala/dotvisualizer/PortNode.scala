// See LICENSE for license details.

package dotvisualizer

case class PortNode(name: String, parentOpt: Option[DotNode]) extends DotNode {
  def render: String = {
    s"""$absoluteName [shape = "rectangle" label="$name"]
     """.stripMargin
  }
}
