'getValue' @ [42:36] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (Type..Type?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [42:54] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (Type..Type?)): ReflectProperties.LazySoftVal<(Type..Type?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Type

'computeJavaType' @ [42:63] ==> value-parameter computeJavaType: () -> Type defined in kotlin.reflect.jvm.internal.KTypeImpl.<init>[ValueParameterDescriptorImpl]

'getValue' @ [44:46] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (KClassifier..KClassifier?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [44:64] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (KClassifier..KClassifier?)): ReflectProperties.LazySoftVal<(KClassifier..KClassifier?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KClassifier

'convert' @ [44:75] ==> private final fun convert(type: KotlinType): KClassifier? defined in kotlin.reflect.jvm.internal.KTypeImpl[SimpleFunctionDescriptorImpl]

'type' @ [44:83] ==> public final val type: KotlinType defined in kotlin.reflect.jvm.internal.KTypeImpl[PropertyDescriptorImpl]

'type' @ [47:26] ==> value-parameter type: KotlinType defined in kotlin.reflect.jvm.internal.KTypeImpl.convert[ValueParameterDescriptorImpl]

'constructor' @ [47:31] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [47:43] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'when (descriptor) {
            is ClassDescriptor -> {
                val jClass = descriptor.toJavaClass() ?: return null
                if (jClass.isArray) {
                    // There may be no argument if it's a primitive array (such as IntArray)
                    val argument = type.arguments.singleOrNull()?.type ?: return KClassImpl(jClass)
                    val elementClassifier =
                            convert(argument)
                            ?: throw KotlinReflectionInternalError("Cannot determine classifier for array element type: $this")
                    return KClassImpl(elementClassifier.jvmErasure.java.createArrayType())
                }

                if (!TypeUtils.isNullableType(type)) {
                    val jClass1: Class<*> = jClass.primitiveByWrapper ?: jClass
                    return KClassImpl(jClass1)
                }

                return KClassImpl(jClass)
            }
            is TypeParameterDescriptor -> return KTypeParameterImpl(descriptor)
            is TypeAliasDescriptor -> TODO("Type alias classifiers are not yet supported")
            else -> return null
        }' @ [48:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing, entry3: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'descriptor' @ [48:15] ==> val descriptor: ClassifierDescriptor? defined in kotlin.reflect.jvm.internal.KTypeImpl.convert[LocalVariableDescriptor]

'descriptor' @ [50:30] ==> val descriptor: ClassifierDescriptor? defined in kotlin.reflect.jvm.internal.KTypeImpl.convert[LocalVariableDescriptor]

'toJavaClass' @ [50:41] ==> internal fun ClassDescriptor.toJavaClass(): Class<*>? defined in kotlin.reflect.jvm.internal in file util.kt[SimpleFunctionDescriptorImpl]

'jClass' @ [51:21] ==> val jClass: Class<out (Any..Any?)> defined in kotlin.reflect.jvm.internal.KTypeImpl.convert[LocalVariableDescriptor]

'isArray' @ [51:28] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isArray: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'type' @ [53:36] ==> value-parameter type: KotlinType defined in kotlin.reflect.jvm.internal.KTypeImpl.convert[ValueParameterDescriptorImpl]

'arguments' @ [53:41] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'singleOrNull' @ [53:51] ==> public fun <T> List<TypeProjection>.singleOrNull(): TypeProjection? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'type' @ [53:67] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'KClassImpl' @ [53:82] ==> public constructor KClassImpl<T : Any>(jClass: Class<out (Any..Any?)>) defined in kotlin.reflect.jvm.internal.KClassImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> (kotlin.Any..kotlin.Any?)

'jClass' @ [53:93] ==> val jClass: Class<out (Any..Any?)> defined in kotlin.reflect.jvm.internal.KTypeImpl.convert[LocalVariableDescriptor]

'convert' @ [55:29] ==> private final fun convert(type: KotlinType): KClassifier? defined in kotlin.reflect.jvm.internal.KTypeImpl[SimpleFunctionDescriptorImpl]

'argument' @ [55:37] ==> val argument: KotlinType defined in kotlin.reflect.jvm.internal.KTypeImpl.convert[LocalVariableDescriptor]

'KotlinReflectionInternalError' @ [56:38] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'this' @ [56:122] ==> <this> defined in kotlin.reflect.jvm.internal.KTypeImpl[LazyClassReceiverParameterDescriptor]

'KClassImpl' @ [57:28] ==> public constructor KClassImpl<T : Any>(jClass: Class<out (Any..Any?)>) defined in kotlin.reflect.jvm.internal.KClassImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> (kotlin.Any..kotlin.Any?)

'elementClassifier' @ [57:39] ==> val elementClassifier: KClassifier defined in kotlin.reflect.jvm.internal.KTypeImpl.convert[LocalVariableDescriptor]

'jvmErasure' @ [57:57] ==> internal val KClassifier.jvmErasure: KClass<*> defined in kotlin.reflect.jvm in file KTypesJvm.kt[PropertyDescriptorImpl]

'java' @ [57:68] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'createArrayType' @ [57:73] ==> public fun Class<*>.createArrayType(): Class<*> defined in org.jetbrains.kotlin.load.java.structure.reflect in file reflectClassUtil.kt[SimpleFunctionDescriptorImpl]

'!' @ [60:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNullableType' @ [60:32] ==> public open fun isNullableType(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'type' @ [60:47] ==> value-parameter type: KotlinType defined in kotlin.reflect.jvm.internal.KTypeImpl.convert[ValueParameterDescriptorImpl]

'jClass' @ [61:45] ==> val jClass: Class<out (Any..Any?)> defined in kotlin.reflect.jvm.internal.KTypeImpl.convert[LocalVariableDescriptor]

'primitiveByWrapper' @ [61:52] ==> public val Class<*>.primitiveByWrapper: Class<*>? defined in org.jetbrains.kotlin.load.java.structure.reflect in file reflectClassUtil.kt[PropertyDescriptorImpl]

'jClass' @ [61:74] ==> val jClass: Class<out (Any..Any?)> defined in kotlin.reflect.jvm.internal.KTypeImpl.convert[LocalVariableDescriptor]

'KClassImpl' @ [62:28] ==> public constructor KClassImpl<T : Any>(jClass: Class<out (Any..Any?)>) defined in kotlin.reflect.jvm.internal.KClassImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> (kotlin.Any..kotlin.Any?)

'jClass1' @ [62:39] ==> val jClass1: Class<*> defined in kotlin.reflect.jvm.internal.KTypeImpl.convert[LocalVariableDescriptor]

'KClassImpl' @ [65:24] ==> public constructor KClassImpl<T : Any>(jClass: Class<out (Any..Any?)>) defined in kotlin.reflect.jvm.internal.KClassImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> (kotlin.Any..kotlin.Any?)

'jClass' @ [65:35] ==> val jClass: Class<out (Any..Any?)> defined in kotlin.reflect.jvm.internal.KTypeImpl.convert[LocalVariableDescriptor]

'KTypeParameterImpl' @ [67:50] ==> public constructor KTypeParameterImpl(descriptor: TypeParameterDescriptor) defined in kotlin.reflect.jvm.internal.KTypeParameterImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [67:69] ==> val descriptor: ClassifierDescriptor? defined in kotlin.reflect.jvm.internal.KTypeImpl.convert[LocalVariableDescriptor]

'TODO' @ [68:39] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'getValue' @ [73:54] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (List<KTypeProjection>..List<KTypeProjection>?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [73:72] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (List<KTypeProjection>..List<KTypeProjection>?)): ReflectProperties.LazySoftVal<(List<KTypeProjection>..List<KTypeProjection>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<KTypeProjection>

'type' @ [74:29] ==> public final val type: KotlinType defined in kotlin.reflect.jvm.internal.KTypeImpl[PropertyDescriptorImpl]

'arguments' @ [74:34] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'typeArguments' @ [75:13] ==> val typeArguments: List<TypeProjection> defined in kotlin.reflect.jvm.internal.KTypeImpl.arguments.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [75:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [75:55] ==> public fun <T> emptyList(): List<KTypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KTypeProjection

'lazy' @ [77:43] ==> public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> List<Type>): Lazy<List<Type>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Type>

'PUBLICATION' @ [77:48] ==> enum entry PUBLICATION defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'javaType' @ [77:63] ==> internal final val javaType: Type defined in kotlin.reflect.jvm.internal.KTypeImpl[PropertyDescriptorImpl]

'parameterizedTypeArguments' @ [77:72] ==> public val Type.parameterizedTypeArguments: List<Type> defined in org.jetbrains.kotlin.load.java.structure.reflect in file reflectClassUtil.kt[PropertyDescriptorImpl]

'typeArguments' @ [79:9] ==> val typeArguments: List<TypeProjection> defined in kotlin.reflect.jvm.internal.KTypeImpl.arguments.<anonymous>[LocalVariableDescriptor]

'mapIndexed' @ [79:23] ==> public inline fun <T, R> Iterable<TypeProjection>.mapIndexed(transform: (index: Int, TypeProjection) -> KTypeProjection): List<KTypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> KTypeProjection

'if (typeProjection.isStarProjection) {
                KTypeProjection.STAR
            }
            else {
                val type = KTypeImpl(typeProjection.type) {
                    val javaType = javaType
                    when (javaType) {
                        is Class<*> -> {
                            // It's either an array or a raw type.
                            // TODO: return upper bound of the corresponding parameter for a raw type?
                            if (javaType.isArray) javaType.componentType else Any::class.java
                        }
                        is GenericArrayType -> {
                            if (i != 0) throw KotlinReflectionInternalError("Array type has been queried for a non-0th argument: $this")
                            javaType.genericComponentType
                        }
                        is ParameterizedType -> {
                            val argument = parameterizedTypeArguments[i]
                            // In "Foo<out Bar>", the JVM type of the first type argument should be "Bar", not "? extends Bar"
                            if (argument !is WildcardType) argument
                            else argument.lowerBounds.firstOrNull() ?: argument.upperBounds.first()
                        }
                        else -> throw KotlinReflectionInternalError("Non-generic type has been queried for arguments: $this")
                    }
                }
                when (typeProjection.projectionKind) {
                    Variance.INVARIANT -> KTypeProjection.invariant(type)
                    Variance.IN_VARIANCE -> KTypeProjection.contravariant(type)
                    Variance.OUT_VARIANCE -> KTypeProjection.covariant(type)
                }
            }' @ [80:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KTypeProjection, elseBranch: KTypeProjection): KTypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KTypeProjection

'typeProjection' @ [80:17] ==> value-parameter typeProjection: TypeProjection defined in kotlin.reflect.jvm.internal.KTypeImpl.arguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isStarProjection' @ [80:32] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'KTypeProjection' @ [81:17] ==> public companion object defined in kotlin.reflect.KTypeProjection[FakeCallableDescriptorForObject]

'STAR' @ [81:33] ==> public final val STAR: KTypeProjection defined in kotlin.reflect.KTypeProjection.Companion[DeserializedPropertyDescriptor]

'KTypeImpl' @ [84:28] ==> public constructor KTypeImpl(type: KotlinType, computeJavaType: () -> Type) defined in kotlin.reflect.jvm.internal.KTypeImpl[ClassConstructorDescriptorImpl]

'typeProjection' @ [84:38] ==> value-parameter typeProjection: TypeProjection defined in kotlin.reflect.jvm.internal.KTypeImpl.arguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [84:53] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'javaType' @ [85:36] ==> internal final val javaType: Type defined in kotlin.reflect.jvm.internal.KTypeImpl[PropertyDescriptorImpl]

'when (javaType) {
                        is Class<*> -> {
                            // It's either an array or a raw type.
                            // TODO: return upper bound of the corresponding parameter for a raw type?
                            if (javaType.isArray) javaType.componentType else Any::class.java
                        }
                        is GenericArrayType -> {
                            if (i != 0) throw KotlinReflectionInternalError("Array type has been queried for a non-0th argument: $this")
                            javaType.genericComponentType
                        }
                        is ParameterizedType -> {
                            val argument = parameterizedTypeArguments[i]
                            // In "Foo<out Bar>", the JVM type of the first type argument should be "Bar", not "? extends Bar"
                            if (argument !is WildcardType) argument
                            else argument.lowerBounds.firstOrNull() ?: argument.upperBounds.first()
                        }
                        else -> throw KotlinReflectionInternalError("Non-generic type has been queried for arguments: $this")
                    }' @ [86:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Type, entry1: Type, entry2: Type, entry3: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type

'javaType' @ [86:27] ==> val javaType: Type defined in kotlin.reflect.jvm.internal.KTypeImpl.arguments.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'if (javaType.isArray) javaType.componentType else Any::class.java' @ [90:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Class<out Any>, elseBranch: Class<out Any>): Class<out Any>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Class<out Any>

'javaType' @ [90:33] ==> val javaType: Type defined in kotlin.reflect.jvm.internal.KTypeImpl.arguments.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isArray' @ [90:42] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isArray: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'javaType' @ [90:51] ==> val javaType: Type defined in kotlin.reflect.jvm.internal.KTypeImpl.arguments.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'componentType' @ [90:60] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.componentType: (Class<*>..Class<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'Any' @ [90:79] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'java' @ [90:90] ==> public val <T> KClass<Any>.java: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'i' @ [93:33] ==> value-parameter i: Int defined in kotlin.reflect.jvm.internal.KTypeImpl.arguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'KotlinReflectionInternalError' @ [93:47] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'this' @ [93:131] ==> <this> defined in kotlin.reflect.jvm.internal.KTypeImpl[LazyClassReceiverParameterDescriptor]

'javaType' @ [94:29] ==> val javaType: Type defined in kotlin.reflect.jvm.internal.KTypeImpl.arguments.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'genericComponentType' @ [94:38] ==> public final val GenericArrayType.genericComponentType: (Type..Type?)[MyPropertyDescriptor]

'parameterizedTypeArguments' @ [97:44] ==> val parameterizedTypeArguments: List<Type> defined in kotlin.reflect.jvm.internal.KTypeImpl.arguments.<anonymous>[LocalVariableDescriptor]

'i' @ [97:71] ==> value-parameter i: Int defined in kotlin.reflect.jvm.internal.KTypeImpl.arguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (argument !is WildcardType) argument
                            else argument.lowerBounds.firstOrNull() ?: argument.upperBounds.first()' @ [99:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'argument' @ [99:33] ==> val argument: Type defined in kotlin.reflect.jvm.internal.KTypeImpl.arguments.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'argument' @ [99:60] ==> val argument: Type defined in kotlin.reflect.jvm.internal.KTypeImpl.arguments.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'argument' @ [100:34] ==> val argument: Type defined in kotlin.reflect.jvm.internal.KTypeImpl.arguments.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'lowerBounds' @ [100:43] ==> public final val WildcardType.lowerBounds: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'firstOrNull' @ [100:55] ==> public fun <T> Array<out (Type..Type?)>.firstOrNull(): Type? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'argument' @ [100:72] ==> val argument: Type defined in kotlin.reflect.jvm.internal.KTypeImpl.arguments.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'upperBounds' @ [100:81] ==> public final val WildcardType.upperBounds: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'first' @ [100:93] ==> public fun <T> Array<out (Type..Type?)>.first(): (Type..Type?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'KotlinReflectionInternalError' @ [102:39] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'this' @ [102:120] ==> <this> defined in kotlin.reflect.jvm.internal.KTypeImpl[LazyClassReceiverParameterDescriptor]

'when (typeProjection.projectionKind) {
                    Variance.INVARIANT -> KTypeProjection.invariant(type)
                    Variance.IN_VARIANCE -> KTypeProjection.contravariant(type)
                    Variance.OUT_VARIANCE -> KTypeProjection.covariant(type)
                }' @ [105:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KTypeProjection, entry1: KTypeProjection, entry2: KTypeProjection): KTypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KTypeProjection

'typeProjection' @ [105:23] ==> value-parameter typeProjection: TypeProjection defined in kotlin.reflect.jvm.internal.KTypeImpl.arguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'projectionKind' @ [105:38] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'INVARIANT' @ [106:30] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'KTypeProjection' @ [106:43] ==> public companion object defined in kotlin.reflect.KTypeProjection[FakeCallableDescriptorForObject]

'invariant' @ [106:59] ==> public final fun invariant(type: KType): KTypeProjection defined in kotlin.reflect.KTypeProjection.Companion[DeserializedSimpleFunctionDescriptor]

'type' @ [106:69] ==> val type: KTypeImpl defined in kotlin.reflect.jvm.internal.KTypeImpl.arguments.<anonymous>.<anonymous>[LocalVariableDescriptor]

'IN_VARIANCE' @ [107:30] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'KTypeProjection' @ [107:45] ==> public companion object defined in kotlin.reflect.KTypeProjection[FakeCallableDescriptorForObject]

'contravariant' @ [107:61] ==> public final fun contravariant(type: KType): KTypeProjection defined in kotlin.reflect.KTypeProjection.Companion[DeserializedSimpleFunctionDescriptor]

'type' @ [107:75] ==> val type: KTypeImpl defined in kotlin.reflect.jvm.internal.KTypeImpl.arguments.<anonymous>.<anonymous>[LocalVariableDescriptor]

'OUT_VARIANCE' @ [108:30] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'KTypeProjection' @ [108:46] ==> public companion object defined in kotlin.reflect.KTypeProjection[FakeCallableDescriptorForObject]

'covariant' @ [108:62] ==> public final fun covariant(type: KType): KTypeProjection defined in kotlin.reflect.KTypeProjection.Companion[DeserializedSimpleFunctionDescriptor]

'type' @ [108:72] ==> val type: KTypeImpl defined in kotlin.reflect.jvm.internal.KTypeImpl.arguments.<anonymous>.<anonymous>[LocalVariableDescriptor]

'type' @ [115:17] ==> public final val type: KotlinType defined in kotlin.reflect.jvm.internal.KTypeImpl[PropertyDescriptorImpl]

'isMarkedNullable' @ [115:22] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'other' @ [118:13] ==> value-parameter other: Any? defined in kotlin.reflect.jvm.internal.KTypeImpl.equals[ValueParameterDescriptorImpl]

'type' @ [118:35] ==> public final val type: KotlinType defined in kotlin.reflect.jvm.internal.KTypeImpl[PropertyDescriptorImpl]

'other' @ [118:43] ==> value-parameter other: Any? defined in kotlin.reflect.jvm.internal.KTypeImpl.equals[ValueParameterDescriptorImpl]

'type' @ [118:49] ==> public final val type: KotlinType defined in kotlin.reflect.jvm.internal.KTypeImpl[PropertyDescriptorImpl]

'type' @ [121:13] ==> public final val type: KotlinType defined in kotlin.reflect.jvm.internal.KTypeImpl[PropertyDescriptorImpl]

'hashCode' @ [121:18] ==> public final fun hashCode(): Int defined in org.jetbrains.kotlin.types.KotlinType[SimpleFunctionDescriptorImpl]

'ReflectionObjectRenderer' @ [124:13] ==> internal object ReflectionObjectRenderer defined in kotlin.reflect.jvm.internal in file ReflectionObjectRenderer.kt[FakeCallableDescriptorForObject]

'renderType' @ [124:38] ==> public final fun renderType(type: KotlinType): String defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[SimpleFunctionDescriptorImpl]

'type' @ [124:49] ==> public final val type: KotlinType defined in kotlin.reflect.jvm.internal.KTypeImpl[PropertyDescriptorImpl]

