package com.jiajia.presenter.util;

import com.google.gson.internal.$Gson$Types;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by dim on 16/5/27.
 * <br>Credit: http://www.jianshu.com/p/9ddd2d5b2d37
 */
public class TypeFactory {

  public static Type $List(Type type) {
    return $Gson$Types.newParameterizedTypeWithOwner(null, List.class, type);
  }

  public static Type $Set(Type type) {
    return $Gson$Types.newParameterizedTypeWithOwner(null, Set.class, type);
  }

  public static Type $HashMap(Type type, Type type2) {
    return $Gson$Types.newParameterizedTypeWithOwner(null, HashMap.class, type, type2);
  }

  public static Type $Map(Type type, Type type2) {
    return $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, type, type2);
  }

  public static Type $Parameterized(Type ownerType, Type rawType, Type... typeArguments) {
    return $Gson$Types.newParameterizedTypeWithOwner(ownerType, rawType, typeArguments);
  }

  public static Type $Array(Type type) {
    return $Gson$Types.arrayOf(type);
  }

  public static Type $SubtypeOf(Type type) {
    return $Gson$Types.subtypeOf(type);
  }

  public static Type $SupertypeOf(Type type) {
    return $Gson$Types.supertypeOf(type);
  }
}