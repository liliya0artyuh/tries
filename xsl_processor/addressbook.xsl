<?xml version='1.0'?>
<xsl:stylesheet   xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

   <xsl:template match="/">
      Found the root!
      <xsl:apply-templates/>
   </xsl:template>

   <xsl:template match="animal">
      Name: <xsl:value-of select="name"/>
   </xsl:template>

</xsl:stylesheet>