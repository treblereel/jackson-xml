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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}SupportVectors" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Coefficients"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="targetCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="alternateTargetCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="threshold" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"extension", "supportVectors", "coefficients"})
@XmlRootElement(name = "SupportVectorMachine")
@JsType
public class SupportVectorMachine {

  @XmlElement(name = "Extension")
  protected List<Extension> extension;

  @XmlElement(name = "SupportVectors")
  protected SupportVectors supportVectors;

  @XmlElement(name = "Coefficients", required = true)
  protected Coefficients coefficients;

  @XmlAttribute(name = "targetCategory")
  protected String targetCategory;

  @XmlAttribute(name = "alternateTargetCategory")
  protected String alternateTargetCategory;

  @XmlAttribute(name = "threshold")
  protected Double threshold;

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
   * Gets the value of the supportVectors property.
   *
   * @return possible object is {@link SupportVectors }
   */
  public SupportVectors getSupportVectors() {
    return supportVectors;
  }

  /**
   * Sets the value of the supportVectors property.
   *
   * @param value allowed object is {@link SupportVectors }
   */
  public void setSupportVectors(SupportVectors value) {
    this.supportVectors = value;
  }

  /**
   * Gets the value of the coefficients property.
   *
   * @return possible object is {@link Coefficients }
   */
  public Coefficients getCoefficients() {
    return coefficients;
  }

  /**
   * Sets the value of the coefficients property.
   *
   * @param value allowed object is {@link Coefficients }
   */
  public void setCoefficients(Coefficients value) {
    this.coefficients = value;
  }

  /**
   * Gets the value of the targetCategory property.
   *
   * @return possible object is {@link String }
   */
  public String getTargetCategory() {
    return targetCategory;
  }

  /**
   * Sets the value of the targetCategory property.
   *
   * @param value allowed object is {@link String }
   */
  public void setTargetCategory(String value) {
    this.targetCategory = value;
  }

  /**
   * Gets the value of the alternateTargetCategory property.
   *
   * @return possible object is {@link String }
   */
  public String getAlternateTargetCategory() {
    return alternateTargetCategory;
  }

  /**
   * Sets the value of the alternateTargetCategory property.
   *
   * @param value allowed object is {@link String }
   */
  public void setAlternateTargetCategory(String value) {
    this.alternateTargetCategory = value;
  }

  /**
   * Gets the value of the threshold property.
   *
   * @return possible object is {@link Double }
   */
  public Double getThreshold() {
    return threshold;
  }

  /**
   * Sets the value of the threshold property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setThreshold(Double value) {
    this.threshold = value;
  }
}
