package com.example.sub_example.section.genericjavaclassowlmapper.utils;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.lang.reflect.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;


/**
 * class with helper methods around data.
 */
public class DataUtils {

    /**
     * takes a string and returns the MD5-value for the string.
     *
     * @param input the input-string
     * @return MD5-value as String
     */
    public static String generateMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashBytes = md.digest(input.getBytes());

            StringBuilder result = new StringBuilder();
            for (byte b : hashBytes) {
                result.append(String.format("%02x", b));
            }
            return result.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long endTime = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (((endTime - startTime) / 1000) / 60) + " minutes");
    }

    public static String evaluateNamespace(Class<?> clazz, boolean isURI) {
        NamespaceProvider namespaceProvider = NamespaceProvider.getInstance();
        String baseNamespace = namespaceProvider.getBaseNamespace();
        String returnString = baseNamespace;
        XmlType xmlTypeAnnotation = clazz.getAnnotation(XmlType.class);
        if (xmlTypeAnnotation != null) {
            String namespace = xmlTypeAnnotation.namespace();
            namespace = ensureTrailingSlash(namespace);
            if (namespace.contains("##")) {
                namespace = baseNamespace;
            }
            returnString = namespace;
        } else {
            returnString = baseNamespace;
        }
        return isURI ? returnString : replaceLastSlashWithFragment(returnString);
    }

    public static String ensureTrailingSlash(String input) {
        if (input == null || input.isEmpty()) {
            return "/";
        } else if (!input.endsWith("/")) {
            return input + "/";
        } else {
            return input;
        }
    }

    /**
     * special helper function to identify the interface of the generic multilang object.
     *
     * @param methodName    the method name you want to check to get the specific literal (e.g. getValue)
     * @param fieldType     class of your instance
     * @param fieldInstance actual instance to call the method on
     * @return returns "" if nothing can be found, else the value
     */
    public static String testAndCallMethodOnInstance(String methodName, Class<?> fieldType, Object fieldInstance) {
        try {
            Method getValueMethod = fieldType.getMethod(methodName);
            if (getValueMethod != null) {
                Object langResult = getValueMethod.invoke(fieldInstance);
                if (langResult != null) {
                    return langResult.toString();
                } else {
                    return "";
                }
            } else {
                return "";
            }
        } catch (NoSuchMethodException e) {
            return "";
        } catch (InvocationTargetException e) {
            return "";
        } catch (IllegalAccessException e) {
            return "";
        }
    }

    public static String evaluateNamespace(Field field, boolean isURI) {
        NamespaceProvider namespaceProvider = NamespaceProvider.getInstance();
        String baseNamespace = namespaceProvider.getBaseNamespace();
        XmlElement xmlElementAnnotation = field.getAnnotation(XmlElement.class);
        String returnString = "";
        if (xmlElementAnnotation != null) {
            returnString = xmlElementAnnotation.namespace();

        } else {
            returnString = baseNamespace;
        }
        //there is some strange default namespace in those files
        if (returnString.contains("##")) {
            returnString = baseNamespace;
        }
        return isURI ? returnString : replaceLastSlashWithFragment(returnString);
    }

    public static String replaceLastSlashWithFragment(String urlString) {
        int lastSlashIndex = urlString.lastIndexOf("/");
        if (lastSlashIndex >= 0) {
            return urlString.substring(0, lastSlashIndex) + "#";
        } else {
            return urlString;
        }
    }

    public static Class<?> getGenericType(Type type) {
        if (type instanceof ParameterizedType parameterizedType) {
            Type[] typeArguments = parameterizedType.getActualTypeArguments();
            if (typeArguments.length > 0) {
                Type innerType = typeArguments[0];
                if (innerType instanceof Class) {
                    return (Class<?>) innerType;
                } else if (innerType instanceof ParameterizedType) {
                    return getGenericType(innerType);
                }
            }
        }
        return null;
    }

    public static String extractLastClassName(String fullyQualifiedName) {
        String[] parts = fullyQualifiedName.split("\\.");
        return parts[parts.length - 1];
    }

    public static <K, V> String prettyPrintMap(Map<K, V> map) {
        StringBuilder result = new StringBuilder("{\n");
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            result.append("    ").append(key.toString()).append(" : ").append(value.toString()).append("\n");
        }
        result.append("}");
        return result.toString();
    }

    public static <T> List<T> castToObjectList(Object rawObject) {
        if (rawObject instanceof List) {
            return (List<T>) rawObject; // This cast is unchecked
        } else {
            throw new ClassCastException("The object is not a List.");
        }
    }


}
