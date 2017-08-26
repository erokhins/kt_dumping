'storageManager' @ [30:32] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotations.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [30:47] ==> public abstract fun <T : Any> createLazyValue(computable: () -> List<AnnotationDescriptor>): NotNullLazyValue<List<AnnotationDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> List<AnnotationDescriptor>

'compute' @ [30:63] ==> value-parameter compute: () -> List<AnnotationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotations.<init>[ValueParameterDescriptorImpl]

'annotations' @ [32:39] ==> private final val annotations: List<AnnotationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotations[PropertyDescriptorImpl]

'isEmpty' @ [32:51] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [34:80] ==> public fun <T> emptyList(): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'annotations' @ [36:68] ==> private final val annotations: List<AnnotationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotations[PropertyDescriptorImpl]

'map' @ [36:80] ==> public inline fun <T, R> Iterable<AnnotationDescriptor>.map(transform: (AnnotationDescriptor) -> AnnotationWithTarget): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor
    <R> -> AnnotationWithTarget

'AnnotationWithTarget' @ [36:86] ==> public constructor AnnotationWithTarget(annotation: AnnotationDescriptor, target: AnnotationUseSiteTarget?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedClassConstructorDescriptor]

'it' @ [36:107] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotations.getAllAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'annotations' @ [38:63] ==> private final val annotations: List<AnnotationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotations[PropertyDescriptorImpl]

'iterator' @ [38:75] ==> public abstract fun iterator(): Iterator<AnnotationDescriptor> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'DeserializedAnnotations' @ [44:5] ==> public constructor DeserializedAnnotations(storageManager: StorageManager, compute: () -> List<AnnotationDescriptor>) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotations[ClassConstructorDescriptorImpl]

'storageManager' @ [44:29] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations.<init>[ValueParameterDescriptorImpl]

'compute' @ [44:45] ==> value-parameter compute: () -> List<AnnotationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [52:32] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotationsWithPossibleTargets.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [52:47] ==> public abstract fun <T : Any> createLazyValue(computable: () -> List<AnnotationWithTarget>): NotNullLazyValue<List<AnnotationWithTarget>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> List<AnnotationWithTarget>

'compute' @ [52:63] ==> value-parameter compute: () -> List<AnnotationWithTarget> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotationsWithPossibleTargets.<init>[ValueParameterDescriptorImpl]

'annotations' @ [54:39] ==> private final val annotations: List<AnnotationWithTarget> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotationsWithPossibleTargets[PropertyDescriptorImpl]

'isEmpty' @ [54:51] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'annotations' @ [57:13] ==> private final val annotations: List<AnnotationWithTarget> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotationsWithPossibleTargets[PropertyDescriptorImpl]

'firstOrNull' @ [57:25] ==> public inline fun <T> Iterable<AnnotationWithTarget>.firstOrNull(predicate: (AnnotationWithTarget) -> Boolean): AnnotationWithTarget? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'component1' @ [57:40] ==> public final operator fun component1(): AnnotationDescriptor defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedSimpleFunctionDescriptor]

'component2' @ [57:52] ==> public final operator fun component2(): AnnotationUseSiteTarget? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedSimpleFunctionDescriptor]

'target' @ [57:63] ==> val target: AnnotationUseSiteTarget? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotationsWithPossibleTargets.findAnnotation.<anonymous>[LocalVariableDescriptor]

'annotation' @ [57:81] ==> val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotationsWithPossibleTargets.findAnnotation.<anonymous>[LocalVariableDescriptor]

'fqName' @ [57:92] ==> public open val fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'fqName' @ [57:102] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotationsWithPossibleTargets.findAnnotation[ValueParameterDescriptorImpl]

'annotation' @ [57:112] ==> public final val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedPropertyDescriptor]

'annotations' @ [59:80] ==> private final val annotations: List<AnnotationWithTarget> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotationsWithPossibleTargets[PropertyDescriptorImpl]

'filter' @ [59:92] ==> public inline fun <T> Iterable<AnnotationWithTarget>.filter(predicate: (AnnotationWithTarget) -> Boolean): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'it' @ [59:101] ==> value-parameter it: AnnotationWithTarget defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotationsWithPossibleTargets.getUseSiteTargetedAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'target' @ [59:104] ==> public final val target: AnnotationUseSiteTarget? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedPropertyDescriptor]

'annotations' @ [61:68] ==> private final val annotations: List<AnnotationWithTarget> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotationsWithPossibleTargets[PropertyDescriptorImpl]

'annotations' @ [64:16] ==> private final val annotations: List<AnnotationWithTarget> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotationsWithPossibleTargets[PropertyDescriptorImpl]

'asSequence' @ [64:28] ==> public fun <T> Iterable<AnnotationWithTarget>.asSequence(): Sequence<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'filter' @ [64:41] ==> public fun <T> Sequence<AnnotationWithTarget>.filter(predicate: (AnnotationWithTarget) -> Boolean): Sequence<AnnotationWithTarget> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'it' @ [64:50] ==> value-parameter it: AnnotationWithTarget defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotationsWithPossibleTargets.iterator.<anonymous>[ValueParameterDescriptorImpl]

'target' @ [64:53] ==> public final val target: AnnotationUseSiteTarget? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedPropertyDescriptor]

'map' @ [64:70] ==> public fun <T, R> Sequence<AnnotationWithTarget>.map(transform: (AnnotationWithTarget) -> AnnotationDescriptor): Sequence<AnnotationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget
    <R> -> AnnotationDescriptor

'it' @ [64:76] ==> value-parameter it: AnnotationWithTarget defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotationsWithPossibleTargets.iterator.<anonymous>[ValueParameterDescriptorImpl]

'annotation' @ [64:79] ==> public final val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedPropertyDescriptor]

'iterator' @ [64:92] ==> public abstract operator fun iterator(): Iterator<AnnotationDescriptor> defined in kotlin.sequences.Sequence[DeserializedSimpleFunctionDescriptor]

'DeserializedAnnotationsWithPossibleTargets' @ [71:5] ==> public constructor DeserializedAnnotationsWithPossibleTargets(storageManager: StorageManager, compute: () -> List<AnnotationWithTarget>) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotationsWithPossibleTargets[ClassConstructorDescriptorImpl]

'storageManager' @ [71:48] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotationsWithPossibleTargets.<init>[ValueParameterDescriptorImpl]

'compute' @ [71:64] ==> value-parameter compute: () -> List<AnnotationWithTarget> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotationsWithPossibleTargets.<init>[ValueParameterDescriptorImpl]

