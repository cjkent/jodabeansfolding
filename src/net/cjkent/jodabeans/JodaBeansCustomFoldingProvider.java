/**
 * Copyright (C) 2014 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package net.cjkent.jodabeans;

import com.intellij.lang.folding.CustomFoldingProvider;

/**
 * Provides folding for code generated by Joda Beans.
 */
public class JodaBeansCustomFoldingProvider extends CustomFoldingProvider {

  @Override
  public boolean isCustomRegionStart(String elementText) {
    return elementText.contains("AUTOGENERATED START");
  }

  @Override
  public boolean isCustomRegionEnd(String elementText) {
    return elementText.contains("AUTOGENERATED END");
  }

  @Override
  public String getPlaceholderText(String s) {
    return "AUTOGENERATED";
  }

  @Override
  public String getDescription() {
    return "Joda Beans Autogenerated";
  }

  @Override
  public String getStartString() {
    return "AUTOGENERATED START";
  }

  @Override
  public String getEndString() {
    return "AUTOGENERATED END";
  }
}
