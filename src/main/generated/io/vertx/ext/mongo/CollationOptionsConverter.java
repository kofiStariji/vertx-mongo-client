package io.vertx.ext.mongo;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

/**
 * Converter and mapper for {@link io.vertx.ext.mongo.CollationOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.mongo.CollationOptions} original class using Vert.x codegen.
 */
public class CollationOptionsConverter {


  private static final Base64.Decoder BASE64_DECODER = JsonUtil.BASE64_DECODER;
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, CollationOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "alternate":
          if (member.getValue() instanceof String) {
            obj.setAlternate((String)member.getValue());
          }
          break;
        case "backwards":
          if (member.getValue() instanceof Boolean) {
            obj.setBackwards((Boolean)member.getValue());
          }
          break;
        case "caseFirst":
          if (member.getValue() instanceof String) {
            obj.setCaseFirst(io.vertx.ext.mongo.CaseFirst.valueOf((String)member.getValue()));
          }
          break;
        case "caseLevel":
          if (member.getValue() instanceof Boolean) {
            obj.setCaseLevel((Boolean)member.getValue());
          }
          break;
        case "locale":
          if (member.getValue() instanceof String) {
            obj.setLocale((String)member.getValue());
          }
          break;
        case "maxVariable":
          if (member.getValue() instanceof String) {
            obj.setMaxVariable(io.vertx.ext.mongo.MaxVariable.valueOf((String)member.getValue()));
          }
          break;
        case "normalization":
          if (member.getValue() instanceof Boolean) {
            obj.setNormalization((Boolean)member.getValue());
          }
          break;
        case "numericOrdering":
          if (member.getValue() instanceof Boolean) {
            obj.setNumericOrdering((Boolean)member.getValue());
          }
          break;
        case "strength":
          if (member.getValue() instanceof Number) {
            obj.setStrength(((Number)member.getValue()).intValue());
          }
          break;
      }
    }
  }

  public static void toJson(CollationOptions obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(CollationOptions obj, java.util.Map<String, Object> json) {
    if (obj.getAlternate() != null) {
      json.put("alternate", obj.getAlternate());
    }
    json.put("backwards", obj.isBackwards());
    if (obj.getCaseFirst() != null) {
      json.put("caseFirst", obj.getCaseFirst().name());
    }
    json.put("caseLevel", obj.isCaseLevel());
    if (obj.getLocale() != null) {
      json.put("locale", obj.getLocale());
    }
    if (obj.getMaxVariable() != null) {
      json.put("maxVariable", obj.getMaxVariable().name());
    }
    json.put("normalization", obj.isNormalization());
    json.put("numericOrdering", obj.isNumericOrdering());
    json.put("strength", obj.getStrength());
  }
}