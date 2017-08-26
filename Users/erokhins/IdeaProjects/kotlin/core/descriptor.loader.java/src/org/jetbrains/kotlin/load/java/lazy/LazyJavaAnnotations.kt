'c' @ [31:41] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations[PropertyDescriptorImpl]

'components' @ [31:43] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'storageManager' @ [31:54] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'createMemoizedFunctionWithNullableValues' @ [31:69] ==> public abstract fun <K, V : Any> createMemoizedFunctionWithNullableValues(compute: (JavaAnnotation) -> AnnotationDescriptor?): MemoizedFunctionToNullable<JavaAnnotation, AnnotationDescriptor> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> JavaAnnotation
    <V : Any> -> AnnotationDescriptor

'JavaAnnotationMapper' @ [32:39] ==> public object JavaAnnotationMapper defined in org.jetbrains.kotlin.load.java.components in file JavaAnnotationMapper.kt[FakeCallableDescriptorForObject]

'mapOrResolveJavaAnnotation' @ [32:60] ==> public final fun mapOrResolveJavaAnnotation(annotation: JavaAnnotation, c: LazyJavaResolverContext): AnnotationDescriptor? defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[SimpleFunctionDescriptorImpl]

'annotation' @ [32:87] ==> value-parameter annotation: JavaAnnotation defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations.annotationDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [32:99] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations[PropertyDescriptorImpl]

'annotationOwner' @ [36:13] ==> private final val annotationOwner: JavaAnnotationOwner defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations[PropertyDescriptorImpl]

'findAnnotation' @ [36:29] ==> public abstract fun findAnnotation(fqName: FqName): JavaAnnotation? defined in org.jetbrains.kotlin.load.java.structure.JavaAnnotationOwner[SimpleFunctionDescriptorImpl]

'fqName' @ [36:44] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations.findAnnotation[ValueParameterDescriptorImpl]

'let' @ [36:53] ==> @InlineOnly public inline fun <T, R> JavaAnnotation.let(block: (JavaAnnotation) -> AnnotationDescriptor?): AnnotationDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaAnnotation
    <R> -> AnnotationDescriptor?

'annotationDescriptors' @ [36:57] ==> private final val annotationDescriptors: MemoizedFunctionToNullable<JavaAnnotation, AnnotationDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations[PropertyDescriptorImpl]

'JavaAnnotationMapper' @ [37:16] ==> public object JavaAnnotationMapper defined in org.jetbrains.kotlin.load.java.components in file JavaAnnotationMapper.kt[FakeCallableDescriptorForObject]

'findMappedJavaAnnotation' @ [37:37] ==> public final fun findMappedJavaAnnotation(kotlinName: FqName, annotationOwner: JavaAnnotationOwner, c: LazyJavaResolverContext): AnnotationDescriptor? defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[SimpleFunctionDescriptorImpl]

'fqName' @ [37:62] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations.findAnnotation[ValueParameterDescriptorImpl]

'annotationOwner' @ [37:70] ==> private final val annotationOwner: JavaAnnotationOwner defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations[PropertyDescriptorImpl]

'c' @ [37:87] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations[PropertyDescriptorImpl]

'c' @ [40:13] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations[PropertyDescriptorImpl]

'components' @ [40:15] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'externalAnnotationResolver' @ [40:26] ==> public final val externalAnnotationResolver: ExternalAnnotationResolver defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'findExternalAnnotation' @ [40:53] ==> @Nullable public abstract fun findExternalAnnotation(@NotNull owner: JavaAnnotationOwner, @NotNull fqName: FqName): JavaAnnotation? defined in org.jetbrains.kotlin.load.java.components.ExternalAnnotationResolver[JavaMethodDescriptor]

'annotationOwner' @ [40:76] ==> private final val annotationOwner: JavaAnnotationOwner defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations[PropertyDescriptorImpl]

'fqName' @ [40:93] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations.findExternalAnnotation[ValueParameterDescriptorImpl]

'let' @ [40:102] ==> @InlineOnly public inline fun <T, R> JavaAnnotation.let(block: (JavaAnnotation) -> AnnotationDescriptor?): AnnotationDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaAnnotation
    <R> -> AnnotationDescriptor?

'annotationDescriptors' @ [40:106] ==> private final val annotationDescriptors: MemoizedFunctionToNullable<JavaAnnotation, AnnotationDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations[PropertyDescriptorImpl]

'emptyList' @ [42:52] ==> public fun <T> emptyList(): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'this' @ [44:40] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations[LazyClassReceiverParameterDescriptor]

'map' @ [44:45] ==> public inline fun <T, R> Iterable<AnnotationDescriptor>.map(transform: (AnnotationDescriptor) -> AnnotationWithTarget): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor
    <R> -> AnnotationWithTarget

'AnnotationWithTarget' @ [44:51] ==> public constructor AnnotationWithTarget(annotation: AnnotationDescriptor, target: AnnotationUseSiteTarget?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[ClassConstructorDescriptorImpl]

'it' @ [44:72] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations.getAllAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'annotationOwner' @ [47:14] ==> private final val annotationOwner: JavaAnnotationOwner defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations[PropertyDescriptorImpl]

'annotations' @ [47:30] ==> public abstract val annotations: Collection<JavaAnnotation> defined in org.jetbrains.kotlin.load.java.structure.JavaAnnotationOwner[PropertyDescriptorImpl]

'asSequence' @ [47:42] ==> public fun <T> Iterable<JavaAnnotation>.asSequence(): Sequence<JavaAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaAnnotation

'map' @ [47:55] ==> public fun <T, R> Sequence<JavaAnnotation>.map(transform: (JavaAnnotation) -> AnnotationDescriptor?): Sequence<AnnotationDescriptor?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaAnnotation
    <R> -> AnnotationDescriptor?

'annotationDescriptors' @ [47:59] ==> private final val annotationDescriptors: MemoizedFunctionToNullable<JavaAnnotation, AnnotationDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations[PropertyDescriptorImpl]

'JavaAnnotationMapper' @ [48:16] ==> public object JavaAnnotationMapper defined in org.jetbrains.kotlin.load.java.components in file JavaAnnotationMapper.kt[FakeCallableDescriptorForObject]

'findMappedJavaAnnotation' @ [48:37] ==> public final fun findMappedJavaAnnotation(kotlinName: FqName, annotationOwner: JavaAnnotationOwner, c: LazyJavaResolverContext): AnnotationDescriptor? defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[SimpleFunctionDescriptorImpl]

'FQ_NAMES' @ [48:77] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'deprecated' @ [48:86] ==> public final val deprecated: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'annotationOwner' @ [48:98] ==> private final val annotationOwner: JavaAnnotationOwner defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations[PropertyDescriptorImpl]

'c' @ [48:115] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations[PropertyDescriptorImpl]

'filterNotNull' @ [48:119] ==> public fun <T : Any> Sequence<AnnotationDescriptor?>.filterNotNull(): Sequence<AnnotationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> AnnotationDescriptor

'iterator' @ [48:135] ==> public abstract operator fun iterator(): Iterator<AnnotationDescriptor> defined in kotlin.sequences.Sequence[DeserializedSimpleFunctionDescriptor]

'!' @ [50:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'iterator' @ [50:31] ==> public open fun iterator(): Iterator<AnnotationDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations[SimpleFunctionDescriptorImpl]

'hasNext' @ [50:42] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'LazyJavaAnnotations' @ [54:11] ==> public constructor LazyJavaAnnotations(c: LazyJavaResolverContext, annotationOwner: JavaAnnotationOwner) defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations[ClassConstructorDescriptorImpl]

'this' @ [54:31] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.resolveAnnotations[ReceiverParameterDescriptorImpl]

'annotationsOwner' @ [54:37] ==> value-parameter annotationsOwner: JavaAnnotationOwner defined in org.jetbrains.kotlin.load.java.lazy.resolveAnnotations[ValueParameterDescriptorImpl]

