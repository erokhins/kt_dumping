'ThreadSafe' @ [41:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'ConcurrentHashMap' @ [43:37] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Type
    <V : (Any..Any?)> -> AMQPSerializer<Any>

'ConcurrentHashMap' @ [44:43] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Any
    <V : (Any..Any?)> -> AMQPSerializer<Any>

'CopyOnWriteArrayList' @ [45:37] ==> public constructor CopyOnWriteArrayList<E : (Any..Any?)>() defined in java.util.concurrent.CopyOnWriteArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CustomSerializer<out Any>

'ClassCarpenter' @ [46:34] ==> public constructor ClassCarpenter(cl: ClassLoader = ...) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[ClassConstructorDescriptorImpl]

'cl' @ [46:49] ==> value-parameter cl: ClassLoader defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.<init>[ValueParameterDescriptorImpl]

'classCarpenter' @ [48:17] ==> private final val classCarpenter: ClassCarpenter defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

'classloader' @ [48:32] ==> public final val classloader: CarpenterClassLoader defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[PropertyDescriptorImpl]

'serializersByDescriptor' @ [51:16] ==> private final val serializersByDescriptor: ConcurrentHashMap<Any, AMQPSerializer<Any>> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

'computeIfAbsent' @ [51:40] ==> public final fun computeIfAbsent(p0: Any, p1: (Any) -> AMQPSerializer<Any>): AMQPSerializer<Any> defined in java.util.concurrent.ConcurrentHashMap[MyFunctionDescriptor]

'typeNotation' @ [51:56] ==> value-parameter typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.getEvolutionSerializer[ValueParameterDescriptorImpl]

'descriptor' @ [51:69] ==> public abstract val descriptor: Descriptor defined in net.corda.nodeapi.internal.serialization.amqp.TypeNotation[PropertyDescriptorImpl]

'name' @ [51:80] ==> public final val name: String? defined in net.corda.nodeapi.internal.serialization.amqp.Descriptor[PropertyDescriptorImpl]

'EvolutionSerializer' @ [52:13] ==> public companion object defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer[FakeCallableDescriptorForObject]

'make' @ [52:33] ==> public final fun make(old: CompositeType, new: ObjectSerializer, factory: SerializerFactory): AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion[SimpleFunctionDescriptorImpl]

'typeNotation' @ [52:38] ==> value-parameter typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.getEvolutionSerializer[ValueParameterDescriptorImpl]

'newSerializer' @ [52:69] ==> value-parameter newSerializer: ObjectSerializer defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.getEvolutionSerializer[ValueParameterDescriptorImpl]

'this' @ [52:84] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[LazyClassReceiverParameterDescriptor]

'Throws' @ [62:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'NotSerializableException' @ [62:13] ==> public constructor NotSerializableException() defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'declaredType' @ [64:29] ==> value-parameter declaredType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[ValueParameterDescriptorImpl]

'asClass' @ [64:42] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'NotSerializableException' @ [64:61] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'declaredType' @ [65:37] ==> value-parameter declaredType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[ValueParameterDescriptorImpl]

'inferTypeVariables' @ [67:32] ==> private final fun inferTypeVariables(actualClass: Class<*>?, declaredClass: Class<*>, declaredType: Type): Type? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'actualClass' @ [67:51] ==> value-parameter actualClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[ValueParameterDescriptorImpl]

'declaredClass' @ [67:64] ==> val declaredClass: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[LocalVariableDescriptor]

'declaredType' @ [67:79] ==> value-parameter declaredType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[ValueParameterDescriptorImpl]

'declaredType' @ [67:96] ==> value-parameter declaredType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[ValueParameterDescriptorImpl]

'if (Collection::class.java.isAssignableFrom(declaredClass)) {
            serializersByType.computeIfAbsent(declaredType) {
                CollectionSerializer(declaredType as? ParameterizedType ?: DeserializedParameterizedType(
                        declaredClass, arrayOf(AnyType), null), this)
            }
        } else if (Map::class.java.isAssignableFrom(declaredClass)) {
            serializersByType.computeIfAbsent(declaredClass) {
                makeMapSerializer(declaredType as? ParameterizedType ?: DeserializedParameterizedType(
                        declaredClass, arrayOf(AnyType, AnyType), null))
            }
        } else {
            makeClassSerializer(actualClass ?: declaredClass, actualType, declaredType)
        }' @ [69:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AMQPSerializer<Any>, elseBranch: AMQPSerializer<Any>): AMQPSerializer<Any>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AMQPSerializer<Any>

'java' @ [69:48] ==> public val <T> KClass<Collection<*>>.java: Class<Collection<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Collection<*>

'isAssignableFrom' @ [69:53] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'declaredClass' @ [69:70] ==> val declaredClass: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[LocalVariableDescriptor]

'serializersByType' @ [70:13] ==> private final val serializersByType: ConcurrentHashMap<Type, AMQPSerializer<Any>> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

'computeIfAbsent' @ [70:31] ==> public final fun computeIfAbsent(p0: Type, p1: (Type) -> AMQPSerializer<Any>): AMQPSerializer<Any> defined in java.util.concurrent.ConcurrentHashMap[MyFunctionDescriptor]

'declaredType' @ [70:47] ==> value-parameter declaredType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[ValueParameterDescriptorImpl]

'CollectionSerializer' @ [71:17] ==> public constructor CollectionSerializer(declaredType: ParameterizedType, factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer[ClassConstructorDescriptorImpl]

'declaredType' @ [71:38] ==> value-parameter declaredType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[ValueParameterDescriptorImpl]

'DeserializedParameterizedType' @ [71:76] ==> public constructor DeserializedParameterizedType(rawType: Class<*>, params: Array<out Type>, ownerType: Type? = ...) defined in net.corda.nodeapi.internal.serialization.amqp.DeserializedParameterizedType[ClassConstructorDescriptorImpl]

'declaredClass' @ [72:25] ==> val declaredClass: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[LocalVariableDescriptor]

'arrayOf' @ [72:40] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: SerializerFactory.AnyType): Array<SerializerFactory.AnyType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> AnyType

'AnyType' @ [72:48] ==> public object AnyType : WildcardType defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[FakeCallableDescriptorForObject]

'this' @ [72:65] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[LazyClassReceiverParameterDescriptor]

'if (Map::class.java.isAssignableFrom(declaredClass)) {
            serializersByType.computeIfAbsent(declaredClass) {
                makeMapSerializer(declaredType as? ParameterizedType ?: DeserializedParameterizedType(
                        declaredClass, arrayOf(AnyType, AnyType), null))
            }
        } else {
            makeClassSerializer(actualClass ?: declaredClass, actualType, declaredType)
        }' @ [74:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AMQPSerializer<Any>, elseBranch: AMQPSerializer<Any>): AMQPSerializer<Any>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AMQPSerializer<Any>

'java' @ [74:31] ==> public val <T> KClass<Map<*, *>>.java: Class<Map<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Map<*, *>

'isAssignableFrom' @ [74:36] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'declaredClass' @ [74:53] ==> val declaredClass: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[LocalVariableDescriptor]

'serializersByType' @ [75:13] ==> private final val serializersByType: ConcurrentHashMap<Type, AMQPSerializer<Any>> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

'computeIfAbsent' @ [75:31] ==> public final fun computeIfAbsent(p0: Type, p1: (Type) -> AMQPSerializer<Any>): AMQPSerializer<Any> defined in java.util.concurrent.ConcurrentHashMap[MyFunctionDescriptor]

'declaredClass' @ [75:47] ==> val declaredClass: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[LocalVariableDescriptor]

'makeMapSerializer' @ [76:17] ==> private final fun makeMapSerializer(declaredType: ParameterizedType): AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'declaredType' @ [76:35] ==> value-parameter declaredType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[ValueParameterDescriptorImpl]

'DeserializedParameterizedType' @ [76:73] ==> public constructor DeserializedParameterizedType(rawType: Class<*>, params: Array<out Type>, ownerType: Type? = ...) defined in net.corda.nodeapi.internal.serialization.amqp.DeserializedParameterizedType[ClassConstructorDescriptorImpl]

'declaredClass' @ [77:25] ==> val declaredClass: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[LocalVariableDescriptor]

'arrayOf' @ [77:40] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: SerializerFactory.AnyType): Array<SerializerFactory.AnyType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> AnyType

'AnyType' @ [77:48] ==> public object AnyType : WildcardType defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[FakeCallableDescriptorForObject]

'AnyType' @ [77:57] ==> public object AnyType : WildcardType defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[FakeCallableDescriptorForObject]

'makeClassSerializer' @ [80:13] ==> private final fun makeClassSerializer(clazz: Class<*>, type: Type, declaredType: Type): AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'actualClass' @ [80:33] ==> value-parameter actualClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[ValueParameterDescriptorImpl]

'declaredClass' @ [80:48] ==> val declaredClass: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[LocalVariableDescriptor]

'actualType' @ [80:63] ==> val actualType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[LocalVariableDescriptor]

'declaredType' @ [80:75] ==> value-parameter declaredType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[ValueParameterDescriptorImpl]

'serializersByDescriptor' @ [83:9] ==> private final val serializersByDescriptor: ConcurrentHashMap<Any, AMQPSerializer<Any>> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

'putIfAbsent' @ [83:33] ==> public open fun putIfAbsent(p0: Any, p1: AMQPSerializer<Any>): AMQPSerializer<Any>? defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'serializer' @ [83:45] ==> val serializer: AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[LocalVariableDescriptor]

'typeDescriptor' @ [83:56] ==> public abstract val typeDescriptor: String defined in net.corda.nodeapi.internal.serialization.amqp.AMQPSerializer[PropertyDescriptorImpl]

'serializer' @ [83:72] ==> val serializer: AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[LocalVariableDescriptor]

'serializer' @ [85:16] ==> val serializer: AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[LocalVariableDescriptor]

'if (declaredType is ParameterizedType) {
            return inferTypeVariables(actualClass, declaredClass, declaredType)
        } else if (declaredType is Class<*>) {
            // Nothing to infer, otherwise we'd have ParameterizedType
            return actualClass
        } else if (declaredType is GenericArrayType) {
            val declaredComponent = declaredType.genericComponentType
            return inferTypeVariables(actualClass?.componentType, declaredComponent.asClass()!!, declaredComponent)?.asArray()
        } else return null' @ [94:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'declaredType' @ [94:13] ==> value-parameter declaredType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'inferTypeVariables' @ [95:20] ==> private final fun inferTypeVariables(actualClass: Class<*>?, declaredClass: Class<*>, declaredType: ParameterizedType): Type? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'actualClass' @ [95:39] ==> value-parameter actualClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'declaredClass' @ [95:52] ==> value-parameter declaredClass: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'declaredType' @ [95:67] ==> value-parameter declaredType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'if (declaredType is Class<*>) {
            // Nothing to infer, otherwise we'd have ParameterizedType
            return actualClass
        } else if (declaredType is GenericArrayType) {
            val declaredComponent = declaredType.genericComponentType
            return inferTypeVariables(actualClass?.componentType, declaredComponent.asClass()!!, declaredComponent)?.asArray()
        } else return null' @ [96:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'declaredType' @ [96:20] ==> value-parameter declaredType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'actualClass' @ [98:20] ==> value-parameter actualClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'if (declaredType is GenericArrayType) {
            val declaredComponent = declaredType.genericComponentType
            return inferTypeVariables(actualClass?.componentType, declaredComponent.asClass()!!, declaredComponent)?.asArray()
        } else return null' @ [99:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'declaredType' @ [99:20] ==> value-parameter declaredType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'declaredType' @ [100:37] ==> value-parameter declaredType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'genericComponentType' @ [100:50] ==> public final val GenericArrayType.genericComponentType: (Type..Type?)[MyPropertyDescriptor]

'inferTypeVariables' @ [101:20] ==> private final fun inferTypeVariables(actualClass: Class<*>?, declaredClass: Class<*>, declaredType: Type): Type? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'actualClass' @ [101:39] ==> value-parameter actualClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'componentType' @ [101:52] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.componentType: (Class<*>..Class<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'declaredComponent' @ [101:67] ==> val declaredComponent: (Type..Type?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[LocalVariableDescriptor]

'asClass' @ [101:85] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'declaredComponent' @ [101:98] ==> val declaredComponent: (Type..Type?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[LocalVariableDescriptor]

'asArray' @ [101:118] ==> internal fun Type.asArray(): Type? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'if (actualClass == null || declaredClass == actualClass) {
            return null
        } else if (declaredClass.isAssignableFrom(actualClass)) {
            return if (actualClass.typeParameters.isNotEmpty()) {
                // The actual class can never have type variables resolved, due to the JVM's use of type erasure, so let's try and resolve them
                // Search for declared type in the inheritance hierarchy and then see if that fills in all the variables
                val implementationChain: List<Type>? = findPathToDeclared(actualClass, declaredType, mutableListOf<Type>())
                if (implementationChain != null) {
                    val start = implementationChain.last()
                    val rest = implementationChain.dropLast(1).drop(1)
                    val resolver = rest.reversed().fold(TypeResolver().where(start, declaredType)) {
                        resolved, chainEntry ->
                        val newResolved = resolved.resolveType(chainEntry)
                        TypeResolver().where(chainEntry, newResolved)
                    }
                    // The end type is a special case as it is a Class, so we need to fake up a ParameterizedType for it to get the TypeResolver to do anything.
                    val endType = DeserializedParameterizedType(actualClass, actualClass.typeParameters)
                    val resolvedType = resolver.resolveType(endType)
                    resolvedType
                } else throw NotSerializableException("No inheritance path between actual $actualClass and declared $declaredType.")
            } else actualClass
        } else throw NotSerializableException("Found object of type $actualClass in a property expecting $declaredType")' @ [110:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'actualClass' @ [110:13] ==> value-parameter actualClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'declaredClass' @ [110:36] ==> value-parameter declaredClass: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'actualClass' @ [110:53] ==> value-parameter actualClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'if (declaredClass.isAssignableFrom(actualClass)) {
            return if (actualClass.typeParameters.isNotEmpty()) {
                // The actual class can never have type variables resolved, due to the JVM's use of type erasure, so let's try and resolve them
                // Search for declared type in the inheritance hierarchy and then see if that fills in all the variables
                val implementationChain: List<Type>? = findPathToDeclared(actualClass, declaredType, mutableListOf<Type>())
                if (implementationChain != null) {
                    val start = implementationChain.last()
                    val rest = implementationChain.dropLast(1).drop(1)
                    val resolver = rest.reversed().fold(TypeResolver().where(start, declaredType)) {
                        resolved, chainEntry ->
                        val newResolved = resolved.resolveType(chainEntry)
                        TypeResolver().where(chainEntry, newResolved)
                    }
                    // The end type is a special case as it is a Class, so we need to fake up a ParameterizedType for it to get the TypeResolver to do anything.
                    val endType = DeserializedParameterizedType(actualClass, actualClass.typeParameters)
                    val resolvedType = resolver.resolveType(endType)
                    resolvedType
                } else throw NotSerializableException("No inheritance path between actual $actualClass and declared $declaredType.")
            } else actualClass
        } else throw NotSerializableException("Found object of type $actualClass in a property expecting $declaredType")' @ [112:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'declaredClass' @ [112:20] ==> value-parameter declaredClass: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'isAssignableFrom' @ [112:34] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'actualClass' @ [112:51] ==> value-parameter actualClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'if (actualClass.typeParameters.isNotEmpty()) {
                // The actual class can never have type variables resolved, due to the JVM's use of type erasure, so let's try and resolve them
                // Search for declared type in the inheritance hierarchy and then see if that fills in all the variables
                val implementationChain: List<Type>? = findPathToDeclared(actualClass, declaredType, mutableListOf<Type>())
                if (implementationChain != null) {
                    val start = implementationChain.last()
                    val rest = implementationChain.dropLast(1).drop(1)
                    val resolver = rest.reversed().fold(TypeResolver().where(start, declaredType)) {
                        resolved, chainEntry ->
                        val newResolved = resolved.resolveType(chainEntry)
                        TypeResolver().where(chainEntry, newResolved)
                    }
                    // The end type is a special case as it is a Class, so we need to fake up a ParameterizedType for it to get the TypeResolver to do anything.
                    val endType = DeserializedParameterizedType(actualClass, actualClass.typeParameters)
                    val resolvedType = resolver.resolveType(endType)
                    resolvedType
                } else throw NotSerializableException("No inheritance path between actual $actualClass and declared $declaredType.")
            } else actualClass' @ [113:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type?, elseBranch: Type?): Type?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type?

'actualClass' @ [113:24] ==> value-parameter actualClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'typeParameters' @ [113:36] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.typeParameters: (Array<out (TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>..TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>?)>..Array<out (TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>..TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'isNotEmpty' @ [113:51] ==> @InlineOnly public inline fun <T> Array<out (TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>..TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.TypeVariable<out (java.lang.Class<out (kotlin.Any..kotlin.Any?)>..java.lang.Class<out (kotlin.Any..kotlin.Any?)>?)>..java.lang.reflect.TypeVariable<out (java.lang.Class<out (kotlin.Any..kotlin.Any?)>..java.lang.Class<out (kotlin.Any..kotlin.Any?)>?)>?)

'findPathToDeclared' @ [116:56] ==> private final fun findPathToDeclared(startingType: Type, declaredType: Type, chain: MutableList<Type>): List<Type>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'actualClass' @ [116:75] ==> value-parameter actualClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'declaredType' @ [116:88] ==> value-parameter declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'mutableListOf' @ [116:102] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'if (implementationChain != null) {
                    val start = implementationChain.last()
                    val rest = implementationChain.dropLast(1).drop(1)
                    val resolver = rest.reversed().fold(TypeResolver().where(start, declaredType)) {
                        resolved, chainEntry ->
                        val newResolved = resolved.resolveType(chainEntry)
                        TypeResolver().where(chainEntry, newResolved)
                    }
                    // The end type is a special case as it is a Class, so we need to fake up a ParameterizedType for it to get the TypeResolver to do anything.
                    val endType = DeserializedParameterizedType(actualClass, actualClass.typeParameters)
                    val resolvedType = resolver.resolveType(endType)
                    resolvedType
                } else throw NotSerializableException("No inheritance path between actual $actualClass and declared $declaredType.")' @ [117:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Type..Type?), elseBranch: (Type..Type?)): (Type..Type?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'implementationChain' @ [117:21] ==> val implementationChain: List<Type>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[LocalVariableDescriptor]

'implementationChain' @ [118:33] ==> val implementationChain: List<Type>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[LocalVariableDescriptor]

'last' @ [118:53] ==> public fun <T> List<Type>.last(): Type defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'implementationChain' @ [119:32] ==> val implementationChain: List<Type>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[LocalVariableDescriptor]

'dropLast' @ [119:52] ==> public fun <T> List<Type>.dropLast(n: Int): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'drop' @ [119:64] ==> public fun <T> Iterable<Type>.drop(n: Int): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'rest' @ [120:36] ==> val rest: List<Type> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[LocalVariableDescriptor]

'reversed' @ [120:41] ==> public fun <T> Iterable<Type>.reversed(): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'fold' @ [120:52] ==> public inline fun <T, R> Iterable<Type>.fold(initial: (TypeResolver..TypeResolver?), operation: (acc: (TypeResolver..TypeResolver?), Type) -> (TypeResolver..TypeResolver?)): (TypeResolver..TypeResolver?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> (com.google.common.reflect.TypeResolver..com.google.common.reflect.TypeResolver?)

'TypeResolver' @ [120:57] ==> public constructor TypeResolver() defined in com.google.common.reflect.TypeResolver[JavaClassConstructorDescriptor]

'where' @ [120:72] ==> public open fun where(p0: (Type..Type?), p1: (Type..Type?)): (TypeResolver..TypeResolver?) defined in com.google.common.reflect.TypeResolver[JavaMethodDescriptor]

'start' @ [120:78] ==> val start: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[LocalVariableDescriptor]

'declaredType' @ [120:85] ==> value-parameter declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'resolved' @ [122:43] ==> value-parameter resolved: (TypeResolver..TypeResolver?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables.<anonymous>[ValueParameterDescriptorImpl]

'resolveType' @ [122:52] ==> public open fun resolveType(p0: (Type..Type?)): (Type..Type?) defined in com.google.common.reflect.TypeResolver[JavaMethodDescriptor]

'chainEntry' @ [122:64] ==> value-parameter chainEntry: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables.<anonymous>[ValueParameterDescriptorImpl]

'TypeResolver' @ [123:25] ==> public constructor TypeResolver() defined in com.google.common.reflect.TypeResolver[JavaClassConstructorDescriptor]

'where' @ [123:40] ==> public open fun where(p0: (Type..Type?), p1: (Type..Type?)): (TypeResolver..TypeResolver?) defined in com.google.common.reflect.TypeResolver[JavaMethodDescriptor]

'chainEntry' @ [123:46] ==> value-parameter chainEntry: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables.<anonymous>[ValueParameterDescriptorImpl]

'newResolved' @ [123:58] ==> val newResolved: (Type..Type?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables.<anonymous>[LocalVariableDescriptor]

'DeserializedParameterizedType' @ [126:35] ==> public constructor DeserializedParameterizedType(rawType: Class<*>, params: Array<out Type>, ownerType: Type? = ...) defined in net.corda.nodeapi.internal.serialization.amqp.DeserializedParameterizedType[ClassConstructorDescriptorImpl]

'actualClass' @ [126:65] ==> value-parameter actualClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'actualClass' @ [126:78] ==> value-parameter actualClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'typeParameters' @ [126:90] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.typeParameters: (Array<out (TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>..TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>?)>..Array<out (TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>..TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'resolver' @ [127:40] ==> val resolver: (TypeResolver..TypeResolver?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[LocalVariableDescriptor]

'resolveType' @ [127:49] ==> public open fun resolveType(p0: (Type..Type?)): (Type..Type?) defined in com.google.common.reflect.TypeResolver[JavaMethodDescriptor]

'endType' @ [127:61] ==> val endType: DeserializedParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[LocalVariableDescriptor]

'resolvedType' @ [128:21] ==> val resolvedType: (Type..Type?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[LocalVariableDescriptor]

'NotSerializableException' @ [129:30] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'actualClass' @ [129:92] ==> value-parameter actualClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'declaredType' @ [129:118] ==> value-parameter declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'actualClass' @ [130:20] ==> value-parameter actualClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'NotSerializableException' @ [131:22] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'actualClass' @ [131:70] ==> value-parameter actualClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'declaredType' @ [131:107] ==> value-parameter declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.inferTypeVariables[ValueParameterDescriptorImpl]

'chain' @ [136:9] ==> value-parameter chain: MutableList<Type> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[ValueParameterDescriptorImpl]

'add' @ [136:15] ==> public abstract fun add(element: Type): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'startingType' @ [136:19] ==> value-parameter startingType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[ValueParameterDescriptorImpl]

'startingType' @ [137:29] ==> value-parameter startingType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[ValueParameterDescriptorImpl]

'asClass' @ [137:42] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'startingClass' @ [138:13] ==> val startingClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[LocalVariableDescriptor]

'declaredType' @ [138:30] ==> value-parameter declaredType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[ValueParameterDescriptorImpl]

'asClass' @ [138:43] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'chain' @ [140:20] ==> value-parameter chain: MutableList<Type> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[ValueParameterDescriptorImpl]

'startingClass' @ [143:26] ==> val startingClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[LocalVariableDescriptor]

'genericSuperclass' @ [143:41] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.genericSuperclass: (Type..Type?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'if (superClass != null) {
            val resolved = TypeResolver().where(startingClass.asParameterizedType(), startingType.asParameterizedType()).resolveType(superClass)
            findPathToDeclared(resolved, declaredType, ArrayList(chain))
        } else null' @ [144:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<Type>?, elseBranch: List<Type>?): List<Type>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<Type>?

'superClass' @ [144:35] ==> val superClass: Type? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[LocalVariableDescriptor]

'TypeResolver' @ [145:28] ==> public constructor TypeResolver() defined in com.google.common.reflect.TypeResolver[JavaClassConstructorDescriptor]

'where' @ [145:43] ==> public open fun where(p0: (Type..Type?), p1: (Type..Type?)): (TypeResolver..TypeResolver?) defined in com.google.common.reflect.TypeResolver[JavaMethodDescriptor]

'startingClass' @ [145:49] ==> val startingClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[LocalVariableDescriptor]

'asParameterizedType' @ [145:63] ==> internal fun Class<*>.asParameterizedType(): ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'startingType' @ [145:86] ==> value-parameter startingType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[ValueParameterDescriptorImpl]

'asParameterizedType' @ [145:99] ==> internal fun Type.asParameterizedType(): ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'resolveType' @ [145:122] ==> public open fun resolveType(p0: (Type..Type?)): (Type..Type?) defined in com.google.common.reflect.TypeResolver[JavaMethodDescriptor]

'superClass' @ [145:134] ==> val superClass: Type? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[LocalVariableDescriptor]

'findPathToDeclared' @ [146:13] ==> private final fun findPathToDeclared(startingType: Type, declaredType: Type, chain: MutableList<Type>): List<Type>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'resolved' @ [146:32] ==> val resolved: (Type..Type?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[LocalVariableDescriptor]

'declaredType' @ [146:42] ==> value-parameter declaredType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[ValueParameterDescriptorImpl]

'ArrayList' @ [146:56] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (Type..Type?)>..Collection<(Type..Type?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Type

'chain' @ [146:66] ==> value-parameter chain: MutableList<Type> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[ValueParameterDescriptorImpl]

'superClassChain' @ [148:13] ==> val superClassChain: List<Type>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[LocalVariableDescriptor]

'superClassChain' @ [148:45] ==> val superClassChain: List<Type>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[LocalVariableDescriptor]

'startingClass' @ [149:23] ==> val startingClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[LocalVariableDescriptor]

'genericInterfaces' @ [149:38] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.genericInterfaces: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'emptyArray' @ [149:59] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<(Type..Type?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'TypeResolver' @ [150:28] ==> public constructor TypeResolver() defined in com.google.common.reflect.TypeResolver[JavaClassConstructorDescriptor]

'where' @ [150:43] ==> public open fun where(p0: (Type..Type?), p1: (Type..Type?)): (TypeResolver..TypeResolver?) defined in com.google.common.reflect.TypeResolver[JavaMethodDescriptor]

'startingClass' @ [150:49] ==> val startingClass: Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[LocalVariableDescriptor]

'asParameterizedType' @ [150:65] ==> internal fun Class<*>.asParameterizedType(): ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'startingType' @ [150:88] ==> value-parameter startingType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[ValueParameterDescriptorImpl]

'asParameterizedType' @ [150:101] ==> internal fun Type.asParameterizedType(): ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'resolveType' @ [150:124] ==> public open fun resolveType(p0: (Type..Type?)): (Type..Type?) defined in com.google.common.reflect.TypeResolver[JavaMethodDescriptor]

'iface' @ [150:136] ==> val iface: (Type..Type?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[LocalVariableDescriptor]

'findPathToDeclared' @ [151:20] ==> private final fun findPathToDeclared(startingType: Type, declaredType: Type, chain: MutableList<Type>): List<Type>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'resolved' @ [151:39] ==> val resolved: (Type..Type?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[LocalVariableDescriptor]

'declaredType' @ [151:49] ==> value-parameter declaredType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[ValueParameterDescriptorImpl]

'ArrayList' @ [151:63] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (Type..Type?)>..Collection<(Type..Type?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Type

'chain' @ [151:73] ==> value-parameter chain: MutableList<Type> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findPathToDeclared[ValueParameterDescriptorImpl]

'Throws' @ [160:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'NotSerializableException' @ [160:13] ==> public constructor NotSerializableException() defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'serializersByDescriptor' @ [162:16] ==> private final val serializersByDescriptor: ConcurrentHashMap<Any, AMQPSerializer<Any>> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

'typeDescriptor' @ [162:40] ==> value-parameter typeDescriptor: Any defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[ValueParameterDescriptorImpl]

'invoke' @ [162:59] ==> public abstract operator fun invoke(): AMQPSerializer<Any> defined in kotlin.Function0[FunctionInvokeDescriptor]

'processSchema' @ [163:13] ==> private final fun processSchema(schema: schemaAndDescriptor, sentinel: Boolean = ...): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'schemaAndDescriptor' @ [163:27] ==> public constructor schemaAndDescriptor(schema: Schema, typeDescriptor: Any) defined in net.corda.nodeapi.internal.serialization.amqp.schemaAndDescriptor[ClassConstructorDescriptorImpl]

'schema' @ [163:47] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[ValueParameterDescriptorImpl]

'typeDescriptor' @ [163:55] ==> value-parameter typeDescriptor: Any defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[ValueParameterDescriptorImpl]

'serializersByDescriptor' @ [164:13] ==> private final val serializersByDescriptor: ConcurrentHashMap<Any, AMQPSerializer<Any>> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

'typeDescriptor' @ [164:37] ==> value-parameter typeDescriptor: Any defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[ValueParameterDescriptorImpl]

'NotSerializableException' @ [164:62] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'typeDescriptor' @ [165:63] ==> value-parameter typeDescriptor: Any defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.get[ValueParameterDescriptorImpl]

'!' @ [174:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'serializersByDescriptor' @ [174:14] ==> private final val serializersByDescriptor: ConcurrentHashMap<Any, AMQPSerializer<Any>> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

'containsKey' @ [174:38] ==> public open fun containsKey(key: Any): Boolean defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'customSerializer' @ [174:50] ==> value-parameter customSerializer: CustomSerializer<out Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.register[ValueParameterDescriptorImpl]

'typeDescriptor' @ [174:67] ==> public abstract val typeDescriptor: String defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer[PropertyDescriptorImpl]

'customSerializers' @ [175:13] ==> private final val customSerializers: CopyOnWriteArrayList<CustomSerializer<out Any>> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

'customSerializer' @ [175:34] ==> value-parameter customSerializer: CustomSerializer<out Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.register[ValueParameterDescriptorImpl]

'serializersByDescriptor' @ [176:13] ==> private final val serializersByDescriptor: ConcurrentHashMap<Any, AMQPSerializer<Any>> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

'customSerializer' @ [176:37] ==> value-parameter customSerializer: CustomSerializer<out Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.register[ValueParameterDescriptorImpl]

'typeDescriptor' @ [176:54] ==> public abstract val typeDescriptor: String defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer[PropertyDescriptorImpl]

'customSerializer' @ [176:72] ==> value-parameter customSerializer: CustomSerializer<out Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.register[ValueParameterDescriptorImpl]

'customSerializer' @ [177:32] ==> value-parameter customSerializer: CustomSerializer<out Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.register[ValueParameterDescriptorImpl]

'additionalSerializers' @ [177:49] ==> public open val additionalSerializers: Iterable<CustomSerializer<out Any>> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer[PropertyDescriptorImpl]

'register' @ [178:17] ==> public final fun register(customSerializer: CustomSerializer<out Any>): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'additional' @ [178:26] ==> val additional: CustomSerializer<out Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.register[LocalVariableDescriptor]

'CarpenterSchemas' @ [188:32] ==> public companion object CarpenterSchemaConstructor defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[FakeCallableDescriptorForObject]

'newInstance' @ [188:49] ==> public final fun newInstance(): CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas.CarpenterSchemaConstructor[SimpleFunctionDescriptorImpl]

'schema' @ [189:30] ==> value-parameter schema: schemaAndDescriptor defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processSchema[ValueParameterDescriptorImpl]

'schema' @ [189:37] ==> public final val schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.schemaAndDescriptor[PropertyDescriptorImpl]

'types' @ [189:44] ==> public final val types: List<TypeNotation> defined in net.corda.nodeapi.internal.serialization.amqp.Schema[PropertyDescriptorImpl]

'processSchemaEntry' @ [191:34] ==> private final fun processSchemaEntry(typeNotation: TypeNotation): AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'typeNotation' @ [191:53] ==> val typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processSchema[LocalVariableDescriptor]

'serialiser' @ [196:21] ==> val serialiser: AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processSchema[LocalVariableDescriptor]

'typeDescriptor' @ [196:32] ==> public abstract val typeDescriptor: String defined in net.corda.nodeapi.internal.serialization.amqp.AMQPSerializer[PropertyDescriptorImpl]

'typeNotation' @ [196:50] ==> val typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processSchema[LocalVariableDescriptor]

'descriptor' @ [196:63] ==> public abstract val descriptor: Descriptor defined in net.corda.nodeapi.internal.serialization.amqp.TypeNotation[PropertyDescriptorImpl]

'name' @ [196:74] ==> public final val name: String? defined in net.corda.nodeapi.internal.serialization.amqp.Descriptor[PropertyDescriptorImpl]

'getEvolutionSerializer' @ [197:21] ==> public final fun getEvolutionSerializer(typeNotation: TypeNotation, newSerializer: ObjectSerializer): AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'typeNotation' @ [197:44] ==> val typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processSchema[LocalVariableDescriptor]

'serialiser' @ [197:58] ==> val serialiser: AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processSchema[LocalVariableDescriptor]

'sentinel' @ [200:21] ==> value-parameter sentinel: Boolean = ... defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processSchema[ValueParameterDescriptorImpl]

'typeNotation' @ [200:34] ==> val typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processSchema[LocalVariableDescriptor]

'e' @ [200:73] ==> val e: ClassNotFoundException defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processSchema[LocalVariableDescriptor]

'typeNotation' @ [201:17] ==> val typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processSchema[LocalVariableDescriptor]

'carpenterSchema' @ [201:30] ==> public fun CompositeType.carpenterSchema(classloader: ClassLoader, carpenterSchemas: CarpenterSchemas, force: Boolean = ...): Unit defined in net.corda.nodeapi.internal.serialization.carpenter in file AMQPSchemaExtensions.kt[SimpleFunctionDescriptorImpl]

'classloader' @ [201:46] ==> public final val classloader: ClassLoader defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

'carpenterSchemas' @ [201:78] ==> val carpenterSchemas: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processSchema[LocalVariableDescriptor]

'carpenterSchemas' @ [205:13] ==> val carpenterSchemas: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processSchema[LocalVariableDescriptor]

'isNotEmpty' @ [205:30] ==> public final fun isNotEmpty(): Boolean defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[SimpleFunctionDescriptorImpl]

'MetaCarpenter' @ [206:22] ==> public constructor MetaCarpenter(schemas: CarpenterSchemas, cc: ClassCarpenter = ...) defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenter[ClassConstructorDescriptorImpl]

'carpenterSchemas' @ [206:36] ==> val carpenterSchemas: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processSchema[LocalVariableDescriptor]

'classCarpenter' @ [206:54] ==> private final val classCarpenter: ClassCarpenter defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

'mc' @ [207:13] ==> val mc: MetaCarpenter defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processSchema[LocalVariableDescriptor]

'build' @ [207:16] ==> public open fun build(): Unit defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenter[SimpleFunctionDescriptorImpl]

'processSchema' @ [208:13] ==> private final fun processSchema(schema: schemaAndDescriptor, sentinel: Boolean = ...): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'schema' @ [208:27] ==> value-parameter schema: schemaAndDescriptor defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processSchema[ValueParameterDescriptorImpl]

'when (typeNotation) {
            is CompositeType -> processCompositeType(typeNotation) // java.lang.Class (whether a class or interface)
            is RestrictedType -> processRestrictedType(typeNotation) // Collection / Map, possibly with generics
        }' @ [212:66] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: AMQPSerializer<Any>, entry1: AMQPSerializer<Any>): AMQPSerializer<Any>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> AMQPSerializer<Any>

'typeNotation' @ [212:72] ==> value-parameter typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processSchemaEntry[ValueParameterDescriptorImpl]

'processCompositeType' @ [213:33] ==> private final fun processCompositeType(typeNotation: CompositeType): AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'typeNotation' @ [213:54] ==> value-parameter typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processSchemaEntry[ValueParameterDescriptorImpl]

'processRestrictedType' @ [214:34] ==> private final fun processRestrictedType(typeNotation: RestrictedType): AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'typeNotation' @ [214:56] ==> value-parameter typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processSchemaEntry[ValueParameterDescriptorImpl]

'typeForName' @ [219:20] ==> private final fun typeForName(name: String, classloader: ClassLoader): Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'typeNotation' @ [219:32] ==> value-parameter typeNotation: RestrictedType defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processRestrictedType[ValueParameterDescriptorImpl]

'name' @ [219:45] ==> public open val name: String defined in net.corda.nodeapi.internal.serialization.amqp.RestrictedType[PropertyDescriptorImpl]

'classloader' @ [219:51] ==> public final val classloader: ClassLoader defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

'get' @ [220:16] ==> @Throws public final fun get(actualClass: Class<*>?, declaredType: Type): AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'type' @ [220:26] ==> val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processRestrictedType[LocalVariableDescriptor]

'typeForName' @ [225:20] ==> private final fun typeForName(name: String, classloader: ClassLoader): Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'typeNotation' @ [225:32] ==> value-parameter typeNotation: CompositeType defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processCompositeType[ValueParameterDescriptorImpl]

'name' @ [225:45] ==> public open val name: String defined in net.corda.nodeapi.internal.serialization.amqp.CompositeType[PropertyDescriptorImpl]

'classloader' @ [225:51] ==> public final val classloader: ClassLoader defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

'get' @ [226:16] ==> @Throws public final fun get(actualClass: Class<*>?, declaredType: Type): AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'type' @ [226:20] ==> val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processCompositeType[LocalVariableDescriptor]

'asClass' @ [226:25] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'NotSerializableException' @ [226:44] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'type' @ [226:106] ==> val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processCompositeType[LocalVariableDescriptor]

'type' @ [226:114] ==> val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.processCompositeType[LocalVariableDescriptor]

'serializersByType' @ [229:109] ==> private final val serializersByType: ConcurrentHashMap<Type, AMQPSerializer<Any>> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

'computeIfAbsent' @ [229:127] ==> public final fun computeIfAbsent(p0: Type, p1: (Type) -> AMQPSerializer<Any>): AMQPSerializer<Any> defined in java.util.concurrent.ConcurrentHashMap[MyFunctionDescriptor]

'type' @ [229:143] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer[ValueParameterDescriptorImpl]

'if (isPrimitive(clazz)) {
            AMQPPrimitiveSerializer(clazz)
        } else {
            findCustomSerializer(clazz, declaredType) ?: run {
                if (type.isArray()) {
                    // Allow Object[] since this can be quite common (i.e. an untyped array)
                    if(type.componentType() != Object::class.java) whitelisted(type.componentType())
                    if (clazz.componentType.isPrimitive) PrimArraySerializer.make(type, this)
                    else ArraySerializer.make(type, this)
                } else if (clazz.kotlin.objectInstance != null) {
                    whitelisted(clazz)
                    SingletonSerializer(clazz, clazz.kotlin.objectInstance!!, this)
                } else {
                    whitelisted(type)
                    ObjectSerializer(type, this)
                }
            }
        }' @ [230:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AMQPSerializer<Any>, elseBranch: AMQPSerializer<Any>): AMQPSerializer<Any>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AMQPSerializer<Any>

'isPrimitive' @ [230:13] ==> public final fun isPrimitive(type: Type): Boolean defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'clazz' @ [230:25] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer[ValueParameterDescriptorImpl]

'AMQPPrimitiveSerializer' @ [231:13] ==> public constructor AMQPPrimitiveSerializer(clazz: Class<*>) defined in net.corda.nodeapi.internal.serialization.amqp.AMQPPrimitiveSerializer[ClassConstructorDescriptorImpl]

'clazz' @ [231:37] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer[ValueParameterDescriptorImpl]

'findCustomSerializer' @ [233:13] ==> internal final fun findCustomSerializer(clazz: Class<*>, declaredType: Type): AMQPSerializer<Any>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'clazz' @ [233:34] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer[ValueParameterDescriptorImpl]

'declaredType' @ [233:41] ==> value-parameter declaredType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer[ValueParameterDescriptorImpl]

'run' @ [233:58] ==> @InlineOnly public inline fun <T, R> SerializerFactory.run(block: SerializerFactory.() -> AMQPSerializer<Any>): AMQPSerializer<Any> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SerializerFactory
    <R> -> AMQPSerializer<Any>

'if (type.isArray()) {
                    // Allow Object[] since this can be quite common (i.e. an untyped array)
                    if(type.componentType() != Object::class.java) whitelisted(type.componentType())
                    if (clazz.componentType.isPrimitive) PrimArraySerializer.make(type, this)
                    else ArraySerializer.make(type, this)
                } else if (clazz.kotlin.objectInstance != null) {
                    whitelisted(clazz)
                    SingletonSerializer(clazz, clazz.kotlin.objectInstance!!, this)
                } else {
                    whitelisted(type)
                    ObjectSerializer(type, this)
                }' @ [234:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AMQPSerializer<Any>, elseBranch: AMQPSerializer<Any>): AMQPSerializer<Any>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AMQPSerializer<Any>

'type' @ [234:21] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer[ValueParameterDescriptorImpl]

'isArray' @ [234:26] ==> internal fun Type.isArray(): Boolean defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'type' @ [236:24] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer[ValueParameterDescriptorImpl]

'componentType' @ [236:29] ==> internal fun Type.componentType(): Type defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'Object' @ [236:48] ==> public constructor Object() defined in java.lang.Object[JavaClassConstructorDescriptor]

'java' @ [236:62] ==> public val <T> KClass<Object>.java: Class<Object> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Object

'whitelisted' @ [236:68] ==> private final fun whitelisted(type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'type' @ [236:80] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer[ValueParameterDescriptorImpl]

'componentType' @ [236:85] ==> internal fun Type.componentType(): Type defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'if (clazz.componentType.isPrimitive) PrimArraySerializer.make(type, this)
                    else ArraySerializer.make(type, this)' @ [237:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ArraySerializer, elseBranch: ArraySerializer): ArraySerializer[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ArraySerializer

'clazz' @ [237:25] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer[ValueParameterDescriptorImpl]

'componentType' @ [237:31] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.componentType: (Class<*>..Class<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'isPrimitive' @ [237:45] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isPrimitive: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'make' @ [237:78] ==> public final fun make(type: Type, factory: SerializerFactory): PrimArraySerializer defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer.Companion[SimpleFunctionDescriptorImpl]

'type' @ [237:83] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer[ValueParameterDescriptorImpl]

'this' @ [237:89] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'make' @ [238:42] ==> public final fun make(type: Type, factory: SerializerFactory): ArraySerializer defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.Companion[SimpleFunctionDescriptorImpl]

'type' @ [238:47] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer[ValueParameterDescriptorImpl]

'this' @ [238:53] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'if (clazz.kotlin.objectInstance != null) {
                    whitelisted(clazz)
                    SingletonSerializer(clazz, clazz.kotlin.objectInstance!!, this)
                } else {
                    whitelisted(type)
                    ObjectSerializer(type, this)
                }' @ [239:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AMQPSerializer<Any>, elseBranch: AMQPSerializer<Any>): AMQPSerializer<Any>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AMQPSerializer<Any>

'clazz' @ [239:28] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer[ValueParameterDescriptorImpl]

'kotlin' @ [239:34] ==> public val <T : Any> Class<out (Any..Any?)>.kotlin: KClass<out (Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Captured(*)

'objectInstance' @ [239:41] ==> public abstract val objectInstance: Any? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'whitelisted' @ [240:21] ==> private final fun whitelisted(type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'clazz' @ [240:33] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer[ValueParameterDescriptorImpl]

'SingletonSerializer' @ [241:21] ==> public constructor SingletonSerializer(type: Class<*>, singleton: Any, factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.SingletonSerializer[ClassConstructorDescriptorImpl]

'clazz' @ [241:41] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer[ValueParameterDescriptorImpl]

'clazz' @ [241:48] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer[ValueParameterDescriptorImpl]

'kotlin' @ [241:54] ==> public val <T : Any> Class<out (Any..Any?)>.kotlin: KClass<out (Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Captured(*)

'objectInstance' @ [241:61] ==> public abstract val objectInstance: Any? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'this' @ [241:79] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'whitelisted' @ [243:21] ==> private final fun whitelisted(type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'type' @ [243:33] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer[ValueParameterDescriptorImpl]

'ObjectSerializer' @ [244:21] ==> public constructor ObjectSerializer(clazz: Type, factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.ObjectSerializer[ClassConstructorDescriptorImpl]

'type' @ [244:38] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer[ValueParameterDescriptorImpl]

'this' @ [244:44] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeClassSerializer.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'customSerializers' @ [253:34] ==> private final val customSerializers: CopyOnWriteArrayList<CustomSerializer<out Any>> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

'customSerializer' @ [254:17] ==> val customSerializer: (CustomSerializer<out Any>..CustomSerializer<out Any>?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findCustomSerializer[LocalVariableDescriptor]

'isSerializerFor' @ [254:34] ==> public abstract fun isSerializerFor(clazz: Class<*>): Boolean defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer[SimpleFunctionDescriptorImpl]

'clazz' @ [254:50] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findCustomSerializer[ValueParameterDescriptorImpl]

'declaredType' @ [255:42] ==> value-parameter declaredType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findCustomSerializer[ValueParameterDescriptorImpl]

'asClass' @ [255:55] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'superclass' @ [255:66] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.superclass: (Class<out Any?>..Class<out Any?>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'if (declaredSuperClass == null || !customSerializer.isSerializerFor(declaredSuperClass)) {
                    return customSerializer
                } else {
                    // Make a subclass serializer for the subclass and return that...
                    @Suppress("UNCHECKED_CAST")
                    return CustomSerializer.SubClass<Any>(clazz, customSerializer as CustomSerializer<Any>)
                }' @ [256:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'declaredSuperClass' @ [256:21] ==> val declaredSuperClass: Class<out Any?>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findCustomSerializer[LocalVariableDescriptor]

'!' @ [256:51] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'customSerializer' @ [256:52] ==> val customSerializer: (CustomSerializer<out Any>..CustomSerializer<out Any>?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findCustomSerializer[LocalVariableDescriptor]

'isSerializerFor' @ [256:69] ==> public abstract fun isSerializerFor(clazz: Class<*>): Boolean defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer[SimpleFunctionDescriptorImpl]

'declaredSuperClass' @ [256:85] ==> val declaredSuperClass: Class<out Any?>? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findCustomSerializer[LocalVariableDescriptor]

'customSerializer' @ [257:28] ==> val customSerializer: (CustomSerializer<out Any>..CustomSerializer<out Any>?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findCustomSerializer[LocalVariableDescriptor]

'Suppress' @ [260:21] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'SubClass' @ [261:45] ==> public constructor SubClass<T>(clazz: Class<*>, superClassSerializer: CustomSerializer<Any>) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> Any

'clazz' @ [261:59] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findCustomSerializer[ValueParameterDescriptorImpl]

'customSerializer' @ [261:66] ==> val customSerializer: (CustomSerializer<out Any>..CustomSerializer<out Any>?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.findCustomSerializer[LocalVariableDescriptor]

'type' @ [269:21] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.whitelisted[ValueParameterDescriptorImpl]

'asClass' @ [269:26] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'isNotWhitelisted' @ [270:13] ==> internal final fun isNotWhitelisted(clazz: Class<*>): Boolean defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'clazz' @ [270:30] ==> val clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.whitelisted[LocalVariableDescriptor]

'NotSerializableException' @ [271:19] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'type' @ [271:52] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.whitelisted[ValueParameterDescriptorImpl]

'clazz' @ [276:63] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.isNotWhitelisted[ValueParameterDescriptorImpl]

'java' @ [276:97] ==> public val <T> KClass<SimpleFieldAccess>.java: Class<SimpleFieldAccess> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SimpleFieldAccess

'!' @ [277:14] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'whitelist' @ [277:15] ==> public final val whitelist: ClassWhitelist defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

'hasListed' @ [277:25] ==> public abstract fun hasListed(type: Class<*>): Boolean defined in net.corda.core.serialization.ClassWhitelist[DeserializedSimpleFunctionDescriptor]

'clazz' @ [277:35] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.isNotWhitelisted[ValueParameterDescriptorImpl]

'!' @ [277:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasAnnotationInHierarchy' @ [277:46] ==> internal final fun hasAnnotationInHierarchy(type: Class<*>): Boolean defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'clazz' @ [277:71] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.isNotWhitelisted[ValueParameterDescriptorImpl]

'type' @ [281:16] ==> value-parameter type: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.hasAnnotationInHierarchy[ValueParameterDescriptorImpl]

'isAnnotationPresent' @ [281:21] ==> public open fun isAnnotationPresent(p0: (Class<out (Annotation..Annotation?)>..Class<out (Annotation..Annotation?)>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'CordaSerializable' @ [281:41] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'java' @ [281:66] ==> public val <T> KClass<CordaSerializable>.java: Class<CordaSerializable> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CordaSerializable

'type' @ [282:17] ==> value-parameter type: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.hasAnnotationInHierarchy[ValueParameterDescriptorImpl]

'interfaces' @ [282:22] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.interfaces: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'any' @ [282:33] ==> public inline fun <T> Array<out (Class<*>..Class<*>?)>.any(predicate: ((Class<*>..Class<*>?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.Class<*>..java.lang.Class<*>?)

'hasAnnotationInHierarchy' @ [282:39] ==> internal final fun hasAnnotationInHierarchy(type: Class<*>): Boolean defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'it' @ [282:64] ==> value-parameter it: (Class<*>..Class<*>?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.hasAnnotationInHierarchy.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [283:21] ==> value-parameter type: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.hasAnnotationInHierarchy[ValueParameterDescriptorImpl]

'superclass' @ [283:26] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.superclass: (Class<out Any?>..Class<out Any?>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'hasAnnotationInHierarchy' @ [283:48] ==> internal final fun hasAnnotationInHierarchy(type: Class<*>): Boolean defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'type' @ [283:73] ==> value-parameter type: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.hasAnnotationInHierarchy[ValueParameterDescriptorImpl]

'superclass' @ [283:78] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.superclass: (Class<out Any?>..Class<out Any?>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'declaredType' @ [287:23] ==> value-parameter declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeMapSerializer[ValueParameterDescriptorImpl]

'rawType' @ [287:36] ==> public final val ParameterizedType.rawType: (Type..Type?)[MyPropertyDescriptor]

'rawType' @ [288:9] ==> val rawType: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeMapSerializer[LocalVariableDescriptor]

'checkNotUnsupportedHashMap' @ [288:17] ==> internal fun Class<*>.checkNotUnsupportedHashMap(): Unit defined in net.corda.nodeapi.internal.serialization.amqp in file MapSerializer.kt[SimpleFunctionDescriptorImpl]

'MapSerializer' @ [289:16] ==> public constructor MapSerializer(declaredType: ParameterizedType, factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer[ClassConstructorDescriptorImpl]

'declaredType' @ [289:30] ==> value-parameter declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.makeMapSerializer[ValueParameterDescriptorImpl]

'this' @ [289:44] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[LazyClassReceiverParameterDescriptor]

'primitiveTypeName' @ [293:48] ==> public final fun primitiveTypeName(type: Type): String? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'type' @ [293:66] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.isPrimitive[ValueParameterDescriptorImpl]

'type' @ [296:25] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.primitiveTypeName[ValueParameterDescriptorImpl]

'primitiveTypeNames' @ [297:20] ==> private final val primitiveTypeNames: Map<Class<*>, String> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[PropertyDescriptorImpl]

'unwrap' @ [297:50] ==> public open fun <T : (Any..Any?)> unwrap(p0: (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)): (Class<out (Any..Any?)>..Class<out (Any..Any?)>?) defined in com.google.common.primitives.Primitives[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'clazz' @ [297:57] ==> val clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.primitiveTypeName[LocalVariableDescriptor]

'namesOfPrimitiveTypes' @ [301:20] ==> private final val namesOfPrimitiveTypes: Map<String, Class<*>> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[PropertyDescriptorImpl]

'type' @ [301:42] ==> value-parameter type: String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.primitiveType[ValueParameterDescriptorImpl]

'mapOf' @ [304:65] ==> public fun <K, V> mapOf(vararg pairs: Pair<Class<*>, String>): Map<Class<*>, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Class<*>
    <V> -> String

'Character' @ [305:17] ==> public constructor Character(p0: Char) defined in java.lang.Character[JavaClassConstructorDescriptor]

'java' @ [305:34] ==> public val <T> KClass<Character>.java: Class<Character> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Character

'Char' @ [306:17] ==> public companion object defined in kotlin.Char[FakeCallableDescriptorForObject]

'java' @ [306:29] ==> public val <T> KClass<Char>.java: Class<Char> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Char

'Boolean' @ [307:17] ==> private constructor Boolean() defined in kotlin.Boolean[DeserializedClassConstructorDescriptor]

'java' @ [307:32] ==> public val <T> KClass<Boolean>.java: Class<Boolean> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Boolean

'Byte' @ [308:17] ==> public companion object defined in kotlin.Byte[FakeCallableDescriptorForObject]

'java' @ [308:29] ==> public val <T> KClass<Byte>.java: Class<Byte> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Byte

'UnsignedByte' @ [309:17] ==> public constructor UnsignedByte(p0: Byte) defined in org.apache.qpid.proton.amqp.UnsignedByte[JavaClassConstructorDescriptor]

'java' @ [309:37] ==> public val <T> KClass<UnsignedByte>.java: Class<UnsignedByte> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UnsignedByte

'Short' @ [310:17] ==> public companion object defined in kotlin.Short[FakeCallableDescriptorForObject]

'java' @ [310:30] ==> public val <T> KClass<Short>.java: Class<Short> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Short

'UnsignedShort' @ [311:17] ==> public constructor UnsignedShort(p0: Short) defined in org.apache.qpid.proton.amqp.UnsignedShort[JavaClassConstructorDescriptor]

'java' @ [311:38] ==> public val <T> KClass<UnsignedShort>.java: Class<UnsignedShort> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UnsignedShort

'Int' @ [312:17] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'java' @ [312:28] ==> public val <T> KClass<Int>.java: Class<Int> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Int

'UnsignedInteger' @ [313:17] ==> public constructor UnsignedInteger(p0: Int) defined in org.apache.qpid.proton.amqp.UnsignedInteger[JavaClassConstructorDescriptor]

'java' @ [313:40] ==> public val <T> KClass<UnsignedInteger>.java: Class<UnsignedInteger> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UnsignedInteger

'Long' @ [314:17] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'java' @ [314:29] ==> public val <T> KClass<Long>.java: Class<Long> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Long

'UnsignedLong' @ [315:17] ==> public constructor UnsignedLong(p0: Long) defined in org.apache.qpid.proton.amqp.UnsignedLong[JavaClassConstructorDescriptor]

'java' @ [315:37] ==> public val <T> KClass<UnsignedLong>.java: Class<UnsignedLong> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UnsignedLong

'Float' @ [316:17] ==> public companion object defined in kotlin.Float[FakeCallableDescriptorForObject]

'java' @ [316:30] ==> public val <T> KClass<Float>.java: Class<Float> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Float

'Double' @ [317:17] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'java' @ [317:31] ==> public val <T> KClass<Double>.java: Class<Double> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Double

'to' @ [318:17] ==> public infix fun <A, B> Class<Decimal32>.to(that: String): Pair<Class<Decimal32>, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Class<Decimal32>
    <B> -> String

'java' @ [318:34] ==> public val <T> KClass<Decimal32>.java: Class<Decimal32> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Decimal32

'to' @ [319:17] ==> public infix fun <A, B> Class<Decimal64>.to(that: String): Pair<Class<Decimal64>, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Class<Decimal64>
    <B> -> String

'java' @ [319:34] ==> public val <T> KClass<Decimal64>.java: Class<Decimal64> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Decimal64

'to' @ [320:17] ==> public infix fun <A, B> Class<Decimal128>.to(that: String): Pair<Class<Decimal128>, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Class<Decimal128>
    <B> -> String

'java' @ [320:35] ==> public val <T> KClass<Decimal128>.java: Class<Decimal128> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Decimal128

'Date' @ [321:17] ==> public constructor Date() defined in java.util.Date[JavaClassConstructorDescriptor]

'java' @ [321:29] ==> public val <T> KClass<Date>.java: Class<Date> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Date

'to' @ [322:17] ==> public infix fun <A, B> Class<UUID>.to(that: String): Pair<Class<UUID>, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Class<UUID>
    <B> -> String

'java' @ [322:29] ==> public val <T> KClass<UUID>.java: Class<UUID> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UUID

'to' @ [323:17] ==> public infix fun <A, B> Class<ByteArray>.to(that: String): Pair<Class<ByteArray>, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Class<ByteArray>
    <B> -> String

'java' @ [323:34] ==> public val <T> KClass<ByteArray>.java: Class<ByteArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ByteArray

'String' @ [324:17] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [324:31] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'Symbol' @ [325:17] ==> private constructor Symbol(p0: (String..String?)) defined in org.apache.qpid.proton.amqp.Symbol[JavaClassConstructorDescriptor]

'java' @ [325:31] ==> public val <T> KClass<Symbol>.java: Class<Symbol> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Symbol

'primitiveTypeNames' @ [327:68] ==> private final val primitiveTypeNames: Map<Class<*>, String> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[PropertyDescriptorImpl]

'map' @ [327:87] ==> public inline fun <K, V, R> Map<out Class<*>, String>.map(transform: (Map.Entry<Class<*>, String>) -> Pair<String, Class<*>>): List<Pair<String, Class<*>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Class<*>
    <V> -> String
    <R> -> Pair<String, Class<*>>

'it' @ [327:93] ==> value-parameter it: Map.Entry<Class<*>, String> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.namesOfPrimitiveTypes.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [327:96] ==> public abstract val value: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [327:105] ==> value-parameter it: Map.Entry<Class<*>, String> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.namesOfPrimitiveTypes.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [327:108] ==> public abstract val key: Class<*> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'toMap' @ [327:114] ==> public fun <K, V> Iterable<Pair<String, Class<*>>>.toMap(): Map<String, Class<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Class<*>

'when (type) {
            is Class<*> -> {
                primitiveTypeName(type) ?: if (type.isArray) {
                    "${nameForType(type.componentType)}${if (type.componentType.isPrimitive) "[p]" else "[]"}"
                } else type.name
            }
            is ParameterizedType -> "${nameForType(type.rawType)}<${type.actualTypeArguments.joinToString { nameForType(it) }}>"
            is GenericArrayType -> "${nameForType(type.genericComponentType)}[]"
            is WildcardType -> "Any"
            else -> throw NotSerializableException("Unable to render type $type to a string.")
        }' @ [329:47] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'type' @ [329:53] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.nameForType[ValueParameterDescriptorImpl]

'primitiveTypeName' @ [331:17] ==> public final fun primitiveTypeName(type: Type): String? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'type' @ [331:35] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.nameForType[ValueParameterDescriptorImpl]

'if (type.isArray) {
                    "${nameForType(type.componentType)}${if (type.componentType.isPrimitive) "[p]" else "[]"}"
                } else type.name' @ [331:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'type' @ [331:48] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.nameForType[ValueParameterDescriptorImpl]

'isArray' @ [331:53] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isArray: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'nameForType' @ [332:24] ==> public final fun nameForType(type: Type): String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'type' @ [332:36] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.nameForType[ValueParameterDescriptorImpl]

'componentType' @ [332:41] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.componentType: (Class<*>..Class<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'if (type.componentType.isPrimitive) "[p]" else "[]"' @ [332:58] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'type' @ [332:62] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.nameForType[ValueParameterDescriptorImpl]

'componentType' @ [332:67] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.componentType: (Class<*>..Class<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'isPrimitive' @ [332:81] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isPrimitive: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'type' @ [333:24] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.nameForType[ValueParameterDescriptorImpl]

'name' @ [333:29] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'nameForType' @ [335:40] ==> public final fun nameForType(type: Type): String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'type' @ [335:52] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.nameForType[ValueParameterDescriptorImpl]

'rawType' @ [335:57] ==> public final val ParameterizedType.rawType: (Type..Type?)[MyPropertyDescriptor]

'type' @ [335:69] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.nameForType[ValueParameterDescriptorImpl]

'actualTypeArguments' @ [335:74] ==> public final val ParameterizedType.actualTypeArguments: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'joinToString' @ [335:94] ==> public fun <T> Array<out (Type..Type?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((Type..Type?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'nameForType' @ [335:109] ==> public final fun nameForType(type: Type): String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'it' @ [335:121] ==> value-parameter it: (Type..Type?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.nameForType.<anonymous>[ValueParameterDescriptorImpl]

'nameForType' @ [336:39] ==> public final fun nameForType(type: Type): String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'type' @ [336:51] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.nameForType[ValueParameterDescriptorImpl]

'genericComponentType' @ [336:56] ==> public final val GenericArrayType.genericComponentType: (Type..Type?)[MyPropertyDescriptor]

'NotSerializableException' @ [338:27] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'type' @ [338:76] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.nameForType[ValueParameterDescriptorImpl]

'if (name.endsWith("[]")) {
                val elementType = typeForName(name.substring(0, name.lastIndex - 1), classloader)
                if (elementType is ParameterizedType || elementType is GenericArrayType) {
                    DeserializedGenericArrayType(elementType)
                } else if (elementType is Class<*>) {
                    java.lang.reflect.Array.newInstance(elementType, 0).javaClass
                } else {
                    throw NotSerializableException("Not able to deserialize array type: $name")
                }
            } else if (name.endsWith("[p]")) {
                // There is no need to handle the ByteArray case as that type is coercible automatically
                // to the binary type and is thus handled by the main serializer and doesn't need a
                // special case for a primitive array of bytes
                when (name) {
                    "int[p]" -> IntArray::class.java
                    "char[p]" -> CharArray::class.java
                    "boolean[p]" -> BooleanArray::class.java
                    "float[p]" -> FloatArray::class.java
                    "double[p]" -> DoubleArray::class.java
                    "short[p]" -> ShortArray::class.java
                    "long[p]" -> LongArray::class.java
                    else -> throw NotSerializableException("Not able to deserialize array type: $name")
                }
            } else {
                DeserializedParameterizedType.make(name, classloader)
            }' @ [342:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'name' @ [342:24] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.typeForName[ValueParameterDescriptorImpl]

'endsWith' @ [342:29] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'typeForName' @ [343:35] ==> private final fun typeForName(name: String, classloader: ClassLoader): Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'name' @ [343:47] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.typeForName[ValueParameterDescriptorImpl]

'substring' @ [343:52] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'name' @ [343:65] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.typeForName[ValueParameterDescriptorImpl]

'lastIndex' @ [343:70] ==> public val CharSequence.lastIndex: Int defined in kotlin.text[DeserializedPropertyDescriptor]

'classloader' @ [343:86] ==> value-parameter classloader: ClassLoader defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.typeForName[ValueParameterDescriptorImpl]

'if (elementType is ParameterizedType || elementType is GenericArrayType) {
                    DeserializedGenericArrayType(elementType)
                } else if (elementType is Class<*>) {
                    java.lang.reflect.Array.newInstance(elementType, 0).javaClass
                } else {
                    throw NotSerializableException("Not able to deserialize array type: $name")
                }' @ [344:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'elementType' @ [344:21] ==> val elementType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.typeForName[LocalVariableDescriptor]

'elementType' @ [344:57] ==> val elementType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.typeForName[LocalVariableDescriptor]

'DeserializedGenericArrayType' @ [345:21] ==> public constructor DeserializedGenericArrayType(componentType: Type) defined in net.corda.nodeapi.internal.serialization.amqp.DeserializedGenericArrayType[ClassConstructorDescriptorImpl]

'elementType' @ [345:50] ==> val elementType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.typeForName[LocalVariableDescriptor]

'if (elementType is Class<*>) {
                    java.lang.reflect.Array.newInstance(elementType, 0).javaClass
                } else {
                    throw NotSerializableException("Not able to deserialize array type: $name")
                }' @ [346:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Class<(Any..Any?)>, elseBranch: Class<(Any..Any?)>): Class<(Any..Any?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Class<(kotlin.Any..kotlin.Any?)>

'elementType' @ [346:28] ==> val elementType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.typeForName[LocalVariableDescriptor]

'newInstance' @ [347:45] ==> public open fun newInstance(p0: (Class<*>..Class<*>?), p1: Int): (Any..Any?) defined in java.lang.reflect.Array[JavaMethodDescriptor]

'elementType' @ [347:57] ==> val elementType: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.typeForName[LocalVariableDescriptor]

'javaClass' @ [347:73] ==> public val <T : Any> (Any..Any?).javaClass: Class<(Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> (kotlin.Any..kotlin.Any?)

'NotSerializableException' @ [349:27] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'name' @ [349:90] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.typeForName[ValueParameterDescriptorImpl]

'if (name.endsWith("[p]")) {
                // There is no need to handle the ByteArray case as that type is coercible automatically
                // to the binary type and is thus handled by the main serializer and doesn't need a
                // special case for a primitive array of bytes
                when (name) {
                    "int[p]" -> IntArray::class.java
                    "char[p]" -> CharArray::class.java
                    "boolean[p]" -> BooleanArray::class.java
                    "float[p]" -> FloatArray::class.java
                    "double[p]" -> DoubleArray::class.java
                    "short[p]" -> ShortArray::class.java
                    "long[p]" -> LongArray::class.java
                    else -> throw NotSerializableException("Not able to deserialize array type: $name")
                }
            } else {
                DeserializedParameterizedType.make(name, classloader)
            }' @ [351:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'name' @ [351:24] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.typeForName[ValueParameterDescriptorImpl]

'endsWith' @ [351:29] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when (name) {
                    "int[p]" -> IntArray::class.java
                    "char[p]" -> CharArray::class.java
                    "boolean[p]" -> BooleanArray::class.java
                    "float[p]" -> FloatArray::class.java
                    "double[p]" -> DoubleArray::class.java
                    "short[p]" -> ShortArray::class.java
                    "long[p]" -> LongArray::class.java
                    else -> throw NotSerializableException("Not able to deserialize array type: $name")
                }' @ [355:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Class<out Any>, entry1: Class<out Any>, entry2: Class<out Any>, entry3: Class<out Any>, entry4: Class<out Any>, entry5: Class<out Any>, entry6: Class<out Any>, entry7: Class<out Any>): Class<out Any>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Class<out Any>

'name' @ [355:23] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.typeForName[ValueParameterDescriptorImpl]

'java' @ [356:49] ==> public val <T> KClass<IntArray>.java: Class<IntArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IntArray

'java' @ [357:51] ==> public val <T> KClass<CharArray>.java: Class<CharArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CharArray

'java' @ [358:57] ==> public val <T> KClass<BooleanArray>.java: Class<BooleanArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BooleanArray

'java' @ [359:53] ==> public val <T> KClass<FloatArray>.java: Class<FloatArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FloatArray

'java' @ [360:55] ==> public val <T> KClass<DoubleArray>.java: Class<DoubleArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DoubleArray

'java' @ [361:53] ==> public val <T> KClass<ShortArray>.java: Class<ShortArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ShortArray

'java' @ [362:51] ==> public val <T> KClass<LongArray>.java: Class<LongArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LongArray

'NotSerializableException' @ [363:35] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'name' @ [363:98] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.typeForName[ValueParameterDescriptorImpl]

'make' @ [366:47] ==> public final fun make(name: String, cl: ClassLoader = ...): Type defined in net.corda.nodeapi.internal.serialization.amqp.DeserializedParameterizedType.Companion[SimpleFunctionDescriptorImpl]

'name' @ [366:52] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.typeForName[ValueParameterDescriptorImpl]

'classloader' @ [366:58] ==> value-parameter classloader: ClassLoader defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion.typeForName[ValueParameterDescriptorImpl]

'arrayOf' @ [372:54] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Type): Array<Type> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Type

'Object' @ [372:62] ==> public constructor Object() defined in java.lang.Object[JavaClassConstructorDescriptor]

'java' @ [372:76] ==> public val <T> KClass<Object>.java: Class<Object> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Object

'emptyArray' @ [374:54] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<Type> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Type

