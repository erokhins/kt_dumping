'splitCanonicalFqName' @ [21:44] ==> private fun String.splitCanonicalFqName(): List<String> defined in org.jetbrains.kotlin.load.java.structure.impl in file classNamesUtil.kt[SimpleFunctionDescriptorImpl]

'joinToString' @ [21:67] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [21:99] ==> value-parameter it: String defined in org.jetbrains.kotlin.load.java.structure.impl.convertCanonicalNameToQName.<anonymous>[ValueParameterDescriptorImpl]

'substringBefore' @ [21:102] ==> public fun String.substringBefore(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (this.isNotEmpty()) this else SpecialNames.SAFE_IDENTIFIER_FOR_NO_NAME.asString()' @ [26:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'this' @ [26:17] ==> <this> defined in org.jetbrains.kotlin.load.java.structure.impl.splitCanonicalFqName.toNonEmpty[ReceiverParameterDescriptorImpl]

'isNotEmpty' @ [26:22] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'this' @ [26:36] ==> <this> defined in org.jetbrains.kotlin.load.java.structure.impl.splitCanonicalFqName.toNonEmpty[ReceiverParameterDescriptorImpl]

'SAFE_IDENTIFIER_FOR_NO_NAME' @ [26:59] ==> public final val SAFE_IDENTIFIER_FOR_NO_NAME: (Name..Name?) defined in org.jetbrains.kotlin.name.SpecialNames[JavaPropertyDescriptor]

'asString' @ [26:87] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'arrayListOf' @ [28:18] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'component1' @ [31:11] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [31:18] ==> public final operator fun component2(): Char defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'this' @ [31:32] ==> <this> defined in org.jetbrains.kotlin.load.java.structure.impl.splitCanonicalFqName[ReceiverParameterDescriptorImpl]

'withIndex' @ [31:37] ==> public fun CharSequence.withIndex(): Iterable<IndexedValue<Char>> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when (character) {
            '.' -> if (balance == 0) {
                result.add(this.substring(currentNameStart, index).toNonEmpty())
                currentNameStart = index + 1
            }
            '<' -> balance++
            '>' -> balance--
        }' @ [32:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'character' @ [32:15] ==> val character: Char defined in org.jetbrains.kotlin.load.java.structure.impl.splitCanonicalFqName[LocalVariableDescriptor]

'balance' @ [33:24] ==> var balance: Int defined in org.jetbrains.kotlin.load.java.structure.impl.splitCanonicalFqName[LocalVariableDescriptor]

'result' @ [34:17] ==> val result: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.load.java.structure.impl.splitCanonicalFqName[LocalVariableDescriptor]

'add' @ [34:24] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'this' @ [34:28] ==> <this> defined in org.jetbrains.kotlin.load.java.structure.impl.splitCanonicalFqName[ReceiverParameterDescriptorImpl]

'substring' @ [34:33] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'currentNameStart' @ [34:43] ==> var currentNameStart: Int defined in org.jetbrains.kotlin.load.java.structure.impl.splitCanonicalFqName[LocalVariableDescriptor]

'index' @ [34:61] ==> val index: Int defined in org.jetbrains.kotlin.load.java.structure.impl.splitCanonicalFqName[LocalVariableDescriptor]

'toNonEmpty' @ [34:68] ==> local final fun String.toNonEmpty(): String defined in org.jetbrains.kotlin.load.java.structure.impl.splitCanonicalFqName[SimpleFunctionDescriptorImpl]

'currentNameStart' @ [35:17] ==> var currentNameStart: Int defined in org.jetbrains.kotlin.load.java.structure.impl.splitCanonicalFqName[LocalVariableDescriptor]

'index' @ [35:36] ==> val index: Int defined in org.jetbrains.kotlin.load.java.structure.impl.splitCanonicalFqName[LocalVariableDescriptor]

'balance' @ [37:20] ==> var balance: Int defined in org.jetbrains.kotlin.load.java.structure.impl.splitCanonicalFqName[LocalVariableDescriptor]

'balance' @ [38:20] ==> var balance: Int defined in org.jetbrains.kotlin.load.java.structure.impl.splitCanonicalFqName[LocalVariableDescriptor]

'result' @ [41:5] ==> val result: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.load.java.structure.impl.splitCanonicalFqName[LocalVariableDescriptor]

'add' @ [41:12] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'this' @ [41:16] ==> <this> defined in org.jetbrains.kotlin.load.java.structure.impl.splitCanonicalFqName[ReceiverParameterDescriptorImpl]

'substring' @ [41:21] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'currentNameStart' @ [41:31] ==> var currentNameStart: Int defined in org.jetbrains.kotlin.load.java.structure.impl.splitCanonicalFqName[LocalVariableDescriptor]

'toNonEmpty' @ [41:49] ==> local final fun String.toNonEmpty(): String defined in org.jetbrains.kotlin.load.java.structure.impl.splitCanonicalFqName[SimpleFunctionDescriptorImpl]

'result' @ [42:12] ==> val result: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.load.java.structure.impl.splitCanonicalFqName[LocalVariableDescriptor]

