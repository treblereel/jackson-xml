/*
 * Copyright © 2021 Treblereel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.treblereel.gwt.xml.mapper.client.tests.pmml.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import jsinterop.annotations.JsType;

/**
 * Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Extension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="field" use="required" type="{http://www.dmg.org/PMML-4_4}FIELD-NAME" /&gt;
 *       &lt;attribute name="function" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="count"/&gt;
 *             &lt;enumeration value="sum"/&gt;
 *             &lt;enumeration value="average"/&gt;
 *             &lt;enumeration value="min"/&gt;
 *             &lt;enumeration value="max"/&gt;
 *             &lt;enumeration value="multiset"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="groupField" type="{http://www.dmg.org/PMML-4_4}FIELD-NAME" /&gt;
 *       &lt;attribute name="sqlWhere" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"extension"})
@XmlRootElement(name = "Aggregate")
@JsType
public class Aggregate implements IApply {

  @XmlElement(name = "Extension")
  protected List<Extension> extension;

  @XmlAttribute(name = "field", required = true)
  protected String field;

  @XmlAttribute(name = "function", required = true)
  protected String function;

  @XmlAttribute(name = "groupField")
  protected String groupField;

  @XmlAttribute(name = "sqlWhere")
  protected String sqlWhere;

  /**
   * Gets the value of the extension property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the extension property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getExtension().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link Extension }
   */
  public List<Extension> getExtension() {
    if (extension == null) {
      extension = new ArrayList<Extension>();
    }
    return this.extension;
  }

  /**
   * Gets the value of the field property.
   *
   * @return possible object is {@link String }
   */
  public String getField() {
    return field;
  }

  /**
   * Sets the value of the field property.
   *
   * @param value allowed object is {@link String }
   */
  public void setField(String value) {
    this.field = value;
  }

  /**
   * Gets the value of the function property.
   *
   * @return possible object is {@link String }
   */
  public String getFunction() {
    return function;
  }

  /**
   * Sets the value of the function property.
   *
   * @param value allowed object is {@link String }
   */
  public void setFunction(String value) {
    this.function = value;
  }

  /**
   * Gets the value of the groupField property.
   *
   * @return possible object is {@link String }
   */
  public String getGroupField() {
    return groupField;
  }

  /**
   * Sets the value of the groupField property.
   *
   * @param value allowed object is {@link String }
   */
  public void setGroupField(String value) {
    this.groupField = value;
  }

  /**
   * Gets the value of the sqlWhere property.
   *
   * @return possible object is {@link String }
   */
  public String getSqlWhere() {
    return sqlWhere;
  }

  /**
   * Sets the value of the sqlWhere property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSqlWhere(String value) {
    this.sqlWhere = value;
  }
}
