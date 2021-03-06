//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.15 at 08:47:18 AM BST 
//

package net.sf.mpxj.primavera.schema;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for ProjectRiskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectRiskType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateIdentified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExposureExpenses" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ExposureLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ExposureMaterialUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ExposureNonLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ImpactDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ImpactExpenses" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ImpactLaborUnits" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="-9.9999999E7"/>
 *               &lt;maxInclusive value="9.9999999E7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ImpactMaterialUnits" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="-9.9999999E7"/>
 *               &lt;maxInclusive value="9.9999999E7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ImpactNonLaborUnits" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="-9.9999999E7"/>
 *               &lt;maxInclusive value="9.9999999E7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ImpactProbability" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="120"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OBSName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OBSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Priority" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Top"/>
 *               &lt;enumeration value="High"/>
 *               &lt;enumeration value="Normal"/>
 *               &lt;enumeration value="Low"/>
 *               &lt;enumeration value="Lowest"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProjectId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProjectName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResourceId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResourceName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResourceObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RiskControlPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RiskTypeObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Open"/>
 *               &lt;enumeration value="Closed"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WBSCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WBSName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WBSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UDF" type="{http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects}UDFAssignmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ProjectRiskType", propOrder =
{
   "createDate",
   "createUser",
   "dateIdentified",
   "description",
   "exposureExpenses",
   "exposureLaborUnits",
   "exposureMaterialUnits",
   "exposureNonLaborUnits",
   "impactDate",
   "impactExpenses",
   "impactLaborUnits",
   "impactMaterialUnits",
   "impactNonLaborUnits",
   "impactProbability",
   "isBaseline",
   "lastUpdateDate",
   "lastUpdateUser",
   "name",
   "obsName",
   "obsObjectId",
   "objectId",
   "priority",
   "projectId",
   "projectName",
   "projectObjectId",
   "resourceId",
   "resourceName",
   "resourceObjectId",
   "riskControlPlan",
   "riskTypeObjectId",
   "status",
   "type",
   "wbsCode",
   "wbsName",
   "wbsObjectId",
   "udf"
}) @SuppressWarnings("all") public class ProjectRiskType
{

   @XmlElementRef(name = "CreateDate", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Date> createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "DateIdentified", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date dateIdentified;
   @XmlElement(name = "Description") protected String description;
   @XmlElementRef(name = "ExposureExpenses", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Double> exposureExpenses;
   @XmlElementRef(name = "ExposureLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Double> exposureLaborUnits;
   @XmlElementRef(name = "ExposureMaterialUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Double> exposureMaterialUnits;
   @XmlElementRef(name = "ExposureNonLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Double> exposureNonLaborUnits;
   @XmlElementRef(name = "ImpactDate", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Date> impactDate;
   @XmlElementRef(name = "ImpactExpenses", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Double> impactExpenses;
   @XmlElementRef(name = "ImpactLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Double> impactLaborUnits;
   @XmlElementRef(name = "ImpactMaterialUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Double> impactMaterialUnits;
   @XmlElementRef(name = "ImpactNonLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Double> impactNonLaborUnits;
   @XmlElementRef(name = "ImpactProbability", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Integer> impactProbability;
   @XmlElement(name = "IsBaseline") protected Boolean isBaseline;
   @XmlElementRef(name = "LastUpdateDate", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Date> lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "Name") protected String name;
   @XmlElement(name = "OBSName") protected String obsName;
   @XmlElement(name = "OBSObjectId") protected Integer obsObjectId;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "Priority") protected String priority;
   @XmlElement(name = "ProjectId") protected String projectId;
   @XmlElement(name = "ProjectName") protected String projectName;
   @XmlElement(name = "ProjectObjectId") protected Integer projectObjectId;
   @XmlElement(name = "ResourceId") protected String resourceId;
   @XmlElement(name = "ResourceName") protected String resourceName;
   @XmlElementRef(name = "ResourceObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Integer> resourceObjectId;
   @XmlElement(name = "RiskControlPlan") protected String riskControlPlan;
   @XmlElementRef(name = "RiskTypeObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Integer> riskTypeObjectId;
   @XmlElement(name = "Status") protected String status;
   @XmlElement(name = "Type") protected String type;
   @XmlElement(name = "WBSCode") protected String wbsCode;
   @XmlElement(name = "WBSName") protected String wbsName;
   @XmlElementRef(name = "WBSObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Integer> wbsObjectId;
   @XmlElement(name = "UDF") protected List<UDFAssignmentType> udf;

   /**
    * Gets the value of the createDate property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Date }{@code >}
    *     
    */
   public JAXBElement<Date> getCreateDate()
   {
      return createDate;
   }

   /**
    * Sets the value of the createDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Date }{@code >}
    *     
    */
   public void setCreateDate(JAXBElement<Date> value)
   {
      this.createDate = ((JAXBElement<Date>) value);
   }

   /**
    * Gets the value of the createUser property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getCreateUser()
   {
      return createUser;
   }

   /**
    * Sets the value of the createUser property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setCreateUser(String value)
   {
      this.createUser = value;
   }

   /**
    * Gets the value of the dateIdentified property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Date getDateIdentified()
   {
      return dateIdentified;
   }

   /**
    * Sets the value of the dateIdentified property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setDateIdentified(Date value)
   {
      this.dateIdentified = value;
   }

   /**
    * Gets the value of the description property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getDescription()
   {
      return description;
   }

   /**
    * Sets the value of the description property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setDescription(String value)
   {
      this.description = value;
   }

   /**
    * Gets the value of the exposureExpenses property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public JAXBElement<Double> getExposureExpenses()
   {
      return exposureExpenses;
   }

   /**
    * Sets the value of the exposureExpenses property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public void setExposureExpenses(JAXBElement<Double> value)
   {
      this.exposureExpenses = ((JAXBElement<Double>) value);
   }

   /**
    * Gets the value of the exposureLaborUnits property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public JAXBElement<Double> getExposureLaborUnits()
   {
      return exposureLaborUnits;
   }

   /**
    * Sets the value of the exposureLaborUnits property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public void setExposureLaborUnits(JAXBElement<Double> value)
   {
      this.exposureLaborUnits = ((JAXBElement<Double>) value);
   }

   /**
    * Gets the value of the exposureMaterialUnits property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public JAXBElement<Double> getExposureMaterialUnits()
   {
      return exposureMaterialUnits;
   }

   /**
    * Sets the value of the exposureMaterialUnits property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public void setExposureMaterialUnits(JAXBElement<Double> value)
   {
      this.exposureMaterialUnits = ((JAXBElement<Double>) value);
   }

   /**
    * Gets the value of the exposureNonLaborUnits property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public JAXBElement<Double> getExposureNonLaborUnits()
   {
      return exposureNonLaborUnits;
   }

   /**
    * Sets the value of the exposureNonLaborUnits property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public void setExposureNonLaborUnits(JAXBElement<Double> value)
   {
      this.exposureNonLaborUnits = ((JAXBElement<Double>) value);
   }

   /**
    * Gets the value of the impactDate property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Date }{@code >}
    *     
    */
   public JAXBElement<Date> getImpactDate()
   {
      return impactDate;
   }

   /**
    * Sets the value of the impactDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Date }{@code >}
    *     
    */
   public void setImpactDate(JAXBElement<Date> value)
   {
      this.impactDate = ((JAXBElement<Date>) value);
   }

   /**
    * Gets the value of the impactExpenses property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public JAXBElement<Double> getImpactExpenses()
   {
      return impactExpenses;
   }

   /**
    * Sets the value of the impactExpenses property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public void setImpactExpenses(JAXBElement<Double> value)
   {
      this.impactExpenses = ((JAXBElement<Double>) value);
   }

   /**
    * Gets the value of the impactLaborUnits property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public JAXBElement<Double> getImpactLaborUnits()
   {
      return impactLaborUnits;
   }

   /**
    * Sets the value of the impactLaborUnits property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public void setImpactLaborUnits(JAXBElement<Double> value)
   {
      this.impactLaborUnits = ((JAXBElement<Double>) value);
   }

   /**
    * Gets the value of the impactMaterialUnits property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public JAXBElement<Double> getImpactMaterialUnits()
   {
      return impactMaterialUnits;
   }

   /**
    * Sets the value of the impactMaterialUnits property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public void setImpactMaterialUnits(JAXBElement<Double> value)
   {
      this.impactMaterialUnits = ((JAXBElement<Double>) value);
   }

   /**
    * Gets the value of the impactNonLaborUnits property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public JAXBElement<Double> getImpactNonLaborUnits()
   {
      return impactNonLaborUnits;
   }

   /**
    * Sets the value of the impactNonLaborUnits property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public void setImpactNonLaborUnits(JAXBElement<Double> value)
   {
      this.impactNonLaborUnits = ((JAXBElement<Double>) value);
   }

   /**
    * Gets the value of the impactProbability property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public JAXBElement<Integer> getImpactProbability()
   {
      return impactProbability;
   }

   /**
    * Sets the value of the impactProbability property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public void setImpactProbability(JAXBElement<Integer> value)
   {
      this.impactProbability = ((JAXBElement<Integer>) value);
   }

   /**
    * Gets the value of the isBaseline property.
    * 
    * @return
    *     possible object is
    *     {@link Boolean }
    *     
    */
   public Boolean isIsBaseline()
   {
      return isBaseline;
   }

   /**
    * Sets the value of the isBaseline property.
    * 
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *     
    */
   public void setIsBaseline(Boolean value)
   {
      this.isBaseline = value;
   }

   /**
    * Gets the value of the lastUpdateDate property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Date }{@code >}
    *     
    */
   public JAXBElement<Date> getLastUpdateDate()
   {
      return lastUpdateDate;
   }

   /**
    * Sets the value of the lastUpdateDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Date }{@code >}
    *     
    */
   public void setLastUpdateDate(JAXBElement<Date> value)
   {
      this.lastUpdateDate = ((JAXBElement<Date>) value);
   }

   /**
    * Gets the value of the lastUpdateUser property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getLastUpdateUser()
   {
      return lastUpdateUser;
   }

   /**
    * Sets the value of the lastUpdateUser property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setLastUpdateUser(String value)
   {
      this.lastUpdateUser = value;
   }

   /**
    * Gets the value of the name property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getName()
   {
      return name;
   }

   /**
    * Sets the value of the name property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setName(String value)
   {
      this.name = value;
   }

   /**
    * Gets the value of the obsName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getOBSName()
   {
      return obsName;
   }

   /**
    * Sets the value of the obsName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setOBSName(String value)
   {
      this.obsName = value;
   }

   /**
    * Gets the value of the obsObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getOBSObjectId()
   {
      return obsObjectId;
   }

   /**
    * Sets the value of the obsObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setOBSObjectId(Integer value)
   {
      this.obsObjectId = value;
   }

   /**
    * Gets the value of the objectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getObjectId()
   {
      return objectId;
   }

   /**
    * Sets the value of the objectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setObjectId(Integer value)
   {
      this.objectId = value;
   }

   /**
    * Gets the value of the priority property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getPriority()
   {
      return priority;
   }

   /**
    * Sets the value of the priority property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setPriority(String value)
   {
      this.priority = value;
   }

   /**
    * Gets the value of the projectId property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getProjectId()
   {
      return projectId;
   }

   /**
    * Sets the value of the projectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setProjectId(String value)
   {
      this.projectId = value;
   }

   /**
    * Gets the value of the projectName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getProjectName()
   {
      return projectName;
   }

   /**
    * Sets the value of the projectName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setProjectName(String value)
   {
      this.projectName = value;
   }

   /**
    * Gets the value of the projectObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getProjectObjectId()
   {
      return projectObjectId;
   }

   /**
    * Sets the value of the projectObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setProjectObjectId(Integer value)
   {
      this.projectObjectId = value;
   }

   /**
    * Gets the value of the resourceId property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getResourceId()
   {
      return resourceId;
   }

   /**
    * Sets the value of the resourceId property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setResourceId(String value)
   {
      this.resourceId = value;
   }

   /**
    * Gets the value of the resourceName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getResourceName()
   {
      return resourceName;
   }

   /**
    * Sets the value of the resourceName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setResourceName(String value)
   {
      this.resourceName = value;
   }

   /**
    * Gets the value of the resourceObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public JAXBElement<Integer> getResourceObjectId()
   {
      return resourceObjectId;
   }

   /**
    * Sets the value of the resourceObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public void setResourceObjectId(JAXBElement<Integer> value)
   {
      this.resourceObjectId = ((JAXBElement<Integer>) value);
   }

   /**
    * Gets the value of the riskControlPlan property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getRiskControlPlan()
   {
      return riskControlPlan;
   }

   /**
    * Sets the value of the riskControlPlan property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setRiskControlPlan(String value)
   {
      this.riskControlPlan = value;
   }

   /**
    * Gets the value of the riskTypeObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public JAXBElement<Integer> getRiskTypeObjectId()
   {
      return riskTypeObjectId;
   }

   /**
    * Sets the value of the riskTypeObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public void setRiskTypeObjectId(JAXBElement<Integer> value)
   {
      this.riskTypeObjectId = ((JAXBElement<Integer>) value);
   }

   /**
    * Gets the value of the status property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getStatus()
   {
      return status;
   }

   /**
    * Sets the value of the status property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setStatus(String value)
   {
      this.status = value;
   }

   /**
    * Gets the value of the type property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getType()
   {
      return type;
   }

   /**
    * Sets the value of the type property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setType(String value)
   {
      this.type = value;
   }

   /**
    * Gets the value of the wbsCode property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getWBSCode()
   {
      return wbsCode;
   }

   /**
    * Sets the value of the wbsCode property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setWBSCode(String value)
   {
      this.wbsCode = value;
   }

   /**
    * Gets the value of the wbsName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getWBSName()
   {
      return wbsName;
   }

   /**
    * Sets the value of the wbsName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setWBSName(String value)
   {
      this.wbsName = value;
   }

   /**
    * Gets the value of the wbsObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public JAXBElement<Integer> getWBSObjectId()
   {
      return wbsObjectId;
   }

   /**
    * Sets the value of the wbsObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public void setWBSObjectId(JAXBElement<Integer> value)
   {
      this.wbsObjectId = ((JAXBElement<Integer>) value);
   }

   /**
    * Gets the value of the udf property.
    * 
    * <p>
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the JAXB object.
    * This is why there is not a <CODE>set</CODE> method for the udf property.
    * 
    * <p>
    * For example, to add a new item, do as follows:
    * <pre>
    *    getUDF().add(newItem);
    * </pre>
    * 
    * 
    * <p>
    * Objects of the following type(s) are allowed in the list
    * {@link UDFAssignmentType }
    * 
    * 
    */
   public List<UDFAssignmentType> getUDF()
   {
      if (udf == null)
      {
         udf = new ArrayList<UDFAssignmentType>();
      }
      return this.udf;
   }

}
