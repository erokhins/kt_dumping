'StubBase<T>' @ [33:121] ==> protected/*protected and package*/ constructor StubBase<T : (PsiElement..PsiElement?)>(p0: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), p1: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)) defined in com.intellij.psi.stubs.StubBase[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> T

'parent' @ [33:133] ==> value-parameter parent: StubElement<*>? defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.<init>[ValueParameterDescriptorImpl]

'elementType' @ [33:141] ==> value-parameter elementType: IStubElementType<*, *> defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [36:29] ==> <this> defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl[LazyClassReceiverParameterDescriptor]

'java' @ [36:41] ==> public val <T> KClass<out KotlinStubBaseImpl<T>>.java: Class<out KotlinStubBaseImpl<T>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinStubBaseImpl<T>

'interfaces' @ [36:46] ==> public final val <T : (Any..Any?)> Class<out KotlinStubBaseImpl<T>>.interfaces: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinStubBaseImpl<T>

'single' @ [36:57] ==> public inline fun <T> Array<out (Class<*>..Class<*>?)>.single(predicate: ((Class<*>..Class<*>?)) -> Boolean): (Class<*>..Class<*>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.Class<*>..java.lang.Class<*>?)

'it' @ [36:66] ==> value-parameter it: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.toString.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [36:69] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'contains' @ [36:74] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'renderPropertyValues' @ [37:32] ==> private final fun renderPropertyValues(stubInterface: Class<out Any?>): List<String> defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl[SimpleFunctionDescriptorImpl]

'stubInterface' @ [37:53] ==> val stubInterface: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.toString[LocalVariableDescriptor]

'propertiesValues' @ [38:13] ==> val propertiesValues: List<String> defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.toString[LocalVariableDescriptor]

'isEmpty' @ [38:30] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'STUB_TO_STRING_PREFIX' @ [39:22] ==> public val STUB_TO_STRING_PREFIX: String defined in org.jetbrains.kotlin.psi.stubs.impl in file KotlinStubBaseImpl.kt[PropertyDescriptorImpl]

'stubType' @ [39:44] ==> public final val <T : KtElementImplStub<*>> KotlinStubBaseImpl<T>.stubType: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)[MyPropertyDescriptor]
Inferred types:
    <T : KtElementImplStub<*>> -> T

'propertiesValues' @ [41:26] ==> val propertiesValues: List<String> defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.toString[LocalVariableDescriptor]

'joinToString' @ [41:43] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'STUB_TO_STRING_PREFIX' @ [42:18] ==> public val STUB_TO_STRING_PREFIX: String defined in org.jetbrains.kotlin.psi.stubs.impl in file KotlinStubBaseImpl.kt[PropertyDescriptorImpl]

'stubType' @ [42:40] ==> public final val <T : KtElementImplStub<*>> KotlinStubBaseImpl<T>.stubType: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)[MyPropertyDescriptor]
Inferred types:
    <T : KtElementImplStub<*>> -> T

'properties' @ [42:49] ==> val properties: String defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.toString[LocalVariableDescriptor]

'collectProperties' @ [46:16] ==> private final fun collectProperties(stubInterface: Class<*>): Collection<Method> defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl[SimpleFunctionDescriptorImpl]

'stubInterface' @ [46:34] ==> value-parameter stubInterface: Class<out Any?> defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.renderPropertyValues[ValueParameterDescriptorImpl]

'mapNotNull' @ [46:49] ==> public inline fun <T, R : Any> Iterable<Method>.mapNotNull(transform: (Method) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Method
    <R : Any> -> String

'renderProperty' @ [46:74] ==> private final fun renderProperty(property: Method): String? defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl[SimpleFunctionDescriptorImpl]

'property' @ [46:89] ==> value-parameter property: Method defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.renderPropertyValues.<anonymous>[ValueParameterDescriptorImpl]

'sorted' @ [46:101] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'ArrayList' @ [50:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Method

'result' @ [51:9] ==> val result: ArrayList<Method> defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.collectProperties[LocalVariableDescriptor]

'addAll' @ [51:16] ==> public open fun addAll(elements: Collection<Method>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'stubInterface' @ [51:23] ==> value-parameter stubInterface: Class<*> defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.collectProperties[ValueParameterDescriptorImpl]

'declaredMethods' @ [51:37] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.declaredMethods: (Array<(Method..Method?)>..Array<out (Method..Method?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'filter' @ [51:53] ==> public inline fun <T> Array<out (Method..Method?)>.filter(predicate: ((Method..Method?)) -> Boolean): List<(Method..Method?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Method..java.lang.reflect.Method?)

'it' @ [51:62] ==> value-parameter it: (Method..Method?) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.collectProperties.<anonymous>[ValueParameterDescriptorImpl]

'parameterTypes' @ [51:65] ==> public final val Method.parameterTypes: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>?)[MyPropertyDescriptor]

'isEmpty' @ [51:82] ==> @InlineOnly public inline fun <T> Array<out (Class<*>..Class<*>?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.Class<*>..java.lang.Class<*>?)

'stubInterface' @ [52:31] ==> value-parameter stubInterface: Class<*> defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.collectProperties[ValueParameterDescriptorImpl]

'interfaces' @ [52:45] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.interfaces: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'baseInterface' @ [53:17] ==> val baseInterface: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.collectProperties[LocalVariableDescriptor]

'BASE_STUB_INTERFACES' @ [53:34] ==> private final val BASE_STUB_INTERFACES: List<Class<out NamedStub<*>>> defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.Companion[PropertyDescriptorImpl]

'result' @ [54:17] ==> val result: ArrayList<Method> defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.collectProperties[LocalVariableDescriptor]

'addAll' @ [54:24] ==> public open fun addAll(elements: Collection<Method>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'collectProperties' @ [54:31] ==> private final fun collectProperties(stubInterface: Class<*>): Collection<Method> defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl[SimpleFunctionDescriptorImpl]

'baseInterface' @ [54:49] ==> val baseInterface: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.collectProperties[LocalVariableDescriptor]

'result' @ [57:16] ==> val result: ArrayList<Method> defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.collectProperties[LocalVariableDescriptor]

'property' @ [62:25] ==> value-parameter property: Method defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.renderProperty[ValueParameterDescriptorImpl]

'invoke' @ [62:34] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'this' @ [62:41] ==> <this> defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl[LazyClassReceiverParameterDescriptor]

'getPropertyName' @ [63:24] ==> private final fun getPropertyName(method: Method): String defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl[SimpleFunctionDescriptorImpl]

'property' @ [63:40] ==> value-parameter property: Method defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.renderProperty[ValueParameterDescriptorImpl]

'name' @ [64:15] ==> val name: String defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.renderProperty[LocalVariableDescriptor]

'value' @ [64:21] ==> val value: (Any..Any?) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.renderProperty[LocalVariableDescriptor]

'LOGGER' @ [67:13] ==> private final val LOGGER: Logger defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.Companion[PropertyDescriptorImpl]

'error' @ [67:20] ==> public open fun error(@NotNull p0: Throwable): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'e' @ [67:26] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.renderProperty[LocalVariableDescriptor]

'method' @ [73:26] ==> value-parameter method: Method defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.getPropertyName[ValueParameterDescriptorImpl]

'name' @ [73:33] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'methodName' @ [74:13] ==> val methodName: String defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.getPropertyName[LocalVariableDescriptor]

'startsWith' @ [74:24] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'methodName' @ [75:20] ==> val methodName: String defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.getPropertyName[LocalVariableDescriptor]

'substring' @ [75:31] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'decapitalize' @ [75:44] ==> public fun String.decapitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'methodName' @ [77:16] ==> val methodName: String defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl.getPropertyName[LocalVariableDescriptor]

'getInstance' @ [81:45] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'KotlinStubBaseImpl' @ [81:57] ==> public companion object defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl[FakeCallableDescriptorForObject]

'java' @ [81:83] ==> public val <T> KClass<KotlinStubBaseImpl<*>>.java: Class<KotlinStubBaseImpl<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinStubBaseImpl<*>

'listOf' @ [83:44] ==> public fun <T> listOf(vararg elements: Class<out NamedStub<*>>): List<Class<out NamedStub<*>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out NamedStub<*>>

'java' @ [83:79] ==> public val <T> KClass<KotlinStubWithFqName<*>>.java: Class<KotlinStubWithFqName<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinStubWithFqName<*>

'java' @ [83:116] ==> public val <T> KClass<KotlinClassOrObjectStub<*>>.java: Class<KotlinClassOrObjectStub<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinClassOrObjectStub<*>

'java' @ [83:139] ==> public val <T> KClass<NamedStub<*>>.java: Class<NamedStub<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NamedStub<*>

'java' @ [83:175] ==> public val <T> KClass<KotlinCallableStubBase<*>>.java: Class<KotlinCallableStubBase<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinCallableStubBase<*>

