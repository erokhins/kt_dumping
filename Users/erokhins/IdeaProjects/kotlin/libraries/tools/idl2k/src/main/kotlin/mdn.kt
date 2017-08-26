'when (url) {
        in existing -> true
        in nonExisting -> false
        else -> null
    }' @ [7:47] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean?, entry1: Boolean?, entry2: Boolean?): Boolean?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean?

'url' @ [7:53] ==> value-parameter url: String defined in org.jetbrains.idl2k.MDNDocumentationCache.checkInCache[ValueParameterDescriptorImpl]

'in' @ [8:9] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'existing' @ [8:12] ==> public final val existing: Set<String> defined in org.jetbrains.idl2k.MDNDocumentationCache[PropertyDescriptorImpl]

'in' @ [9:9] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'nonExisting' @ [9:12] ==> public final val nonExisting: Set<String> defined in org.jetbrains.idl2k.MDNDocumentationCache[PropertyDescriptorImpl]

'MDNDocumentationCache' @ [14:21] ==> public constructor MDNDocumentationCache(existing: Set<String>, nonExisting: Set<String>) defined in org.jetbrains.idl2k.MDNDocumentationCache[ClassConstructorDescriptorImpl]

'emptySet' @ [14:43] ==> public fun <T> emptySet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'emptySet' @ [14:55] ==> public fun <T> emptySet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'HashSet' @ [17:28] ==> public final fun <E> <init>(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections.HashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> String

'HashSet' @ [18:31] ==> public final fun <E> <init>(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections.HashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> String

'file' @ [20:13] ==> value-parameter file: File defined in org.jetbrains.idl2k.MDNDocumentationCache.Companion.read[ValueParameterDescriptorImpl]

'forEachLine' @ [20:18] ==> public fun File.forEachLine(charset: Charset = ..., action: (line: String) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'line' @ [21:29] ==> value-parameter line: String defined in org.jetbrains.idl2k.MDNDocumentationCache.Companion.read.<anonymous>[ValueParameterDescriptorImpl]

'split' @ [21:34] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'parts' @ [22:21] ==> val parts: List<String> defined in org.jetbrains.idl2k.MDNDocumentationCache.Companion.read.<anonymous>[LocalVariableDescriptor]

'size' @ [22:27] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'parts' @ [23:31] ==> val parts: List<String> defined in org.jetbrains.idl2k.MDNDocumentationCache.Companion.read.<anonymous>[LocalVariableDescriptor]

'if (parts[1] == "Y") existing.add(url)
                    else if (parts[1] == "N") nonExisting.add(url)' @ [24:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'parts' @ [24:25] ==> val parts: List<String> defined in org.jetbrains.idl2k.MDNDocumentationCache.Companion.read.<anonymous>[LocalVariableDescriptor]

'existing' @ [24:42] ==> val existing: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.idl2k.MDNDocumentationCache.Companion.read[LocalVariableDescriptor]

'add' @ [24:51] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'url' @ [24:55] ==> val url: String defined in org.jetbrains.idl2k.MDNDocumentationCache.Companion.read.<anonymous>[LocalVariableDescriptor]

'parts' @ [25:30] ==> val parts: List<String> defined in org.jetbrains.idl2k.MDNDocumentationCache.Companion.read.<anonymous>[LocalVariableDescriptor]

'nonExisting' @ [25:47] ==> val nonExisting: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.idl2k.MDNDocumentationCache.Companion.read[LocalVariableDescriptor]

'add' @ [25:59] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'url' @ [25:63] ==> val url: String defined in org.jetbrains.idl2k.MDNDocumentationCache.Companion.read.<anonymous>[LocalVariableDescriptor]

'MDNDocumentationCache' @ [29:20] ==> public constructor MDNDocumentationCache(existing: Set<String>, nonExisting: Set<String>) defined in org.jetbrains.idl2k.MDNDocumentationCache[ClassConstructorDescriptorImpl]

'existing' @ [29:42] ==> val existing: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.idl2k.MDNDocumentationCache.Companion.read[LocalVariableDescriptor]

'nonExisting' @ [29:52] ==> val nonExisting: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.idl2k.MDNDocumentationCache.Companion.read[LocalVariableDescriptor]

'file' @ [33:13] ==> value-parameter file: File defined in org.jetbrains.idl2k.MDNDocumentationCache.Companion.writeTo[ValueParameterDescriptorImpl]

'bufferedWriter' @ [33:18] ==> @InlineOnly public inline fun File.bufferedWriter(charset: Charset = ..., bufferSize: Int = ...): BufferedWriter defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'use' @ [33:35] ==> @InlineOnly public inline fun <T : Closeable?, R> BufferedWriter.use(block: (BufferedWriter) -> BufferedWriter): BufferedWriter defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> BufferedWriter
    <R> -> BufferedWriter

'c' @ [34:18] ==> value-parameter c: MDNDocumentationCache defined in org.jetbrains.idl2k.MDNDocumentationCache.Companion.writeTo[ValueParameterDescriptorImpl]

'existing' @ [34:20] ==> public final val existing: Set<String> defined in org.jetbrains.idl2k.MDNDocumentationCache[PropertyDescriptorImpl]

'c' @ [34:31] ==> value-parameter c: MDNDocumentationCache defined in org.jetbrains.idl2k.MDNDocumentationCache.Companion.writeTo[ValueParameterDescriptorImpl]

'nonExisting' @ [34:33] ==> public final val nonExisting: Set<String> defined in org.jetbrains.idl2k.MDNDocumentationCache[PropertyDescriptorImpl]

'sorted' @ [34:46] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'joinTo' @ [34:55] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<String>.joinTo(buffer: BufferedWriter, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): BufferedWriter defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <A : Appendable /* = Appendable */> -> BufferedWriter

'it' @ [34:62] ==> value-parameter it: BufferedWriter defined in org.jetbrains.idl2k.MDNDocumentationCache.Companion.writeTo.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [34:88] ==> value-parameter it: String defined in org.jetbrains.idl2k.MDNDocumentationCache.Companion.writeTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (it in c.existing) "Y" else "N"' @ [34:93] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'it' @ [34:97] ==> value-parameter it: String defined in org.jetbrains.idl2k.MDNDocumentationCache.Companion.writeTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [34:103] ==> value-parameter c: MDNDocumentationCache defined in org.jetbrains.idl2k.MDNDocumentationCache.Companion.writeTo[ValueParameterDescriptorImpl]

'existing' @ [34:105] ==> public final val existing: Set<String> defined in org.jetbrains.idl2k.MDNDocumentationCache[PropertyDescriptorImpl]

