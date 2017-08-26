'annotationsByFqName' @ [57:51] ==> public abstract val annotationsByFqName: Map<FqName?, JavaAnnotation> defined in org.jetbrains.kotlin.load.java.structure.MapBasedJavaAnnotationOwner[PropertyDescriptorImpl]

'fqName' @ [57:71] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.java.structure.MapBasedJavaAnnotationOwner.findAnnotation[ValueParameterDescriptorImpl]

'lazy' @ [62:50] ==> public fun <T> lazy(initializer: () -> Map<FqName?, JavaAnnotation>): Lazy<Map<FqName?, JavaAnnotation>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<FqName?, JavaAnnotation>

'annotations' @ [63:5] ==> public abstract val annotations: Collection<JavaAnnotation> defined in org.jetbrains.kotlin.load.java.structure.JavaAnnotationOwner[PropertyDescriptorImpl]

'associateBy' @ [63:17] ==> public inline fun <T, K> Iterable<JavaAnnotation>.associateBy(keySelector: (JavaAnnotation) -> FqName?): Map<FqName?, JavaAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaAnnotation
    <K> -> FqName?

'it' @ [63:31] ==> value-parameter it: JavaAnnotation defined in org.jetbrains.kotlin.load.java.structure.buildLazyValueForMap.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'classId' @ [63:34] ==> public abstract val classId: ClassId? defined in org.jetbrains.kotlin.load.java.structure.JavaAnnotation[PropertyDescriptorImpl]

'asSingleFqName' @ [63:43] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

