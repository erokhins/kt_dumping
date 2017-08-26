'TestCase' @ [26:34] ==> public constructor TestCase() defined in junit.framework.TestCase[JavaClassConstructorDescriptor]

'super' @ [30:9] ==> <this> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest[LazyClassReceiverParameterDescriptor]

'setUp' @ [30:15] ==> protected/*protected and package*/ open fun setUp(): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'classLoader' @ [31:9] ==> private final lateinit var classLoader: ClassLoader defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest[PropertyDescriptorImpl]

'runtimeAndReflectJarClassLoader' @ [31:45] ==> @NotNull public open fun runtimeAndReflectJarClassLoader(): ClassLoader defined in org.jetbrains.kotlin.codegen.forTestCompile.ForTestCompileRuntime[JavaMethodDescriptor]

'ReflectionCodeSanityTest' @ [35:9] ==> public constructor ReflectionCodeSanityTest() defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest[ClassConstructorDescriptorImpl]

'classLoader' @ [35:35] ==> private final lateinit var classLoader: ClassLoader defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest[PropertyDescriptorImpl]

'javaField' @ [35:47] ==> public val KProperty<*>.javaField: Field? defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]

'set' @ [35:59] ==> @CallerSensitive public open operator fun set(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in java.lang.reflect.Field[JavaMethodDescriptor]

'this' @ [35:63] ==> <this> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest[LazyClassReceiverParameterDescriptor]

'super' @ [36:9] ==> <this> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest[LazyClassReceiverParameterDescriptor]

'tearDown' @ [36:15] ==> protected/*protected and package*/ open fun tearDown(): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'classLoader' @ [40:13] ==> private final lateinit var classLoader: ClassLoader defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest[PropertyDescriptorImpl]

'loadClass' @ [40:25] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'name' @ [40:65] ==> value-parameter name: String defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.loadClass[ValueParameterDescriptorImpl]

'linkedSetOf' @ [43:22] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<Class<*>> /* = LinkedHashSet<Class<*>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<*>

'result' @ [45:17] ==> val result: LinkedHashSet<Class<*>> /* = LinkedHashSet<Class<*>> */ defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.collectClassesWithSupers[LocalVariableDescriptor]

'add' @ [45:24] ==> public open fun add(element: Class<*>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'klass' @ [45:28] ==> value-parameter klass: Class<*> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.collectClassesWithSupers.addClassToCheck[ValueParameterDescriptorImpl]

'klass' @ [46:17] ==> value-parameter klass: Class<*> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.collectClassesWithSupers.addClassToCheck[ValueParameterDescriptorImpl]

'superclass' @ [46:23] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.superclass: (Class<in (Nothing..Nothing?)>..Class<in (Nothing..Nothing?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'let' @ [46:35] ==> @InlineOnly public inline fun <T, R> Class<out (Any..Any?)>.let(block: (Class<out (Any..Any?)>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out (kotlin.Any..kotlin.Any?)>
    <R> -> Unit

'names' @ [50:22] ==> value-parameter vararg names: String defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.collectClassesWithSupers[ValueParameterDescriptorImpl]

'addClassToCheck' @ [51:13] ==> local final fun addClassToCheck(klass: Class<*>): Unit defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.collectClassesWithSupers[SimpleFunctionDescriptorImpl]

'loadClass' @ [51:29] ==> private final fun loadClass(name: String): Class<*> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest[SimpleFunctionDescriptorImpl]

'name' @ [51:39] ==> val name: String defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.collectClassesWithSupers[LocalVariableDescriptor]

'result' @ [54:16] ==> val result: LinkedHashSet<Class<*>> /* = LinkedHashSet<Class<*>> */ defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.collectClassesWithSupers[LocalVariableDescriptor]

'linkedSetOf' @ [58:25] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<Field> /* = LinkedHashSet<Field> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Field

'collectClassesWithSupers' @ [59:23] ==> private final fun collectClassesWithSupers(vararg names: String): Set<Class<*>> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest[SimpleFunctionDescriptorImpl]

'badFields' @ [65:13] ==> val badFields: LinkedHashSet<Field> /* = LinkedHashSet<Field> */ defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testNoDelegatedPropertiesInKClassAndKProperties[LocalVariableDescriptor]

'addAll' @ [65:23] ==> public open fun addAll(elements: Collection<Field>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'klass' @ [65:30] ==> val klass: Class<*> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testNoDelegatedPropertiesInKClassAndKProperties[LocalVariableDescriptor]

'declaredFields' @ [65:36] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.declaredFields: (Array<(Field..Field?)>..Array<out (Field..Field?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'filter' @ [65:51] ==> public inline fun <T> Array<out (Field..Field?)>.filter(predicate: ((Field..Field?)) -> Boolean): List<(Field..Field?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Field..java.lang.reflect.Field?)

'it' @ [65:60] ==> value-parameter it: (Field..Field?) defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testNoDelegatedPropertiesInKClassAndKProperties.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [65:63] ==> public final val Field.name: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [65:68] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DELEGATED_PROPERTY_NAME_SUFFIX' @ [65:84] ==> public const final val DELEGATED_PROPERTY_NAME_SUFFIX: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'badFields' @ [68:13] ==> val badFields: LinkedHashSet<Field> /* = LinkedHashSet<Field> */ defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testNoDelegatedPropertiesInKClassAndKProperties[LocalVariableDescriptor]

'isNotEmpty' @ [68:23] ==> @InlineOnly public inline fun <T> Collection<Field>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Field

'fail' @ [69:13] ==> public open fun fail(p0: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'+' @ [69:18] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'badFields' @ [74:18] ==> val badFields: LinkedHashSet<Field> /* = LinkedHashSet<Field> */ defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testNoDelegatedPropertiesInKClassAndKProperties[LocalVariableDescriptor]

'joinToString' @ [74:28] ==> public fun <T> Iterable<Field>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Field) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Field

'linkedMapOf' @ [82:43] ==> public fun <K, V> linkedMapOf(vararg pairs: Pair<String, Int>): LinkedHashMap<String, Int> /* = LinkedHashMap<String, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [83:17] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [84:17] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'linkedMapOf' @ [87:26] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<Class<*>, Collection<Field>> /* = LinkedHashMap<Class<*>, Collection<Field>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Class<*>
    <V> -> Collection<Field>

'component1' @ [88:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, Int>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'component2' @ [88:26] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, Int>.component2(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'classesWithMaxAllowedFields' @ [88:47] ==> val classesWithMaxAllowedFields: LinkedHashMap<String, Int> /* = LinkedHashMap<String, Int> */ defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields[LocalVariableDescriptor]

'loadClass' @ [89:25] ==> private final fun loadClass(name: String): Class<*> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest[SimpleFunctionDescriptorImpl]

'className' @ [89:35] ==> val className: String defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields[LocalVariableDescriptor]

'generateSequence' @ [90:26] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: Class<out (Any..Any?)>?, nextFunction: (Class<out (Any..Any?)>) -> Class<out (Any..Any?)>?): Sequence<Class<out (Any..Any?)>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Class<out (kotlin.Any..kotlin.Any?)>

'klass' @ [90:43] ==> val klass: Class<*> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields[LocalVariableDescriptor]

'it' @ [90:52] ==> value-parameter it: Class<out (Any..Any?)> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields.<anonymous>[ValueParameterDescriptorImpl]

'superclass' @ [90:55] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.superclass: (Class<in (Nothing..Nothing?)>..Class<in (Nothing..Nothing?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'flatMap' @ [91:22] ==> public fun <T, R> Sequence<Class<out (Any..Any?)>>.flatMap(transform: (Class<out (Any..Any?)>) -> Sequence<(Field..Field?)>): Sequence<(Field..Field?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out (kotlin.Any..kotlin.Any?)>
    <R> -> (java.lang.reflect.Field..java.lang.reflect.Field?)

'it' @ [91:32] ==> value-parameter it: Class<out (Any..Any?)> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields.<anonymous>[ValueParameterDescriptorImpl]

'declaredFields' @ [91:35] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.declaredFields: (Array<(Field..Field?)>..Array<out (Field..Field?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'asSequence' @ [91:50] ==> public fun <T> Array<out (Field..Field?)>.asSequence(): Sequence<(Field..Field?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Field..java.lang.reflect.Field?)

'filterNot' @ [92:22] ==> public fun <T> Sequence<(Field..Field?)>.filterNot(predicate: ((Field..Field?)) -> Boolean): Sequence<(Field..Field?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Field..java.lang.reflect.Field?)

'isStatic' @ [92:43] ==> public open fun isStatic(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'it' @ [92:52] ==> value-parameter it: (Field..Field?) defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields.<anonymous>[ValueParameterDescriptorImpl]

'modifiers' @ [92:55] ==> public final val Field.modifiers: Int[MyPropertyDescriptor]

'toList' @ [93:22] ==> public fun <T> Sequence<(Field..Field?)>.toList(): List<(Field..Field?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Field..java.lang.reflect.Field?)

'fields' @ [94:17] ==> val fields: List<(Field..Field?)> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields[LocalVariableDescriptor]

'size' @ [94:24] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'maxAllowedFields' @ [94:31] ==> val maxAllowedFields: Int defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields[LocalVariableDescriptor]

'badClasses' @ [95:17] ==> val badClasses: LinkedHashMap<Class<*>, Collection<Field>> /* = LinkedHashMap<Class<*>, Collection<Field>> */ defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields[LocalVariableDescriptor]

'klass' @ [95:28] ==> val klass: Class<*> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields[LocalVariableDescriptor]

'fields' @ [95:37] ==> val fields: List<(Field..Field?)> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields[LocalVariableDescriptor]

'badClasses' @ [99:13] ==> val badClasses: LinkedHashMap<Class<*>, Collection<Field>> /* = LinkedHashMap<Class<*>, Collection<Field>> */ defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields[LocalVariableDescriptor]

'isNotEmpty' @ [99:24] ==> @InlineOnly public inline fun <K, V> Map<out Class<*>, Collection<Field>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Class<*>
    <V> -> Collection<Field>

'fail' @ [100:13] ==> public open fun fail(p0: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'+' @ [100:18] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'badClasses' @ [101:18] ==> val badClasses: LinkedHashMap<Class<*>, Collection<Field>> /* = LinkedHashMap<Class<*>, Collection<Field>> */ defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields[LocalVariableDescriptor]

'entries' @ [101:29] ==> public open val entries: MutableSet<MutableMap.MutableEntry<Class<*>, Collection<Field>>> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'joinToString' @ [101:37] ==> public fun <T> Iterable<MutableMap.MutableEntry<Class<*>, Collection<Field>>>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((MutableMap.MutableEntry<Class<*>, Collection<Field>>) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableEntry<Class<*>, Collection<Field>>

'component1' @ [102:27] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Class<*>, Collection<Field>>.component1(): Class<*> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Class<*>
    <V> -> Collection<Field>

'component2' @ [102:34] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Class<*>, Collection<Field>>.component2(): Collection<Field> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Class<*>
    <V> -> Collection<Field>

'entry' @ [102:44] ==> value-parameter entry: MutableMap.MutableEntry<Class<*>, Collection<Field>> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields.<anonymous>[ValueParameterDescriptorImpl]

'+' @ [103:22] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'klass' @ [103:24] ==> val klass: Class<*> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields.<anonymous>[LocalVariableDescriptor]

'fields' @ [103:36] ==> val fields: Collection<Field> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields.<anonymous>[LocalVariableDescriptor]

'size' @ [103:43] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'classesWithMaxAllowedFields' @ [103:76] ==> val classesWithMaxAllowedFields: LinkedHashMap<String, Int> /* = LinkedHashMap<String, Int> */ defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields[LocalVariableDescriptor]

'klass' @ [103:104] ==> val klass: Class<*> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields.<anonymous>[LocalVariableDescriptor]

'simpleName' @ [103:110] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'fields' @ [104:22] ==> val fields: Collection<Field> defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields.<anonymous>[LocalVariableDescriptor]

'joinToString' @ [104:29] ==> public fun <T> Iterable<Field>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Field) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Field

'it' @ [104:56] ==> value-parameter it: Field defined in org.jetbrains.kotlin.code.ReflectionCodeSanityTest.testMaxAllowedFields.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

