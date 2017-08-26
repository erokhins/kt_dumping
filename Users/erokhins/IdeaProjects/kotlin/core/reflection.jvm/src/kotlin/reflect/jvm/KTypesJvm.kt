'JvmName' @ [17:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'SinceKotlin' @ [30:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'classifier' @ [32:13] ==> @SinceKotlin public abstract val classifier: KClassifier? defined in kotlin.reflect.KType[DeserializedPropertyDescriptor]

'jvmErasure' @ [32:25] ==> internal val KClassifier.jvmErasure: KClass<*> defined in kotlin.reflect.jvm in file KTypesJvm.kt[PropertyDescriptorImpl]

'KotlinReflectionInternalError' @ [32:45] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'this' @ [32:116] ==> <this> defined in kotlin.reflect.jvm.jvmErasure[ReceiverParameterDescriptorImpl]

'when (this) {
        is KClass<*> -> this
        is KTypeParameter -> {
            // See getRepresentativeUpperBound in typeSignatureMapping.kt
            val bounds = upperBounds
            val representativeBound = bounds.firstOrNull {
                val classDescriptor = (it as KTypeImpl).type.constructor.declarationDescriptor as? ClassDescriptor
                classDescriptor != null && classDescriptor.kind != INTERFACE && classDescriptor.kind != ANNOTATION_CLASS
            } ?: bounds.firstOrNull()
            representativeBound?.jvmErasure ?: Any::class
        }
        else -> throw KotlinReflectionInternalError("Cannot calculate JVM erasure for type: $this")
    }' @ [35:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KClass<*>, entry1: KClass<*>, entry2: KClass<*>): KClass<*>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KClass<*>

'this' @ [35:19] ==> <this> defined in kotlin.reflect.jvm.jvmErasure[ReceiverParameterDescriptorImpl]

'this' @ [36:25] ==> <this> defined in kotlin.reflect.jvm.jvmErasure[ReceiverParameterDescriptorImpl]

'upperBounds' @ [39:26] ==> public abstract val upperBounds: List<KType> defined in kotlin.reflect.KTypeParameter[DeserializedPropertyDescriptor]

'bounds' @ [40:39] ==> val bounds: List<KType> defined in kotlin.reflect.jvm.<get-jvmErasure>[LocalVariableDescriptor]

'firstOrNull' @ [40:46] ==> public inline fun <T> Iterable<KType>.firstOrNull(predicate: (KType) -> Boolean): KType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KType

'it' @ [41:40] ==> value-parameter it: KType defined in kotlin.reflect.jvm.<get-jvmErasure>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [41:57] ==> public final val type: KotlinType defined in kotlin.reflect.jvm.internal.KTypeImpl[PropertyDescriptorImpl]

'constructor' @ [41:62] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [41:74] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'classDescriptor' @ [42:17] ==> val classDescriptor: ClassDescriptor? defined in kotlin.reflect.jvm.<get-jvmErasure>.<anonymous>[LocalVariableDescriptor]

'classDescriptor' @ [42:44] ==> val classDescriptor: ClassDescriptor? defined in kotlin.reflect.jvm.<get-jvmErasure>.<anonymous>[LocalVariableDescriptor]

'kind' @ [42:60] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [42:68] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'classDescriptor' @ [42:81] ==> val classDescriptor: ClassDescriptor? defined in kotlin.reflect.jvm.<get-jvmErasure>.<anonymous>[LocalVariableDescriptor]

'kind' @ [42:97] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ANNOTATION_CLASS' @ [42:105] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'bounds' @ [43:18] ==> val bounds: List<KType> defined in kotlin.reflect.jvm.<get-jvmErasure>[LocalVariableDescriptor]

'firstOrNull' @ [43:25] ==> public fun <T> List<KType>.firstOrNull(): KType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KType

'representativeBound' @ [44:13] ==> val representativeBound: KType? defined in kotlin.reflect.jvm.<get-jvmErasure>[LocalVariableDescriptor]

'jvmErasure' @ [44:34] ==> @SinceKotlin public val KType.jvmErasure: KClass<*> defined in kotlin.reflect.jvm in file KTypesJvm.kt[PropertyDescriptorImpl]

'Any' @ [44:48] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'KotlinReflectionInternalError' @ [46:23] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'this' @ [46:94] ==> <this> defined in kotlin.reflect.jvm.jvmErasure[ReceiverParameterDescriptorImpl]

