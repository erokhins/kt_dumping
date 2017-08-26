'toRegex' @ [22:77] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'JvmStatic' @ [24:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'SANITIZE_AS_JAVA_INVALID_CHARACTERS' @ [26:16] ==> private final val SANITIZE_AS_JAVA_INVALID_CHARACTERS: Regex defined in org.jetbrains.kotlin.name.NameUtils[PropertyDescriptorImpl]

'replace' @ [26:52] ==> public final fun replace(input: CharSequence, replacement: String): String defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'name' @ [26:60] ==> value-parameter name: String defined in org.jetbrains.kotlin.name.NameUtils.sanitizeAsJavaIdentifier[ValueParameterDescriptorImpl]

'JvmStatic' @ [33:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'if (shortFileName.isEmpty())
                "_"
            else
                capitalizeAsJavaClassName(sanitizeAsJavaIdentifier(shortFileName))' @ [35:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'shortFileName' @ [35:17] ==> value-parameter shortFileName: String defined in org.jetbrains.kotlin.name.NameUtils.getPackagePartClassNamePrefix[ValueParameterDescriptorImpl]

'isEmpty' @ [35:31] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'capitalizeAsJavaClassName' @ [38:17] ==> @JvmStatic private final fun capitalizeAsJavaClassName(str: String): String defined in org.jetbrains.kotlin.name.NameUtils[SimpleFunctionDescriptorImpl]

'sanitizeAsJavaIdentifier' @ [38:43] ==> @JvmStatic public final fun sanitizeAsJavaIdentifier(name: String): String defined in org.jetbrains.kotlin.name.NameUtils[SimpleFunctionDescriptorImpl]

'shortFileName' @ [38:68] ==> value-parameter shortFileName: String defined in org.jetbrains.kotlin.name.NameUtils.getPackagePartClassNamePrefix[ValueParameterDescriptorImpl]

'JvmStatic' @ [40:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'if (Character.isJavaIdentifierStart(str[0]))
                str.substring(0, 1).toUpperCase(Locale.ENGLISH) + str.substring(1)
            else
                "_$str"' @ [44:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isJavaIdentifierStart' @ [44:27] ==> public open fun isJavaIdentifierStart(p0: Char): Boolean defined in java.lang.Character[JavaMethodDescriptor]

'str' @ [44:49] ==> value-parameter str: String defined in org.jetbrains.kotlin.name.NameUtils.capitalizeAsJavaClassName[ValueParameterDescriptorImpl]

'str' @ [45:17] ==> value-parameter str: String defined in org.jetbrains.kotlin.name.NameUtils.capitalizeAsJavaClassName[ValueParameterDescriptorImpl]

'substring' @ [45:21] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toUpperCase' @ [45:37] ==> @InlineOnly public inline fun String.toUpperCase(locale: Locale): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ENGLISH' @ [45:56] ==> public final val ENGLISH: (Locale..Locale?) defined in java.util.Locale[JavaPropertyDescriptor]

'str' @ [45:67] ==> value-parameter str: String defined in org.jetbrains.kotlin.name.NameUtils.capitalizeAsJavaClassName[ValueParameterDescriptorImpl]

'substring' @ [45:71] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'str' @ [47:20] ==> value-parameter str: String defined in org.jetbrains.kotlin.name.NameUtils.capitalizeAsJavaClassName[ValueParameterDescriptorImpl]

'JvmStatic' @ [50:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'identifier' @ [52:18] ==> @NotNull public open fun identifier(@NotNull name: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'getPackagePartClassNamePrefix' @ [52:39] ==> @JvmStatic public final fun getPackagePartClassNamePrefix(shortFileName: String): String defined in org.jetbrains.kotlin.name.NameUtils[SimpleFunctionDescriptorImpl]

'filePath' @ [52:69] ==> value-parameter filePath: String defined in org.jetbrains.kotlin.name.NameUtils.getScriptNameForFile[ValueParameterDescriptorImpl]

'substringAfterLast' @ [52:78] ==> public fun String.substringAfterLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substringBeforeLast' @ [52:102] ==> public fun String.substringBeforeLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

