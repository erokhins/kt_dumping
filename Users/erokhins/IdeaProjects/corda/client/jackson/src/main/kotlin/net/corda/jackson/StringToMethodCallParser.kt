'ThreadSafe' @ [73:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'JvmOverloads' @ [74:49] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'JacksonSupport' @ [76:40] ==> public object JacksonSupport defined in net.corda.jackson in file JacksonSupport.kt[FakeCallableDescriptorForObject]

'createNonRpcMapper' @ [76:55] ==> @JvmStatic @JvmOverloads public final fun createNonRpcMapper(factory: JsonFactory = ...): ObjectMapper defined in net.corda.jackson.JacksonSupport[SimpleFunctionDescriptorImpl]

'YAMLFactory' @ [76:74] ==> public constructor YAMLFactory() defined in com.fasterxml.jackson.dataformat.yaml.YAMLFactory[JavaClassConstructorDescriptor]

'this' @ [78:46] ==> @JvmOverloads public constructor StringToMethodCallParser<in T : Any>(targetType: Class<out T>, om: ObjectMapper = ...) defined in net.corda.jackson.StringToMethodCallParser[ClassConstructorDescriptorImpl]
Inferred types:
    <in T : Any> -> T

'targetType' @ [78:51] ==> value-parameter targetType: KClass<out T> defined in net.corda.jackson.StringToMethodCallParser.<init>[ValueParameterDescriptorImpl]

'java' @ [78:62] ==> public val <T> KClass<out T>.java: Class<out T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out T)

'Suppress' @ [81:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Object' @ [82:36] ==> public constructor Object() defined in java.lang.Object[JavaClassConstructorDescriptor]

'java' @ [82:50] ==> public val <T> KClass<Object>.java: Class<Object> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Object

'methods' @ [82:55] ==> public final val <T : (Any..Any?)> Class<Object>.methods: (Array<(Method..Method?)>..Array<out (Method..Method?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Object

'map' @ [82:63] ==> public inline fun <T, R> Array<out (Method..Method?)>.map(transform: ((Method..Method?)) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Method..java.lang.reflect.Method?)
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [82:69] ==> value-parameter it: (Method..Method?) defined in net.corda.jackson.StringToMethodCallParser.Companion.ignoredNames.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [82:72] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'create' @ [85:39] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> create(): (HashMultimap<(String..String?), (Method..Method?)>..HashMultimap<(String..String?), (Method..Method?)>?) defined in com.google.common.collect.HashMultimap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> Method

'component1' @ [86:19] ==> public final operator fun component1(): (String..String?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [86:24] ==> public final operator fun component2(): (Method..Method?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'clazz' @ [86:34] ==> value-parameter clazz: Class<*> defined in net.corda.jackson.StringToMethodCallParser.Companion.methodsFromType[ValueParameterDescriptorImpl]

'methods' @ [86:40] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.methods: (Array<(Method..Method?)>..Array<out (Method..Method?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'filterNot' @ [86:48] ==> public inline fun <T> Array<out (Method..Method?)>.filterNot(predicate: ((Method..Method?)) -> Boolean): List<(Method..Method?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Method..java.lang.reflect.Method?)

'it' @ [86:60] ==> value-parameter it: (Method..Method?) defined in net.corda.jackson.StringToMethodCallParser.Companion.methodsFromType.<anonymous>[ValueParameterDescriptorImpl]

'isSynthetic' @ [86:63] ==> public final val Method.isSynthetic: Boolean[MyPropertyDescriptor]

'it' @ [86:78] ==> value-parameter it: (Method..Method?) defined in net.corda.jackson.StringToMethodCallParser.Companion.methodsFromType.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [86:81] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'ignoredNames' @ [86:90] ==> @Suppress private final val ignoredNames: List<(String..String?)> defined in net.corda.jackson.StringToMethodCallParser.Companion[PropertyDescriptorImpl]

'map' @ [86:105] ==> public inline fun <T, R> Iterable<(Method..Method?)>.map(transform: ((Method..Method?)) -> Pair<(String..String?), (Method..Method?)>): List<Pair<(String..String?), (Method..Method?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Method..java.lang.reflect.Method?)
    <R> -> Pair<(kotlin.String..kotlin.String?), (java.lang.reflect.Method..java.lang.reflect.Method?)>

'it' @ [86:111] ==> value-parameter it: (Method..Method?) defined in net.corda.jackson.StringToMethodCallParser.Companion.methodsFromType.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [86:114] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'it' @ [86:122] ==> value-parameter it: (Method..Method?) defined in net.corda.jackson.StringToMethodCallParser.Companion.methodsFromType.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [87:17] ==> val result: (HashMultimap<(String..String?), (Method..Method?)>..HashMultimap<(String..String?), (Method..Method?)>?) defined in net.corda.jackson.StringToMethodCallParser.Companion.methodsFromType[LocalVariableDescriptor]

'put' @ [87:24] ==> @CanIgnoreReturnValue public open fun put(@Nullable p0: String?, @Nullable p1: Method?): Boolean defined in com.google.common.collect.HashMultimap[JavaMethodDescriptor]

'key' @ [87:28] ==> val key: (String..String?) defined in net.corda.jackson.StringToMethodCallParser.Companion.methodsFromType[LocalVariableDescriptor]

'value' @ [87:33] ==> val value: (Method..Method?) defined in net.corda.jackson.StringToMethodCallParser.Companion.methodsFromType[LocalVariableDescriptor]

'result' @ [89:20] ==> val result: (HashMultimap<(String..String?), (Method..Method?)>..HashMultimap<(String..String?), (Method..Method?)>?) defined in net.corda.jackson.StringToMethodCallParser.Companion.methodsFromType[LocalVariableDescriptor]

'!!' @ [92:27] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Logger?): Logger[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Logger

'getLogger' @ [92:41] ==> public open fun getLogger(p0: (Class<*>..Class<*>?)): (Logger..Logger?) defined in org.slf4j.LoggerFactory[JavaMethodDescriptor]

'StringToMethodCallParser' @ [92:51] ==> public companion object defined in net.corda.jackson.StringToMethodCallParser[FakeCallableDescriptorForObject]

'java' @ [92:83] ==> public val <T> KClass<StringToMethodCallParser<*>>.java: Class<StringToMethodCallParser<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> StringToMethodCallParser<*>

'methodsFromType' @ [96:57] ==> private final fun methodsFromType(clazz: Class<*>): Multimap<String, Method> defined in net.corda.jackson.StringToMethodCallParser.Companion[SimpleFunctionDescriptorImpl]

'targetType' @ [96:73] ==> value-parameter targetType: Class<out T> defined in net.corda.jackson.StringToMethodCallParser.<init>[ValueParameterDescriptorImpl]

'targetType' @ [99:55] ==> value-parameter targetType: Class<out T> defined in net.corda.jackson.StringToMethodCallParser.<init>[ValueParameterDescriptorImpl]

'declaredMethods' @ [99:66] ==> public final val <T : (Any..Any?)> Class<out T>.declaredMethods: (Array<(Method..Method?)>..Array<out (Method..Method?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out T)

'mapNotNull' @ [99:82] ==> public inline fun <T, R : Any> Array<out (Method..Method?)>.mapNotNull(transform: ((Method..Method?)) -> Pair<(String..String?), List<String>>?): List<Pair<(String..String?), List<String>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Method..java.lang.reflect.Method?)
    <R : Any> -> Pair<(kotlin.String..kotlin.String?), List<String>>

'it' @ [101:13] ==> value-parameter it: (Method..Method?) defined in net.corda.jackson.StringToMethodCallParser.methodParamNames.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [101:16] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'paramNamesFromMethod' @ [101:24] ==> public open fun paramNamesFromMethod(method: Method): List<String> defined in net.corda.jackson.StringToMethodCallParser[SimpleFunctionDescriptorImpl]

'it' @ [101:45] ==> value-parameter it: (Method..Method?) defined in net.corda.jackson.StringToMethodCallParser.methodParamNames.<anonymous>[ValueParameterDescriptorImpl]

'toMap' @ [107:7] ==> public fun <K, V> Iterable<Pair<String, List<String>>>.toMap(): Map<String, List<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<String>

'call' @ [110:39] ==> public open fun call(): Any? defined in net.corda.jackson.StringToMethodCallParser.ParsedMethodCall[SimpleFunctionDescriptorImpl]

'target' @ [112:17] ==> private/*private to this*/ final val target: T? defined in net.corda.jackson.StringToMethodCallParser.ParsedMethodCall[PropertyDescriptorImpl]

'IllegalStateException' @ [113:23] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'log' @ [114:17] ==> private final val log: Logger defined in net.corda.jackson.StringToMethodCallParser.Companion[PropertyDescriptorImpl]

'isDebugEnabled' @ [114:21] ==> public final val Logger.isDebugEnabled: Boolean[MyPropertyDescriptor]

'log' @ [115:17] ==> private final val log: Logger defined in net.corda.jackson.StringToMethodCallParser.Companion[PropertyDescriptorImpl]

'debug' @ [115:21] ==> public abstract fun debug(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'method' @ [115:44] ==> public final val method: Method defined in net.corda.jackson.StringToMethodCallParser.ParsedMethodCall[PropertyDescriptorImpl]

'name' @ [115:51] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'args' @ [115:58] ==> public final val args: Array<Any?> defined in net.corda.jackson.StringToMethodCallParser.ParsedMethodCall[PropertyDescriptorImpl]

'method' @ [116:20] ==> public final val method: Method defined in net.corda.jackson.StringToMethodCallParser.ParsedMethodCall[PropertyDescriptorImpl]

'invoke' @ [116:27] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'target' @ [116:34] ==> private/*private to this*/ final val target: T? defined in net.corda.jackson.StringToMethodCallParser.ParsedMethodCall[PropertyDescriptorImpl]

'args' @ [116:43] ==> public final val args: Array<Any?> defined in net.corda.jackson.StringToMethodCallParser.ParsedMethodCall[PropertyDescriptorImpl]

'method' @ [124:33] ==> value-parameter method: Method defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromMethod[ValueParameterDescriptorImpl]

'kotlinFunction' @ [124:40] ==> public val Method.kotlinFunction: KFunction<*>? defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]

'method' @ [125:16] ==> value-parameter method: Method defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromMethod[ValueParameterDescriptorImpl]

'parameters' @ [125:23] ==> public final val Method.parameters: (Array<(Parameter..Parameter?)>..Array<out (Parameter..Parameter?)>?)[MyPropertyDescriptor]

'mapIndexed' @ [125:34] ==> public inline fun <T, R> Array<out (Parameter..Parameter?)>.mapIndexed(transform: (index: Int, (Parameter..Parameter?)) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Parameter..java.lang.reflect.Parameter?)
    <R> -> (kotlin.String..kotlin.String?)

'when {
                param.isNamePresent -> param.name
            // index + 1 because the first Kotlin reflection param is 'this', but that doesn't match Java reflection.
                kf != null -> kf.parameters[index + 1].name ?: throw UnparseableCallException.ReflectionDataMissing(method.name, index)
                else -> throw UnparseableCallException.ReflectionDataMissing(method.name, index)
            }' @ [126:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (String..String?), entry1: (String..String?), entry2: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'param' @ [127:17] ==> value-parameter param: (Parameter..Parameter?) defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromMethod.<anonymous>[ValueParameterDescriptorImpl]

'isNamePresent' @ [127:23] ==> public final val Parameter.isNamePresent: Boolean[MyPropertyDescriptor]

'param' @ [127:40] ==> value-parameter param: (Parameter..Parameter?) defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromMethod.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [127:46] ==> public final val Parameter.name: (String..String?)[MyPropertyDescriptor]

'kf' @ [129:17] ==> val kf: KFunction<*>? defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromMethod[LocalVariableDescriptor]

'kf' @ [129:31] ==> val kf: KFunction<*>? defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromMethod[LocalVariableDescriptor]

'parameters' @ [129:34] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'index' @ [129:45] ==> value-parameter index: Int defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromMethod.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [129:56] ==> public abstract val name: String? defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'ReflectionDataMissing' @ [129:95] ==> public constructor ReflectionDataMissing(methodName: String, argIndex: Int) defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.ReflectionDataMissing[ClassConstructorDescriptorImpl]

'method' @ [129:117] ==> value-parameter method: Method defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromMethod[ValueParameterDescriptorImpl]

'name' @ [129:124] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'index' @ [129:130] ==> value-parameter index: Int defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromMethod.<anonymous>[ValueParameterDescriptorImpl]

'ReflectionDataMissing' @ [130:56] ==> public constructor ReflectionDataMissing(methodName: String, argIndex: Int) defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.ReflectionDataMissing[ClassConstructorDescriptorImpl]

'method' @ [130:78] ==> value-parameter method: Method defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromMethod[ValueParameterDescriptorImpl]

'name' @ [130:85] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'index' @ [130:91] ==> value-parameter index: Int defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromMethod.<anonymous>[ValueParameterDescriptorImpl]

'ctor' @ [139:33] ==> value-parameter ctor: Constructor<*> defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromConstructor[ValueParameterDescriptorImpl]

'kotlinFunction' @ [139:38] ==> public val <T : Any> Constructor<out (Any..Any?)>.kotlinFunction: KFunction<(Any..Any?)>? defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Captured(*)

'ctor' @ [140:16] ==> value-parameter ctor: Constructor<*> defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromConstructor[ValueParameterDescriptorImpl]

'parameters' @ [140:21] ==> public final val <T : (Any..Any?)> Constructor<out (Any..Any?)>.parameters: (Array<(Parameter..Parameter?)>..Array<out (Parameter..Parameter?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'mapIndexed' @ [140:32] ==> public inline fun <T, R> Array<out (Parameter..Parameter?)>.mapIndexed(transform: (index: Int, (Parameter..Parameter?)) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Parameter..java.lang.reflect.Parameter?)
    <R> -> (kotlin.String..kotlin.String?)

'when {
                param.isNamePresent -> param.name
                kf != null -> kf.parameters[index].name ?: throw UnparseableCallException.ReflectionDataMissing("<init>", index)
                else -> throw UnparseableCallException.ReflectionDataMissing("<init>", index)
            }' @ [141:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (String..String?), entry1: (String..String?), entry2: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'param' @ [142:17] ==> value-parameter param: (Parameter..Parameter?) defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromConstructor.<anonymous>[ValueParameterDescriptorImpl]

'isNamePresent' @ [142:23] ==> public final val Parameter.isNamePresent: Boolean[MyPropertyDescriptor]

'param' @ [142:40] ==> value-parameter param: (Parameter..Parameter?) defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromConstructor.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [142:46] ==> public final val Parameter.name: (String..String?)[MyPropertyDescriptor]

'kf' @ [143:17] ==> val kf: KFunction<*>? defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromConstructor[LocalVariableDescriptor]

'kf' @ [143:31] ==> val kf: KFunction<*>? defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromConstructor[LocalVariableDescriptor]

'parameters' @ [143:34] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'index' @ [143:45] ==> value-parameter index: Int defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromConstructor.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [143:52] ==> public abstract val name: String? defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'ReflectionDataMissing' @ [143:91] ==> public constructor ReflectionDataMissing(methodName: String, argIndex: Int) defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.ReflectionDataMissing[ClassConstructorDescriptorImpl]

'index' @ [143:123] ==> value-parameter index: Int defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromConstructor.<anonymous>[ValueParameterDescriptorImpl]

'ReflectionDataMissing' @ [144:56] ==> public constructor ReflectionDataMissing(methodName: String, argIndex: Int) defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.ReflectionDataMissing[ClassConstructorDescriptorImpl]

'index' @ [144:88] ==> value-parameter index: Int defined in net.corda.jackson.StringToMethodCallParser.paramNamesFromConstructor.<anonymous>[ValueParameterDescriptorImpl]

'Exception' @ [149:86] ==> public final fun <init>(p0: (String..String?), p1: (Throwable..Throwable?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'command' @ [149:128] ==> value-parameter command: String defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.<init>[ValueParameterDescriptorImpl]

'cause' @ [149:138] ==> value-parameter cause: Throwable? = ... defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.<init>[ValueParameterDescriptorImpl]

'UnparseableCallException' @ [150:55] ==> public constructor UnparseableCallException(command: String, cause: Throwable? = ...) defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException[ClassConstructorDescriptorImpl]

'methodName' @ [150:104] ==> value-parameter methodName: String defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.UnknownMethod.<init>[ValueParameterDescriptorImpl]

'UnparseableCallException' @ [151:94] ==> public constructor UnparseableCallException(command: String, cause: Throwable? = ...) defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException[ClassConstructorDescriptorImpl]

'paramName' @ [151:131] ==> value-parameter paramName: String defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.MissingParameter.<init>[ValueParameterDescriptorImpl]

'methodName' @ [151:173] ==> value-parameter methodName: String defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.MissingParameter.<init>[ValueParameterDescriptorImpl]

'command' @ [151:197] ==> value-parameter command: String defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.MissingParameter.<init>[ValueParameterDescriptorImpl]

'UnparseableCallException' @ [152:72] ==> public constructor UnparseableCallException(command: String, cause: Throwable? = ...) defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException[ClassConstructorDescriptorImpl]

'methodName' @ [152:132] ==> value-parameter methodName: String defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.TooManyParameters.<init>[ValueParameterDescriptorImpl]

'command' @ [152:145] ==> value-parameter command: String defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.TooManyParameters.<init>[ValueParameterDescriptorImpl]

'UnparseableCallException' @ [153:74] ==> public constructor UnparseableCallException(command: String, cause: Throwable? = ...) defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException[ClassConstructorDescriptorImpl]

'methodName' @ [153:108] ==> value-parameter methodName: String defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.ReflectionDataMissing.<init>[ValueParameterDescriptorImpl]

'argIndex' @ [153:152] ==> value-parameter argIndex: Int defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.ReflectionDataMissing.<init>[ValueParameterDescriptorImpl]

'UnparseableCallException' @ [154:43] ==> public constructor UnparseableCallException(command: String, cause: Throwable? = ...) defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException[ClassConstructorDescriptorImpl]

'e' @ [154:68] ==> value-parameter e: Exception /* = Exception */ defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.FailedParse.<init>[ValueParameterDescriptorImpl]

'message' @ [154:70] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'e' @ [154:81] ==> value-parameter e: Exception /* = Exception */ defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.FailedParse.<init>[ValueParameterDescriptorImpl]

'toString' @ [154:83] ==> public open fun toString(): String defined in java.lang.Exception[DeserializedSimpleFunctionDescriptor]

'e' @ [154:95] ==> value-parameter e: Exception /* = Exception */ defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.FailedParse.<init>[ValueParameterDescriptorImpl]

'Throws' @ [161:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'UnparseableCallException' @ [161:13] ==> public constructor UnparseableCallException(command: String, cause: Throwable? = ...) defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException[ClassConstructorDescriptorImpl]

'log' @ [163:9] ==> private final val log: Logger defined in net.corda.jackson.StringToMethodCallParser.Companion[PropertyDescriptorImpl]

'debug' @ [163:13] ==> public abstract fun debug(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'command' @ [163:59] ==> value-parameter command: String defined in net.corda.jackson.StringToMethodCallParser.parse[ValueParameterDescriptorImpl]

'command' @ [164:26] ==> value-parameter command: String defined in net.corda.jackson.StringToMethodCallParser.parse[ValueParameterDescriptorImpl]

'indexOf' @ [164:34] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (spaceIndex != -1) command.substring(0, spaceIndex) else command' @ [165:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'spaceIndex' @ [165:24] ==> val spaceIndex: Int defined in net.corda.jackson.StringToMethodCallParser.parse[LocalVariableDescriptor]

'-' @ [165:38] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'command' @ [165:42] ==> value-parameter command: String defined in net.corda.jackson.StringToMethodCallParser.parse[ValueParameterDescriptorImpl]

'substring' @ [165:50] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'spaceIndex' @ [165:63] ==> val spaceIndex: Int defined in net.corda.jackson.StringToMethodCallParser.parse[LocalVariableDescriptor]

'command' @ [165:80] ==> value-parameter command: String defined in net.corda.jackson.StringToMethodCallParser.parse[ValueParameterDescriptorImpl]

'if (spaceIndex != -1) command.substring(spaceIndex) else ""' @ [166:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'spaceIndex' @ [166:26] ==> val spaceIndex: Int defined in net.corda.jackson.StringToMethodCallParser.parse[LocalVariableDescriptor]

'-' @ [166:40] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'command' @ [166:44] ==> value-parameter command: String defined in net.corda.jackson.StringToMethodCallParser.parse[ValueParameterDescriptorImpl]

'substring' @ [166:52] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'spaceIndex' @ [166:62] ==> val spaceIndex: Int defined in net.corda.jackson.StringToMethodCallParser.parse[LocalVariableDescriptor]

'methodMap' @ [167:43] ==> protected final val methodMap: Multimap<String, Method> defined in net.corda.jackson.StringToMethodCallParser[PropertyDescriptorImpl]

'name' @ [167:53] ==> val name: String defined in net.corda.jackson.StringToMethodCallParser.parse[LocalVariableDescriptor]

'methods' @ [168:13] ==> val methods: Collection<Method> defined in net.corda.jackson.StringToMethodCallParser.parse[LocalVariableDescriptor]

'isEmpty' @ [168:21] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'UnknownMethod' @ [169:44] ==> public constructor UnknownMethod(methodName: String) defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.UnknownMethod[ClassConstructorDescriptorImpl]

'name' @ [169:58] ==> val name: String defined in net.corda.jackson.StringToMethodCallParser.parse[LocalVariableDescriptor]

'log' @ [170:9] ==> private final val log: Logger defined in net.corda.jackson.StringToMethodCallParser.Companion[PropertyDescriptorImpl]

'debug' @ [170:13] ==> public abstract fun debug(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'name' @ [170:49] ==> val name: String defined in net.corda.jackson.StringToMethodCallParser.parse[LocalVariableDescriptor]

'component1' @ [173:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [173:22] ==> public final operator fun component2(): Method defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'methods' @ [173:33] ==> val methods: Collection<Method> defined in net.corda.jackson.StringToMethodCallParser.parse[LocalVariableDescriptor]

'withIndex' @ [173:41] ==> public fun <T> Iterable<Method>.withIndex(): Iterable<IndexedValue<Method>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Method

'parseArguments' @ [175:28] ==> @Throws public final fun parseArguments(methodNameHint: String, parameters: List<Pair<String, Class<*>>>, args: String): Array<Any?> defined in net.corda.jackson.StringToMethodCallParser[SimpleFunctionDescriptorImpl]

'name' @ [175:43] ==> val name: String defined in net.corda.jackson.StringToMethodCallParser.parse[LocalVariableDescriptor]

'paramNamesFromMethod' @ [175:49] ==> public open fun paramNamesFromMethod(method: Method): List<String> defined in net.corda.jackson.StringToMethodCallParser[SimpleFunctionDescriptorImpl]

'method' @ [175:70] ==> val method: Method defined in net.corda.jackson.StringToMethodCallParser.parse[LocalVariableDescriptor]

'zip' @ [175:78] ==> public infix fun <T, R> Iterable<String>.zip(other: Array<out (Class<*>..Class<*>?)>): List<Pair<String, (Class<*>..Class<*>?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (java.lang.Class<*>..java.lang.Class<*>?)

'method' @ [175:82] ==> val method: Method defined in net.corda.jackson.StringToMethodCallParser.parse[LocalVariableDescriptor]

'parameterTypes' @ [175:89] ==> public final val Method.parameterTypes: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>?)[MyPropertyDescriptor]

'argStr' @ [175:106] ==> val argStr: String defined in net.corda.jackson.StringToMethodCallParser.parse[LocalVariableDescriptor]

'ParsedMethodCall' @ [176:24] ==> public constructor ParsedMethodCall(target: T?, method: Method, args: Array<Any?>) defined in net.corda.jackson.StringToMethodCallParser.ParsedMethodCall[ClassConstructorDescriptorImpl]

'target' @ [176:41] ==> value-parameter target: T? defined in net.corda.jackson.StringToMethodCallParser.parse[ValueParameterDescriptorImpl]

'method' @ [176:49] ==> val method: Method defined in net.corda.jackson.StringToMethodCallParser.parse[LocalVariableDescriptor]

'args' @ [176:57] ==> val args: Array<Any?> defined in net.corda.jackson.StringToMethodCallParser.parse[LocalVariableDescriptor]

'index' @ [178:21] ==> val index: Int defined in net.corda.jackson.StringToMethodCallParser.parse[LocalVariableDescriptor]

'methods' @ [178:30] ==> val methods: Collection<Method> defined in net.corda.jackson.StringToMethodCallParser.parse[LocalVariableDescriptor]

'size' @ [178:38] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'e' @ [179:27] ==> val e: StringToMethodCallParser.UnparseableCallException defined in net.corda.jackson.StringToMethodCallParser.parse[LocalVariableDescriptor]

'UnparseableCallException' @ [182:15] ==> public constructor UnparseableCallException(command: String, cause: Throwable? = ...) defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException[ClassConstructorDescriptorImpl]

'Throws' @ [190:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'UnparseableCallException' @ [190:13] ==> public constructor UnparseableCallException(command: String, cause: Throwable? = ...) defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException[ClassConstructorDescriptorImpl]

'args' @ [193:35] ==> value-parameter args: String defined in net.corda.jackson.StringToMethodCallParser.parseArguments[ValueParameterDescriptorImpl]

'om' @ [194:30] ==> private final val om: ObjectMapper defined in net.corda.jackson.StringToMethodCallParser[PropertyDescriptorImpl]

'readTree' @ [194:33] ==> public open fun readTree(p0: (String..String?)): (JsonNode..JsonNode?) defined in com.fasterxml.jackson.databind.ObjectMapper[JavaMethodDescriptor]

'parameterString' @ [194:42] ==> val parameterString: String defined in net.corda.jackson.StringToMethodCallParser.parseArguments[LocalVariableDescriptor]

'UnparseableCallException' @ [194:68] ==> public constructor UnparseableCallException(command: String, cause: Throwable? = ...) defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException[ClassConstructorDescriptorImpl]

'args' @ [194:93] ==> value-parameter args: String defined in net.corda.jackson.StringToMethodCallParser.parseArguments[ValueParameterDescriptorImpl]

'tree' @ [195:13] ==> val tree: JsonNode defined in net.corda.jackson.StringToMethodCallParser.parseArguments[LocalVariableDescriptor]

'size' @ [195:18] ==> public open fun size(): Int defined in com.fasterxml.jackson.databind.JsonNode[JavaMethodDescriptor]

'parameters' @ [195:27] ==> value-parameter parameters: List<Pair<String, Class<*>>> defined in net.corda.jackson.StringToMethodCallParser.parseArguments[ValueParameterDescriptorImpl]

'size' @ [195:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'TooManyParameters' @ [195:75] ==> public constructor TooManyParameters(methodName: String, command: String) defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.TooManyParameters[ClassConstructorDescriptorImpl]

'methodNameHint' @ [195:93] ==> value-parameter methodNameHint: String defined in net.corda.jackson.StringToMethodCallParser.parseArguments[ValueParameterDescriptorImpl]

'args' @ [195:109] ==> value-parameter args: String defined in net.corda.jackson.StringToMethodCallParser.parseArguments[ValueParameterDescriptorImpl]

'parameters' @ [196:41] ==> value-parameter parameters: List<Pair<String, Class<*>>> defined in net.corda.jackson.StringToMethodCallParser.parseArguments[ValueParameterDescriptorImpl]

'mapIndexed' @ [196:52] ==> public inline fun <T, R> Iterable<Pair<String, Class<*>>>.mapIndexed(transform: (index: Int, Pair<String, Class<*>>) -> (Any..Any?)): List<(Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Class<*>>
    <R> -> (kotlin.Any..kotlin.Any?)

'component1' @ [196:69] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [196:78] ==> public final operator fun component2(): Class<*> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'tree' @ [197:25] ==> val tree: JsonNode defined in net.corda.jackson.StringToMethodCallParser.parseArguments[LocalVariableDescriptor]

'argName' @ [197:30] ==> val argName: String defined in net.corda.jackson.StringToMethodCallParser.parseArguments.<anonymous>[LocalVariableDescriptor]

'MissingParameter' @ [197:73] ==> public constructor MissingParameter(methodName: String, paramName: String, command: String) defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.MissingParameter[ClassConstructorDescriptorImpl]

'methodNameHint' @ [197:90] ==> value-parameter methodNameHint: String defined in net.corda.jackson.StringToMethodCallParser.parseArguments[ValueParameterDescriptorImpl]

'argName' @ [197:106] ==> val argName: String defined in net.corda.jackson.StringToMethodCallParser.parseArguments.<anonymous>[LocalVariableDescriptor]

'args' @ [197:115] ==> value-parameter args: String defined in net.corda.jackson.StringToMethodCallParser.parseArguments[ValueParameterDescriptorImpl]

'om' @ [199:17] ==> private final val om: ObjectMapper defined in net.corda.jackson.StringToMethodCallParser[PropertyDescriptorImpl]

'readValue' @ [199:20] ==> public open fun <T : (Any..Any?)> readValue(p0: (JsonParser..JsonParser?), p1: (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)): (Any..Any?) defined in com.fasterxml.jackson.databind.ObjectMapper[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'entry' @ [199:30] ==> val entry: JsonNode defined in net.corda.jackson.StringToMethodCallParser.parseArguments.<anonymous>[LocalVariableDescriptor]

'traverse' @ [199:36] ==> public abstract fun traverse(p0: (ObjectCodec..ObjectCodec?)): (JsonParser..JsonParser?) defined in com.fasterxml.jackson.databind.JsonNode[JavaMethodDescriptor]

'om' @ [199:45] ==> private final val om: ObjectMapper defined in net.corda.jackson.StringToMethodCallParser[PropertyDescriptorImpl]

'argType' @ [199:50] ==> val argType: Class<*> defined in net.corda.jackson.StringToMethodCallParser.parseArguments.<anonymous>[LocalVariableDescriptor]

'FailedParse' @ [201:48] ==> public constructor FailedParse(e: Exception /* = Exception */) defined in net.corda.jackson.StringToMethodCallParser.UnparseableCallException.FailedParse[ClassConstructorDescriptorImpl]

'e' @ [201:60] ==> val e: Exception /* = Exception */ defined in net.corda.jackson.StringToMethodCallParser.parseArguments.<anonymous>[LocalVariableDescriptor]

'log' @ [204:13] ==> private final val log: Logger defined in net.corda.jackson.StringToMethodCallParser.Companion[PropertyDescriptorImpl]

'isDebugEnabled' @ [204:17] ==> public final val Logger.isDebugEnabled: Boolean[MyPropertyDescriptor]

'inOrderParams' @ [205:13] ==> val inOrderParams: List<Any?> defined in net.corda.jackson.StringToMethodCallParser.parseArguments[LocalVariableDescriptor]

'forEachIndexed' @ [205:27] ==> public inline fun <T> Iterable<Any?>.forEachIndexed(action: (index: Int, Any?) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'if (param != null) "${param.javaClass.name} -> $param" else "(null)"' @ [206:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'param' @ [206:31] ==> value-parameter param: Any? defined in net.corda.jackson.StringToMethodCallParser.parseArguments.<anonymous>[ValueParameterDescriptorImpl]

'param' @ [206:49] ==> value-parameter param: Any? defined in net.corda.jackson.StringToMethodCallParser.parseArguments.<anonymous>[ValueParameterDescriptorImpl]

'javaClass' @ [206:55] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'name' @ [206:65] ==> public final val <T : (Any..Any?)> Class<Any>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'param' @ [206:75] ==> value-parameter param: Any? defined in net.corda.jackson.StringToMethodCallParser.parseArguments.<anonymous>[ValueParameterDescriptorImpl]

'log' @ [207:17] ==> private final val log: Logger defined in net.corda.jackson.StringToMethodCallParser.Companion[PropertyDescriptorImpl]

'debug' @ [207:21] ==> public abstract fun debug(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'i' @ [207:39] ==> value-parameter i: Int defined in net.corda.jackson.StringToMethodCallParser.parseArguments.<anonymous>[ValueParameterDescriptorImpl]

'tmp' @ [207:43] ==> val tmp: String defined in net.corda.jackson.StringToMethodCallParser.parseArguments.<anonymous>[LocalVariableDescriptor]

'inOrderParams' @ [210:16] ==> val inOrderParams: List<Any?> defined in net.corda.jackson.StringToMethodCallParser.parseArguments[LocalVariableDescriptor]

'toTypedArray' @ [210:30] ==> public inline fun <reified T> Collection<Any?>.toTypedArray(): Array<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Any?

'methodMap' @ [215:16] ==> protected final val methodMap: Multimap<String, Method> defined in net.corda.jackson.StringToMethodCallParser[PropertyDescriptorImpl]

'entries' @ [215:26] ==> public abstract fun entries(): (MutableCollection<(MutableMap.MutableEntry<(String..String?), (Method..Method?)>..Map.Entry<(String..String?), (Method..Method?)>?)>..Collection<(MutableMap.MutableEntry<(String..String?), (Method..Method?)>..Map.Entry<(String..String?), (Method..Method?)>?)>?) defined in com.google.common.collect.Multimap[JavaMethodDescriptor]

'map' @ [215:36] ==> public inline fun <T, R> Iterable<(MutableMap.MutableEntry<(String..String?), (Method..Method?)>..Map.Entry<(String..String?), (Method..Method?)>?)>.map(transform: ((MutableMap.MutableEntry<(String..String?), (Method..Method?)>..Map.Entry<(String..String?), (Method..Method?)>?)) -> Pair<(String..String?), String>): List<Pair<(String..String?), String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableMap.MutableEntry<(kotlin.String..kotlin.String?), (java.lang.reflect.Method..java.lang.reflect.Method?)>..kotlin.collections.Map.Entry<(kotlin.String..kotlin.String?), (java.lang.reflect.Method..java.lang.reflect.Method?)>?)
    <R> -> Pair<(kotlin.String..kotlin.String?), String>

'component1' @ [216:18] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(String..String?), (Method..Method?)>.component1(): (String..String?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (java.lang.reflect.Method..java.lang.reflect.Method?)

'component2' @ [216:24] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(String..String?), (Method..Method?)>.component2(): (Method..Method?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (java.lang.reflect.Method..java.lang.reflect.Method?)

'entry' @ [216:32] ==> value-parameter entry: (MutableMap.MutableEntry<(String..String?), (Method..Method?)>..Map.Entry<(String..String?), (Method..Method?)>?) defined in net.corda.jackson.StringToMethodCallParser.<get-availableCommands>.<anonymous>[ValueParameterDescriptorImpl]

'if (args.parameterCount == 0) "" else {
                val paramNames = methodParamNames[name]!!
                val typeNames = args.parameters.map { it.type.simpleName }
                val paramTypes = paramNames.zip(typeNames)
                paramTypes.map { "${it.first}: ${it.second}" }.joinToString(", ")
            }' @ [217:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'args' @ [217:30] ==> val args: (Method..Method?) defined in net.corda.jackson.StringToMethodCallParser.<get-availableCommands>.<anonymous>[LocalVariableDescriptor]

'parameterCount' @ [217:35] ==> public final val Method.parameterCount: Int[MyPropertyDescriptor]

'methodParamNames' @ [218:34] ==> public final val methodParamNames: Map<String, List<String>> defined in net.corda.jackson.StringToMethodCallParser[PropertyDescriptorImpl]

'name' @ [218:51] ==> val name: (String..String?) defined in net.corda.jackson.StringToMethodCallParser.<get-availableCommands>.<anonymous>[LocalVariableDescriptor]

'args' @ [219:33] ==> val args: (Method..Method?) defined in net.corda.jackson.StringToMethodCallParser.<get-availableCommands>.<anonymous>[LocalVariableDescriptor]

'parameters' @ [219:38] ==> public final val Method.parameters: (Array<(Parameter..Parameter?)>..Array<out (Parameter..Parameter?)>?)[MyPropertyDescriptor]

'map' @ [219:49] ==> public inline fun <T, R> Array<out (Parameter..Parameter?)>.map(transform: ((Parameter..Parameter?)) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Parameter..java.lang.reflect.Parameter?)
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [219:55] ==> value-parameter it: (Parameter..Parameter?) defined in net.corda.jackson.StringToMethodCallParser.<get-availableCommands>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [219:58] ==> public final val Parameter.type: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'simpleName' @ [219:63] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'paramNames' @ [220:34] ==> val paramNames: List<String> defined in net.corda.jackson.StringToMethodCallParser.<get-availableCommands>.<anonymous>[LocalVariableDescriptor]

'zip' @ [220:45] ==> public infix fun <T, R> Iterable<String>.zip(other: Iterable<(String..String?)>): List<Pair<String, (String..String?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (kotlin.String..kotlin.String?)

'typeNames' @ [220:49] ==> val typeNames: List<(String..String?)> defined in net.corda.jackson.StringToMethodCallParser.<get-availableCommands>.<anonymous>[LocalVariableDescriptor]

'paramTypes' @ [221:17] ==> val paramTypes: List<Pair<String, (String..String?)>> defined in net.corda.jackson.StringToMethodCallParser.<get-availableCommands>.<anonymous>[LocalVariableDescriptor]

'map' @ [221:28] ==> public inline fun <T, R> Iterable<Pair<String, (String..String?)>>.map(transform: (Pair<String, (String..String?)>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, (kotlin.String..kotlin.String?)>
    <R> -> String

'it' @ [221:37] ==> value-parameter it: Pair<String, (String..String?)> defined in net.corda.jackson.StringToMethodCallParser.<get-availableCommands>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [221:40] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [221:50] ==> value-parameter it: Pair<String, (String..String?)> defined in net.corda.jackson.StringToMethodCallParser.<get-availableCommands>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [221:53] ==> public final val second: (String..String?) defined in kotlin.Pair[DeserializedPropertyDescriptor]

'joinToString' @ [221:64] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Pair' @ [223:13] ==> public constructor Pair<out A, out B>(first: (String..String?), second: String) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> (kotlin.String..kotlin.String?)
    <out B> -> String

'name' @ [223:18] ==> val name: (String..String?) defined in net.corda.jackson.StringToMethodCallParser.<get-availableCommands>.<anonymous>[LocalVariableDescriptor]

'argStr' @ [223:24] ==> val argStr: String defined in net.corda.jackson.StringToMethodCallParser.<get-availableCommands>.<anonymous>[LocalVariableDescriptor]

'toMap' @ [224:11] ==> public fun <K, V> Iterable<Pair<String, String>>.toMap(): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

