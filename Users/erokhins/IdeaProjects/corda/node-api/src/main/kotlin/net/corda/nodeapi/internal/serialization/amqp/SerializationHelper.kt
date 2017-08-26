'Target' @ [20:1] ==> public constructor Target(vararg allowedTargets: AnnotationTarget) defined in kotlin.annotation.Target[DeserializedClassConstructorDescriptor]

'CONSTRUCTOR' @ [20:26] ==> enum entry CONSTRUCTOR defined in kotlin.annotation.AnnotationTarget[FakeCallableDescriptorForObject]

'Retention' @ [21:1] ==> public constructor Retention(value: AnnotationRetention = ...) defined in kotlin.annotation.Retention[DeserializedClassConstructorDescriptor]

'RUNTIME' @ [21:32] ==> enum entry RUNTIME defined in kotlin.annotation.AnnotationRetention[FakeCallableDescriptorForObject]

'type' @ [32:27] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[ValueParameterDescriptorImpl]

'asClass' @ [32:32] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'if (isConcrete(clazz)) {
        var preferredCandidate: KFunction<Any>? = clazz.kotlin.primaryConstructor
        var annotatedCount = 0
        val kotlinConstructors = clazz.kotlin.constructors
        val hasDefault = kotlinConstructors.any { it.parameters.isEmpty() }
        for (kotlinConstructor in kotlinConstructors) {
            if (preferredCandidate == null && kotlinConstructors.size == 1 && !hasDefault) {
                preferredCandidate = kotlinConstructor
            } else if (preferredCandidate == null && kotlinConstructors.size == 2 && hasDefault && kotlinConstructor.parameters.isNotEmpty()) {
                preferredCandidate = kotlinConstructor
            } else if (kotlinConstructor.findAnnotation<ConstructorForDeserialization>() != null) {
                if (annotatedCount++ > 0) {
                    throw NotSerializableException("More than one constructor for $clazz is annotated with @CordaConstructor.")
                }
                preferredCandidate = kotlinConstructor
            }
        }
        return preferredCandidate ?: throw NotSerializableException("No constructor for deserialization found for $clazz.")
    } else {
        return null
    }' @ [33:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'isConcrete' @ [33:9] ==> public fun isConcrete(clazz: Class<*>): Boolean defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'clazz' @ [33:20] ==> val clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'clazz' @ [34:51] ==> val clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'kotlin' @ [34:57] ==> public val <T : Any> Class<out (Any..Any?)>.kotlin: KClass<out (Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> (kotlin.Any..kotlin.Any?)

'primaryConstructor' @ [34:64] ==> @SinceKotlin public val <T : Any> KClass<out Any>.primaryConstructor: KFunction<Any>? defined in kotlin.reflect.full[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'clazz' @ [36:34] ==> val clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'kotlin' @ [36:40] ==> public val <T : Any> Class<out (Any..Any?)>.kotlin: KClass<out (Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> (kotlin.Any..kotlin.Any?)

'constructors' @ [36:47] ==> public abstract val constructors: Collection<KFunction<Any>> defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'kotlinConstructors' @ [37:26] ==> val kotlinConstructors: Collection<KFunction<Any>> defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'any' @ [37:45] ==> public inline fun <T> Iterable<KFunction<Any>>.any(predicate: (KFunction<Any>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction<Any>

'it' @ [37:51] ==> value-parameter it: KFunction<Any> defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization.<anonymous>[ValueParameterDescriptorImpl]

'parameters' @ [37:54] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'isEmpty' @ [37:65] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'kotlinConstructors' @ [38:35] ==> val kotlinConstructors: Collection<KFunction<Any>> defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'if (preferredCandidate == null && kotlinConstructors.size == 1 && !hasDefault) {
                preferredCandidate = kotlinConstructor
            } else if (preferredCandidate == null && kotlinConstructors.size == 2 && hasDefault && kotlinConstructor.parameters.isNotEmpty()) {
                preferredCandidate = kotlinConstructor
            } else if (kotlinConstructor.findAnnotation<ConstructorForDeserialization>() != null) {
                if (annotatedCount++ > 0) {
                    throw NotSerializableException("More than one constructor for $clazz is annotated with @CordaConstructor.")
                }
                preferredCandidate = kotlinConstructor
            }' @ [39:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'preferredCandidate' @ [39:17] ==> var preferredCandidate: KFunction<Any>? defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'kotlinConstructors' @ [39:47] ==> val kotlinConstructors: Collection<KFunction<Any>> defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'size' @ [39:66] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'!' @ [39:79] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasDefault' @ [39:80] ==> val hasDefault: Boolean defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'preferredCandidate' @ [40:17] ==> var preferredCandidate: KFunction<Any>? defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'kotlinConstructor' @ [40:38] ==> val kotlinConstructor: KFunction<Any> defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'if (preferredCandidate == null && kotlinConstructors.size == 2 && hasDefault && kotlinConstructor.parameters.isNotEmpty()) {
                preferredCandidate = kotlinConstructor
            } else if (kotlinConstructor.findAnnotation<ConstructorForDeserialization>() != null) {
                if (annotatedCount++ > 0) {
                    throw NotSerializableException("More than one constructor for $clazz is annotated with @CordaConstructor.")
                }
                preferredCandidate = kotlinConstructor
            }' @ [41:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'preferredCandidate' @ [41:24] ==> var preferredCandidate: KFunction<Any>? defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'kotlinConstructors' @ [41:54] ==> val kotlinConstructors: Collection<KFunction<Any>> defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'size' @ [41:73] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'hasDefault' @ [41:86] ==> val hasDefault: Boolean defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'kotlinConstructor' @ [41:100] ==> val kotlinConstructor: KFunction<Any> defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'parameters' @ [41:118] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'isNotEmpty' @ [41:129] ==> @InlineOnly public inline fun <T> Collection<KParameter>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KParameter

'preferredCandidate' @ [42:17] ==> var preferredCandidate: KFunction<Any>? defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'kotlinConstructor' @ [42:38] ==> val kotlinConstructor: KFunction<Any> defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'kotlinConstructor' @ [43:24] ==> val kotlinConstructor: KFunction<Any> defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'findAnnotation' @ [43:42] ==> @SinceKotlin public inline fun <reified T : Annotation> KAnnotatedElement.findAnnotation(): ConstructorForDeserialization? defined in kotlin.reflect.full[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Annotation> -> ConstructorForDeserialization

'annotatedCount' @ [44:21] ==> var annotatedCount: Int defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'NotSerializableException' @ [45:27] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'clazz' @ [45:84] ==> val clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'preferredCandidate' @ [47:17] ==> var preferredCandidate: KFunction<Any>? defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'kotlinConstructor' @ [47:38] ==> val kotlinConstructor: KFunction<Any> defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'preferredCandidate' @ [50:16] ==> var preferredCandidate: KFunction<Any>? defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'NotSerializableException' @ [50:44] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'clazz' @ [50:116] ==> val clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.constructorForDeserialization[LocalVariableDescriptor]

'type' @ [64:17] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerialization[ValueParameterDescriptorImpl]

'asClass' @ [64:22] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'if (kotlinConstructor != null) propertiesForSerializationFromConstructor(kotlinConstructor, type, factory) else propertiesForSerializationFromAbstract(clazz, type, factory)' @ [65:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<PropertySerializer>, elseBranch: Collection<PropertySerializer>): Collection<PropertySerializer>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<PropertySerializer>

'kotlinConstructor' @ [65:16] ==> value-parameter kotlinConstructor: KFunction<T>? defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerialization[ValueParameterDescriptorImpl]

'propertiesForSerializationFromConstructor' @ [65:43] ==> private fun <T : Any> propertiesForSerializationFromConstructor(kotlinConstructor: KFunction<T>, type: Type, factory: SerializerFactory): Collection<PropertySerializer> defined in net.corda.nodeapi.internal.serialization.amqp[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'kotlinConstructor' @ [65:85] ==> value-parameter kotlinConstructor: KFunction<T>? defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerialization[ValueParameterDescriptorImpl]

'type' @ [65:104] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerialization[ValueParameterDescriptorImpl]

'factory' @ [65:110] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerialization[ValueParameterDescriptorImpl]

'propertiesForSerializationFromAbstract' @ [65:124] ==> private fun propertiesForSerializationFromAbstract(clazz: Class<*>, type: Type, factory: SerializerFactory): Collection<PropertySerializer> defined in net.corda.nodeapi.internal.serialization.amqp[SimpleFunctionDescriptorImpl]

'clazz' @ [65:163] ==> val clazz: Class<out (Any..Any?)> defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerialization[LocalVariableDescriptor]

'type' @ [65:170] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerialization[ValueParameterDescriptorImpl]

'factory' @ [65:176] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerialization[ValueParameterDescriptorImpl]

'!' @ [68:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'clazz' @ [68:46] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.isConcrete[ValueParameterDescriptorImpl]

'isInterface' @ [68:52] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isInterface: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'isAbstract' @ [68:76] ==> public open fun isAbstract(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'clazz' @ [68:87] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.isConcrete[ValueParameterDescriptorImpl]

'modifiers' @ [68:93] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.modifiers: Int[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'kotlinConstructor' @ [71:18] ==> value-parameter kotlinConstructor: KFunction<T> defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[ValueParameterDescriptorImpl]

'returnType' @ [71:36] ==> public abstract val returnType: KType defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'classifier' @ [71:47] ==> @SinceKotlin public abstract val classifier: KClassifier? defined in kotlin.reflect.KType[DeserializedPropertyDescriptor]

'javaObjectType' @ [71:72] ==> public val <T : Any> KClass<out Any>.javaObjectType: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'getBeanInfo' @ [73:35] ==> public open fun getBeanInfo(p0: (Class<*>..Class<*>?)): (BeanInfo..BeanInfo?) defined in java.beans.Introspector[JavaMethodDescriptor]

'clazz' @ [73:47] ==> val clazz: Class<out Any> defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'propertyDescriptors' @ [73:54] ==> public final val BeanInfo.propertyDescriptors: (Array<(PropertyDescriptor..PropertyDescriptor?)>..Array<out (PropertyDescriptor..PropertyDescriptor?)>?)[MyPropertyDescriptor]

'filter' @ [73:74] ==> public inline fun <T> Array<out (PropertyDescriptor..PropertyDescriptor?)>.filter(predicate: ((PropertyDescriptor..PropertyDescriptor?)) -> Boolean): List<(PropertyDescriptor..PropertyDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.beans.PropertyDescriptor..java.beans.PropertyDescriptor?)

'it' @ [73:83] ==> value-parameter it: (PropertyDescriptor..PropertyDescriptor?) defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [73:86] ==> public final var PropertyDescriptor.name: (String..String?)[MyPropertyDescriptor]

'groupBy' @ [73:104] ==> public inline fun <T, K> Iterable<(PropertyDescriptor..PropertyDescriptor?)>.groupBy(keySelector: ((PropertyDescriptor..PropertyDescriptor?)) -> (String..String?)): Map<(String..String?), List<(PropertyDescriptor..PropertyDescriptor?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.beans.PropertyDescriptor..java.beans.PropertyDescriptor?)
    <K> -> (kotlin.String..kotlin.String?)

'it' @ [73:114] ==> value-parameter it: (PropertyDescriptor..PropertyDescriptor?) defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [73:117] ==> public final var PropertyDescriptor.name: (String..String?)[MyPropertyDescriptor]

'mapValues' @ [73:124] ==> public inline fun <K, V, R> Map<out (String..String?), List<(PropertyDescriptor..PropertyDescriptor?)>>.mapValues(transform: (Map.Entry<(String..String?), List<(PropertyDescriptor..PropertyDescriptor?)>>) -> (PropertyDescriptor..PropertyDescriptor?)): Map<(String..String?), (PropertyDescriptor..PropertyDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> List<(java.beans.PropertyDescriptor..java.beans.PropertyDescriptor?)>
    <R> -> (java.beans.PropertyDescriptor..java.beans.PropertyDescriptor?)

'it' @ [73:136] ==> value-parameter it: Map.Entry<(String..String?), List<(PropertyDescriptor..PropertyDescriptor?)>> defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [73:139] ==> public abstract val value: List<(PropertyDescriptor..PropertyDescriptor?)> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'ArrayList' @ [74:47] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PropertySerializer

'kotlinConstructor' @ [74:57] ==> value-parameter kotlinConstructor: KFunction<T> defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[ValueParameterDescriptorImpl]

'parameters' @ [74:75] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'size' @ [74:86] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'kotlinConstructor' @ [75:19] ==> value-parameter kotlinConstructor: KFunction<T> defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[ValueParameterDescriptorImpl]

'parameters' @ [75:37] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'param' @ [76:20] ==> val param: KParameter defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'name' @ [76:26] ==> public abstract val name: String? defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'NotSerializableException' @ [76:40] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'clazz' @ [76:92] ==> val clazz: Class<out Any> defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'properties' @ [77:32] ==> val properties: Map<(String..String?), (PropertyDescriptor..PropertyDescriptor?)> defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'name' @ [77:43] ==> val name: String defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'NotSerializableException' @ [78:23] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'+' @ [78:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'name' @ [78:99] ==> val name: String defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'clazz' @ [78:108] ==> val clazz: Class<out Any> defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'matchingProperty' @ [81:22] ==> val matchingProperty: PropertyDescriptor defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'readMethod' @ [81:39] ==> public final var PropertyDescriptor.readMethod: (Method..Method?)[MyPropertyDescriptor]

'NotSerializableException' @ [81:59] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'+' @ [81:84] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'name' @ [81:120] ==> val name: String defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'clazz' @ [81:129] ==> val clazz: Class<out Any> defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'resolveTypeVariables' @ [83:26] ==> private fun resolveTypeVariables(actualType: Type, contextType: Type?): Type defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'getter' @ [83:47] ==> val getter: Method defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'genericReturnType' @ [83:54] ==> public final val Method.genericReturnType: (Type..Type?)[MyPropertyDescriptor]

'type' @ [83:73] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[ValueParameterDescriptorImpl]

'if (constructorParamTakesReturnTypeOfGetter(returnType, getter.genericReturnType, param)) {
            rc += PropertySerializer.make(name, getter, returnType, factory)
        } else {
            throw NotSerializableException("Property type $returnType for $name of $clazz differs from constructor parameter type ${param.type.javaType}")
        }' @ [84:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'constructorParamTakesReturnTypeOfGetter' @ [84:13] ==> private fun constructorParamTakesReturnTypeOfGetter(getterReturnType: Type, rawGetterReturnType: Type, param: KParameter): Boolean defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'returnType' @ [84:53] ==> val returnType: Type defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'getter' @ [84:65] ==> val getter: Method defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'genericReturnType' @ [84:72] ==> public final val Method.genericReturnType: (Type..Type?)[MyPropertyDescriptor]

'param' @ [84:91] ==> val param: KParameter defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'rc' @ [85:13] ==> val rc: MutableList<PropertySerializer> defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'PropertySerializer' @ [85:19] ==> public companion object defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[FakeCallableDescriptorForObject]

'make' @ [85:38] ==> public final fun make(name: String, readMethod: Method?, resolvedType: Type, factory: SerializerFactory): PropertySerializer defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.Companion[SimpleFunctionDescriptorImpl]

'name' @ [85:43] ==> val name: String defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'getter' @ [85:49] ==> val getter: Method defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'returnType' @ [85:57] ==> val returnType: Type defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'factory' @ [85:69] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[ValueParameterDescriptorImpl]

'NotSerializableException' @ [87:19] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'returnType' @ [87:60] ==> val returnType: Type defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'name' @ [87:76] ==> val name: String defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'clazz' @ [87:85] ==> val clazz: Class<out Any> defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'param' @ [87:133] ==> val param: KParameter defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'type' @ [87:139] ==> public abstract val type: KType defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'javaType' @ [87:144] ==> public val KType.javaType: Type defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]

'rc' @ [90:12] ==> val rc: MutableList<PropertySerializer> defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromConstructor[LocalVariableDescriptor]

'of' @ [94:31] ==> public open fun of(p0: (Type..Type?)): (TypeToken<*>..TypeToken<*>?) defined in com.google.common.reflect.TypeToken[JavaMethodDescriptor]

'param' @ [94:34] ==> value-parameter param: KParameter defined in net.corda.nodeapi.internal.serialization.amqp.constructorParamTakesReturnTypeOfGetter[ValueParameterDescriptorImpl]

'type' @ [94:40] ==> public abstract val type: KType defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'javaType' @ [94:45] ==> public val KType.javaType: Type defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]

'typeToken' @ [95:12] ==> val typeToken: (TypeToken<*>..TypeToken<*>?) defined in net.corda.nodeapi.internal.serialization.amqp.constructorParamTakesReturnTypeOfGetter[LocalVariableDescriptor]

'isSupertypeOf' @ [95:22] ==> public final fun isSupertypeOf(p0: (Type..Type?)): Boolean defined in com.google.common.reflect.TypeToken[JavaMethodDescriptor]

'getterReturnType' @ [95:36] ==> value-parameter getterReturnType: Type defined in net.corda.nodeapi.internal.serialization.amqp.constructorParamTakesReturnTypeOfGetter[ValueParameterDescriptorImpl]

'typeToken' @ [95:57] ==> val typeToken: (TypeToken<*>..TypeToken<*>?) defined in net.corda.nodeapi.internal.serialization.amqp.constructorParamTakesReturnTypeOfGetter[LocalVariableDescriptor]

'isSupertypeOf' @ [95:67] ==> public final fun isSupertypeOf(p0: (Type..Type?)): Boolean defined in com.google.common.reflect.TypeToken[JavaMethodDescriptor]

'rawGetterReturnType' @ [95:81] ==> value-parameter rawGetterReturnType: Type defined in net.corda.nodeapi.internal.serialization.amqp.constructorParamTakesReturnTypeOfGetter[ValueParameterDescriptorImpl]

'getBeanInfo' @ [100:35] ==> public open fun getBeanInfo(p0: (Class<*>..Class<*>?)): (BeanInfo..BeanInfo?) defined in java.beans.Introspector[JavaMethodDescriptor]

'clazz' @ [100:47] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromAbstract[ValueParameterDescriptorImpl]

'propertyDescriptors' @ [100:54] ==> public final val BeanInfo.propertyDescriptors: (Array<(PropertyDescriptor..PropertyDescriptor?)>..Array<out (PropertyDescriptor..PropertyDescriptor?)>?)[MyPropertyDescriptor]

'filter' @ [100:74] ==> public inline fun <T> Array<out (PropertyDescriptor..PropertyDescriptor?)>.filter(predicate: ((PropertyDescriptor..PropertyDescriptor?)) -> Boolean): List<(PropertyDescriptor..PropertyDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.beans.PropertyDescriptor..java.beans.PropertyDescriptor?)

'it' @ [100:83] ==> value-parameter it: (PropertyDescriptor..PropertyDescriptor?) defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromAbstract.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [100:86] ==> public final var PropertyDescriptor.name: (String..String?)[MyPropertyDescriptor]

'sortedBy' @ [100:104] ==> public inline fun <T, R : Comparable<String>> Iterable<(PropertyDescriptor..PropertyDescriptor?)>.sortedBy(crossinline selector: ((PropertyDescriptor..PropertyDescriptor?)) -> String?): List<(PropertyDescriptor..PropertyDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.beans.PropertyDescriptor..java.beans.PropertyDescriptor?)
    <R : Comparable<R>> -> String

'it' @ [100:115] ==> value-parameter it: (PropertyDescriptor..PropertyDescriptor?) defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromAbstract.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [100:118] ==> public final var PropertyDescriptor.name: (String..String?)[MyPropertyDescriptor]

'filterNot' @ [100:125] ==> public inline fun <T> Iterable<(PropertyDescriptor..PropertyDescriptor?)>.filterNot(predicate: ((PropertyDescriptor..PropertyDescriptor?)) -> Boolean): List<(PropertyDescriptor..PropertyDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.beans.PropertyDescriptor..java.beans.PropertyDescriptor?)

'it' @ [100:137] ==> value-parameter it: (PropertyDescriptor..PropertyDescriptor?) defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromAbstract.<anonymous>[ValueParameterDescriptorImpl]

'ArrayList' @ [101:47] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PropertySerializer

'properties' @ [101:57] ==> val properties: List<(PropertyDescriptor..PropertyDescriptor?)> defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromAbstract[LocalVariableDescriptor]

'size' @ [101:68] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'properties' @ [102:22] ==> val properties: List<(PropertyDescriptor..PropertyDescriptor?)> defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromAbstract[LocalVariableDescriptor]

'property' @ [104:22] ==> val property: (PropertyDescriptor..PropertyDescriptor?) defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromAbstract[LocalVariableDescriptor]

'readMethod' @ [104:31] ==> public final var PropertyDescriptor.readMethod: (Method..Method?)[MyPropertyDescriptor]

'NotSerializableException' @ [104:51] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'property' @ [104:113] ==> val property: (PropertyDescriptor..PropertyDescriptor?) defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromAbstract[LocalVariableDescriptor]

'name' @ [104:122] ==> public final var PropertyDescriptor.name: (String..String?)[MyPropertyDescriptor]

'clazz' @ [104:132] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromAbstract[ValueParameterDescriptorImpl]

'resolveTypeVariables' @ [105:26] ==> private fun resolveTypeVariables(actualType: Type, contextType: Type?): Type defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'getter' @ [105:47] ==> val getter: Method defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromAbstract[LocalVariableDescriptor]

'genericReturnType' @ [105:54] ==> public final val Method.genericReturnType: (Type..Type?)[MyPropertyDescriptor]

'type' @ [105:73] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromAbstract[ValueParameterDescriptorImpl]

'rc' @ [106:9] ==> val rc: MutableList<PropertySerializer> defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromAbstract[LocalVariableDescriptor]

'PropertySerializer' @ [106:15] ==> public companion object defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[FakeCallableDescriptorForObject]

'make' @ [106:34] ==> public final fun make(name: String, readMethod: Method?, resolvedType: Type, factory: SerializerFactory): PropertySerializer defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.Companion[SimpleFunctionDescriptorImpl]

'property' @ [106:39] ==> val property: (PropertyDescriptor..PropertyDescriptor?) defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromAbstract[LocalVariableDescriptor]

'name' @ [106:48] ==> public final var PropertyDescriptor.name: (String..String?)[MyPropertyDescriptor]

'getter' @ [106:54] ==> val getter: Method defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromAbstract[LocalVariableDescriptor]

'returnType' @ [106:62] ==> val returnType: Type defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromAbstract[LocalVariableDescriptor]

'factory' @ [106:74] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromAbstract[ValueParameterDescriptorImpl]

'rc' @ [108:12] ==> val rc: MutableList<PropertySerializer> defined in net.corda.nodeapi.internal.serialization.amqp.propertiesForSerializationFromAbstract[LocalVariableDescriptor]

'LinkedHashSet' @ [112:22] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Type

'exploreType' @ [113:5] ==> private fun exploreType(type: Type?, interfaces: MutableSet<Type>, serializerFactory: SerializerFactory): Unit defined in net.corda.nodeapi.internal.serialization.amqp[SimpleFunctionDescriptorImpl]

'type' @ [113:17] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.interfacesForSerialization[ValueParameterDescriptorImpl]

'interfaces' @ [113:23] ==> val interfaces: LinkedHashSet<Type> defined in net.corda.nodeapi.internal.serialization.amqp.interfacesForSerialization[LocalVariableDescriptor]

'serializerFactory' @ [113:35] ==> value-parameter serializerFactory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.interfacesForSerialization[ValueParameterDescriptorImpl]

'interfaces' @ [114:12] ==> val interfaces: LinkedHashSet<Type> defined in net.corda.nodeapi.internal.serialization.amqp.interfacesForSerialization[LocalVariableDescriptor]

'toList' @ [114:23] ==> public fun <T> Iterable<Type>.toList(): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'type' @ [118:17] ==> value-parameter type: Type? defined in net.corda.nodeapi.internal.serialization.amqp.exploreType[ValueParameterDescriptorImpl]

'asClass' @ [118:23] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'clazz' @ [119:9] ==> val clazz: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.exploreType[LocalVariableDescriptor]

'clazz' @ [120:13] ==> val clazz: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.exploreType[LocalVariableDescriptor]

'isInterface' @ [120:19] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isInterface: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'if(serializerFactory.isNotWhitelisted(clazz)) return // We stop exploring once we reach a branch that has no `CordaSerializable` annotation or whitelisting.
            else interfaces += type' @ [121:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'serializerFactory' @ [121:16] ==> value-parameter serializerFactory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.exploreType[ValueParameterDescriptorImpl]

'isNotWhitelisted' @ [121:34] ==> internal final fun isNotWhitelisted(clazz: Class<*>): Boolean defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'clazz' @ [121:51] ==> val clazz: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.exploreType[LocalVariableDescriptor]

'interfaces' @ [122:18] ==> value-parameter interfaces: MutableSet<Type> defined in net.corda.nodeapi.internal.serialization.amqp.exploreType[ValueParameterDescriptorImpl]

'type' @ [122:32] ==> value-parameter type: Type? defined in net.corda.nodeapi.internal.serialization.amqp.exploreType[ValueParameterDescriptorImpl]

'clazz' @ [124:30] ==> val clazz: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.exploreType[LocalVariableDescriptor]

'genericInterfaces' @ [124:36] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.genericInterfaces: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'newInterface' @ [125:17] ==> val newInterface: (Type..Type?) defined in net.corda.nodeapi.internal.serialization.amqp.exploreType[LocalVariableDescriptor]

'interfaces' @ [125:34] ==> value-parameter interfaces: MutableSet<Type> defined in net.corda.nodeapi.internal.serialization.amqp.exploreType[ValueParameterDescriptorImpl]

'exploreType' @ [126:17] ==> private fun exploreType(type: Type?, interfaces: MutableSet<Type>, serializerFactory: SerializerFactory): Unit defined in net.corda.nodeapi.internal.serialization.amqp[SimpleFunctionDescriptorImpl]

'resolveTypeVariables' @ [126:29] ==> private fun resolveTypeVariables(actualType: Type, contextType: Type?): Type defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'newInterface' @ [126:50] ==> val newInterface: (Type..Type?) defined in net.corda.nodeapi.internal.serialization.amqp.exploreType[LocalVariableDescriptor]

'type' @ [126:64] ==> value-parameter type: Type? defined in net.corda.nodeapi.internal.serialization.amqp.exploreType[ValueParameterDescriptorImpl]

'interfaces' @ [126:71] ==> value-parameter interfaces: MutableSet<Type> defined in net.corda.nodeapi.internal.serialization.amqp.exploreType[ValueParameterDescriptorImpl]

'serializerFactory' @ [126:83] ==> value-parameter serializerFactory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.exploreType[ValueParameterDescriptorImpl]

'clazz' @ [129:26] ==> val clazz: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.exploreType[LocalVariableDescriptor]

'genericSuperclass' @ [129:32] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.genericSuperclass: (Type..Type?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'exploreType' @ [130:9] ==> private fun exploreType(type: Type?, interfaces: MutableSet<Type>, serializerFactory: SerializerFactory): Unit defined in net.corda.nodeapi.internal.serialization.amqp[SimpleFunctionDescriptorImpl]

'resolveTypeVariables' @ [130:21] ==> private fun resolveTypeVariables(actualType: Type, contextType: Type?): Type defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'superClass' @ [130:42] ==> val superClass: Type defined in net.corda.nodeapi.internal.serialization.amqp.exploreType[LocalVariableDescriptor]

'type' @ [130:54] ==> value-parameter type: Type? defined in net.corda.nodeapi.internal.serialization.amqp.exploreType[ValueParameterDescriptorImpl]

'interfaces' @ [130:61] ==> value-parameter interfaces: MutableSet<Type> defined in net.corda.nodeapi.internal.serialization.amqp.exploreType[ValueParameterDescriptorImpl]

'serializerFactory' @ [130:73] ==> value-parameter serializerFactory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.exploreType[ValueParameterDescriptorImpl]

'putDescribed' @ [139:5] ==> public abstract fun putDescribed(): Unit defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'enter' @ [140:5] ==> public abstract fun enter(): Boolean defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'putObject' @ [142:5] ==> public abstract fun putObject(p0: (Any..Any?)): Unit defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'descriptor' @ [142:15] ==> value-parameter descriptor: Descriptor defined in net.corda.nodeapi.internal.serialization.amqp.withDescribed[ValueParameterDescriptorImpl]

'code' @ [142:26] ==> public final val code: UnsignedLong? defined in net.corda.nodeapi.internal.serialization.amqp.Descriptor[PropertyDescriptorImpl]

'descriptor' @ [142:34] ==> value-parameter descriptor: Descriptor defined in net.corda.nodeapi.internal.serialization.amqp.withDescribed[ValueParameterDescriptorImpl]

'name' @ [142:45] ==> public final val name: String? defined in net.corda.nodeapi.internal.serialization.amqp.Descriptor[PropertyDescriptorImpl]

'invoke' @ [143:5] ==> public abstract operator fun Data.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'exit' @ [144:5] ==> public abstract fun exit(): Boolean defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'putList' @ [152:5] ==> public abstract fun putList(): Unit defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'enter' @ [153:5] ==> public abstract fun enter(): Boolean defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'invoke' @ [154:5] ==> public abstract operator fun Data.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'exit' @ [155:5] ==> public abstract fun exit(): Boolean defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'if (contextType != null) TypeToken.of(contextType).resolveType(actualType).type else actualType' @ [159:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Type..Type?), elseBranch: (Type..Type?)): (Type..Type?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'contextType' @ [159:28] ==> value-parameter contextType: Type? defined in net.corda.nodeapi.internal.serialization.amqp.resolveTypeVariables[ValueParameterDescriptorImpl]

'of' @ [159:59] ==> public open fun of(p0: (Type..Type?)): (TypeToken<*>..TypeToken<*>?) defined in com.google.common.reflect.TypeToken[JavaMethodDescriptor]

'contextType' @ [159:62] ==> value-parameter contextType: Type? defined in net.corda.nodeapi.internal.serialization.amqp.resolveTypeVariables[ValueParameterDescriptorImpl]

'resolveType' @ [159:75] ==> public final fun resolveType(p0: (Type..Type?)): (TypeToken<*>..TypeToken<*>?) defined in com.google.common.reflect.TypeToken[JavaMethodDescriptor]

'actualType' @ [159:87] ==> value-parameter actualType: Type defined in net.corda.nodeapi.internal.serialization.amqp.resolveTypeVariables[ValueParameterDescriptorImpl]

'type' @ [159:99] ==> public final val <T : (Any..Any?)> TypeToken<out (Any..Any?)>.type: (Type..Type?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'actualType' @ [159:109] ==> value-parameter actualType: Type defined in net.corda.nodeapi.internal.serialization.amqp.resolveTypeVariables[ValueParameterDescriptorImpl]

'if (resolvedType is TypeVariable<*>) {
        val bounds = resolvedType.bounds
        return if (bounds.isEmpty()) SerializerFactory.AnyType else if (bounds.size == 1) resolveTypeVariables(bounds[0], contextType) else throw NotSerializableException("Got bounded type $actualType but only support single bound.")
    } else {
        resolvedType
    }' @ [161:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'resolvedType' @ [161:16] ==> val resolvedType: (Type..Type?) defined in net.corda.nodeapi.internal.serialization.amqp.resolveTypeVariables[LocalVariableDescriptor]

'resolvedType' @ [162:22] ==> val resolvedType: (Type..Type?) defined in net.corda.nodeapi.internal.serialization.amqp.resolveTypeVariables[LocalVariableDescriptor]

'bounds' @ [162:35] ==> public final val <D : (GenericDeclaration..GenericDeclaration?)> TypeVariable<out (GenericDeclaration..GenericDeclaration?)>.bounds: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]
Inferred types:
    <D : (GenericDeclaration..GenericDeclaration?)> -> (java.lang.reflect.GenericDeclaration..java.lang.reflect.GenericDeclaration?)

'if (bounds.isEmpty()) SerializerFactory.AnyType else if (bounds.size == 1) resolveTypeVariables(bounds[0], contextType) else throw NotSerializableException("Got bounded type $actualType but only support single bound.")' @ [163:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'bounds' @ [163:20] ==> val bounds: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in net.corda.nodeapi.internal.serialization.amqp.resolveTypeVariables[LocalVariableDescriptor]

'isEmpty' @ [163:27] ==> @InlineOnly public inline fun <T> Array<out (Type..Type?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'SerializerFactory' @ [163:38] ==> public companion object defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[FakeCallableDescriptorForObject]

'AnyType' @ [163:56] ==> public object AnyType : WildcardType defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[FakeCallableDescriptorForObject]

'if (bounds.size == 1) resolveTypeVariables(bounds[0], contextType) else throw NotSerializableException("Got bounded type $actualType but only support single bound.")' @ [163:69] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'bounds' @ [163:73] ==> val bounds: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in net.corda.nodeapi.internal.serialization.amqp.resolveTypeVariables[LocalVariableDescriptor]

'size' @ [163:80] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'resolveTypeVariables' @ [163:91] ==> private fun resolveTypeVariables(actualType: Type, contextType: Type?): Type defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'bounds' @ [163:112] ==> val bounds: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in net.corda.nodeapi.internal.serialization.amqp.resolveTypeVariables[LocalVariableDescriptor]

'contextType' @ [163:123] ==> value-parameter contextType: Type? defined in net.corda.nodeapi.internal.serialization.amqp.resolveTypeVariables[ValueParameterDescriptorImpl]

'NotSerializableException' @ [163:147] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'actualType' @ [163:191] ==> value-parameter actualType: Type defined in net.corda.nodeapi.internal.serialization.amqp.resolveTypeVariables[ValueParameterDescriptorImpl]

'resolvedType' @ [165:9] ==> val resolvedType: (Type..Type?) defined in net.corda.nodeapi.internal.serialization.amqp.resolveTypeVariables[LocalVariableDescriptor]

'when {
        this is Class<*> -> this
        this is ParameterizedType -> this.rawType.asClass()
        this is GenericArrayType -> this.genericComponentType.asClass()?.arrayClass()
        else -> null
    }' @ [170:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Class<*>?, entry1: Class<*>?, entry2: Class<*>?, entry3: Class<*>?): Class<*>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Class<*>?

'this' @ [171:9] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.asClass[ReceiverParameterDescriptorImpl]

'this' @ [171:29] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.asClass[ReceiverParameterDescriptorImpl]

'this' @ [172:9] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.asClass[ReceiverParameterDescriptorImpl]

'this' @ [172:38] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.asClass[ReceiverParameterDescriptorImpl]

'rawType' @ [172:43] ==> public final val ParameterizedType.rawType: (Type..Type?)[MyPropertyDescriptor]

'asClass' @ [172:51] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'this' @ [173:9] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.asClass[ReceiverParameterDescriptorImpl]

'this' @ [173:37] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.asClass[ReceiverParameterDescriptorImpl]

'genericComponentType' @ [173:42] ==> public final val GenericArrayType.genericComponentType: (Type..Type?)[MyPropertyDescriptor]

'asClass' @ [173:63] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'arrayClass' @ [173:74] ==> internal fun Class<*>.arrayClass(): Class<*> defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'when {
        this is Class<*> -> this.arrayClass()
        this is ParameterizedType -> DeserializedGenericArrayType(this)
        else -> null
    }' @ [179:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Type?, entry1: Type?, entry2: Type?): Type?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type?

'this' @ [180:9] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.asArray[ReceiverParameterDescriptorImpl]

'this' @ [180:29] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.asArray[ReceiverParameterDescriptorImpl]

'arrayClass' @ [180:34] ==> internal fun Class<*>.arrayClass(): Class<*> defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'this' @ [181:9] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.asArray[ReceiverParameterDescriptorImpl]

'DeserializedGenericArrayType' @ [181:38] ==> public constructor DeserializedGenericArrayType(componentType: Type) defined in net.corda.nodeapi.internal.serialization.amqp.DeserializedGenericArrayType[ClassConstructorDescriptorImpl]

'this' @ [181:67] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.asArray[ReceiverParameterDescriptorImpl]

'newInstance' @ [186:72] ==> public open fun newInstance(p0: (Class<*>..Class<*>?), p1: Int): (Any..Any?) defined in java.lang.reflect.Array[JavaMethodDescriptor]

'this' @ [186:84] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.arrayClass[ReceiverParameterDescriptorImpl]

'javaClass' @ [186:93] ==> public val <T : Any> (Any..Any?).javaClass: Class<(Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> (kotlin.Any..kotlin.Any?)

'this' @ [188:41] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.isArray[ReceiverParameterDescriptorImpl]

'this' @ [188:61] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.isArray[ReceiverParameterDescriptorImpl]

'isArray' @ [188:66] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isArray: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'this' @ [188:79] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.isArray[ReceiverParameterDescriptorImpl]

'check' @ [191:5] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'this' @ [191:11] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.componentType[ReceiverParameterDescriptorImpl]

'isArray' @ [191:16] ==> internal fun Type.isArray(): Boolean defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'this' @ [191:31] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.componentType[ReceiverParameterDescriptorImpl]

'?:' @ [192:12] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Type?, right: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Type

'this' @ [192:13] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.componentType[ReceiverParameterDescriptorImpl]

'componentType' @ [192:33] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.componentType: (Class<*>..Class<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'this' @ [192:51] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.componentType[ReceiverParameterDescriptorImpl]

'genericComponentType' @ [192:77] ==> public final val GenericArrayType.genericComponentType: (Type..Type?)[MyPropertyDescriptor]

'DeserializedParameterizedType' @ [196:12] ==> public constructor DeserializedParameterizedType(rawType: Class<*>, params: Array<out Type>, ownerType: Type? = ...) defined in net.corda.nodeapi.internal.serialization.amqp.DeserializedParameterizedType[ClassConstructorDescriptorImpl]

'this' @ [196:42] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.asParameterizedType[ReceiverParameterDescriptorImpl]

'this' @ [196:48] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.asParameterizedType[ReceiverParameterDescriptorImpl]

'typeParameters' @ [196:53] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.typeParameters: (Array<out (TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>..TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>?)>..Array<out (TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>..TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'when (this) {
        is Class<*> -> this.asParameterizedType()
        is ParameterizedType -> this
        else -> throw NotSerializableException("Don't know how to convert to ParameterizedType")
    }' @ [200:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ParameterizedType, entry1: ParameterizedType, entry2: ParameterizedType): ParameterizedType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ParameterizedType

'this' @ [200:18] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.asParameterizedType[ReceiverParameterDescriptorImpl]

'this' @ [201:24] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.asParameterizedType[ReceiverParameterDescriptorImpl]

'asParameterizedType' @ [201:29] ==> internal fun Class<*>.asParameterizedType(): ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'this' @ [202:33] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.asParameterizedType[ReceiverParameterDescriptorImpl]

'NotSerializableException' @ [203:23] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'of' @ [208:22] ==> public open fun of(p0: (Type..Type?)): (TypeToken<*>..TypeToken<*>?) defined in com.google.common.reflect.TypeToken[JavaMethodDescriptor]

'this' @ [208:25] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.isSubClassOf[ReceiverParameterDescriptorImpl]

'isSubtypeOf' @ [208:31] ==> public final fun isSubtypeOf(p0: (Type..Type?)): Boolean defined in com.google.common.reflect.TypeToken[JavaMethodDescriptor]

'type' @ [208:43] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.isSubClassOf[ValueParameterDescriptorImpl]

