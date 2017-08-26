'element' @ [27:17] ==> public abstract val element: AnnotatedElement? defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationOwner[PropertyDescriptorImpl]

'declaredAnnotations' @ [27:26] ==> public final val AnnotatedElement.declaredAnnotations: (Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)[MyPropertyDescriptor]

'getAnnotations' @ [27:47] ==> public fun Array<Annotation>.getAnnotations(): List<ReflectJavaAnnotation> defined in org.jetbrains.kotlin.load.java.structure.reflect[SimpleFunctionDescriptorImpl]

'emptyList' @ [27:67] ==> public fun <T> emptyList(): List<ReflectJavaAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReflectJavaAnnotation

'element' @ [30:13] ==> public abstract val element: AnnotatedElement? defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationOwner[PropertyDescriptorImpl]

'declaredAnnotations' @ [30:22] ==> public final val AnnotatedElement.declaredAnnotations: (Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)[MyPropertyDescriptor]

'findAnnotation' @ [30:43] ==> public fun Array<Annotation>.findAnnotation(fqName: FqName): ReflectJavaAnnotation? defined in org.jetbrains.kotlin.load.java.structure.reflect[SimpleFunctionDescriptorImpl]

'fqName' @ [30:58] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationOwner.findAnnotation[ValueParameterDescriptorImpl]

'map' @ [37:12] ==> public inline fun <T, R> Array<out Annotation>.map(transform: (Annotation) -> ReflectJavaAnnotation): List<ReflectJavaAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation
    <R> -> ReflectJavaAnnotation

'firstOrNull' @ [41:12] ==> public inline fun <T> Array<out Annotation>.firstOrNull(predicate: (Annotation) -> Boolean): Annotation? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation

'it' @ [41:26] ==> value-parameter it: Annotation defined in org.jetbrains.kotlin.load.java.structure.reflect.findAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'annotationClass' @ [41:29] ==> public val <T : Annotation> Annotation.annotationClass: KClass<out Annotation> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Annotation> -> Annotation

'java' @ [41:45] ==> public val <T> KClass<out Annotation>.java: Class<out Annotation> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Annotation

'classId' @ [41:50] ==> public val Class<*>.classId: ClassId defined in org.jetbrains.kotlin.load.java.structure.reflect in file reflectClassUtil.kt[PropertyDescriptorImpl]

'asSingleFqName' @ [41:58] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'fqName' @ [41:78] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.java.structure.reflect.findAnnotation[ValueParameterDescriptorImpl]

'let' @ [41:88] ==> @InlineOnly public inline fun <T, R> Annotation.let(block: (Annotation) -> ReflectJavaAnnotation): ReflectJavaAnnotation defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation
    <R> -> ReflectJavaAnnotation

