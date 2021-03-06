/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.docx4j.dml.diagram;

import org.docx4j.dml.ArrayListDml;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.docx4j.dml.CTOfficeArtExtensionList;


/**
 * <p>Java class for CT_ForEach complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_ForEach">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="alg" type="{http://schemas.openxmlformats.org/drawingml/2006/diagram}CT_Algorithm" minOccurs="0"/>
 *         &lt;element name="shape" type="{http://schemas.openxmlformats.org/drawingml/2006/diagram}CT_Shape" minOccurs="0"/>
 *         &lt;element name="presOf" type="{http://schemas.openxmlformats.org/drawingml/2006/diagram}CT_PresentationOf" minOccurs="0"/>
 *         &lt;element name="constrLst" type="{http://schemas.openxmlformats.org/drawingml/2006/diagram}CT_Constraints" minOccurs="0"/>
 *         &lt;element name="ruleLst" type="{http://schemas.openxmlformats.org/drawingml/2006/diagram}CT_Rules" minOccurs="0"/>
 *         &lt;element name="forEach" type="{http://schemas.openxmlformats.org/drawingml/2006/diagram}CT_ForEach"/>
 *         &lt;element name="layoutNode" type="{http://schemas.openxmlformats.org/drawingml/2006/diagram}CT_LayoutNode"/>
 *         &lt;element name="choose" type="{http://schemas.openxmlformats.org/drawingml/2006/diagram}CT_Choose"/>
 *         &lt;element name="extLst" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_OfficeArtExtensionList" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://schemas.openxmlformats.org/drawingml/2006/diagram}AG_IteratorAttributes"/>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_ForEach", propOrder = {
    "algOrShapeOrPresOf"
})
public class CTForEach {

    @XmlElements({
        @XmlElement(name = "forEach", type = CTForEach.class),
        @XmlElement(name = "extLst", type = CTOfficeArtExtensionList.class),
        @XmlElement(name = "shape", type = CTShape.class),
        @XmlElement(name = "alg", type = CTAlgorithm.class),
        @XmlElement(name = "presOf", type = CTPresentationOf.class),
        @XmlElement(name = "choose", type = CTChoose.class),
        @XmlElement(name = "ruleLst", type = CTRules.class),
        @XmlElement(name = "layoutNode", type = CTLayoutNode.class),
        @XmlElement(name = "constrLst", type = CTConstraints.class)
    })
    protected List<Object> algOrShapeOrPresOf = new ArrayListDml<Object>(this);
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String ref;
    @XmlAttribute
    protected List<STAxisType> axis = new ArrayListDml<STAxisType>(this);
    @XmlAttribute
    protected List<STElementType> ptType = new ArrayListDml<STElementType>(this);
    @XmlAttribute
    protected List<Boolean> hideLastTrans  = new ArrayListDml<Boolean>(this);
    @XmlAttribute
    protected List<Integer> st = new ArrayListDml<Integer>(this);
    @XmlAttribute
    protected List<Long> cnt = new ArrayListDml<Long>(this);
    @XmlAttribute
    protected List<Integer> step = new ArrayListDml<Integer>(this);

    /**
     * Gets the value of the algOrShapeOrPresOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the algOrShapeOrPresOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlgOrShapeOrPresOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTForEach }
     * {@link CTOfficeArtExtensionList }
     * {@link CTShape }
     * {@link CTAlgorithm }
     * {@link CTPresentationOf }
     * {@link CTChoose }
     * {@link CTRules }
     * {@link CTLayoutNode }
     * {@link CTConstraints }
     * 
     * 
     */
    public List<Object> getAlgOrShapeOrPresOf() {
        if (algOrShapeOrPresOf == null) {
            algOrShapeOrPresOf = new ArrayListDml<Object>(this);
        }
        return this.algOrShapeOrPresOf;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        if (name == null) {
            return "";
        } else {
            return name;
        }
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        if (ref == null) {
            return "";
        } else {
            return ref;
        }
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the axis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STAxisType }
     * 
     * 
     */
    public List<STAxisType> getAxis() {
        if (axis == null) {
            axis = new ArrayListDml<STAxisType>(this);
        }
        return this.axis;
    }

    /**
     * Gets the value of the ptType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STElementType }
     * 
     * 
     */
    public List<STElementType> getPtType() {
        if (ptType == null) {
            ptType = new ArrayListDml<STElementType>(this);
        }
        return this.ptType;
    }

    /**
     * Gets the value of the hideLastTrans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hideLastTrans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHideLastTrans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getHideLastTrans() {
        if (hideLastTrans == null) {
            hideLastTrans = new ArrayListDml<Boolean>(this);
        }
        return this.hideLastTrans;
    }

    /**
     * Gets the value of the st property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the st property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSt() {
        if (st == null) {
            st = new ArrayListDml<Integer>(this);
        }
        return this.st;
    }

    /**
     * Gets the value of the cnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCnt() {
        if (cnt == null) {
            cnt = new ArrayListDml<Long>(this);
        }
        return this.cnt;
    }

    /**
     * Gets the value of the step property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the step property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getStep() {
        if (step == null) {
            step = new ArrayListDml<Integer>(this);
        }
        return this.step;
    }

}
