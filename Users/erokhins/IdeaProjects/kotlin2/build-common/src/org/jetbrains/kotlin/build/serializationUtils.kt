'serializeToPlainText' @ [23:74] ==> public fun <T : Any> serializeToPlainText(instance: T, klass: KClass<T>): String defined in org.jetbrains.kotlin.build[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'instance' @ [23:95] ==> value-parameter instance: T defined in org.jetbrains.kotlin.build.serializeToPlainText[ValueParameterDescriptorImpl]

'ArrayList' @ [26:17] ==> public final fun <E> <init>(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> String

'klass' @ [27:22] ==> value-parameter klass: KClass<T> defined in org.jetbrains.kotlin.build.serializeToPlainText[ValueParameterDescriptorImpl]

'memberProperties' @ [27:28] ==> @SinceKotlin public val <T : Any> KClass<T>.memberProperties: Collection<KProperty1<T, *>> defined in kotlin.reflect.full[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> T

'property' @ [28:21] ==> val property: KProperty1<T, *> defined in org.jetbrains.kotlin.build.serializeToPlainText[LocalVariableDescriptor]

'get' @ [28:30] ==> public abstract fun get(receiver: T): Any? defined in kotlin.reflect.KProperty1[DeserializedSimpleFunctionDescriptor]

'instance' @ [28:34] ==> value-parameter instance: T defined in org.jetbrains.kotlin.build.serializeToPlainText[ValueParameterDescriptorImpl]

'value' @ [29:13] ==> val value: Any? defined in org.jetbrains.kotlin.build.serializeToPlainText[LocalVariableDescriptor]

'lines' @ [30:13] ==> val lines: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.build.serializeToPlainText[LocalVariableDescriptor]

'add' @ [30:19] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'property' @ [30:26] ==> val property: KProperty1<T, *> defined in org.jetbrains.kotlin.build.serializeToPlainText[LocalVariableDescriptor]

'name' @ [30:35] ==> public abstract val name: String defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'value' @ [30:42] ==> val value: Any? defined in org.jetbrains.kotlin.build.serializeToPlainText[LocalVariableDescriptor]

'lines' @ [33:12] ==> val lines: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.build.serializeToPlainText[LocalVariableDescriptor]

'joinToString' @ [33:18] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'deserializeFromPlainText' @ [36:74] ==> public fun <T : Any> deserializeFromPlainText(str: String, klass: KClass<T>): T? defined in org.jetbrains.kotlin.build[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'str' @ [36:99] ==> value-parameter str: String defined in org.jetbrains.kotlin.build.deserializeFromPlainText[ValueParameterDescriptorImpl]

'ArrayList' @ [39:16] ==> public final fun <E> <init>(): ArrayList<Any?> /* = ArrayList<Any?> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> Any?

'str' @ [40:22] ==> value-parameter str: String defined in org.jetbrains.kotlin.build.deserializeFromPlainText[ValueParameterDescriptorImpl]

'split' @ [41:14] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'filter' @ [42:14] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'String' @ [42:21] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'associate' @ [43:14] ==> public inline fun <T, K, V> Iterable<String>.associate(transform: (String) -> Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> String
    <V> -> String

'it' @ [43:26] ==> value-parameter it: String defined in org.jetbrains.kotlin.build.deserializeFromPlainText.<anonymous>[ValueParameterDescriptorImpl]

'substringBefore' @ [43:29] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [43:53] ==> value-parameter it: String defined in org.jetbrains.kotlin.build.deserializeFromPlainText.<anonymous>[ValueParameterDescriptorImpl]

'substringAfter' @ [43:56] ==> public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'klass' @ [45:30] ==> value-parameter klass: KClass<T> defined in org.jetbrains.kotlin.build.deserializeFromPlainText[ValueParameterDescriptorImpl]

'primaryConstructor' @ [45:36] ==> @SinceKotlin public val <T : Any> KClass<T>.primaryConstructor: KFunction<T>? defined in kotlin.reflect.full[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> T

'IllegalStateException' @ [46:39] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'klass' @ [46:64] ==> value-parameter klass: KClass<T> defined in org.jetbrains.kotlin.build.deserializeFromPlainText[ValueParameterDescriptorImpl]

'java' @ [46:70] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'primaryConstructor' @ [47:19] ==> val primaryConstructor: KFunction<T> defined in org.jetbrains.kotlin.build.deserializeFromPlainText[LocalVariableDescriptor]

'parameters' @ [47:38] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'sortedBy' @ [47:49] ==> public inline fun <T, R : Comparable<Int>> Iterable<KParameter>.sortedBy(crossinline selector: (KParameter) -> Int?): List<KParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KParameter
    <R : Comparable<R>> -> Int

'it' @ [47:60] ==> value-parameter it: KParameter defined in org.jetbrains.kotlin.build.deserializeFromPlainText.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [47:63] ==> public abstract val index: Int defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'properties' @ [48:30] ==> val properties: Map<String, String> defined in org.jetbrains.kotlin.build.deserializeFromPlainText[LocalVariableDescriptor]

'param' @ [48:41] ==> val param: KParameter defined in org.jetbrains.kotlin.build.deserializeFromPlainText[LocalVariableDescriptor]

'name' @ [48:47] ==> public abstract val name: String? defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'argumentString' @ [50:13] ==> val argumentString: String? defined in org.jetbrains.kotlin.build.deserializeFromPlainText[LocalVariableDescriptor]

'if (param.type.isMarkedNullable) {
                args.add(null)
                continue
            }
            else {
                return null
            }' @ [51:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'param' @ [51:17] ==> val param: KParameter defined in org.jetbrains.kotlin.build.deserializeFromPlainText[LocalVariableDescriptor]

'type' @ [51:23] ==> public abstract val type: KType defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'isMarkedNullable' @ [51:28] ==> public abstract val isMarkedNullable: Boolean defined in kotlin.reflect.KType[DeserializedPropertyDescriptor]

'args' @ [52:17] ==> val args: ArrayList<Any?> /* = ArrayList<Any?> */ defined in org.jetbrains.kotlin.build.deserializeFromPlainText[LocalVariableDescriptor]

'add' @ [52:22] ==> public open fun add(element: Any?): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'when (param.type.classifier) {
            Int::class -> argumentString.toInt()
            Boolean::class -> argumentString.toBoolean()
            String::class -> argumentString
            else -> throw IllegalStateException("Unexpected property type: ${param.type}")
        }' @ [60:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: {Comparable<{Boolean & String & Int}> & java.io.Serializable}, entry1: {Comparable<{Boolean & String & Int}> & java.io.Serializable}, entry2: {Comparable<{Boolean & String & Int}> & java.io.Serializable}, entry3: {Comparable<{Boolean & String & Int}> & java.io.Serializable}): {Comparable<{Boolean & String & Int}> & java.io.Serializable}[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> {Comparable<{Boolean & String & Int}> & java.io.Serializable}

'param' @ [60:36] ==> val param: KParameter defined in org.jetbrains.kotlin.build.deserializeFromPlainText[LocalVariableDescriptor]

'type' @ [60:42] ==> public abstract val type: KType defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'classifier' @ [60:47] ==> @SinceKotlin public abstract val classifier: KClassifier? defined in kotlin.reflect.KType[DeserializedPropertyDescriptor]

'Int' @ [61:13] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'argumentString' @ [61:27] ==> val argumentString: String? defined in org.jetbrains.kotlin.build.deserializeFromPlainText[LocalVariableDescriptor]

'toInt' @ [61:42] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Boolean' @ [62:13] ==> private constructor Boolean() defined in kotlin.Boolean[DeserializedClassConstructorDescriptor]

'argumentString' @ [62:31] ==> val argumentString: String? defined in org.jetbrains.kotlin.build.deserializeFromPlainText[LocalVariableDescriptor]

'toBoolean' @ [62:46] ==> @InlineOnly public inline fun String.toBoolean(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'String' @ [63:13] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'argumentString' @ [63:30] ==> val argumentString: String? defined in org.jetbrains.kotlin.build.deserializeFromPlainText[LocalVariableDescriptor]

'IllegalStateException' @ [64:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'param' @ [64:78] ==> val param: KParameter defined in org.jetbrains.kotlin.build.deserializeFromPlainText[LocalVariableDescriptor]

'type' @ [64:84] ==> public abstract val type: KType defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'args' @ [67:9] ==> val args: ArrayList<Any?> /* = ArrayList<Any?> */ defined in org.jetbrains.kotlin.build.deserializeFromPlainText[LocalVariableDescriptor]

'add' @ [67:14] ==> public open fun add(element: Any?): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'argument' @ [67:18] ==> val argument: Any? defined in org.jetbrains.kotlin.build.deserializeFromPlainText[LocalVariableDescriptor]

'primaryConstructor' @ [70:12] ==> val primaryConstructor: KFunction<T> defined in org.jetbrains.kotlin.build.deserializeFromPlainText[LocalVariableDescriptor]

'call' @ [70:31] ==> public abstract fun call(vararg args: Any?): T defined in kotlin.reflect.KFunction[DeserializedSimpleFunctionDescriptor]

'args' @ [70:37] ==> val args: ArrayList<Any?> /* = ArrayList<Any?> */ defined in org.jetbrains.kotlin.build.deserializeFromPlainText[LocalVariableDescriptor]

'toTypedArray' @ [70:42] ==> public inline fun <reified T> Collection<Any?>.toTypedArray(): Array<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Any?

